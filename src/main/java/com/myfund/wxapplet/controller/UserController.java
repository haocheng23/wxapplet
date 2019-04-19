package com.myfund.wxapplet.controller;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.myfund.wxapplet.entity.secondary.User;
import com.myfund.wxapplet.entity.secondary.ZdRecord;
import com.myfund.wxapplet.entity.secondary.ZxList;
import com.myfund.wxapplet.service.UserService;
import com.myfund.wxapplet.util.MD5;
import com.myfund.wxapplet.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

    private ResultVo vo = new ResultVo();

    @Autowired
    private UserService userService;


    /**
     * @description: 用户注册
     * @author: haocheng
     * @date: 2019-03-21 15:49
     *
     */
    @RequestMapping("/regist")
    @ResponseBody
    public String saveUser(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("company") String company){
        Boolean flag1 = userService.findUser(username, password);
        if (!flag1){
            vo.setCode("-8888");
            vo.setMsg("该用户已注册");
            String result = JSON.toJSONString(vo, true);//true美化结构
            return result;
        }
        String flag2 = userService.addUser(username, MD5.creatMD5(password), company);
        if (!flag2.equals("")) {
            vo.setCode("0000");
            vo.setMsg("注册成功");
        }else{
            vo.setCode("-9999");
            vo.setMsg("注册失败");
        }
        String result = JSON.toJSONString(vo,true);
        return result;
    }


    /**
     * @description: 用户登录
     * @author: haocheng
     * @date: 2019-03-21 15:50
     *
     */
    @RequestMapping("/login")
    @ResponseBody
    public String loginRequest(@RequestParam("username") String username,
                                 @RequestParam("password") String password){
//        ResultVo vo = new ResultVo();
        String passwordMD5 = MD5.creatMD5(password);
        User user = userService.findByUsername(username);
        if (user == null){
            vo.setCode("-8888");
            vo.setMsg("用户名不存在");
            String result = JSON.toJSONString(vo, true);//true美化结构
            return result;
        }
        Boolean flag = userService.findUser(username, passwordMD5);
        if (flag) {
            vo.setCode("0000");
            vo.setMsg("用户信息匹配");
        }else{
            vo.setCode("-9999");
            vo.setMsg("用户名密码不匹配");
        }
        String result = JSON.toJSONString(vo, true);//true美化结构
        return result;
    }


    /**
     * @description: 忘记密码
     * @author: haocheng
     * @date: 2019-03-21 15:50
     *
     */
    @RequestMapping("/forgetPwd")
    @ResponseBody
    public String resetPassword(@RequestParam("username") String username,
                                  @RequestParam("oldPwd") String oldPwd,
                                  @RequestParam("newPwd") String newPwd){
        User user = userService.findByUsername(username);
        if (user == null){
            vo.setCode("-8888");
            vo.setMsg("用户名不存在");
            String result = JSON.toJSONString(vo, true);//true美化结构
            return result;
        }
        //原密码加密
        String oldPwdMD5 = MD5.creatMD5(oldPwd);
        System.out.println(oldPwdMD5);
        //新密码加密
        String newPwdMD5 = MD5.creatMD5(newPwd);
        System.out.println(newPwdMD5);
        if (oldPwdMD5.equals(user.getPassword())) {
            int i = userService.updatePwd(username, newPwdMD5,user.getId());
            if (i > 0) {
                vo.setCode("0000");
                vo.setMsg("密码修改成功");
            }
        }else{
            vo.setCode("-9999");
            vo.setMsg("原密码不正确");
        }
        String result = JSON.toJSONString(vo, true);//true美化结构
        return result;
    }


    /**
     * @description: 获取用户的诊断记录
     * @author: haocheng
     * @date: 2019-03-27 10:45
     *
     */
    @RequestMapping("/getZdRecord")
    @ResponseBody
    public String getZdRecord(@RequestParam("username") String username){
        List<ZdRecord> zdRecord = userService.findZdRecord(username);
        String result = JSON.toJSONString(zdRecord, true);//true美化结构
        return result;
    }


    /**
     * @description: 保存客户诊断记录
     * @author: haocheng
     * @date: 2019-03-27 17:25
     *
     */
    @RequestMapping("/addZdRecord")
    @ResponseBody
    public String addZdRecord(@RequestParam("username") String username,
                              @RequestParam("fundcode") String fundcode,
                              @RequestParam("fundname") String fundname){
        String zdRecord = userService.addZdRecord(username,fundcode,fundname);
        if (zdRecord != null || !zdRecord.equals("")){
            vo.setCode("0000");
            vo.setMsg("保存诊断记录成功");
        } else {
            vo.setCode("-9999");
            vo.setMsg("保存诊断记录失败");
        }
        String result = JSON.toJSONString(vo, true);
        return result;
    }


    /**
     * @description: 获取用户的自选列表
     * @author: haocheng
     * @date: 2019-03-27 17:53
     *
     */
    @RequestMapping("/getZxList")
    @ResponseBody
    public String getZxList(@RequestParam("username") String username){
        System.out.println("只有第一次才会打印sql语句");
        List<ZxList> zxList = userService.findZxList(username);
        String result = JSON.toJSONString(zxList, true);
        return result;
    }

    /**
     * @description: 加自选
     * @author: haocheng
     * @date: 2019-03-27 18:19
     *
     */
    @RequestMapping("/addZx")
    @ResponseBody
    public String addZx(@RequestParam("username") String username,
                        @RequestParam("fundcode") String fundcode,
                        @RequestParam("fundname") String fundname){

        int flag = userService.addZx(username, fundcode, fundname);
        if (flag == 0) {
            vo.setCode("-8888");
            vo.setMsg("已添加自选，不能重复添加");
        }else if (flag == 1){
            vo.setCode("0000");
            vo.setMsg("添加自选成功");
        }else{
            vo.setCode("-9999");
            vo.setMsg("添加自选失败");
        }
        String result = JSON.toJSONString(vo, true);
        return result;
    }


    /**
     * @description: 取消自选
     * @author: haocheng
     * @date: 2019-03-27 18:21
     *
     */
    @RequestMapping("/cancelZx")
    @ResponseBody
    public String cancelZx(@RequestParam("username") String username,
                          @RequestParam("fundcode") String fundcode){
        int flag = userService.cancelZx(username, fundcode);
        if (flag > 0) {
            vo.setCode("0000");
            vo.setMsg("取消自选成功");
        }else{
            vo.setCode("-9999");
            vo.setMsg("取消自选失败");
        }
        String result = JSON.toJSONString(vo,true);
        return result;
    }
}
