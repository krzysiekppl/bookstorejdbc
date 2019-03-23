package dbconf;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class BookstoreDataSource {
    private static BasicDataSource ds = new BasicDataSource();

    static  {
        ds.setUrl("jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("password");
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
