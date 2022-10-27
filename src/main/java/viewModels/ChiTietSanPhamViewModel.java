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
public class ChiTietSanPhamViewModel {
    private String id;
    private String TenSP;
    private String TenNSX;
    private String MauSac;
    private String DongSP;
    private int NamBH;
    private String MoTa;
    private int SoLuongTon;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;

    public ChiTietSanPhamViewModel() {
    }

    public ChiTietSanPhamViewModel(String id, String TenSP, String TenNSX, String MauSac, String DongSP, int NamBH, String MoTa, int SoLuongTon, BigDecimal GiaNhap, BigDecimal GiaBan) {
        this.id = id;
        this.TenSP = TenSP;
        this.TenNSX = TenNSX;
        this.MauSac = MauSac;
        this.DongSP = DongSP;
        this.NamBH = NamBH;
        this.MoTa = MoTa;
        this.SoLuongTon = SoLuongTon;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getDongSP() {
        return DongSP;
    }

    public void setDongSP(String DongSP) {
        this.DongSP = DongSP;
    }

    public int getNamBH() {
        return NamBH;
    }

    public void setNamBH(int NamBH) {
        this.NamBH = NamBH;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
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
