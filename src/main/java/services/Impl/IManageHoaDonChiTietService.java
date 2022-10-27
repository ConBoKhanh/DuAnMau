/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import viewModels.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageHoaDonChiTietService {

    List<HoaDonChiTietViewModel> getListSP(String idhd);

    boolean add(String Idhd, String Idsp, int soluong, int dongia);

    boolean delete(String Idhd, String Idsp);

    boolean update(String Idhd, String Idsp, int soluong);
}
