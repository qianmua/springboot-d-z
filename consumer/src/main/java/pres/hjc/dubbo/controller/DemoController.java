package pres.hjc.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import pres.hjc.dubbo.service.UserService;

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
public class DemoController {

    @Reference
    private UserService userService;

}
