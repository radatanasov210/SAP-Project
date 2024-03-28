//примерен код на java за свързване с База данни(Тестовата база данни е в DataBase папката) и извеждане на информация от нея на Конзолата
import java.sql.*;

public class main {
    // JDBC URL, username(по default е root) и password на MySQL server-а който ще изполваме
    private static final String URL = "jdbc:mysql://localhost/school_sport_clubs";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            // Opening database connection to MySQL server
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Getting statement object to execute query
            statement = connection.createStatement();

            // Тук въвеждаме заявката която искаме да изведем
            resultSet=statement.executeQuery("select *from students");

            // Printing column names
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%-20s", metaData.getColumnName(i));
            }
            System.out.println();

            // Printing rows
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%-20s", resultSet.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Closing ResultSet, PreparedStatement and Connection
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
