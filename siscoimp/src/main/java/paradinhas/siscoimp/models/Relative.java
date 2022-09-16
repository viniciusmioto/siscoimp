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
public class Relative extends Person implements Jsonfison{
        
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

    @Override
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("address", address);
        json.put("phone", phone);
        json.put("kinship", kinship);
        
        return json;
    }
    
    @Override
    public void fromJson(JSONObject json){
        try {   
        name = json.optString("name");
        address = json.optString("address");
        phone = json.optString("phone");
        kinship = json.optString("kinship");
        } catch (Exception e) {
        }
    }

    
}
