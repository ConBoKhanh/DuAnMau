package services;

import utilities.mycompany.DBConext.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import domainModels.ChiTietSanPham;
import domainModels.SanPham;
import org.hibernate.Session;
import repositories.ChiTietSanPhamRepo;
import viewModels.ChiTietSanPhamViewModel;
import viewModels.SanPhamVModel;
import java.math.BigDecimal;
import services.Impl.IManageChiTietSanPhamService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class ChiTietSanPhamService implements IManageChiTietSanPhamService {

    private final ChiTietSanPhamRepo repo = new ChiTietSanPhamRepo();

    @Override
    public boolean add(ChiTietSanPham ct, String idsp, String idnsx, String idmau, String idDong) {
        try {
            return repo.add(ct, idsp, idnsx, idmau, idDong);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(ChiTietSanPham ct, String idsp, String idnsx, String idmau, String idDong, String idct) {
        try {
            return repo.update(ct, idsp, idnsx, idmau, idDong, idct);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateXoa(String idct) {
        try {
            return repo.updateXoa(idct);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean Delete(String idct) {
        try {
            return repo.Delete(idct);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<ChiTietSanPhamViewModel> list() {
        List<Object[]> list = repo.list();
        List<ChiTietSanPhamViewModel> i = new ArrayList<>();
        for (Object[] a : list) {
            i.add(new ChiTietSanPhamViewModel(a[0].toString(), a[1].toString(), a[2].toString(), a[3].toString(), a[4].toString(),
                    Integer.parseInt(a[5].toString()), a[6].toString(), Integer.parseInt(a[7].toString()),
                    BigDecimal.valueOf(Integer.parseInt(a[8].toString())), BigDecimal.valueOf(Integer.parseInt(a[9].toString()))));
        }
        return i;
    }

}
