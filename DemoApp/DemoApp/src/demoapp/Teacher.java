/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp;

/**
 *
 * @author NGUYEN HUU THUONG
 */
public class Teacher {
    private String MaGV;
    private String Name;
    private String BoMon;
    private int SoSv;

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBoMon() {
        return BoMon;
    }

    public void setBoMon(String BoMon) {
        this.BoMon = BoMon;
    }

    public int getSoSv() {
        return SoSv;
    }

    public void setSoSv(int SoSv) {
        this.SoSv = SoSv;
    }

    public Teacher(String MaGV, String Name, String BoMon, int SoSv) {
        this.MaGV = MaGV;
        this.Name = Name;
        this.BoMon = BoMon;
        this.SoSv = SoSv;
    }
}
