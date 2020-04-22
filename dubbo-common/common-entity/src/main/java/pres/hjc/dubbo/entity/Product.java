package pres.hjc.dubbo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/22
 * @time 13:59
 */
@Data
public class Product implements Serializable {
    private long id;
    private String name;
    private long price;
    private long salePrice;
    private String salePoint;
    private String imageUrl;
    private long stock;
    private int flag;
    private String createTime;
    private String updateTime;
    private long createUser;
    private long updateUser;
}
