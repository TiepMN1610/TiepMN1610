/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.ChiTietSP;
import model.SanPham;
import reposition.ChiTietSPReposition;
import service.ChiTietSPService;

/**
 *
 * @author admin
 */
public class ChiTietSPServiceImpl implements ChiTietSPService {

    ChiTietSPReposition ctspr = new ChiTietSPReposition();

    @Override
    public List<ChiTietSP> getAll() {
        return ctspr.getAll();
    }

    @Override
    public String delete(String id) {
        boolean delete = ctspr.delete(id);
        if (delete) {
            return "Delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public String update(ChiTietSP ctsp, String id) {
        boolean update = ctspr.update(ctsp, id);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String add(ChiTietSP ctsp) {
        boolean add = ctspr.add(ctsp);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

}
