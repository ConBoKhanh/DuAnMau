package utilities.mycompany.DBConext;


import java.util.Properties;
import domainModels.ChiTietGioHang;
import domainModels.ChiTietSanPham;
import domainModels.ChucVu;
import domainModels.CuaHang;
import domainModels.DongSP;
import domainModels.GioHang;
import domainModels.HoaDon;
import domainModels.HoaDonChiTiet;
import domainModels.KhachHang;
import domainModels.MauSac;
import domainModels.NSX;
import domainModels.NhanVien;
import domainModels.SanPham;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernatUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "12345678");
        properties.put(Environment.SHOW_SQL, "true");
        //gen DB tự động
//        properties.put(Environment.HBM2DDL_AUTO, "create");

        conf.setProperties(properties);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(NSX.class);
        conf.addAnnotatedClass(DongSP.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(ChiTietSanPham.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(GioHang.class);
        conf.addAnnotatedClass(ChiTietGioHang.class);
        conf.addAnnotatedClass(CuaHang.class);
        conf.addAnnotatedClass(ChucVu.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }

}
