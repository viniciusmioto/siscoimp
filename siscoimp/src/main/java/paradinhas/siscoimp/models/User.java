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
public class User extends Person implements Jsonfison {

    private String email;
    private String imagePath;

    public User() {
        super(null, null, null);
    }

    public User(String name, String adress, String email, String phone, String imagePath) {
        super(name, adress, phone);
        this.email = email;
        this.imagePath = imagePath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("address", address);
        json.put("email", email);
        json.put("phone", phone);
        try {
            File file = new File(imagePath);
            imagePath = FileManipulation.saveFile(file, "user");
        } catch (Exception e) {
            System.out.println(e);
        }

        json.put("imagePath", imagePath);

        return json;
    }

    @Override
    public void fromJson(JSONObject json) {
        try {
            name = json.optString("name");
            address = json.optString("address");
            email = json.optString("email");
            phone = json.optString("phone");
            imagePath = json.optString("imagePath");
        } catch (Exception e) {
        }
    }
}
