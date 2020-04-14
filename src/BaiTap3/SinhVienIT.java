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
public class SinhVienIT extends SinhVienPoly
{
    double diemJava,diemCss,diemHtml;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

   
    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem()
    {
        return (2*getDiemJava()+getDiemHtml()+getDiemCss())/4;
    }

    @Override
    public void xuat() {
        super.xuat(); 
            System.out.println("\n"+"điểm"+ getDiem()+"\n"+"học lực"+getHocLuc());
    }
    
}
