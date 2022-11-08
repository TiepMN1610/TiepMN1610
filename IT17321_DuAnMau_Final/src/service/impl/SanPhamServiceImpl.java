/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.SanPham;
import reposition.SanPhamReposition;
import service.SanPhamService;

/**
 *
 * @author admin
 */
public class SanPhamServiceImpl implements SanPhamService {

    SanPhamReposition spr = new SanPhamReposition();

    @Override
    public List<SanPham> getAll() {
        return spr.getAll();
    }

    @Override
    public SanPham getOne(String tenSP) {
        return spr.getOne(tenSP);
    }

}
