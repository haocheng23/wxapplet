package com.myfund.wxapplet.service;

import com.myfund.wxapplet.entity.fourthary.HotFundContent;
import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.entity.secondary.Tcrecord;
import com.myfund.wxapplet.entity.secondary.YxStar;
import com.myfund.wxapplet.entity.thirdary.FundanalysisNew;
import com.myfund.wxapplet.repository.fourthary.YxStarDetail4Repository;
import com.myfund.wxapplet.repository.primary.YxStarDetailRepository;
import com.myfund.wxapplet.repository.secondary.TcRepository;
import com.myfund.wxapplet.repository.secondary.YxRepository;
import com.myfund.wxapplet.repository.thirdary.YxStarDetail3Repository;
import com.myfund.wxapplet.util.ListSort;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
//1.添加缓存注解
@CacheConfig
@Slf4j
public class FundServiceImpl implements FundService{


    @Autowired
    private YxRepository yxRepository;

    @Autowired
    private YxStarDetailRepository yxStarDetailRepository;

    @Autowired
    private YxStarDetail4Repository yxStarDetail4Repository;

    @Autowired
    private YxStarDetail3Repository yxStarDetail3Repository;

    @Autowired
    private TcRepository tcRepository;

    //2.指定缓存的key  value要和方法名一样
    @Override
    @Cacheable(value = "getYxStar", keyGenerator = "keyGenerator")
    public List<PubFundanalyseNewest> getYxStar() {
//        List<YxStar> fundcodeList = yxRepository.findFundcode();
        List<YxStar> starList = yxRepository.findAll();
        System.out.println(starList);
        List resultList  = new LinkedList();
        for (int i = 0; i < starList.size(); i++) {
            System.out.println("--------------begin------------------");
            String fundcode = starList.get(i).getFundcode();
            System.out.println(fundcode);
            List<PubFundanalyseNewest> result = yxStarDetailRepository.findYxStarByFundcode(fundcode);
            List<FundanalysisNew> result3 = yxStarDetail3Repository.findYxStar3ByFundcode(fundcode);
            List<HotFundContent> result4 = yxStarDetail4Repository.findYxStar4ByFundcode(fundcode);
            System.out.println(result.toString());
            System.out.println(result3.toString());
            System.out.println(result4.toString());
            Map map = new HashMap();
            if (result.size()==0|| result3.size()==0 || result4.size()==0){
                System.out.println("fundcode："+fundcode+"不存在");
                map.put("error", "fundcode["+fundcode+"]不存在");
                resultList.clear();
                resultList.add(map);
                return resultList;
            }
            map.put("fundcode", result.get(0).getFundCode());
            map.put("fundName", result.get(0).getFundName());
            map.put("fundType", result.get(0).getFundType());
            map.put("thisYearRedound", result.get(0).getThisYearRedound());
            map.put("IntegratedScore", result3.get(0).getIntegratedScore());
            map.put("IntegratedScoreAdvice", result3.get(0).getIntegratedScoreAdvice());
            map.put("Reason", result4.get(0).getReason());
            map.put("ZHStar", result4.get(0).getZhStar());
            map.put("level", starList.get(0).getLevel());
            resultList.add(map);
            System.out.println("---------------end-----------------");
        }
        log.debug("排序前：");
        log.debug(resultList.toString());

        ListSort.ListOfMap(resultList);
        log.debug("排序后：");
        log.debug(resultList.toString());


        return resultList;
    }

    /**
     * @Field: 更新数据之前先清空相应缓存
     *
     */
    @Override
    @CacheEvict(cacheNames = "getYxStar", allEntries = true)
    public String saveYxStar(Tcrecord t) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdf.format(Calendar.getInstance().getTime());
        t.setCreated(datetime);
        t.setUpdated(datetime);
        System.out.println(t.toString());
        String str = null;
        //调入
        if (t.getStatus().equals("1")){
            YxStar yxStar = new YxStar();
            yxStar.setFundcode(t.getFundcode());
            yxRepository.save(yxStar);
            str = tcRepository.save(t).toString();
        }else if (t.getStatus().equals("0")){ //调出
            int i = yxRepository.deleteByFundcode(t.getFundcode());
            if (i < 0) {
                return str;
            }
            System.out.println(t.toString());
            str = tcRepository.save(t).toString();
        }
        return str;
    }

    @Override
    public List<YxStar> getYxTiaocang() {

        List list = yxRepository.findFundcode();
        return list;
    }

    @Override
    public List<Tcrecord> getTiaocang() {
        List<Tcrecord> all = tcRepository.findAll();
        return all;
    }


}
