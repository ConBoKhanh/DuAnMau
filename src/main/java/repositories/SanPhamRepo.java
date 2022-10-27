/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import domainModels.SanPham;
import viewModels.SanPhamVModel;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class SanPhamRepo {

    public List<SanPham> getListSP() {
        Session session = HibernatUtil.getFACTORY().openSession();
        List<SanPham> list = new ArrayList<>();
        Query q = session.createQuery("FROM SanPham");
        list = q.getResultList();
        session.close();
        return list;
    }

    public boolean addSp(SanPham s) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            SanPham sp = new SanPham();
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
            SanPham sp = session.get(SanPham.class, id);
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
            SanPham sp = session.get(SanPham.class, id);
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
        
    }
}
