/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

/**
 *
 * @author gab
 */
public class EmergencyInfo {
    
    public enum Urgency {
        EMERGENCY, VERY_URGENT, URGENT, LESS_URGENT, NON_URGENT
    }
    private Urgency urg;
    private String title;
    private String desc;

    public EmergencyInfo(Urgency urg, String title, String desc) {
        this.urg = urg;
        this.title = title;
        this.desc = desc;
    }

    public Urgency getUrg() {
        return urg;
    }

    public void setUrg(Urgency urg) {
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
    
    
}
