/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import domainModels.ChiTietSanPham;
import domainModels.GioHang;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "GioHangChiTiet")
public class ChiTietGioHang implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "IdGioHang")
    private GioHang IdGioHang;
    @Id
    @ManyToOne
    @JoinColumn(name = "IdChiTietSP")
    private ChiTietSanPham IdChiTietSP;
    private int SoLuong;
    private BigDecimal DonGia;
    private BigDecimal DonGiaKhiGiam;

    /**
     * @return the IdGioHang
     */
    public GioHang getIdGioHang() {
        return IdGioHang;
    }

    /**
     * @param IdGioHang the IdGioHang to set
     */
    public void setIdGioHang(GioHang IdGioHang) {
        this.IdGioHang = IdGioHang;
    }

    /**
     * @return the IdChiTietSP
     */
    public ChiTietSanPham getIdChiTietSP() {
        return IdChiTietSP;
    }

    /**
     * @param IdChiTietSP the IdChiTietSP to set
     */
    public void setIdChiTietSP(ChiTietSanPham IdChiTietSP) {
        this.IdChiTietSP = IdChiTietSP;
    }

    /**
     * @return the SoLuong
     */
    public int getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    /**
     * @return the DonGia
     */
    public BigDecimal getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    /**
     * @return the DonGiaKhiGiam
     */
    public BigDecimal getDonGiaKhiGiam() {
        return DonGiaKhiGiam;
    }

    /**
     * @param DonGiaKhiGiam the DonGiaKhiGiam to set
     */
    public void setDonGiaKhiGiam(BigDecimal DonGiaKhiGiam) {
        this.DonGiaKhiGiam = DonGiaKhiGiam;
    }

   
    
    
}
