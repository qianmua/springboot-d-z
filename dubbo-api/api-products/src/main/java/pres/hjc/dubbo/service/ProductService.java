package pres.hjc.dubbo.service;

import pres.hjc.dubbo.entity.Product;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/22
 * @time 14:15
 */
public interface ProductService {

    List<Product> queryAll();
}
