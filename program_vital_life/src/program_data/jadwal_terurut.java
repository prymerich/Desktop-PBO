/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cyber
 */
public class jadwal_terurut {
    private Connection con;
    
    public jadwal_terurut(Connection con) {
        this.con = con;
    }
    
    public List<menu_jadwal.Schedule> jadwal_hari(int userId, String hari) {
        List<menu_jadwal.Schedule> jadwal = new ArrayList<>();
        String sql = "SELECT waktu, kegiatan FROM jadwal_mingguan WHERE id_user = ? AND hari = ? ORDER BY waktu ASC";
        
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, userId);
            pst.setString(2, hari);
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Time waktu = rs.getTime("waktu");
                    String kegiatan = rs.getString("kegiatan");
                    jadwal.add(new menu_jadwal().new Schedule(waktu, kegiatan));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return jadwal;
    }
    
}
