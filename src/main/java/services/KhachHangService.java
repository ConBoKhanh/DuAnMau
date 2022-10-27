/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.KhachHang;
import repositories.KhachHangRepo;
import java.util.List;
import services.Impl.IManageKhachHangService;

/**
 *
 * @author Admin
 */
public class KhachHangService implements IManageKhachHangService {

    private final KhachHangRepo repo = new KhachHangRepo();

    @Override
    public List<KhachHang> getKH() {
        return repo.getKH();
    }

    @Override
    public boolean addKh(KhachHang kh, String date) {
        try {
            return repo.addKh(kh, date);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean Update(KhachHang kh, String date) {
        try {
            return repo.Update(kh, date);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try {
            return repo.delete(id);
        } catch (Exception e) {
            return false;
        }
    }

}
