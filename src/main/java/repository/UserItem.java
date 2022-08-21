package repository;

import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserItem {
    String sql = "create table if not exists user_item(id bigint references user(id), )";
    PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);

    public UserItem() throws SQLException {
    }
}
