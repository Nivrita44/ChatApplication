
package chatapplication.connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    private DatabaseConnection() {
    }

    public void connectToDatabase() throws SQLException {
        String server = "localhost";
        String port = "3306";
        String database = "chat_application";
        String userName = "root";
        String password = "";
        this.connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
