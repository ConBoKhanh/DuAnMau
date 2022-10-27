/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import viewModels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageHoaDonService {
    List<HoaDonViewModel> getHd();
    List<HoaDonViewModel> getHdby(int tt);
    int getma();
    boolean deleteHD(String Id);
    boolean UpdateHoaDon(String Id,String date,int tinhtrang);
    boolean add(String Mahd,String idnv,String date);
    boolean update(String idhd,String date);
    int tongTien(String Id);
}
