/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class SanPhamReposition {

    public List<SanPham> getAll() {
        String query = "select sp.Id, sp.Ma, sp.Ten\n"
                + "from SanPham sp";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<SanPham> listSanPham = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                listSanPham.add(sp);
            }
            return listSanPham;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public SanPham getOne(String tenSP) {
        String query = "select sp.Id, sp.Ma, sp.Ten\n"
                + "from SanPham sp where sp.Ten like ?";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenSP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new SanPham(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
