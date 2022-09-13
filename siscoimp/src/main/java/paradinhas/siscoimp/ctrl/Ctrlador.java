/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.ctrl;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import paradinhas.siscoimp.json.Jsonfy;
import paradinhas.siscoimp.models.Appointment;
import paradinhas.siscoimp.models.Doctor;
import paradinhas.siscoimp.models.User;

/**
 *
 * @author rodri
 */
public class Ctrlador {

    static public Ctrlador ctrl;
    private User user = new User();
    private ArrayList<Appointment> apptList = new ArrayList<>();

    private Ctrlador() {
        user.setJson(Jsonfy.readJsonFile());
        for (int i = 0; i < 10; i++){
            apptList.add(new Appointment(Appointment.ConsultType.Exam, Appointment.ConsultStatus.InProgress, "Exame de vista " + i, new GregorianCalendar(2022, 9, 13), new Doctor()));
        }
    }

    static public Ctrlador instance() {
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
        
        Jsonfy.saveJsonFile(user.getJson());
    }
    
    public void addAppointment(String title, Appointment.ConsultType type,  Appointment.ConsultStatus status, GregorianCalendar date, Doctor doctor){
        this.apptList.add(new Appointment(type, status, title, date, doctor));
    }
    
    public User getUser() {
        return this.user;
    }

    public ArrayList<Appointment> getApptList() {
        return apptList;
    }
   
}
