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
public class ChuyenXeNoiThanh extends ChuyenXe
{
    String soTuyen,soKm;

    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(String soTuyen, String soKm, String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public String getSoKm() {
        return soKm;
    }

    public void setSoKm(String soKm) {
        this.soKm = soKm;
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
