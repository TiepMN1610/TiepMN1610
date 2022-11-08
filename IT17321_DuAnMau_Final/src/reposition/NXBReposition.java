/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import model.NXB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class NXBReposition {
    
    public List<NXB> getAll() {
        String query = "select nsx.Id, nsx.Ma, nsx.Ten\n"
                + "from NSX nsx";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<NXB> listNXB = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NXB nxb = new NXB(rs.getString(1), rs.getString(2), rs.getString(3));
                listNXB.add(nxb);
            }
            return listNXB;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public NXB getOne(String tenNXB) {
        String query = "select nsx.Id, nsx.Ma, nsx.Ten\n"
                + "from NSX nsx where nsx.Ten like ?";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenNXB);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new NXB(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
