/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import domainModels.SanPham;
import repositories.SanPhamRepo;
import viewModels.SanPhamVModel;
import java.sql.Array;
import java.util.ArrayList;
import services.Impl.IManageSanPhamService;

/**
 *
 * @author Admin
 */
public class SPService implements IManageSanPhamService {

    private final SanPhamRepo repo = new SanPhamRepo();


    @Override
    public List<SanPhamVModel> getSp() {
        List<SanPham> i = repo.getListSP();
        List<SanPhamVModel> a = new ArrayList<>();
        for (SanPham d : i) {
            a.add(new SanPhamVModel(d.getId(), d.getMa(), d.getTen()));

        }
        return a;
    }

    @Override
    public boolean add(SanPham s) {
        try {
            return repo.addSp(s);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(String Ten, String id) {
        try {
            return repo.update(Ten, id);
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
