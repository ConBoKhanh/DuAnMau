/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import domainModels.NSX;
import domainModels.SanPham;
import repositories.NSCXRepo;
import repositories.SanPhamRepo;
import viewModels.NSXViewModel;
import java.util.ArrayList;
import services.Impl.IManageNSXService;

/**
 *
 * @author Admin
 */
public class NSXService implements IManageNSXService {

    private final NSCXRepo repo = new NSCXRepo();

    @Override
    public List<NSXViewModel> getNSX() {
        List<NSX> i = repo.getListSP();
        List<NSXViewModel> a = new ArrayList<>();
        for (NSX d : i) {
            a.add(new NSXViewModel(d.getId(), d.getMa(), d.getTen()));

        }
        return a;
    }

     @Override
    public boolean add(NSX s) {
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
