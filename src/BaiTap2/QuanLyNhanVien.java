/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author phamthu
 */
public class QuanLyNhanVien implements IQuanLy
{
  ArrayList<NhanVien> nhanVien = new ArrayList<>();
    @Override
    public void them(NhanVien nv) 
    {
        nhanVien.add(nv);
    }

    @Override
    public void inDS() 
    {
        for(int i=0; i<nhanVien.size();i++)
        {
            System.out.println("Danh sách nhân viên "+ i
                     +nhanVien.get(i).getThongTin());
        }
   
    }
    
}
