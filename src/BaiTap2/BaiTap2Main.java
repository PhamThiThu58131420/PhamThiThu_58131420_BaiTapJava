/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author phamthu
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
     // nhân vien 1
     NhanVien nhanVien1  = new NhanVien();
     nhanVien1.setTen("phạm thị thu");
     nhanVien1.setDiaChi("nha trang");
     nhanVien1.setTuoi("22");
     nhanVien1.setTongSoGioLam(20);
     nhanVien1.setTienluong(4000);
     quanLyNhanVien.them(nhanVien1);
     // nhân vien 2
     NhanVien nhanVien2  = new NhanVien();
     nhanVien2.setTen("mai xuân vũ");
     nhanVien2.setDiaChi("vũng tàu");
     nhanVien2.setTuoi("22");
     nhanVien2.setTongSoGioLam(300);
     nhanVien2.setTienluong(1500);
     quanLyNhanVien.them(nhanVien2);
     
     // nhân vien 3
     NhanVien nhanVien3  = new NhanVien();
     nhanVien3.setTen("phạm thu trang");
     nhanVien3.setDiaChi("quảng trị");
     nhanVien3.setTuoi("21");
     nhanVien3.setTongSoGioLam(500);
     nhanVien3.setTienluong(2000);
     quanLyNhanVien.them(nhanVien3);
     
     // nhân vien 4
     NhanVien nhanVien4  = new NhanVien();
     nhanVien4.setTen("lê thi lan hương");
     nhanVien4.setDiaChi("hà nội");
     nhanVien4.setTuoi("26");
     nhanVien4.setTongSoGioLam(230);
     nhanVien4.setTienluong(1000);
     quanLyNhanVien.them(nhanVien4);
     
     // nhân vien 5
     NhanVien nhanVien5  = new NhanVien();
     nhanVien5.setTen("phạm tùng phương");
     nhanVien5.setDiaChi("tphcm");
     nhanVien5.setTuoi("32");
     nhanVien5.setTongSoGioLam(200);
     nhanVien5.setTienluong(5000);
     quanLyNhanVien.them(nhanVien5);
     
     
     quanLyNhanVien.inDS();
     
     
    }
    
}
