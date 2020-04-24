package pres.hjc.dubbo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pres.hjc.dubbo.entity.Product;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/24
 * @time 13:25
 */
@Mapper
public interface ProductsMapping {

    @Select("select * from t_products")
    List<Product> queryAll();
}
