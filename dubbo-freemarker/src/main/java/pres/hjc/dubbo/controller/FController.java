package pres.hjc.dubbo.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pres.hjc.dubbo.pojo.UserModel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/26
 * @time 17:03
 */
@RestController
public class FController {
    @Autowired
    private Configuration configuration;


    /**
     * freemarker 模板
     *
     * 使用模板直接生成html静态页面。
     *
     * @throws IOException
     * @throws TemplateException
     */
    @GetMapping("/test")
    public void create() throws IOException, TemplateException {
        Template template = configuration.getTemplate("index.ftl");


        Map<String , Object> map = new HashMap<>();
        map.put("name", "qianmuna");

        UserModel userModel = new UserModel(1,"hello",new Date().toString());
        UserModel userModel2 = new UserModel(2,"hello2",new Date().toString());
        UserModel userModel3 = new UserModel(3,"hello2",new Date().toString());

        List<UserModel> list = new ArrayList<>();
        list.add(userModel);
        list.add(userModel2);
        list.add(userModel3);

        map.put("list", list);
        FileWriter writer = new FileWriter("生成路径/*html");
        template.process(map,writer);

        System.out.println("生成静态页面");
    }

}
