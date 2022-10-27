/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import domainModels.NSX;
import domainModels.SanPham;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class NSCXRepo {
    public List<NSX> getListSP(){
         Session session = HibernatUtil.getFACTORY().openSession();
         List<NSX> list = new ArrayList<>();
         Query q = session.createQuery("FROM NSX");
         list = q.getResultList();
         session.close();
         return list;
    }
        public boolean addSp(NSX s) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            NSX sp = new NSX();
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
        public boolean update(String ten , String id) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            NSX sp = session.get(NSX.class, id);
            sp.setTen(ten);
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
            NSX sp = session.get(NSX.class, id);
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
