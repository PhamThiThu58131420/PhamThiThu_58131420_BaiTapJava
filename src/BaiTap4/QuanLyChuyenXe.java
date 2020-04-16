/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;


import java.util.ArrayList;

/**
 *
 * @author phamthu
 */
public class QuanLyChuyenXe 
{
    ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanh = new ArrayList<>();
    ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanh = new ArrayList<>();
    
    //Thêm chuyến xe nội thành
    public void themChuyenXeNoiThanh(ChuyenXeNoiThanh xeNoiThanh)
    {
        chuyenXeNoiThanh.add(xeNoiThanh);
    }
    //thêm chuyến xe ngoại thành
    public void themChuyenXeNgoaiThanh(ChuyenXeNgoaiThanh xeNgoaiThanh)
    {
        chuyenXeNgoaiThanh.add(xeNgoaiThanh);
    }
    //xuất chuyến xe nội thành
    public void xuatDSChuyenXeNoiThanh()
    {
        
        for(int i=0; i<chuyenXeNoiThanh.size();i++)
        {
            System.out.println(chuyenXeNoiThanh.get(i).getMaChuyenXe());
        }
    }
    public void xuatDSChuyenXeNgoaiThanh()
    {
        //xuát chuyến xe ngoại thành
        for(int i=0; i<chuyenXeNgoaiThanh.size();i++)
        {
            System.out.println(chuyenXeNgoaiThanh.get(i).getMaChuyenXe());
        }
            
    }
    //in thông tin tùng chuyên xe
    public void InThongTinTungChuyenXe()
    {
         //in thông tin chuyến xe nội thành
        for(int i=0; i<chuyenXeNoiThanh.size();i++)
        {
            System.out.println("Thông tin chuyến xe nội thành : "+"\n"
                   +"Mã Chuyến Xe:"+ chuyenXeNoiThanh.get(i).getMaChuyenXe()+"\n"
                   +"Họ tên tài xế:"+chuyenXeNoiThanh.get(i).getHoTenTaiXe()+"\n"
                   +"Số xe:"+chuyenXeNoiThanh.get(i).getSoXe()+"\n"
                   +"Số tuyến:"+chuyenXeNoiThanh.get(i).getSoTuyen()+"\n"
                   +"số km:"+chuyenXeNoiThanh.get(i).getSoKm()+"\n"
                   +"Doanh Thu:"+chuyenXeNoiThanh.get(i).getDoanhThu());
        }
        //in thông tinchuyến xe ngoại thành
        for(int i=0; i<chuyenXeNgoaiThanh.size();i++)
        {
            System.out.println("Thông tin chuyến xe Ngoại Thành:"+ "\n"
                  +"Mã Chuyến Xe:"+chuyenXeNgoaiThanh.get(i).getMaChuyenXe()+"\n"
                  +"Họ tên tài xế:"+chuyenXeNgoaiThanh.get(i).getHoTenTaiXe()+"\n"
                  +"Số xe:"+chuyenXeNgoaiThanh.get(i).getSoXe()+"\n"
                  +"Nơi đến:"+chuyenXeNgoaiThanh.get(i).getNoiDen()+"\n"
                  +"Số ngày đi đươc:"+chuyenXeNgoaiThanh.get(i).getSoNgayDi()+"\n"
                  +"Doanh Thu:"+chuyenXeNgoaiThanh.get(i).getDoanhThu());
        }
    }
    // tổng danh thu của  xe nội thành
    public float tinhDoanhThuNoiThanh()
    {
        int sumNoiThanh=0;
         for(int i=0;i<chuyenXeNoiThanh.size();i++)
         {
             if(chuyenXeNoiThanh.get(i) instanceof ChuyenXeNoiThanh)
             {
                 sumNoiThanh += chuyenXeNoiThanh.get(i).getDoanhThu();
             }
         }    
        return sumNoiThanh;
        
    }
    //tổng doanh thu của xe ngoại thành
    public float tinhDoanhThuNgoaiThanh()
    {
        int sumNgoaiThanh=0;
         for(int i=0;i<chuyenXeNgoaiThanh.size();i++)
         {
             if(chuyenXeNgoaiThanh.get(i) instanceof ChuyenXeNgoaiThanh)
             {
                 sumNgoaiThanh += chuyenXeNgoaiThanh.get(i).getDoanhThu();
             }
         }    
        return sumNgoaiThanh;
        
    }
    //tổng doanh thu cả cả 2 xe
    public float tongDoanhThu()
    {
        return tinhDoanhThuNoiThanh()+tinhDoanhThuNgoaiThanh();
    }
}
