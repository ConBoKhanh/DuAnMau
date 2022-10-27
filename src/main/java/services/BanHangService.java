/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import repositories.BanHangRepo;
import viewModels.BanHangViewModel;
import java.awt.image.BandedSampleModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import services.Impl.IManageBanHangService;

/**
 *
 * @author Admin
 */
public class BanHangService implements IManageBanHangService {

    private final BanHangRepo repo = new BanHangRepo();

    @Override
    public List<BanHangViewModel> getListSP() {
        List<Object[]> a = repo.getListSP();
        List<BanHangViewModel> b = new ArrayList<>();
        for (Object[] d : a) {
            b.add(new BanHangViewModel(d[0].toString(), d[1].toString(),
                    d[2].toString(), Integer.parseInt(d[3].toString()),
                    d[4].toString(), d[5].toString(),
                     Integer.parseInt(d[6].toString()),
                     BigDecimal.valueOf(Integer.parseInt(d[7].toString())),
                    BigDecimal.valueOf(Integer.parseInt(d[8].toString()))));
        }

        return b;
    }

    @Override
    public boolean update(String IdSp, int Soluong) {
        try {
            return repo.update(IdSp, Soluong);
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public List<BanHangViewModel> getListSPbyname(String name) {
       List<Object[]> a = repo.getListSPByMa(name);
        List<BanHangViewModel> b = new ArrayList<>();
        for (Object[] d : a) {
            b.add(new BanHangViewModel(d[0].toString(), d[1].toString(),
                    d[2].toString(), Integer.parseInt(d[3].toString()),
                    d[4].toString(), d[5].toString(),
                     Integer.parseInt(d[6].toString()),
                     BigDecimal.valueOf(Integer.parseInt(d[7].toString())),
                    BigDecimal.valueOf(Integer.parseInt(d[8].toString()))));
        }

        return b;
    }

}
