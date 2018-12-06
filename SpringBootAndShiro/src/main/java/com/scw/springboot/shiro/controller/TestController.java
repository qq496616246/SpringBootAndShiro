package com.scw.springboot.shiro.controller;
import com.scw.springboot.shiro.config.ShiroKit;
import com.scw.springboot.shiro.config.ShiroUser;
import com.scw.springboot.shiro.config.aop.Permission;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author scw
 * @create 2018-01-03 10:31
 * @desc shiro的验证
 **/
@Controller
public class TestController {

    /**
     * 跳转到登录界面
     * @return
     */

    @RequestMapping(value = "/tologin")
    public String showLogin(){
        return "login";
    }
    @RequestMapping(value = "/login")
    public String dealLogin(String account , String password, String remember){
        Subject currentUser = ShiroKit.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(account, password.toCharArray());
        if ("on".equals(remember)) {
            token.setRememberMe(true);
        } else {
            token.setRememberMe(false);
        }
        currentUser.login(token);
        ShiroUser shiroUser = ShiroKit.getUser();
        return "ok";
    }

    /**
     * 测试权限（是否有administrator角色）
     * @return
     */
    @Permission("administrator")
    @RequestMapping(value = "/test")
    @ResponseBody
    public String testPermission(){
        return "you are good boy";
    }
}
