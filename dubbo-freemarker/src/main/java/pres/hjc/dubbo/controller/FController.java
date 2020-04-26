package pres.hjc.dubbo.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/test")
    public void create() throws IOException, TemplateException {
        Template template = configuration.getTemplate("index.ftl");


        Map<String , Object> map = new HashMap<>();
        map.put("name", "qianmuna");

        FileWriter writer = null;
        template.process(map,writer);

        System.out.println("生成静态页面");
    }

}
