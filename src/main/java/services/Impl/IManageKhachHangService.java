/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.KhachHang;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageKhachHangService {

    List<KhachHang> getKH();

    boolean addKh(KhachHang kh, String date);

    boolean Update(KhachHang kh, String date);

    boolean delete(String id);
}
