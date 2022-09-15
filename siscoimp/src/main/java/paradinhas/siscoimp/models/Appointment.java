/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

import java.util.GregorianCalendar;

/**
 *
 * @author vsmioto
 */

public class Appointment {
    
    public enum AppointmentType {
        EXAM,CONSULT;
    }
    private AppointmentType type;
    
    public enum AppointmentStatus {
        CONCLUDED, IN_PROGRESS, CANCELED
    }
    private AppointmentStatus status;

    private String title;
    private GregorianCalendar date;
    private Doctor doctor;
    

    public Appointment(AppointmentType type, AppointmentStatus status, String title, GregorianCalendar date, Doctor doctor) {
        this.title = title;
        this.type = type;
        this.status = status;
        this.date = date;
        this.doctor = doctor;
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
    
    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
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
}