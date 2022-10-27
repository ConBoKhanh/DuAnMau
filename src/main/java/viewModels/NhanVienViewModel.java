/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModels;

/**
 *
 * @author Admin
 */
public class NhanVienViewModel {

    private String Id;
    private String Ma;
    private String Ten;
    private String GioiTinh;
    private String sdt;
    private String pass;
    private String ChucVu;
    private String CuaHang;
    private int TrangThai;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String Id, String Ma, String Ten, String GioiTinh, String sdt, String pass, String ChucVu, String CuaHang, int TrangThai) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.sdt = sdt;
        this.pass = pass;
        this.ChucVu = ChucVu;
        this.CuaHang = CuaHang;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getCuaHang() {
        return CuaHang;
    }

    public void setCuaHang(String CuaHang) {
        this.CuaHang = CuaHang;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

}
