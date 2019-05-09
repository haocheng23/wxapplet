package com.myfund.wxapplet.repository.fourthary;

import com.myfund.wxapplet.entity.fourthary.HotFundContent;
import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface YxStarDetail4Repository extends JpaRepository<HotFundContent, Integer> {

    //1076
    @Query(value = "select ID,title,subtitle,Reason,ZHStar from HotFundContent where nodeid=1076 and SubTitle=?1", nativeQuery = true)
    List<HotFundContent> findYxStar4ByFundcode(String fundcode);



    @Query(value = "select ID,title,subtitle,Reason,ZHStar from HotFundContent where nodeid=1076 and SubTitle in (?1)", nativeQuery = true)
    List<HotFundContent> findYxStar4ByFundcode(List fundcodeList);

}
