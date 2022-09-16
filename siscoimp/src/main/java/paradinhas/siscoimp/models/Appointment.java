/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import org.json.JSONObject;
import paradinhas.siscoimp.common.FileManipulation;

/**
 *
 * @author vsmioto
 */
public class Appointment implements Jsonfison {

    public enum AppointmentType {
        EXAM, CONSULT
    }
    private AppointmentType type;

    public enum AppointmentStatus {
        CONCLUDED, IN_PROGRESS, EXPIRED
    }
    private AppointmentStatus status;

    private String title;
    private Date date;
    private Doctor doctor;
    private String filePath;
    private String desc;

    public Appointment(AppointmentType type, String title, String desc, Date date, Doctor doctor, String filePath) {
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.status = AppointmentStatus.IN_PROGRESS;
        this.date = date;
        this.doctor = doctor;
        this.filePath = filePath;
    }
    
    @Override
    public String toString(){
        String type;
        switch (this.getType()){
            case EXAM:
                type = "Exame";
                break;
            case CONSULT:;
                type = "Consulta";
                break;
            default:
                type = "Exame";
                break;
        }
        return this.title + "; " + this.desc + "; " + (new SimpleDateFormat("dd/MM/yyyy").format(this.getDate())) + "; " + this.doctor.getName() + "; " + type;
    }
   

    public Appointment() {

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AppointmentType getType() {
        return type;
    }

    public void setType(AppointmentType type) {
        this.type = type;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("title", title);
        json.put("desc", desc);
        json.put("date", new SimpleDateFormat("dd/MM/yyyy").format(date));
        json.put("doctor", doctor.toJson());
        json.put("status", status.name());
        json.put("type", type.name());
        
        try {
            File file = new File(filePath);
            filePath = FileManipulation.saveFile(file, "appointment");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        json.put("filePath", filePath);

        return json;
    }

    @Override
    public void fromJson(JSONObject json) {
        try {
            title = json.optString("title");
            desc = json.optString("desc");
            date = new SimpleDateFormat("dd/MM/yyyy").parse(json.optString("date"));
            doctor = new Doctor();
            doctor.fromJson(new JSONObject(json.optString("doctor")));
            status = AppointmentStatus.valueOf(json.optString("status"));
            filePath = json.optString("filePath");
            type = AppointmentType.valueOf(json.optString("type"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateAppointmentStatus(){
        System.out.println("atualizando status");
        System.out.println(this.date);
        System.out.println(new Date());
        if (this.date.before(new Date())){
            System.out.println("atualizando");
            if (!this.filePath.equals("")){
                this.status = AppointmentStatus.CONCLUDED;
            }
            else {
                this.status = AppointmentStatus.EXPIRED;
            }
        }
    }
}
