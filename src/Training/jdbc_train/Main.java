package Training.jdbc_train;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String userName = "root";
        String password = "Qwerty1";
        String connectionURL = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(connectionURL, userName, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("DROP TABLE Books");
            statement.executeUpdate("CREATE TABLE Books (id MEDIUMINT NOT NULL AUTO_INCREMENT, name VARCHAR(30) NOT NULL , PRIMARY KEY (id))");
            statement.executeUpdate("INSERT INTO Books (name) VALUES ('Book1')");
            statement.executeUpdate("INSERT INTO Books (name) VALUES ('Book11')");
            statement.executeUpdate("INSERT INTO Books (name) VALUES ('Book111')");
            statement.executeUpdate("INSERT INTO Books (name) VALUES ('Book1111')");

            ResultSet resultSet=statement.executeQuery("SELECT * FROM Books");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println("========================================");
            }

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            ResultSet resultSet1 = statement.executeQuery("SELECT name FROM Books WHERE id=4");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString(1));

            }
        }
    }
}
