package com.myfund.wxapplet.service;


import com.myfund.wxapplet.entity.secondary.User;
import com.myfund.wxapplet.entity.secondary.ZdRecord;
import com.myfund.wxapplet.entity.secondary.ZxList;

import java.util.List;


public interface UserService {

    String addUser(String username, String password, String company);

    Boolean findUser(String username, String password);

    User findByUsername(String username);

    int updatePwd(String username, String newPwdMD5, String id);

    List<ZdRecord> findZdRecord(String username);

    String addZdRecord(String username, String fundcode, String fundname);

    List<ZxList> findZxList(String username);

    int addZx(String username, String fundcode, String fundname);

    int cancelZx(String username, String fundcode);

}
