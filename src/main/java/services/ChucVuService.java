/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.ChucVu;
import repositories.ChucVuRepo;
import viewModels.ChucVuModelView;
import java.util.ArrayList;
import java.util.List;
import services.Impl.IManageChucVuService;

/**
 *
 * @author Admin
 */
public class ChucVuService implements IManageChucVuService {

    private final ChucVuRepo repo = new ChucVuRepo();

    @Override
    public List<ChucVuModelView> getList() {
        List<ChucVu> a = repo.getCV();

        List<ChucVuModelView> b = new ArrayList<>();

        for (ChucVu c : a) {
            b.add(new ChucVuModelView(c.getId(), c.getMa(), c.getTen()));
        }
        
        return b;
    }

    @Override
    public boolean addcv(ChucVu s) {
        try {
            return repo.addCV(s);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(String Ten, String id) {
        try {
            return repo.update(Ten, id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try {
            return repo.delete(id);
        } catch (Exception e) {
            return false;
        }
    }
}
