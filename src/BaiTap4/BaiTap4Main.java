/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author phamthu
 */
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tạo 3 chuyến xe nôi thành
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        
        ChuyenXeNoiThanh chuyenXeNoiThanh1 = new ChuyenXeNoiThanh();
        chuyenXeNoiThanh1.setHoTenTaiXe("phạm thị thu");
        chuyenXeNoiThanh1.setMaChuyenXe("11");
        chuyenXeNoiThanh1.setSoXe("N01");
        chuyenXeNoiThanh1.setSoTuyen("01");
        chuyenXeNoiThanh1.setSoKm("100");
        chuyenXeNoiThanh1.setDoanhThu(20000);
        
        
        
        ChuyenXeNoiThanh chuyenXeNoiThanh2 = new ChuyenXeNoiThanh();
        chuyenXeNoiThanh2.setHoTenTaiXe("phạm tùng phương");
        chuyenXeNoiThanh2.setMaChuyenXe("12");
        chuyenXeNoiThanh2.setSoXe("N02");
        chuyenXeNoiThanh2.setSoTuyen("02");
        chuyenXeNoiThanh2.setSoKm("200");
        chuyenXeNoiThanh2.setDoanhThu(40000);
       
        
        
        
        ChuyenXeNoiThanh chuyenXeNoiThanh3 = new ChuyenXeNoiThanh();
        chuyenXeNoiThanh3.setHoTenTaiXe("nguyễn thu trang");
        chuyenXeNoiThanh3.setMaChuyenXe("13");
        chuyenXeNoiThanh3.setSoXe("N03");
        chuyenXeNoiThanh3.setSoTuyen("03");
        chuyenXeNoiThanh3.setSoKm("300");
        chuyenXeNoiThanh3.setDoanhThu(30000);
        
        //tạo 3 chuyen xe ngoai thành
        
        ChuyenXeNgoaiThanh chuyenXeNgoaiThanh1 = new ChuyenXeNgoaiThanh();
        chuyenXeNgoaiThanh1.setHoTenTaiXe("Nguyễn văn A");
        chuyenXeNgoaiThanh1.setMaChuyenXe("A1");
        chuyenXeNgoaiThanh1.setSoXe("NF01");
        chuyenXeNgoaiThanh1.setNoiDen("nha trang");
        chuyenXeNgoaiThanh1.setSoNgayDi("6");
        chuyenXeNgoaiThanh1.setDoanhThu(24000);
      
        
       
        ChuyenXeNgoaiThanh chuyenXeNgoaiThanh2 = new ChuyenXeNgoaiThanh();
        chuyenXeNgoaiThanh2.setHoTenTaiXe("Nguyễn văn B");
        chuyenXeNgoaiThanh2.setMaChuyenXe("B1");
        chuyenXeNgoaiThanh2.setSoXe("NF02");
        chuyenXeNgoaiThanh2.setNoiDen("hà nội");
        chuyenXeNgoaiThanh2.setSoNgayDi("8");
        chuyenXeNgoaiThanh2.setDoanhThu(54000);
        
         
        ChuyenXeNgoaiThanh chuyenXeNgoaiThanh3 = new ChuyenXeNgoaiThanh();
        chuyenXeNgoaiThanh3.setHoTenTaiXe("Nguyễn văn c");
        chuyenXeNgoaiThanh3.setMaChuyenXe("C1");
        chuyenXeNgoaiThanh3.setSoXe("NF03");
        chuyenXeNgoaiThanh3.setNoiDen("đà nẳng");
        chuyenXeNgoaiThanh3.setSoNgayDi("3");
        chuyenXeNgoaiThanh3.setDoanhThu(20000);
     
        
        // thêm chuyến Xe nội thành
        quanLyChuyenXe.themChuyenXeNoiThanh(chuyenXeNoiThanh1);
        quanLyChuyenXe.themChuyenXeNoiThanh(chuyenXeNoiThanh2);
        quanLyChuyenXe.themChuyenXeNoiThanh(chuyenXeNoiThanh3);
        //thêm chuyến xe ngoại thành
        
        
        //in thông tin từng chuyến xe ngoại thành
         
        quanLyChuyenXe.themChuyenXeNgoaiThanh(chuyenXeNgoaiThanh1);
        quanLyChuyenXe.themChuyenXeNgoaiThanh(chuyenXeNgoaiThanh2);
        quanLyChuyenXe.themChuyenXeNgoaiThanh(chuyenXeNgoaiThanh3);
       ///---------------------------------------
       //tổng doanh thu xe nội thành
        System.out.println("TỔNG DOANH THU XE NỘI THÀNH :"+ quanLyChuyenXe.tinhDoanhThuNoiThanh());
        //tổng doanh thu xe ngoại thành
        System.out.println("TỔNG DOANH THU XE NGOẠI THÀNH :"+ quanLyChuyenXe.tinhDoanhThuNgoaiThanh());
        //Tổng doanh thu của 2 xe
        System.out.println("TỔNG DOANH THU CỦA 2 XE :"+quanLyChuyenXe.tongDoanhThu());
        
        quanLyChuyenXe.InThongTinTungChuyenXe();
        
                
        
    }
    
}
