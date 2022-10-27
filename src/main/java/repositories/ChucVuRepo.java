/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.ChucVu;
import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class ChucVuRepo {
    public List<ChucVu> getCV(){
        Session session = HibernatUtil.getFACTORY().openSession();
        List<ChucVu> list = new ArrayList<>();
        Query q = session.createQuery("FROM ChucVu");
        list = q.getResultList();
        session.close();
        return list;
        
    }
      public boolean addCV(ChucVu s) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            ChucVu sp = new ChucVu();
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
            ChucVu sp = session.get(ChucVu.class, id);
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
            ChucVu sp = session.get(ChucVu.class, id);
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
