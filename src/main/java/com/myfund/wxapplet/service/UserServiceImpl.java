package com.myfund.wxapplet.service;

import com.myfund.wxapplet.entity.secondary.User;
import com.myfund.wxapplet.entity.secondary.ZdRecord;
import com.myfund.wxapplet.entity.secondary.ZxList;
import com.myfund.wxapplet.repository.primary.YxStarDetailRepository;
import com.myfund.wxapplet.repository.secondary.UserRepository;
import com.myfund.wxapplet.repository.secondary.YxRepository;
import com.myfund.wxapplet.repository.secondary.ZdRepository;
import com.myfund.wxapplet.repository.secondary.ZxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ZdRepository zdRepository;

    @Autowired
    private ZxRepository zxRepository;

    @Autowired
    private YxRepository yxRepository;

    @Autowired
    private YxStarDetailRepository yxStarDetailRepository;

    @Override
    public String addUser(String username, String password, String company){
        User user = new User();
        String uuid = UUID.randomUUID().toString().substring(0, 32);
        user.setId(uuid);
        user.setUsername(username);
        user.setPassword(password);
        user.setCompany(company);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdf.format(Calendar.getInstance().getTime());
        user.setDate(datetime);
        User user1 = userRepository.save(user);
        System.out.println("插入成功");
        return user1.getId();
    }

    @Override
    public Boolean findUser(String username, String passwordMD5) {
        User user  = new User();
        user.setUsername(username);
        user.setPassword(passwordMD5);
        /*springboot 2.0+ 新版本获取findOne()方法*/
        Example<User> userExample = Example.of(user);
        Optional<User> userOptional = userRepository.findOne(userExample);
        if(userOptional.isPresent()){
            User user1 = userOptional.get();
            System.out.println(user1.getId());

            return true;
        }else{
            System.out.println("no exit!");
            return false;
        }
//        userRepository.findByUsernameAndPassword();
    }

    @Override
    public User findByUsername(String username){
        User user = new User();
        user.setUsername(username);
        Example<User> userExample = Example.of(user);
        Optional<User> userOptional = userRepository.findOne(userExample);
        if(userOptional.isPresent()){
            User user1 = userOptional.get();
            return user1;
        }else{
            System.out.println("no exit!");
            return null;
        }
    }


    @Override
    public int updatePwd(String username, String newPwdMD5, String id){
        int i = userRepository.updatePasswordByUsernameAndId(newPwdMD5, username, id);
        return i;
    }

    @Override
    public List findZdRecord(String username) {
//        ZdRecord zd = new ZdRecord();
//        zd.setUsername(username);
//        Example<ZdRecord> zdExample = Example.of(zd);
//        List<ZdRecord> all = zdRepository.findAll(zdExample);
        List list = zdRepository.findAllByUsernameOrderByZddateDescGroupbyFundcode(username);
        System.out.println(list.toString());
        return list;
    }

    @Override
    public String addZdRecord(String username, String fundcode, String fundname) {
        ZdRecord zd = new ZdRecord();
        String uuid = UUID.randomUUID().toString().substring(0, 32);
        zd.setId(uuid);
        zd.setUsername(username);
        zd.setFundcode(fundcode);
        zd.setFundname(fundname);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdf.format(Calendar.getInstance().getTime());
        zd.setZddate(datetime);
        ZdRecord zd2 = zdRepository.save(zd);
        System.out.println("插入成功");
        return zd2.getId();
    }




    @Override
    public List<ZxList> findZxList(String username) {
        ZxList zx = new ZxList();
        zx.setUsername(username);
        Example<ZxList> zdExample = Example.of(zx);

        List<ZxList> all = zxRepository.findAll(zdExample);
        System.out.println(all.toString());
        return all;
    }


    @Override
    public int addZx(String username, String fundcode, String fundname) {
        ZxList zx = new ZxList();
        zx.setUsername(username);
        zx.setFundcode(fundcode);
        zx.setFundname(fundname);
        Example<ZxList> userExample = Example.of(zx);
        Optional<ZxList> zxOptional = zxRepository.findOne(userExample);
        if(zxOptional.isPresent()){
            ZxList zx1 = zxOptional.get();
            System.out.println("exit!");
            return 0;
        }else{
            System.out.println("no exit!");
            ZxList zx2 = zxRepository.save(zx);
            if (zx2.getId() > 0){
                return 1;
            }
            return -1;
        }
    }


    @Override
    public int cancelZx(String username, String fundcode) {
        int flag = zxRepository.deleteByUsernameAndFundcode(username, fundcode);
        /*Boolean flag = false;
        ZxList zx = new ZxList();
        zx.setUsername(username);
        zx.setFundcode(fundcode);
        zxRepository.delete(zx);
        flag = true;*/
        return flag;
    }


    public void main(String[] args) {
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(Calendar.getInstance().getTime());
        System.out.println(format);*/
        /*List<YxStar> all = yxRepository.findAll();
        System.out.println(all.toString());*/

        System.out.println("111111111");
        List list = zdRepository.findAllByUsernameOrderByZddateDescGroupbyFundcode("八宝");
        System.out.println(list.toString());
    }
}
