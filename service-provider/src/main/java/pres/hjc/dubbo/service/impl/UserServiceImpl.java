package pres.hjc.dubbo.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import pres.hjc.dubbo.pojo.UserModel;
import pres.hjc.dubbo.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/21
 * @time 20:31
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserModel> queryAll() {
        return null;
    }

    @Override
    public UserModel queryByUid(String uid) {
        return null;
    }
}
