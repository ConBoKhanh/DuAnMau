/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.CuaHang;
import domainModels.MauSac;
import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class CuaHangRepo {
      public List<CuaHang> getList(){
         Session session = HibernatUtil.getFACTORY().openSession();
         List<CuaHang> list = new ArrayList<>();
         Query q = session.createQuery("FROM CuaHang");
         list = q.getResultList();
         session.close();
         return list;
    }
    public boolean add(CuaHang s) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            CuaHang sp = new CuaHang();
            sp.setMa(s.getMa());
            sp.setTen(s.getTen());
            sp.setDiaChi(s.getDiaChi());
            sp.setThanhPho(s.getThanhPho());
            sp.setQuocGia(s.getQuocGia());
            session.getTransaction().begin();
            session.save(sp);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(String id,CuaHang s) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            CuaHang sp = session.get(CuaHang.class, id);
            sp.setTen(s.getTen());
            sp.setDiaChi(s.getDiaChi());
            sp.setThanhPho(s.getThanhPho());
            sp.setQuocGia(s.getQuocGia());
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
            CuaHang sp = session.get(CuaHang.class, id);
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
