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
public abstract class SinhVienPoly 
{
    String hoTen,nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public  abstract double getDiem();
    public  String getHocLuc()
    {
        if(getDiem()<5)
            return "yếu";
        if(getDiem()>=5 && getDiem()<6.5)
            return "trung bình";
        if(getDiem()>=6.5 && getDiem()<7.5)
            return "khá";
        if(getDiem()>=7.5 && getDiem()<9)
            return "giỏi";
         return "xuất sắc";
        
    }
    public void xuat()
    {
        System.out.println("họ tên:"+ getHoTen()+"\n"+"ngành:"+getNganh());
    }
    
    
}
