/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModels;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class BanHangViewModel {

    private String Id;
    private String MaSP;
    private String TenSP;
    private int NamBH;
    private String MauSac;
    private String MoTa;
    private int SoLuong;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;

    public BanHangViewModel(String Id, String MaSP, String TenSP, int NamBH, String MauSac, String MoTa, int SoLuong, BigDecimal GiaNhap, BigDecimal GiaBan) {
        this.Id = Id;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.NamBH = NamBH;
        this.MauSac = MauSac;
        this.MoTa = MoTa;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    public BanHangViewModel() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getNamBH() {
        return NamBH;
    }

    public void setNamBH(int NamBH) {
        this.NamBH = NamBH;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(BigDecimal GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }
    
    
}
