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
@Table(name = "NhanVien")
public class NhanVien implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String Id;
    private String Ma;
    private String Ten;
    private String TenDem;
    private String Ho;
    private String GioiTinh;
    private Date NgaySinh;
    private String DiaChi;
    private String Sdt;
    private String MatKhau;
    
    @ManyToOne
    @JoinColumn(name = "IdCH")
    private CuaHang IdCH;
    @ManyToOne
    @JoinColumn(name = "IdCV")
    private ChucVu IdCV;
    private String IdGuiBC;
    private int TrangThai;
    
    
    
    @OneToMany(mappedBy = "IdNV")
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
     * @return the GioiTinh
     */
    public String getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
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
     * @return the IdCH
     */
    public CuaHang getIdCH() {
        return IdCH;
    }

    /**
     * @param IdCH the IdCH to set
     */
    public void setIdCH(CuaHang IdCH) {
        this.IdCH = IdCH;
    }

    /**
     * @return the IdCV
     */
    public ChucVu getIdCV() {
        return IdCV;
    }

    /**
     * @param IdCV the IdCV to set
     */
    public void setIdCV(ChucVu IdCV) {
        this.IdCV = IdCV;
    }

    /**
     * @return the IdGuiBC
     */
    public String getIdGuiBC() {
        return IdGuiBC;
    }

    /**
     * @param IdGuiBC the IdGuiBC to set
     */
    public void setIdGuiBC(String IdGuiBC) {
        this.IdGuiBC = IdGuiBC;
    }

    /**
     * @return the TrangThai
     */
    public int getTrangThai() {
        return TrangThai;
    }

    /**
     * @param TrangThai the TrangThai to set
     */
    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
}
