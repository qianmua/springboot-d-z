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
 * @time 14:10
 */
@Data
public class ProductType implements Serializable {
    private long id;
    private long pid;
    private String name;
}
