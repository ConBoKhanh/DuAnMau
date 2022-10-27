/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import domainModels.DongSP;
import domainModels.NSX;
import domainModels.SanPham;
import repositories.DongSPRepo;
import repositories.NSCXRepo;
import repositories.SanPhamRepo;
import viewModels.DongSPVmodel;
import java.util.ArrayList;
import services.Impl.IManageDongSPService;

/**
 *
 * @author Admin
 */
public class DongSpService implements IManageDongSPService {

    private final DongSPRepo repo = new DongSPRepo();

    @Override
    public boolean add(DongSP s) {
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

    @Override
    public List<DongSPVmodel> getlist() {
        List<DongSP> i = repo.getListSP();
        List<DongSPVmodel> a = new ArrayList<>();
        for (DongSP d : i) {
            a.add(new DongSPVmodel(d.getId(), d.getMa(), d.getTen()));
        }
        return a;
    }
}
