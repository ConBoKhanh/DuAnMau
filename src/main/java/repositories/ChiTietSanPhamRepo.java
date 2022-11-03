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
import domainModels.DongSP;
import domainModels.MauSac;
import domainModels.NSX;
import domainModels.SanPham;
import viewModels.SanPhamVModel;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class ChiTietSanPhamRepo {

    public List<Object[]> list() {
        Session session = HibernatUtil.getFACTORY().openSession();
        Query q = session.createQuery("SELECT A.Id,B.Ten ,C.Ten , E.Ten , D.Ten , A.NamBH ,A.MoTa , A.SoLuongTon , A.GiaNhap , A.GiaBan "
                + " FROM ChiTietSanPham A,SanPham B , NSX C,DongSP D,MauSac E "
                + " WHERE A.IdSP = B.Id AND A.IdNsx = C.Id AND A.IdDongSP = D.Id AND A.IdMauSac = E.Id");

        List<Object[]> list = q.getResultList();
        return list;
    }
    public List<ChiTietSanPham> listtesst() {
        Session session = HibernatUtil.getFACTORY().openSession();
        Query q = session.createQuery("From ChiTietSanPham");

        List<ChiTietSanPham> list = q.getResultList();
        return list;
    }

    public boolean add(ChiTietSanPham ct, String idsp, String idnsx, String idmau, String idDong) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            ChiTietSanPham gt = new ChiTietSanPham();

            MauSac ms = session.get(MauSac.class, idmau);
            NSX nx = session.get(NSX.class, idnsx);
            SanPham sp = session.get(SanPham.class, idsp);
            DongSP dong = session.get(DongSP.class, idDong);
            gt.setIdMauSac(ms);
            gt.setIdNsx(nx);
            gt.setIdSP(sp);
            gt.setIdDongSP(dong);
            gt.setNamBH(ct.getNamBH());
            gt.setMoTa(ct.getMoTa());
            gt.setSoLuongTon(ct.getSoLuongTon());
            gt.setGiaNhap((ct.getGiaNhap()));
            gt.setGiaBan(ct.getGiaBan());

            session.getTransaction().begin();
            session.save(gt);
            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(ChiTietSanPham ct, String idsp, String idnsx, String idmau, String idDong, String idct) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            ChiTietSanPham gt = session.get(ChiTietSanPham.class, idct);

            MauSac ms = session.get(MauSac.class, idmau);
            NSX nx = session.get(NSX.class, idnsx);
            SanPham sp = session.get(SanPham.class, idsp);
            DongSP dong = session.get(DongSP.class, idDong);
            gt.setIdMauSac(ms);
            gt.setIdNsx(nx);
            gt.setIdSP(sp);
            gt.setIdDongSP(dong);
            gt.setNamBH(ct.getNamBH());
            gt.setMoTa(ct.getMoTa());
            gt.setSoLuongTon(ct.getSoLuongTon());
            gt.setGiaNhap((ct.getGiaNhap()));
            gt.setGiaBan(ct.getGiaBan());

            session.getTransaction().begin();
            session.update(gt);
            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateXoa(String idct) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            ChiTietSanPham gt = session.get(ChiTietSanPham.class, idct);
            gt.setSoLuongTon(0);
            session.getTransaction().begin();
            session.update(gt);
            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean Delete(String idct) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            ChiTietSanPham gt = session.get(ChiTietSanPham.class, idct);
            session.getTransaction().begin();
            session.delete(gt);
            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<ChiTietSanPham> list1() {
        Session session = HibernatUtil.getFACTORY().openSession();
        
        Query q = session.createQuery("From ChiTietSanPham");

        List<ChiTietSanPham> list = q.getResultList();
        return list;
    }
    
    public static void main(String[] args) {
        ChiTietSanPhamRepo rp = new ChiTietSanPhamRepo();
        List<ChiTietSanPham> a  = rp.listtesst();
        
        for (ChiTietSanPham chiTietSanPham : a) {
            System.out.println(a.toString());
        }
//        List<Object[]> list = rp.list();
//         List<SanPhamVModel> i = new ArrayList<>();
//         for (Object[] hd : list) {
//            i.add(new SanPhamVModel(hd[0].toString(), hd[1].toString(), hd[2].toString()));
//        }
//         for (SanPhamVModel sanPhamVModel : i) {
//             System.out.printf(sanPhamVModel.toString());
//        }
    }
}
