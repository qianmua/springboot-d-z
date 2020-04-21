package pres.hjc.dubbo.service;

import pres.hjc.dubbo.pojo.UserModel;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/21
 * @time 20:29
 */
public interface UserService {
    List<UserModel> queryAll();
}
