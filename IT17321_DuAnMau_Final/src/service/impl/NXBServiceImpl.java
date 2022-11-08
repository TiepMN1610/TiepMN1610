/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.NXB;
import reposition.NXBReposition;
import service.NXBService;

/**
 *
 * @author admin
 */
public class NXBServiceImpl implements NXBService {

    NXBReposition nxbr = new NXBReposition();

    @Override
    public List<NXB> getAll() {
        return nxbr.getAll();
    }

    @Override
    public NXB getOne(String tenNXB) {
        return nxbr.getOne(tenNXB);
    }

}
