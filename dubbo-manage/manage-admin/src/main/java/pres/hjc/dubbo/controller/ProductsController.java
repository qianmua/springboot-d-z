package pres.hjc.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pres.hjc.dubbo.entity.Product;
import pres.hjc.dubbo.service.ProductService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/24
 * @time 13:40
 */
@RestController
public class ProductsController {

    @Reference
    private ProductService productService;

    @GetMapping("/")
    public List<Product> queryAll(){
        return productService.queryAll();
    }
}
