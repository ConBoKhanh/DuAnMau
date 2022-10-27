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
public class HoaDonChiTietViewModel {

    private String Idhd;
    private String Idsp;
    private String Tensp;
    private int SoLuong;
    private BigDecimal DonGia;

    public HoaDonChiTietViewModel(String Idhd, String Idsp, String Tensp, int SoLuong, BigDecimal DonGia) {
        this.Idhd = Idhd;
        this.Idsp = Idsp;
        this.Tensp = Tensp;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public HoaDonChiTietViewModel() {
    }

    public String getIdhd() {
        return Idhd;
    }

    public void setIdhd(String Idhd) {
        this.Idhd = Idhd;
    }

    public String getIdsp() {
        return Idsp;
    }

    public void setIdsp(String Idsp) {
        this.Idsp = Idsp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

}
