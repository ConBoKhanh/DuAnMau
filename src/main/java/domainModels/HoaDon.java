/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModels;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "HoaDon")
public class HoaDon implements Serializable{

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String Id;
    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang IdKH;
    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien IdNV;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private Date NgayShip;
    private Date NgayNhan;
    private int TinhTrang;
    private String TenNguoiNhan;
    private String DiaChi;
    private String Sdt;
    
    
     @OneToMany(mappedBy = "IdHoaDon")
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
     * @return the IdKH
     */
    public KhachHang getIdKH() {
        return IdKH;
    }

    /**
     * @param IdKH the IdKH to set
     */
    public void setIdKH(KhachHang IdKH) {
        this.IdKH = IdKH;
    }

    /**
     * @return the IdNV
     */
    public NhanVien getIdNV() {
        return IdNV;
    }

    /**
     * @param IdNV the IdNV to set
     */
    public void setIdNV(NhanVien IdNV) {
        this.IdNV = IdNV;
    }

    /**
     * @return the Ma
     */
    public String getMa() {
        return Ma;
    }

    /**
     * @param Ma the Ma to set
     */
    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    /**
     * @return the NgayTao
     */
    public Date getNgayTao() {
        return NgayTao;
    }

    /**
     * @param NgayTao the NgayTao to set
     */
    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    /**
     * @return the NgayThanhToan
     */
    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    /**
     * @param NgayThanhToan the NgayThanhToan to set
     */
    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    /**
     * @return the NgayShip
     */
    public Date getNgayShip() {
        return NgayShip;
    }

    /**
     * @param NgayShip the NgayShip to set
     */
    public void setNgayShip(Date NgayShip) {
        this.NgayShip = NgayShip;
    }

    /**
     * @return the NgayNhan
     */
    public Date getNgayNhan() {
        return NgayNhan;
    }

    /**
     * @param NgayNhan the NgayNhan to set
     */
    public void setNgayNhan(Date NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    /**
     * @return the TinhTrang
     */
    public int getTinhTrang() {
        return TinhTrang;
    }

    /**
     * @param TinhTrang the TinhTrang to set
     */
    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    /**
     * @return the TenNguoiNhan
     */
    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    /**
     * @param TenNguoiNhan the TenNguoiNhan to set
     */
    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the Sdt
     */
    public String getSdt() {
        return Sdt;
    }

    /**
     * @param Sdt the Sdt to set
     */
    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    @Override
    public String toString() {
        return Id ;
    }

    public void setIdNV(String dC0CA4C5DF04ABCACF36636F3764CAF) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
