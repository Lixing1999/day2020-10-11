package cn.lixing.dao.impl;

import cn.lixing.basedao.BaseDao;
import cn.lixing.dao.UserDao;
import cn.lixing.entity.User;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int findByCountUser() throws Exception {
        int index = 0;
        String sql = "select Count(*) from user";
        ResultSet rs = exeuQuery(sql);
        while (rs.next()){
            index = rs.getInt(1);
        }
        getClose();
        return index;
    }

    @Override
    public List<User> findByPageUserInfo(int pageNo, int pageSize) throws SQLException {
        List<User> list = new ArrayList<>();
        String sql = "select * from user limit ?,?";
        Object[] obj = {(pageNo-1)*pageSize,pageSize};
        ResultSet rs = exeuQuery(sql, obj);
        while (rs.next()){
            User user = new User();
            user.setId(rs.getInt(1));
            user.setUsername(rs.getString(2));
            user.setPassword(rs.getString(3));
            user.setSex(rs.getString(4));
            user.setBornDate(rs.getDate(5));
            user.setUserpic(rs.getString(6));
            list.add(user);
        }
        return list;
    }

    @Override
    public int addUserInfo(User user) {
        String sql = "insert into user(username,password,sex,bornDate) values(?,?,?,?)";
        Object[] objects = {user.getUsername(),user.getPassword(),user.getSex(),user.getBornDate()};
        int i = exeuUpdate(sql, objects);
        return i;
    }

    @Override
    public int deleteUserInfo(int id) {
        String sql = "delete from user where id=?";
        Object obj = id;
        int i = exeuUpdate(sql, obj);
        return i;
    }

    @Override
    public List<User> findByIdUserInfo(int id) throws SQLException {
        List<User> list = new ArrayList<>();
        String sql = "select * from user where id=?";
        Object obj = id;
        User user;
        ResultSet rs = exeuQuery(sql, obj);
        while (rs.next()){
            user = new User();
//            String username = rs.getString(2);
//            String password = rs.getString(3);
//            String sex = rs.getString(4);
//            Date date = rs.getDate(5);
            user.setId(rs.getInt(1));
            user.setUsername(rs.getString(2));
            user.setPassword(rs.getString(3));
            user.setSex(rs.getString(4));
            user.setBornDate(rs.getDate(5));
            list.add(user);
        }
        return list;
    }

    @Override
    public int updateUserInfo(User user) {
        String sql = "update user set username=?,password=?,sex=?,bornDate=? where id=?";
        Object[] objects = {user.getUsername(),user.getPassword(),user.getSex(),user.getBornDate(),user.getId()};
        int i = exeuUpdate(sql, objects);
        return i;
    }
}
