package pres.hjc.dubbo.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pres.hjc.dubbo.entity.Product;
import pres.hjc.dubbo.mapper.ProductsMapping;
import pres.hjc.dubbo.service.ProductService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/22
 * @time 14:22
 */
@Service
@Component
public class ProductsServiceImpl implements ProductService {

    @Autowired
    private ProductsMapping productsMapping;


    @Override
    public List<Product> queryAll() {
        return productsMapping.queryAll();
    }
}
