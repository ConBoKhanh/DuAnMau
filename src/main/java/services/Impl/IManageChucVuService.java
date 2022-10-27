/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.ChucVu;
import viewModels.ChucVuModelView;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageChucVuService {

    List<ChucVuModelView> getList();

    boolean addcv(ChucVu s);

    boolean update(String Ten, String id);
    
    boolean delete(String id);
}
