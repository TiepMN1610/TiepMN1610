/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.MauSac;
import reposition.MauSacReposition;
import service.MauSacService;

/**
 *
 * @author admin
 */
public class MauSacServiceImpl implements MauSacService {

    MauSacReposition msr = new MauSacReposition();

    @Override
    public List<MauSac> getAll() {
        return msr.getAll();
    }

    @Override
    public MauSac getOne(String tenMS) {
        return msr.getOne(tenMS);
    }

}
