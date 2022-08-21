package repository;

import entity.User;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository implements baseInterface<User>{
    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User read(User user) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void creatTable() throws SQLException {
        String sql = "create table if not exists user(id serial primary key , )";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
    }
}
