package ie.atu;

import java.sql.*;
public class SelectExample {
    String url = "jdbc:mysql://localhost:3306/newdatabase";
    String username = "root";
    String password = "password";

    String selectSQL = "SELECT u.username, u.password, e.email " +
            "FROM users u " +
            "JOIN emails e ON u.id = e.user_id";
}
