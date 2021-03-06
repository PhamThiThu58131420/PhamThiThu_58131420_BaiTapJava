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
public class NhanVien
{
     String ten,tuoi,diaChi;
    double tienluong;
    int tongSoGioLam;

    public NhanVien(String ten, String tuoi, String diaChi, double tienluong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienluong = tienluong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public NhanVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    public String getThongTin()
    {
         return "tên:"+getTen()+"\n"
               +"tuổi :"+getTuoi()+"\n"
               +"địa chỉ :"+getDiaChi()+"\n"
                 +"tiền thưởng :"+tinhThuong()+"\n";
    }
    public  double tinhThuong()
    {
        if(getTongSoGioLam()>=200)
            return getTienluong()*0.2;
        if(getTongSoGioLam()<200 && getTongSoGioLam()>=100)
            return getTienluong()*0.1;
        if(getTongSoGioLam()<100)
          return 0;
        return 0;
    }
    
}
