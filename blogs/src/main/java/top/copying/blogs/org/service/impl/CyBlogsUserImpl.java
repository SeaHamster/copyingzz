package top.copying.blogs.org.service.impl;

import org.springframework.stereotype.Service;
import top.copying.blogs.org.service.CyBlogsUserService;


/**
 * @author copying
 * @date 2020-08-11
 * 用户管理具体实现
 */
@Service("CyBlogsUserService")
public class CyBlogsUserImpl implements CyBlogsUserService {

    @Override
    public Boolean isLogin(String userName, String passWord) {

        return true;
    }
}
