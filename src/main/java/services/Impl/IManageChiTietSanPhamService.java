/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.ChiTietSanPham;
import viewModels.ChiTietSanPhamViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageChiTietSanPhamService {

    List<ChiTietSanPhamViewModel> list();

    boolean add(ChiTietSanPham ct, String idsp, String idnsx, String idmau, String idDong);

    boolean update(ChiTietSanPham ct, String idsp, String idnsx, String idmau, String idDong, String idct);

    boolean updateXoa(String idct);

    boolean Delete(String idct);
}
