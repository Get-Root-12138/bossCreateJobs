package org.gao.service;

import org.gao.pojo.User;

public interface UserService {

    //用户名查询
    User findByUserName(String username);

    //注册
    void register(String username, String password);


    //更新
    void update(User user);


    //更新头像
    void updateAvatar(String avatarUrl);

    //更新密码
    void updatePwd(String newPwd);
}
