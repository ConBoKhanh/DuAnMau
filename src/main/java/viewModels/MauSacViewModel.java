/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModels;

/**
 *
 * @author Admin
 */
public class MauSacViewModel {
    private String Id;
    private String Ma;
    private String Ten;

    public MauSacViewModel() {
    }

    public MauSacViewModel(String Id, String Ma, String Ten) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
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

    @Override
    public String toString() {
        return "SanPhamVModel{" + "Id=" + Id + ", Ma=" + Ma + ", Ten=" + Ten + "\n" +'}';
    }
    
    
    
}
