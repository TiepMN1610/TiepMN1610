/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.SanPham;

/**
 *
 * @author admin
 */
public interface SanPhamService {

    List<SanPham> getAll();
    
    SanPham getOne(String tenSP);

}
