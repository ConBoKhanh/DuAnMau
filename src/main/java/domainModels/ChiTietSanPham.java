/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "ChiTietSP")
public class ChiTietSanPham implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String Id;

    @ManyToOne
    @JoinColumn(name = "IdSP")
    private SanPham IdSP;

    @ManyToOne
    @JoinColumn(name = "IdNsx")
    private NSX IdNsx;

    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private MauSac IdMauSac;

    @ManyToOne
    @JoinColumn(name = "IdDongSP")
    private DongSP IdDongSP;
    
    private int NamBH;
    private String MoTa;
    private int SoLuongTon;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;
    
    
    @OneToMany(mappedBy = "IdChiTietSP")
    private Set<ChiTietGioHang> chiTietGioHangs;
    
    @OneToMany(mappedBy = "IdChiTietSP")
    private Set<HoaDonChiTiet> hoaDonChiTiets;
    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the IdSP
     */
    public SanPham getIdSP() {
        return IdSP;
    }

    /**
     * @param IdSP the IdSP to set
     */
    public void setIdSP(SanPham IdSP) {
        this.IdSP = IdSP;
    }

    /**
     * @return the IdNsx
     */
    public NSX getIdNsx() {
        return IdNsx;
    }

    /**
     * @param IdNsx the IdNsx to set
     */
    public void setIdNsx(NSX IdNsx) {
        this.IdNsx = IdNsx;
    }

    /**
     * @return the IdMauSac
     */
    public MauSac getIdMauSac() {
        return IdMauSac;
    }

    /**
     * @param IdMauSac the IdMauSac to set
     */
    public void setIdMauSac(MauSac IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    /**
     * @return the IdDongSP
     */
    public DongSP getIdDongSP() {
        return IdDongSP;
    }

    /**
     * @param IdDongSP the IdDongSP to set
     */
    public void setIdDongSP(DongSP IdDongSP) {
        this.IdDongSP = IdDongSP;
    }

    /**
     * @return the NamBH
     */
    public int getNamBH() {
        return NamBH;
    }

    /**
     * @param NamBH the NamBH to set
     */
    public void setNamBH(int NamBH) {
        this.NamBH = NamBH;
    }

    /**
     * @return the MoTa
     */
    public String getMoTa() {
        return MoTa;
    }

    /**
     * @param MoTa the MoTa to set
     */
    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    /**
     * @return the SoLuongTon
     */
    public int getSoLuongTon() {
        return SoLuongTon;
    }

    /**
     * @param SoLuongTon the SoLuongTon to set
     */
    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    /**
     * @return the GiaNhap
     */
    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    /**
     * @param GiaNhap the GiaNhap to set
     */
    public void setGiaNhap(BigDecimal GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    /**
     * @return the GiaBan
     */
    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    /**
     * @param GiaBan the GiaBan to set
     */
    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "Id=" + Id + ", IdSP=" + IdSP + ", IdNsx=" + IdNsx + ", IdMauSac=" + IdMauSac + ", IdDongSP=" + IdDongSP + ", NamBH=" + NamBH + ", MoTa=" + MoTa + ", SoLuongTon=" + SoLuongTon + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", chiTietGioHangs=" + chiTietGioHangs + ", hoaDonChiTiets=" + hoaDonChiTiets + '}';
    }

    

   
    
    
}
