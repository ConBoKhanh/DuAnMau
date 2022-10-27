/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import domainModels.DongSP;
import domainModels.MauSac;
import domainModels.NSX;
import domainModels.SanPham;
import repositories.DongSPRepo;
import repositories.MauSacRepo;
import repositories.NSCXRepo;
import repositories.SanPhamRepo;
import viewModels.DongSPVmodel;
import viewModels.MauSacViewModel;
import java.util.ArrayList;
import services.Impl.IManageMauSacService;

/**
 *
 * @author Admin
 */
public class MauSacService implements IManageMauSacService {

    private final MauSacRepo repo = new MauSacRepo();

    @Override
    public boolean add(MauSac s) {
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
    public List<MauSacViewModel> getlist() {
        List<MauSac> i = repo.getListSP();
        List<MauSacViewModel> a = new ArrayList<>();
        for (MauSac d : i) {
            a.add(new MauSacViewModel(d.getId(), d.getMa(), d.getTen()));

        }
        return a;
    }
}
