/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

/**
 *
 * @author gab
 */
public class Relative extends Person {
        
    private String kinship;
   
    public Relative() {
        super(null, null, null);
        this.kinship = null;
    }
    
    public Relative(String name, String address, String phone, String kinship) {
        super(name, address, phone);
        this.kinship = kinship;
    }
    

    public String getKinship() {
        return kinship;
    }

    public void setKinship(String kinship) {
        this.kinship = kinship;
    }

    
}
