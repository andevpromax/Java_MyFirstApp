package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseHandler extends Config {
    Connection dbConnection;

    public  Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql//" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser,
                dbPass);

        return dbConnection;
    }

    public void signUpUser(String firstName, String lastName, String userName,
                           String password, String location, String gender){

    }



}
