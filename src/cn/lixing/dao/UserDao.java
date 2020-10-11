package cn.lixing.dao;

import cn.lixing.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    // 查询总记录数
    public abstract int findByCountUser() throws Exception;

    // 分页方法
    public abstract List<User> findByPageUserInfo(int pageNo, int pageSize) throws SQLException;

    // 添加用户
    public abstract int addUserInfo(User user);

    //删除用户
    public abstract int deleteUserInfo(int id);

    //通过id查看用户信息
    public abstract List<User> findByIdUserInfo(int id) throws SQLException;

    // 通过id修改信息
    public abstract int updateUserInfo(User user);

}
