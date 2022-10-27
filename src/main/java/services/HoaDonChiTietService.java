/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import utilities.mycompany.DBConext.HibernatUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import repositories.HoaDonChiTietRepo;
import viewModels.HoaDonChiTietViewModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import services.Impl.IManageHoaDonChiTietService;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietService implements IManageHoaDonChiTietService{
    private final HoaDonChiTietRepo repo = new HoaDonChiTietRepo();
    
    @Override
    public List<HoaDonChiTietViewModel> getListSP(String idhd) {
        List<Object[]> a = repo.getListSP(idhd);
        
        List<HoaDonChiTietViewModel> b = new ArrayList<>();
        
        for (Object[] c : a) {
            b.add(new HoaDonChiTietViewModel(c[0].toString(), c[1].toString(), c[2].toString(),
                    Integer.parseInt(c[3].toString()), BigDecimal.valueOf(Integer.parseInt(c[4].toString()))));
        }
        
        return b; 
        
    }
    @Override
    public boolean add(String Idhd, String Idsp, int soluong, int dongia){
        try {
            return repo.add(Idhd, Idsp, soluong, dongia);
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public boolean delete(String Idhd, String Idsp){
        try {
            return repo.delete(Idhd, Idsp);
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public boolean update(String Idhd, String Idsp,int soluong){
        try {
            return repo.update(Idhd, Idsp, soluong);
        } catch (Exception e) {
            return false;
        }
    }
}
