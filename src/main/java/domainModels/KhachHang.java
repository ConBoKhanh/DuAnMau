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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "KhachHang")
public class KhachHang implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String Id;
    private String Ma;
    private String Ten;
    private String TenDem;
    private String Ho;
    private Date NgaySinh;
    private String Sdt;
    private String DiaChi;
    private String ThanhPho;
    private String QuocGia;
    private String MatKhau;
    
    
    @OneToMany(mappedBy = "IdKH")
    private Set<GioHang> GioHangs; //
    
    @OneToMany(mappedBy = "IdKH")
    private Set<HoaDon> hoaDons;
    
    
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
     * @return the Ten
     */
    public String getTen() {
        return Ten;
    }

    /**
     * @param Ten the Ten to set
     */
    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    /**
     * @return the TenDem
     */
    public String getTenDem() {
        return TenDem;
    }

    /**
     * @param TenDem the TenDem to set
     */
    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    /**
     * @return the Ho
     */
    public String getHo() {
        return Ho;
    }

    /**
     * @param Ho the Ho to set
     */
    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    /**
     * @return the NgaySinh
     */
    public Date getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
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
     * @return the ThanhPho
     */
    public String getThanhPho() {
        return ThanhPho;
    }

    /**
     * @param ThanhPho the ThanhPho to set
     */
    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    /**
     * @return the QuocGia
     */
    public String getQuocGia() {
        return QuocGia;
    }

    /**
     * @param QuocGia the QuocGia to set
     */
    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    /**
     * @return the MatKhau
     */
    public String getMatKhau() {
        return MatKhau;
    }

    /**
     * @param MatKhau the MatKhau to set
     */
    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    /**
     * @return the GioHangs
     */
    public Set<GioHang> getGioHangs() {
        return GioHangs;
    }

    /**
     * @param GioHangs the GioHangs to set
     */
    public void setGioHangs(Set<GioHang> GioHangs) {
        this.GioHangs = GioHangs;
    }

}
