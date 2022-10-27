/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.CuaHang;
import viewModels.CuaHangViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageCuaHangService {
    List<CuaHangViewModel> getlist();
    
    boolean add(CuaHang s);
    
    boolean update(String id,CuaHang s);
    
    boolean delete(String id);
}
