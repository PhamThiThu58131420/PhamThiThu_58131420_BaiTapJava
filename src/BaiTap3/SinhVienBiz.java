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
public class SinhVienBiz extends SinhVienPoly
{
    double diemMarketing,diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem()
    {
        return (2*getDiemMarketing()+getDiemSales())/3;
    }
    
    @Override
    public void xuat() {
        super.xuat(); 
          System.out.println("\n"+"điểm"+ getDiem()+"\n"+"học lực"+getHocLuc());
    }
    
    
}
