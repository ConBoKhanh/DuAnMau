/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.NhanVien;
import java.util.List;
import repositories.NhanVienRepo;
import viewModels.NhanVienViewModel;
import java.util.ArrayList;
import services.Impl.IManageNhanVienService;

/**
 *
 * @author Admin
 */
public class NhanVienService implements IManageNhanVienService{
    private NhanVienRepo repo = new NhanVienRepo();
    
  

    @Override
    public List<NhanVienViewModel> getNṾ() {
        List<Object[]> a = repo.getNV();
       
        List<NhanVienViewModel> b = new ArrayList<>();
        
         for (Object[] c : a) {
            b.add(new NhanVienViewModel(c[0].toString(), c[1].toString(), c[2].toString(), 
                    c[3].toString(), c[4].toString(),c[5].toString() , c[6].toString(),
                    c[7].toString(), Integer.parseInt(c[8].toString())));
        }
        
        return b;
    }

    @Override
    public boolean add(NhanVien s, String idch, String idCV) {
        try {
            return repo.add(s, idch, idCV);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(NhanVien s, String idch, String idCV, String idnv) {
        try {
            return repo.update(s, idch, idCV, idnv);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String idnv) {
        try {
            return repo.delete(idnv);
        } catch (Exception e) {
            return false;
        }
    }
}
