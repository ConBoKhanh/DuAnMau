/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import domainModels.DongSP;
import domainModels.NSX;
import domainModels.SanPham;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class DongSPRepo {
    public List<DongSP> getListSP(){
         Session session = HibernatUtil.getFACTORY().openSession();
         List<DongSP> list = new ArrayList<>();
         Query q = session.createQuery("FROM DongSP");
         list = q.getResultList();
         session.close();
         return list;
    }
    public List<DongSP> getListSPtest(){
         Session session = HibernatUtil.getFACTORY().openSession();
         List<DongSP> list = new ArrayList<>();
         Query q = session.createQuery("FROM DongSP");
         list = q.getResultList();
         session.close();
         return list;
    }
     public boolean addSp(DongSP s) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            DongSP sp = new DongSP();
            sp.setMa(s.getMa());
            sp.setTen(s.getTen());
            session.getTransaction().begin();
            session.save(sp);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(String Ten, String id) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            DongSP sp = session.get(DongSP.class, id);
            sp.setTen(Ten);
            session.getTransaction().begin();
            session.update(sp);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(String id) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            DongSP sp = session.get(DongSP.class, id);
            session.getTransaction().begin();
            session.delete(sp);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public static void main(String[] args) {
        DongSPRepo s = new DongSPRepo();
        List<DongSP> list = s.getListSPtest();
        for (DongSP l : list) {
            System.out.println(l.toString());
        }
    }
}
