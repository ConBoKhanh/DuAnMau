/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModels;



/**
 *
 * @author Admin
 */
public class HoaDonViewModel {
    private String idHD;
    private String Ma;
    private String TenNV;
    private int TrangThai;
    private Object Ngaytt;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String idHD, String Ma, String TenNV, int TrangThai, Object Ngaytt) {
        this.idHD = idHD;
        this.Ma = Ma;
        this.TenNV = TenNV;
        this.TrangThai = TrangThai;
        this.Ngaytt = Ngaytt;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Object getNgaytt() {
        return Ngaytt;
    }

    public void setNgaytt(Object Ngaytt) {
        this.Ngaytt = Ngaytt;
    }

  
}
