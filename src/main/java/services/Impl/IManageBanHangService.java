/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.ChiTietSanPham;
import viewModels.BanHangViewModel;
import java.awt.image.BandedSampleModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageBanHangService {
    public List<BanHangViewModel> getListSP();
    
    public List<BanHangViewModel> getListSPbyname(String name);
    
    boolean update(String IdSp,int Soluong);
}
