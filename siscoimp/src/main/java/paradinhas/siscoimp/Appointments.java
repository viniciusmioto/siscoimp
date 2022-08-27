/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp;

import java.util.Date;

/**
 *
 * @author vsmioto
 */

public class Appointments {
    public enum ConsultType {
        Exam,Consult
    }
    ConsultType type;

//    public static final char ap = 'e'; /* exam */
//    public static final char ap = 'c'; /* consultation */

    Date date;
    Doctor doctor;

    public Appointments(ConsultType type, Date date, Doctor doctor) {
        this.type = type;
        this.date = date;
        this.doctor = doctor;
    }

    public ConsultType getType() {
        return type;
    }

    public void setExam(ConsultType type) {
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