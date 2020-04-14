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
public class ChuyenXeNgoaiThanh extends ChuyenXe
{
    String noiDen,soNgayDi;

    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(String noiDen, String soNgayDi, String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(String soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String getMaChuyenXe() {
        return maChuyenXe;
    }

    @Override
    public void setMaChuyenXe(String maChuyenXe) {
        this.maChuyenXe = maChuyenXe;
    }

    @Override
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    @Override
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    @Override
    public String getSoXe() {
        return soXe;
    }

    @Override
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    @Override
    public double getDoanhThu() {
        return doanhThu;
    }

    @Override
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    
    
    
}
