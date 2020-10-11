package cn.lixing.service.impl;

import cn.lixing.dao.impl.UserDaoImpl;
import cn.lixing.entity.User;
import cn.lixing.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class  UserServiceImpl  implements UserService {

    private UserDaoImpl udi = new UserDaoImpl();

    @Override
    public int findByCountUser() throws Exception {
        return udi.findByCountUser();
    }

    @Override
    public List<User> findByPageUserInfo(int pageNo, int pageSize) throws SQLException {
        return udi.findByPageUserInfo(pageNo,pageSize);
    }

    @Override
    public int addUserInfo(User user) {
        return udi.addUserInfo(user);
    }

    @Override
    public int deleteUserInfo(int id) {
        return udi.deleteUserInfo(id);
    }

    @Override
    public List<User> findByIdUserInfo(int id) throws SQLException {
        return udi.findByIdUserInfo(id);
    }

    @Override
    public int updateUserInfo(User user) {
        return udi.updateUserInfo(user);
    }
}
