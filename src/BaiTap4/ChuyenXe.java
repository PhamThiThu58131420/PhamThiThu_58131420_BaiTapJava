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
public class ChuyenXe
{
    String maChuyenXe,hoTenTaiXe,soXe;
    double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maChuyenXe = maChuyenXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyenXe() {
        return maChuyenXe;
    }

    public void setMaChuyenXe(String maChuyenXe) {
        this.maChuyenXe = maChuyenXe;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
