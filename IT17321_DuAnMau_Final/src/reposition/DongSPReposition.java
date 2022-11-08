/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import model.DongSP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DongSPReposition {

    public List<DongSP> getAll() {
        String query = "select dsp.Id, dsp.Ma, dsp.Ten\n"
                + "from DongSP dsp";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<DongSP> listDSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongSP dsp = new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
                listDSP.add(dsp);
            }
            return listDSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public DongSP getOne(String tenDSP) {
        String query = "select dsp.Id, dsp.Ma, dsp.Ten\n"
                + "from DongSP dsp where dsp.Ten like ?";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenDSP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
