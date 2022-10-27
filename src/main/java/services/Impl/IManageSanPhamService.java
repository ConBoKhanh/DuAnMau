/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.SanPham;
import viewModels.SanPhamVModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageSanPhamService {
    List<SanPhamVModel> getSp();
    
    boolean add(SanPham s);
    
    boolean update(String Ten, String id);
    
    boolean delete(String id);
    
    
}
