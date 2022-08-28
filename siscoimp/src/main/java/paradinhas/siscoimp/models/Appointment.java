/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.models;

import java.util.Date;

/**
 *
 * @author vsmioto
 */

public class Appointment {
    
    public enum ConsultType {
        Exam,Consult
    }
    ConsultType type;
    
    Date date;
    Doctor doctor;

    public Appointment(ConsultType type, Date date, Doctor doctor) {
        this.type = type;
        this.date = date;
        this.doctor = doctor;
    }

    public ConsultType getType() {
        return type;
    }

    public void setType(ConsultType type) {
        this.type = type;
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
}