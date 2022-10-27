/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.KhachHang;
import utilities.mycompany.DBConext.HibernatUtil;
import java.sql.Date;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class KhachHangRepo {

    public List<KhachHang> getKH() {
        Session session = HibernatUtil.getFACTORY().openSession();
        Query q = session.createQuery("From KhachHang");
        List<KhachHang> list = q.getResultList();
        return list;
    }

    public boolean addKh(KhachHang kh, String date) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            KhachHang k = new KhachHang();
            k.setMa(kh.getMa());
            k.setTen(kh.getTen());
            k.setNgaySinh(Date.valueOf(date));
            k.setSdt(kh.getSdt());
            k.setDiaChi(kh.getDiaChi());
            k.setThanhPho(kh.getThanhPho());
            k.setMatKhau(kh.getMatKhau());

            session.getTransaction().begin();
            session.save(k);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean Update(KhachHang kh, String date) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            KhachHang k = session.get(KhachHang.class, kh.getId());
            k.setMa(kh.getMa());
            k.setTen(kh.getTen());
            k.setNgaySinh(Date.valueOf(date));
            k.setSdt(kh.getSdt());
            k.setDiaChi(kh.getDiaChi());
            k.setThanhPho(kh.getThanhPho());
            k.setMatKhau(kh.getMatKhau());

            session.getTransaction().begin();
            session.update(k);
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
            KhachHang k = session.get(KhachHang.class, id);
            session.getTransaction().begin();
            session.delete(k);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
