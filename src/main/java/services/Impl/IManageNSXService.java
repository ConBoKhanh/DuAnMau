/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.NSX;
import viewModels.NSXViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageNSXService {
    List<NSXViewModel> getNSX();
    
    boolean add(NSX s);
    
    boolean update(String Ten, String id);
    
    boolean delete(String id);
    
}
