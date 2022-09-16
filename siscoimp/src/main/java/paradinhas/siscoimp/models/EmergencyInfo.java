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
public class EmergencyInfo implements Jsonfison{
    
    public enum EmergencyInfoUrgency {
        EMERGENCY, VERY_URGENT, URGENT, LESS_URGENT, NON_URGENT
    }
    private EmergencyInfoUrgency urg;
    private String title;
    private String desc;

    public EmergencyInfo(EmergencyInfoUrgency urg, String title, String desc) {
        this.urg = urg;
        this.title = title;
        this.desc = desc;
    }

    @Override
    public String toString(){
        return this.title + "; " + this.desc;
    }
    
    public EmergencyInfo() {
    }
    
    

    public EmergencyInfoUrgency getUrg() {
        return urg;
    }

    public void setUrg(EmergencyInfoUrgency urg) {
        this.urg = urg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    @Override
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("urg", urg.name());
        json.put("title", title);
        json.put("desc", desc);
        
        return json;
    }
    
    @Override
    public void fromJson(JSONObject json){
        try {   
        urg = EmergencyInfoUrgency.valueOf(json.optString("urg"));
        title = json.optString("title");
        desc = json.optString("desc");
        } catch (Exception e) {
        }
    }
}
