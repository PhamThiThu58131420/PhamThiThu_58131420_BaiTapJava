/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author phamthu
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nhanVien = new NhanVien("Phạm Thị Thu", "20", "Nha Trang", 400, 4000);
        System.out.println("Tên:"+ nhanVien.getTen());
        System.out.println("Tuổi: "+nhanVien.getTuoi());
        System.out.println("Địa Chỉ:"+nhanVien.getDiaChi());
        System.out.println("Tổng số giờ làm:"+nhanVien.getTongSoGioLam());
        System.out.println("Tiền Lương :"+nhanVien.getTienluong());
       

        System.out.println("Thông tin nhân viên:\n"+nhanVien.getThongTin());
        
        
        System.out.println("Tổng lương của nhân viên: "+ nhanVien.tinhThuong());
        
    }
    
}
