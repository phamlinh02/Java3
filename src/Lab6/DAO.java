/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Thuy Linh
 */
public class DAO {
    private Connection conn ;

    public DAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databasename =BOOKS";
            conn = DriverManager.getConnection( url,"sa","sa");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<BOOK> getList(){
        ArrayList<BOOK> lst = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tblBOOK";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BOOK bk = new BOOK();
                bk.setID(rs.getInt(1));
                bk.setTitle(rs.getString(2));
                bk.setPrice(rs.getBigDecimal(3));
                lst.add(bk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    public int getIDTheoTitle(String Title){
        int index = -1;
        try {
            String sql = "SELECT * FROM tblBOOK WHERE Title like N'%"+Title+"%'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                index=rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            index = -1;
        }
        
        return index;
    }
    public boolean DeleteBook(BOOK x){
        try {
            String sql = "DELETE FROM tblBOOK where ID =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(x.getID()));
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
}
