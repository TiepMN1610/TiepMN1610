/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import model.MauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class MauSacReposition {

    public List<MauSac> getAll() {
        String query = "select ms.Id, ms.Ma, ms.Ten\n"
                + "from MauSac ms";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<MauSac> listMS = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listMS.add(ms);
            }
            return listMS;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public MauSac getOne(String tenMS) {
        String query = "select ms.Id, ms.Ma, ms.Ten\n"
                + "from MauSac ms where ms.Ten like ?";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenMS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
