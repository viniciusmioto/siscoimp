/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

import org.json.JSONObject;

/**
 *
 * @author gab
 */
public class User extends Person {
    private String email;
    
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
    
    public JSONObject getJson(){
        JSONObject json = new JSONObject();
        json.put("nome", name);
        json.put("address", address);
        json.put("email", email);
        json.put("phone", phone);
        
        return json;
    }
}
