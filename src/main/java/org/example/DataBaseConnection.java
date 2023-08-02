package org.example;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static final String serverTimeZone = "UTC";

    public static final String serverName = "localhost";
    public static final String databaseName = "homework27";
    public static final int portNumber = 3306;
    public static final String user = "Kristina";
    private static final String password = "Password";

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setUseSSL(false);
        dataSource.setServerTimezone(serverTimeZone);

        dataSource.setServerName(serverName);
        dataSource.setDatabaseName(databaseName);
        dataSource.setPortNumber(portNumber);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        return connection = dataSource.getConnection();
    }





    public void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error while closing the connection: " + e.getMessage());
            }
        }
    }
}

