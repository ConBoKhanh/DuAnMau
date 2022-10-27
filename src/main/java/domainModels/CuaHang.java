/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModels;

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
@Table(name = "CuaHang")
public class CuaHang {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String Id;
    private String Ma;
    private String Ten;
    private String DiaChi;
    private String ThanhPho;
    private String QuocGia;

    @OneToMany(mappedBy = "IdCH")
    private Set<NhanVien> nhanViens;
    
    
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
    
    
    
    
}
