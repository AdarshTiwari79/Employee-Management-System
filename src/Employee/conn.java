package Employee;

import java.sql.*;

public class conn{

    public Connection c;
    public Statement s;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employee","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

