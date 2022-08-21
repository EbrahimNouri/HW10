package service;

import java.sql.Connection;

public class ApplicationConstant {
    private static Connection connection = new DatabaseConnection().connect();

    public static Connection getConnection() {
        return connection;
    }
}
