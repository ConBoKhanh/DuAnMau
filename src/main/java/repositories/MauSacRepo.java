/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import domainModels.MauSac;
import domainModels.NSX;
import domainModels.SanPham;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class MauSacRepo {
    public List<MauSac> getListSP(){
         Session session = HibernatUtil.getFACTORY().openSession();
         List<MauSac> list = new ArrayList<>();
         Query q = session.createQuery("FROM MauSac");
         list = q.getResultList();
         session.close();
         return list;
    }
    public boolean addSp(MauSac s) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            MauSac sp = new MauSac();
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
            MauSac sp = session.get(MauSac.class, id);
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
            MauSac sp = session.get(MauSac.class, id);
            session.getTransaction().begin();
            session.delete(sp);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
  
}
