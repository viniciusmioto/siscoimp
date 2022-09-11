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
public class Doctor extends Person implements Jsonfison {

    public Doctor() {
        super(null, null, null, null);
    }

    public Doctor(String name, String adress, String phone, String imagePath) {
        super(name, adress, phone, imagePath);
    }
    
    public JSONObject getJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("address", address);
        json.put("phone", phone);
        json.put("imagePath", imagePath);

        return json;
    }

    public void setJson(JSONObject json) {
        try {
            name = json.optString("name");
            address = json.optString("address");
            phone = json.optString("phone");
            imagePath = json.optString("imagePath");
        } catch (Exception e) {
        }
    }
}
