/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.DongSP;

/**
 *
 * @author admin
 */
public interface DongSPService {

    List<DongSP> getAll();
    
    DongSP getOne(String tenDSP);

}
