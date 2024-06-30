/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author krish
 */
public class con_db_artikel {
    private static Connection mysqlkonek;
    public static Connection koneksiDB()throws SQLException{
        if(mysqlkonek==null){
            try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/program_hidup_sehat", "root", "");
        return conn;
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage());
        throw new RuntimeException(e);
    }
        }return mysqlkonek;
    }
}
