/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import utilities.mycompany.DBConext.HibernatUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import repositories.HoaDonRepo;
import viewModels.HoaDonViewModel;
import java.util.ArrayList;
import services.Impl.IManageHoaDonService;

/**
 *
 * @author Admin
 */
public class HoaDonService implements IManageHoaDonService{
    private final HoaDonRepo service = new  HoaDonRepo();
    
    
    public List<HoaDonViewModel> getHd(){ 
        List<Object[]> a = service.getHd();
        
        List<HoaDonViewModel> b = new ArrayList<>();
        
        for (Object[] c : a) {
            b.add(new HoaDonViewModel(c[0].toString(), c[1].toString(),c[2].toString() ,Integer.parseInt(c[3].toString()), c[4]));
        }
        
        return b;
    }
    @Override
    public int getma(){ 
        return service.getMa();
    }
     @Override
    public boolean add(String Mahd,String idnv,String date){
        try {
            return service.addHoaDon(Mahd,idnv,date);
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public boolean update(String idhd,String date){
        try {
            return service.updateThanhToan(idhd,date);
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public int tongTien(String Id){
        
            return service.getDonGia(Id);
        
    }
    
    public static void main(String[] args) {
        IManageHoaDonService serviceHd = new HoaDonService();
        List<HoaDonViewModel> list = serviceHd.getHd();
        for (HoaDonViewModel hoaDonViewModel : list) {
            System.out.println(hoaDonViewModel.toString());
        }
    }

    @Override
    public List<HoaDonViewModel> getHdby(int tt) {
          List<Object[]> a = service.getHdByTT(tt);
        
        List<HoaDonViewModel> b = new ArrayList<>();
        
        for (Object[] c : a) {
            b.add(new HoaDonViewModel(c[0].toString(), c[1].toString(),c[2].toString() ,Integer.parseInt(c[3].toString()), c[4]));
        }
        
        return b;
    }

    @Override
    public boolean deleteHD(String Id) {
        try {
            return service.deleteHD(Id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean UpdateHoaDon(String Id, String date, int tinhtrang) {
        try {
            return service.UpdateHoaDon(Id, date, tinhtrang);
        } catch (Exception e) {
            return false;
        }
    }
    
}
