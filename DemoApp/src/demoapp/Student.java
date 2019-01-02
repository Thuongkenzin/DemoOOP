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
    private String Id, Name, GVCN;
    private float DTB;

    public Student(String Id, String Name,float DTB, String GVCN ) {
        this.Id = Id;
        this.Name = Name;
        this.GVCN = GVCN;
        this.DTB = DTB;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }
    

  
}
