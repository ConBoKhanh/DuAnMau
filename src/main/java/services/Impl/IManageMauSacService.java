/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.DongSP;
import domainModels.MauSac;
import domainModels.NSX;
import viewModels.DongSPVmodel;
import viewModels.MauSacViewModel;
import viewModels.NSXViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageMauSacService {
    List<MauSacViewModel> getlist();
    
    boolean add(MauSac s);
    
    boolean update(String Ten, String id);
    
    boolean delete(String id);
    
}
