package ELE;

import java.sql.*;


public class Conn {

    Connection c=null;
    Statement s=null;
    Conn() {
        try {

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "here replace"); // replace the password according to your account
            s = c.createStatement();
            System.out.println("DB CONNECTED!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
////////ascsac