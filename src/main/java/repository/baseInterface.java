package repository;

import java.sql.SQLException;

public interface baseInterface<T> {
    T create(T t);
    T read(T t);
    void update(T t);
    void delete(T t);
    void creatTable() throws SQLException;
}
