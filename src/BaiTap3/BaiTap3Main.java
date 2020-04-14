/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author phamthu
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //sinh viên biz
        System.out.println("---------------------SINH VIÊN BIZ-------------");
        //sinh viên IT
        SinhVienBiz sinhVienBiz = new SinhVienBiz(7, 6, "Mai hạnh nguyên","thực phẩm");
        System.out.println("Họ tên:"+ sinhVienBiz.getHoTen());
        System.out.println("Ngành: "+sinhVienBiz.getNganh());
        System.out.println("Điểm marketing:"+sinhVienBiz.getDiemMarketing());
        System.out.println("Điểm sales:"+sinhVienBiz.getDiemSales());
        System.out.println("Điểm sinh viên BIZ:"+sinhVienBiz.getDiem());
        System.out.println("Học lực:"+sinhVienBiz.getHocLuc());
        
          System.out.println("---------------------SINH VIÊN IT-------------");
        SinhVienIT sinhVienIT = new SinhVienIT(6, 3, 7,"phạm hồng ngọc", "du lịch");
        System.out.println("Họ tên:"+ sinhVienIT.getHoTen());
        System.out.println("Ngành: "+sinhVienIT.getNganh());
        System.out.println("Điểm Java:"+sinhVienIT.getDiemJava());
        System.out.println("Điểm CSS:"+sinhVienIT.getDiemCss());
        System.out.println("Điểm HTML:"+sinhVienIT.getDiemHtml());
        System.out.println("Điểm sinh viên IT:"+sinhVienIT.getDiem());
        System.out.println("Hoc Lực :"+sinhVienIT.getHocLuc());
        
       
          // sinh viên poly
           System.out.println("---------------------SINH VIÊN POLY-------------");
        SinhVienPoly sinhVienPoly = new SinhVienIT(8, 7, 6, "thu", "cntt");
        sinhVienPoly.xuat();
        
        
    }
    
}
