/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.ChiTietSanPham;
import domainModels.DongSP;
import domainModels.MauSac;
import domainModels.NSX;
import domainModels.SanPham;
import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class BanHangRepo {

    public List<Object[]> getListSP()  {
        Session session = HibernatUtil.getFACTORY().openSession();

        Query q = session.createQuery("SELECT B.Id ,A.Ma ,A.Ten ,B.NamBH ,C.Ten ,B.MoTa,B.SoLuongTon,B.GiaNhap,B.GiaBan "
                + "FROM SanPham A JOIN ChiTietSanPham B ON A.Id = B.IdSP JOIN MauSac C ON  B.IdMauSac = C.Id Where B.SoLuongTon > 0");
        List<Object[]> list = q.getResultList();

        return list;
    }
    
    public List<Object[]> getListSPByMa(String name)  {
        Session session = HibernatUtil.getFACTORY().openSession();

        Query q = session.createQuery("SELECT B.Id ,A.Ma ,A.Ten ,B.NamBH ,C.Ten ,B.MoTa,B.SoLuongTon,B.GiaNhap,B.GiaBan \n" +
"                FROM SanPham A JOIN ChiTietSanPham B ON A.Id = B.IdSP JOIN MauSac C ON  B.IdMauSac = C.Id\n" +
"                Where A.Ten LIKE '%"+name+"%' AND B.SoLuongTon > 0");
        List<Object[]> list = q.getResultList();

        return list;
    }
        public boolean update(String IdSp, int Soluong) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            ChiTietSanPham gt = session.get(ChiTietSanPham.class, IdSp);
            gt.setSoLuongTon(Soluong);
            session.getTransaction().begin();
            session.update(gt);
            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
        public static void main(String[] args) {
//            BanHangRepo v = new BanHangRepo();
//        List<Object[]> getListSPByMa = v.getListSPByMa("");
//            for (Object[] a : getListSPByMa) {
//                System.out.println(a[0]+"\n");
//            }
        int i = Integer.valueOf("1");
            System.out.println(i);
    }

}
