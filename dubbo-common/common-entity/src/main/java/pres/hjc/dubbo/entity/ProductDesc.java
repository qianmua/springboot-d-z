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
 * @time 14:11
 */
@Data
public class ProductDesc implements Serializable {
    private long id;
    private String pDesc;
    private long productId;
}
