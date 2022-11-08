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
import model.MauSac;
import model.SanPham;
import model.NXB;
import model.ChiTietSP;

/**
 *
 * @author admin
 */
public class ChiTietSPReposition {

    public List<ChiTietSP> getAll() {
        String query = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Id AS Expr1, dbo.NSX.Id AS Expr2, dbo.MauSac.Id AS Expr3, dbo.DongSP.Id AS Expr4, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.DongSP.Ma AS Expr5, dbo.DongSP.Ten AS Expr6, dbo.NSX.Ma AS Expr7, \n"
                + "                  dbo.NSX.Ten AS Expr8, dbo.MauSac.Ma AS Expr9, dbo.MauSac.Ten AS Expr10, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "                  dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<ChiTietSP> listCTSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(2), rs.getString(6), rs.getString(7));
                DongSP dsp = new DongSP(rs.getString(3), rs.getString(8), rs.getString(9));
                NXB nxb = new NXB(rs.getString(4), rs.getString(10), rs.getString(11));
                MauSac ms = new MauSac(rs.getString(5), rs.getString(12), rs.getString(13));
                ChiTietSP ctsp = new ChiTietSP(rs.getString(1), sp, nxb, ms, dsp, sp, sp, dsp, dsp, nxb, nxb, ms, ms, rs.getInt(14), rs.getString(15), rs.getInt(16), rs.getDouble(17), rs.getDouble(18));
                listCTSP.add(ctsp);
            }
            return listCTSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[ChiTietSP]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(ChiTietSP ctsp, String id) {
        String query = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [NamBH] = ?"
                + "      ,[MoTa] = ?"
                + "      ,[SoLuongTon] = ?"
                + "      ,[GiaNhap] = ?"
                + "      ,[GiaBan] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ctsp.getNamBH());
            ps.setObject(2, ctsp.getMoTa());
            ps.setObject(3, ctsp.getSoLuong());
            ps.setObject(4, ctsp.getGiaNhap());
            ps.setObject(5, ctsp.getGiaBan());
            ps.setObject(6, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean add(ChiTietSP ctsp) {
        String query = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "           ([IdSP]\n"
                + "           ,[IdNsx]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[NamBH]\n"
                + "           ,[MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLServerConection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ctsp.getIdSP().getIdSP());
            ps.setObject(2, ctsp.getIdNXB().getIdNXB());
            ps.setObject(3, ctsp.getIdMauSac().getIdMS());
            ps.setObject(4, ctsp.getIdDSP().getIdDSP());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuong());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
