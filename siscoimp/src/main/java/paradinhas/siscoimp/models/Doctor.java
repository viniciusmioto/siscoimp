/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

import java.io.File;
import org.json.JSONObject;
import paradinhas.siscoimp.common.FileManipulation;

/**
 *
 * @author gab
 */
public class Doctor extends Person implements Jsonfison {

    private String spec;
    private String imagePath;
    
    public Doctor() {
        super(null, null, null);
    }

    public Doctor(String name, String address, String phone, String spec, String imagePath) {
        super(name, address, phone);
        this.spec = spec;
        this.imagePath = imagePath;
    }
    
    public String toStringFilter(){
        return this.name + "; " + this.address + "; " + this.phone + "; " + this.spec;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("address", address);
        json.put("phone", phone);
        json.put("spec", spec);
        
        try {
            File file = new File(imagePath);
            imagePath = FileManipulation.saveFile(file, "doctors");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        json.put("imagePath", imagePath);

        return json;
    }

    public void fromJson(JSONObject json) {
        try {
            name = json.optString("name");
            address = json.optString("address");
            phone = json.optString("phone");
            spec = json.optString("spec");
            imagePath = json.optString("imagePath");
        } catch (Exception e) {
        }
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
