package pres.hjc.dubbo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/26
 * @time 17:17
 */
@Data
@Accessors
@AllArgsConstructor
public class UserModel implements Serializable {


    private long uId;
    private String uName;
    private String date;
}
