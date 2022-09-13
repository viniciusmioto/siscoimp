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
    private ArrayList<Doctor> docList = new ArrayList<>();

    private Ctrlador() {
        user.setJson(Jsonfy.readJsonFile());
        for (int i = 0; i < 10; i++){
            apptList.add(new Appointment(Appointment.AppointmentType.Exam, Appointment.AppointmentStatus.InProgress, "Exame de vista " + i, new GregorianCalendar(2022, 9, 13), new Doctor()));
        }
        
        for (int i = 0; i < 10; i++){
            docList.add(new Doctor("FIlho do Andrey " + i, "Casa do Andrey", "(69) 96969-6969", "/home/andrey/Images/filho" + i));
        }
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
        
        Jsonfy.saveJsonFile(user.getJson());
    }
    
    public void addAppointment(String title, Appointment.AppointmentType type,  Appointment.AppointmentStatus status, GregorianCalendar date, Doctor doctor){
        this.apptList.add(new Appointment(type, status, title, date, doctor));
    }
    
    public void addDoctor(String name, String address, String phone, String imagePath){
        this.docList.add(new Doctor(name, address, phone, imagePath));
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
   
}
