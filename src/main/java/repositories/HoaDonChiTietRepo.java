/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import utilities.mycompany.DBConext.HibernatUtil;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Query;
import domainModels.ChiTietSanPham;
import domainModels.HoaDon;
import domainModels.HoaDonChiTiet;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietRepo {

    public List<Object[]> getListSP(String idhd) {
        Session session = HibernatUtil.getFACTORY().openSession();

        Query q = session.createQuery("SELECT A.IdHoaDon,B.Id,C.Ten,A.SoLuong,A.DonGia FROM "
                + "HoaDonChiTiet A JOIN ChiTietSanPham B on A.IdChiTietSP = B.Id JOIN SanPham C ON B.IdSP = C.Id "
                + " WHERE A.IdHoaDon = '" + idhd + "'");
        List<Object[]> list = q.getResultList();

        return list;
    }

    public boolean add(String Idhd, String Idsp, int soluong, int dongia) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            HoaDonChiTiet hdct = new HoaDonChiTiet();
            HoaDon hd = session.get(HoaDon.class, Idhd);
            ChiTietSanPham sp = session.get(ChiTietSanPham.class, Idsp);
            hdct.setIdHoaDon(hd);
            hdct.setIdChiTietSP(sp);
            hdct.setSoLuong(soluong);
            int tongtien = soluong * dongia;
            hdct.setDonGia(BigDecimal.valueOf(tongtien));

            session.getTransaction().begin();
            session.save(hdct);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    // get don gia theo san pham
    public int getDonGia(String idsp) {
        int i = 1;
        Session session = HibernatUtil.getFACTORY().openSession();
        Query q = session.createQuery("select A.Id,A.GiaBan From ChiTietSanPham A Where Id = '" + idsp + "'");
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

    public boolean update(String Idhd, String Idsp, int soluong) {
        try {
            int dongia = getDonGia(Idsp);
            Session session = HibernatUtil.getFACTORY().openSession();
            HoaDonChiTiet hdct = new HoaDonChiTiet();
            HoaDon hd = session.get(HoaDon.class, Idhd);
            ChiTietSanPham sp = session.get(ChiTietSanPham.class, Idsp);
            hdct.setIdHoaDon(hd);
            hdct.setIdChiTietSP(sp);
            hdct.setSoLuong(soluong);
            int tongtien = soluong * dongia;
            hdct.setDonGia(BigDecimal.valueOf(tongtien));

            session.getTransaction().begin();
            session.update(hdct);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean delete(String idhd, String idsp) {

        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            HoaDonChiTiet hdct = new HoaDonChiTiet();
            HoaDon hd = session.get(HoaDon.class, idhd);
            ChiTietSanPham ct = session.get(ChiTietSanPham.class, idsp);
            hdct.setIdHoaDon(hd);
            hdct.setIdChiTietSP(ct);
            session.getTransaction().begin();
            session.delete(hdct);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        HoaDonChiTietRepo hd = new HoaDonChiTietRepo();
        hd.update("C896DA82-FCBC-443A-A7C4-146FF31E48F7", "AFF37C6B-FBF9-4CA4-8E30-A8B05F4C68B8",2);
    }

}
