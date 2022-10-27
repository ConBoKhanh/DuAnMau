/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import views.MenuView;
import views.viewBanHang;
import views.viewChiTietSanPham;
import views.viewDangNhap;
import views.viewNhanVien;
import views.viewSanPham;

public class Application { 

    public static void main(String[] args) {
        viewDangNhap v = new viewDangNhap();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
}
