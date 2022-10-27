/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.Impl;

import domainModels.NhanVien;
import viewModels.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IManageNhanVienService {

    List<NhanVienViewModel> getNṾ();

    boolean add(NhanVien s, String idch, String idCV);

    boolean update(NhanVien s, String idch, String idCV, String idnv);

    boolean delete(String idnv);

}
