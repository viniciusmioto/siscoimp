/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.ctrl;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.json.JSONObject;
import paradinhas.siscoimp.json.Jsonfy;
import paradinhas.siscoimp.models.Appointment;
import paradinhas.siscoimp.models.Doctor;
import paradinhas.siscoimp.models.EmergencyInfo;
import paradinhas.siscoimp.models.Relative;
import paradinhas.siscoimp.models.User;

/**
 *
 * @author rodri
 */
public class Ctrlador {

    static public Ctrlador ctrl;
    private JSONObject jsonData;
    private User user = new User();
    private ArrayList<Appointment> apptList = new ArrayList<>();
    private ArrayList<Doctor> docList = new ArrayList<>();
    private ArrayList<Relative> relList = new ArrayList<>();
    private ArrayList<EmergencyInfo> emgList = new ArrayList<>();

    private Ctrlador() {
        jsonData = new JSONObject(Jsonfy.readJsonFile());
        System.out.println(jsonData);
        System.out.println(jsonData.getString("empty"));
        user.fromJson(jsonData.optJSONObject("profile"));
        
    }

    static public Ctrlador getInstance() {
        if (ctrl == null) {
            ctrl = new Ctrlador();
        }
        return ctrl;
    }

    public void updateUser(String name, String address, String email,String phone,String imagePath) {
        this.user.setName(name);
        this.user.setAddress(address);
        this.user.setEmail(email);
        this.user.setPhone(phone);
        this.user.setImagePath(imagePath);
        jsonData.put("profile", user.toJson());
        
        Jsonfy.saveJsonFile(jsonData);
    }
    
    public void addAppointment(String title, Appointment.AppointmentType type,  Appointment.AppointmentStatus status, GregorianCalendar date, Doctor doctor){
        this.apptList.add(new Appointment(type, status, title, date, doctor));
    }
    
    public void addDoctor(String name, String address, String phone, String spec, String imagePath){
        this.docList.add(new Doctor(name, address, phone, spec, imagePath));
    }
    
    public void addRelative(String name, String address, String phone, String kinship){
        this.relList.add(new Relative(name, address, phone, kinship));
    }
    
    public void addEmgInfo(String title, String desc, EmergencyInfo.Urgency urg){
        this.emgList.add(new EmergencyInfo(urg, title, desc));
    }
    
    public User getUser() {
        return this.user;
    }

    public ArrayList<Appointment> getApptList() {
        return apptList;
    }

    public ArrayList<Doctor> getDoctorsList() {
        return docList;
    }

    public ArrayList<Relative> getRelativesList() {
        return relList;
    }

    public ArrayList<EmergencyInfo> getEmgList() {
        return emgList;
    }
   
}
