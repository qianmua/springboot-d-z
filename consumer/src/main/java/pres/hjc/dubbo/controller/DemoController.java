package pres.hjc.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pres.hjc.dubbo.pojo.UserModel;
import pres.hjc.dubbo.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/21
 * @time 22:03
 */
@Controller
@RequestMapping("test")
public class DemoController {

    @Reference
    private UserService userService;

    @GetMapping("h")
    @ResponseBody
    public String getHh(String hh){
        try {
            List<UserModel> userModels = userService.queryAll();
        } catch (Exception e) {
            System.out.println("你这个是空的啊 + msg :" + e.getMessage())  ;
        }
        return hh;
    }

}
