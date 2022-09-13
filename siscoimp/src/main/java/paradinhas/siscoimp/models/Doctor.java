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

    private String spec;
    
    public Doctor() {
        super(null, null, null, null);
    }

    public Doctor(String name, String address, String phone, String spec, String imagePath) {
        super(name, address, phone, imagePath);
        this.spec = spec;
    }
    
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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
