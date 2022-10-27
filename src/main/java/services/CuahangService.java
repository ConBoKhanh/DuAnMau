/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.CuaHang;
import repositories.CuaHangRepo;
import utilities.mycompany.DBConext.HibernatUtil;
import viewModels.CuaHangViewModel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import services.Impl.IManageCuaHangService;

/**
 *
 * @author Admin
 */
public class CuahangService implements IManageCuaHangService {

    private final CuaHangRepo repo = new CuaHangRepo();

    @Override
    public List<CuaHangViewModel> getlist() {
        List<CuaHang> a = repo.getList();

        List<CuaHangViewModel> b = new ArrayList<>();

        for (CuaHang x : a) {
            b.add(new CuaHangViewModel(x.getId(), x.getMa(), x.getTen(), x.getDiaChi(), x.getThanhPho(), x.getQuocGia()));
        }

        return b;
    }

    @Override
    public boolean add(CuaHang s) {
        try {
            return repo.add(s);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(String id, CuaHang s) {
        try {
            return repo.update(id, s);
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
