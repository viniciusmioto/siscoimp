/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.ctrl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.json.JSONArray;
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
public class Ctrlador implements PropertyChangeListener {

    private static Ctrlador ctrl;

    private JSONObject jsonData;
    private User user = new User();
    private ArrayList<Appointment> apptList = new ArrayList<>();
    private JSONArray docList = new JSONArray();
    private ArrayList<Relative> relList = new ArrayList<>();
    private ArrayList<EmergencyInfo> emgList = new ArrayList<>();

    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    private Ctrlador() {
        jsonData = Jsonfy.readJsonFile();
        System.out.println(jsonData);
        user.fromJson(jsonData.optJSONObject("profile"));
        docList = jsonData.optJSONArray("doctors");
        if (docList == null) {
            docList = new JSONArray();
        }
    }

    private void saveChanges() {
        Jsonfy.saveJsonFile(jsonData);
        System.out.println(jsonData);
    }

    static public synchronized Ctrlador getInstance() {
        if (ctrl == null) {
            ctrl = new Ctrlador();
        }
        return ctrl;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }

    public void createDoctor(Doctor doc) {
        if (doc != null) {
            docList.put(doc.toJson());
            changes.firePropertyChange("doctorsList", null, doc);
            jsonData.put("doctors", docList);
            saveChanges();
        }
    }

    public void updateUser(String name, String address, String email, String phone, String imagePath) {
        this.user.setName(name);
        this.user.setAddress(address);
        this.user.setEmail(email);
        this.user.setPhone(phone);
        this.user.setImagePath(imagePath);
        jsonData.put("profile", user.toJson());
        saveChanges();
    }

    public void addAppointment(String title, Appointment.AppointmentType type, Appointment.AppointmentStatus status, GregorianCalendar date, Doctor doctor, String filePath) {
        this.apptList.add(new Appointment(type, status, title, date, doctor, filePath));
    }

//    public void addDoctor(String name, String address, String phone, String spec, String imagePath) {
//        this.docList.add(new Doctor(name, address, phone, spec, imagePath));
//    }
    public void addRelative(String name, String address, String phone, String kinship) {
        this.relList.add(new Relative(name, address, phone, kinship));
    }

    public void addEmgInfo(String title, String desc, EmergencyInfo.Urgency urg) {
        this.emgList.add(new EmergencyInfo(urg, title, desc));
    }

    public User getUser() {
        return this.user;
    }

    public ArrayList<Appointment> getApptList() {
        return apptList;
    }

    public JSONArray getDoctorsList() {
        return docList;
    }

    public ArrayList<Relative> getRelativesList() {
        return relList;
    }

    public ArrayList<EmergencyInfo> getEmgList() {
        return emgList;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("alguem me ajuda");
    }
}
