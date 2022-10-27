/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import utilities.mycompany.DBConext.HibernatUtil;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Query;
import domainModels.HoaDon;
import domainModels.NhanVien;
import viewModels.SanPhamVModel;
import java.util.ArrayList;
import java.util.Arrays;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class HoaDonRepo {

    public List<Object[]> getHd() {
        Session session = HibernatUtil.getFACTORY().openSession();

        Query q = session.createQuery("SELECT A.Id,A.Ma,B.Ten,A.TinhTrang,A.NgayTao FROM HoaDon A JOIN NhanVien B ON A.IdNV = B.Id ");
        List<Object[]> list = q.getResultList();
        return list;
    }
    
    public List<Object[]> getHdByTT(int tt) {
        Session session = HibernatUtil.getFACTORY().openSession();

        Query q = session.createQuery("SELECT A.Id,A.Ma,B.Ten,A.TinhTrang,A.NgayTao FROM HoaDon A JOIN NhanVien B ON A.IdNV = B.Id "
                + "Where A.TinhTrang = "+tt);
        List<Object[]> list = q.getResultList();
        return list;
    }

    
    public int getMa() {
        Session session = HibernatUtil.getFACTORY().openSession();
        String soMaLonNhat = null;
        Query q = session.createQuery(" select A.Ma From HoaDon A  ");
        List<String> i = q.getResultList();
        List<Integer> c = new ArrayList<>();
        for (String a : i) {
            c.add(Integer.parseInt(a));
        }
              System.out.println(c+"\n");
        
        int max = c.get(0);
        for (int j = 0; j < c.size(); j++) {
            if(c.get(j).compareTo(max)>0){
                max = c.get(j);
            }
        }
        
       return max;
    }

    public boolean addHoaDon(String Mahd,String idnv,String date) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            HoaDon hd = new HoaDon();
            hd.setMa(Mahd);
            hd.setTinhTrang(0);
            NhanVien v = new NhanVien();
            v.setId(idnv);
            hd.setIdNV(v);
            hd.setNgayTao(Date.valueOf(date));
            session.getTransaction().begin();
            session.save(hd);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public boolean UpdateHoaDon(String Id,String date,int tinhtrang) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            HoaDon hd = session.get(HoaDon.class, Id);
            hd.setTinhTrang(tinhtrang);
            hd.setNgayTao(Date.valueOf(date));
            session.getTransaction().begin();
            session.update(hd);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public boolean deleteHD(String Id) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            HoaDon hd = session.get(HoaDon.class, Id);
            session.getTransaction().begin();
            session.delete(hd);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    

    public boolean updateThanhToan(String idhd, String date) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            HoaDon hd = session.get(HoaDon.class, idhd);
            hd.setTinhTrang(1);
            hd.setNgayTao(Date.valueOf(date));
            session.getTransaction().begin();
            session.update(hd);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public int getDonGia(String idhd) {
        int i = 1;
        Session session = HibernatUtil.getFACTORY().openSession();
        Query q = session.createQuery("select A.Id , Sum(B.DonGia) From HoaDon A JOIN HoaDonChiTiet B ON A.Id = B.IdHoaDon"
                + " Where A.Id = '" + idhd + "' Group by A.Id");
        List<Object[]> list = q.getResultList();
        if (list.isEmpty()) {
            i = 0;
        } else {
            Object[] hh = list.get(0);
            BigDecimal tongtien = (BigDecimal) hh[1];
            i = Integer.valueOf(tongtien.intValue());
        }
        return i;

    }

    public static void main(String[] args) {
        HoaDonRepo rp = new HoaDonRepo();
       List<Object[]> list =  rp.getHdByTT(0);
        for (Object[] a : list) {
            System.out.println(a[0]);
        }
        



    }
    
}
