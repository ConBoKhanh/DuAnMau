/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.ChucVu;
import domainModels.CuaHang;
import domainModels.NhanVien;
import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class NhanVienRepo {

    public List<Object[]> getNV() {

        Session session = HibernatUtil.getFACTORY().openSession();
        Query q = session.createQuery("SELECT A.Id , A.Ma , A.Ten , A.GioiTinh , A.Sdt , A.MatKhau , B.Ten , C.Ten ,A.TrangThai"
                + " FROM NhanVien A ,ChucVu B ,CuaHang C Where A.IdCV = B.Id And A.IdCH = C.Id ");
        List<Object[]> nvs = q.getResultList();
        return nvs;
    }

    public boolean add(NhanVien s, String idch, String idCV) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            NhanVien nv = new NhanVien();
            CuaHang ch = session.get(CuaHang.class, idch);
            ChucVu cv = session.get(ChucVu.class, idCV);

            nv.setMa(s.getMa());
            nv.setTen(s.getTen());
            nv.setGioiTinh(s.getGioiTinh());
            nv.setSdt(s.getSdt());
            nv.setMatKhau(s.getMatKhau());
            nv.setIdCH(ch);
            nv.setIdCV(cv);
            nv.setTrangThai(1);

            session.getTransaction().begin();
            session.save(nv);
            session.getTransaction().commit();
            session.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(NhanVien s, String idch, String idCV, String idnv) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            NhanVien nv = session.get(NhanVien.class, idnv);
            CuaHang ch = session.get(CuaHang.class, idch);
            ChucVu cv = session.get(ChucVu.class, idCV);

            nv.setTen(s.getTen());
            nv.setGioiTinh(s.getGioiTinh());
            nv.setSdt(s.getSdt());
            nv.setMatKhau(s.getMatKhau());
            nv.setIdCH(ch);
            nv.setIdCV(cv);
            nv.setTrangThai(s.getTrangThai());

            session.getTransaction().begin();
            session.update(nv);
            session.getTransaction().commit();
            session.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(String idnv) {
        try {
            Session session = HibernatUtil.getFACTORY().openSession();
            NhanVien nv = session.get(NhanVien.class, idnv);
            session.getTransaction().begin();
            session.delete(nv);
            session.getTransaction().commit();
            session.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
