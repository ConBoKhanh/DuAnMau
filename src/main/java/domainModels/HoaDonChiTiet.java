/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon IdHoaDon;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "IdChiTietSP")
    private ChiTietSanPham IdChiTietSP;
    
    @Column(name = "SoLuong")
    private int SoLuong;
    
    @Column(name = "DonGia")
    private BigDecimal DonGia;

    /**
     * @return the IdHoaDon
     */
    public HoaDon getIdHoaDon() {
        return IdHoaDon;
    }

    /**
     * @param IdHoaDon the IdHoaDon to set
     */
    public void setIdHoaDon(HoaDon IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
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
    
    
}
