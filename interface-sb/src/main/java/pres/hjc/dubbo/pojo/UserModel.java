package pres.hjc.dubbo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/21
 * @time 20:27
 */
@Data
public class UserModel implements Serializable {
    private String id;
    private String name;
    private String uid;
    private String cerateDate;
    private long version;
}
