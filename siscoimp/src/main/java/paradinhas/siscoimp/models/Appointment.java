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
    
    public enum ConsultType {
        Exam,Consult;
    }
    private ConsultType type;
    
    public enum ConsultStatus {
        Concluded, InProgress, Canceled
    }
    private ConsultStatus status;

    private String title;
    private GregorianCalendar date;
    private Doctor doctor;
    

    public Appointment(ConsultType type, ConsultStatus status, String title, GregorianCalendar date, Doctor doctor) {
        this.title = title;
        this.type = type;
        this.status = status;
        this.date = date;
        this.doctor = doctor;
    }

    public ConsultType getType() {
        return type;
    }

    public void setType(ConsultType type) {
        this.type = type;
    }
    
    public ConsultStatus getStatus() {
        return status;
    }

    public void setStatus(ConsultStatus status) {
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