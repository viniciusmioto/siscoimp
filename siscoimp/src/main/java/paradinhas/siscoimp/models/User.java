/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

/**
 *
 * @author gab
 */
public class User extends Person {
    String email;
    
    public User() {
        super(null, null, null, null);
    }

    public User(String email, String name, String adress, String phone, String imagePath) {
        super(name, adress, phone, imagePath);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
