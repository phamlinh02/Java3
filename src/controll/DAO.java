/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Thuy Linh
 */
public class DAO {
    private Connection conn ;
    public DAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=QLHH;"+ "username=sa;password=sa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new DAO();
    }
}
