/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuviendemo;

/**
 *
 * @author NGUYEN HUU THUONG
 */
public class Sach_TacGia {
    private String maSach;
    private String maTacGia;

    public Sach_TacGia(String maSach, String maTacGia) {
        this.maSach = maSach;
        this.maTacGia = maTacGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }
    
}
