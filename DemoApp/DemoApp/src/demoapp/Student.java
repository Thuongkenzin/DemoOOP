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
public class Student {
    private String ID,Name,GVCN;
    private float GPA;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGVCN() {
        return GVCN;
    }

    public void setGVCN(String GVCN) {
        this.GVCN = GVCN;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public Student(String ID, String Name, String GVCN, float GPA) {
        this.ID = ID;
        this.Name = Name;
        this.GVCN = GVCN;
        this.GPA = GPA;
    }

  
}
