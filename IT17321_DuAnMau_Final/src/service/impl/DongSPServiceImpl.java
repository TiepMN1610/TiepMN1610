/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.DongSP;
import reposition.DongSPReposition;
import service.DongSPService;

/**
 *
 * @author admin
 */
public class DongSPServiceImpl implements DongSPService {

    DongSPReposition dspr = new DongSPReposition();

    @Override
    public List<DongSP> getAll() {
        return dspr.getAll();
    }

    @Override
    public DongSP getOne(String tenDSP) {
        return dspr.getOne(tenDSP);
    }

}
