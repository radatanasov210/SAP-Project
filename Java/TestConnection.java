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
//Това трябва да изведе конзолата в случая:
//id                  name                egn                 address             phone               class               
//1                   Iliyan Ivanov       9401150045          Sofia-Mladost 1     0893452120          10                  
//2                   Ivan Iliev Georgiev 9510104512          Sofia-Liylin        0894123456          11                  
//3                   Elena Petrova Petrova9505052154          Sofia-Mladost 3     0897852412          11                  
//4                   Ivan Iliev Iliev    9510104542          Sofia-Mladost 3     0894123457          11                  
//5                   Maria Hristova Dimova9510104547          Sofia-Mladost 4     0894123442          11                  
//6                   Antoaneta Ivanova Georgieva9411104547          Sofia-Krasno selo   0874526235          10  
