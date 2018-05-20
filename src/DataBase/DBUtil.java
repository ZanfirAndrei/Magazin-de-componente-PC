/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author AndreiZanfir
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String mySQLUser = "root";
    private static final String mySQLPass = "";
    private static final String mySQLCS = "jdbc:mysql://localhost:3306/magazin"; //Connection String
    public static java.sql.Connection getConnection(DBType dbtype) throws SQLException
    {
        switch (dbtype)
        {
            case ORADB:
                return null;
            case MYSQLDB:
                return DriverManager.getConnection(mySQLCS, mySQLUser, mySQLPass);
            default:
                return null;   
        }
    }
    
    public static void showErrorMessage(SQLException e){
		System.err.println("Error :" + e.getMessage());
		System.err.println("Error Code :" + e.getErrorCode());
	}
}