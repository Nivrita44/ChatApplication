package chatapplication.service;

import chatapplication.connection.DatabaseConnection;
import chatapplication.model.Model_Message;
import chatapplication.model.Model_Register;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceUser {

    public ServiceUser() {
        this.con = (Connection) DatabaseConnection.getInstance().getConnection();
    }

    public Model_Message register(Model_Register data) {
        Model_Message message = new Model_Message();
        try {
            PreparedStatement p = con.prepareStatement(CHECK_USER);
            p.setString(1, data.getUserName());
            ResultSet r = p.executeQuery();
            if (r.next()) { // Use next() instead of first()
                message.setAction(false);
                message.setMessage("User Already Exists"); // Correct the message spelling
            } else {
                message.setAction(true);
            }
            r.close();
            p.close();
            if (message.isAction()) {
                p = con.prepareStatement(INSERT_USER);
                p.setString(1, data.getUserName());
                p.setString(2, data.getPassword());
                p.execute();
                p.close();
                message.setAction(true);
                message.setMessage("Ok");
            }
        } catch (SQLException e) {
            message.setAction(false);
            message.setMessage("Server Error");
        }
        return message;
    }

    //  SQL
    private final String INSERT_USER = "insert into user (UserName, `Password`) values (?,?)";
    private final String CHECK_USER = "select UserID from user where UserName =? limit 1";
    //  Instance
    private final Connection con;
}
