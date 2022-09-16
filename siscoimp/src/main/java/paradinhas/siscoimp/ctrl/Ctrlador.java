/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.ctrl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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

    private final JSONObject jsonData;
    private User user = new User();
    private JSONArray apptList = new JSONArray();
    private JSONArray docList = new JSONArray();
    private JSONArray relList = new JSONArray();
    private JSONArray emgList = new JSONArray();

    private final PropertyChangeSupport changes = new PropertyChangeSupport(this);

    private Ctrlador() {
        jsonData = Jsonfy.readJsonFile();
        System.out.println(jsonData);
        user.fromJson(jsonData.optJSONObject("profile"));
        docList = nullSafe(jsonData.optJSONArray("doctors"));
        relList = nullSafe(jsonData.optJSONArray("relatives"));
        emgList = nullSafe(jsonData.optJSONArray("emergencyInfos"));
        apptList = nullSafe(jsonData.optJSONArray("appointments"));
    }

    private JSONArray nullSafe(JSONArray list) {
        if (list == null) {
            return new JSONArray();
        }
        return list;
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

    public void create(Doctor doc) {
        if (doc != null) {
            docList.put(doc.toJson());
            jsonData.put("doctors", docList);
            changes.firePropertyChange("doctorsList", null, doc);
            saveChanges();
        }
    }

    public void create(Relative rel) {
        if (rel != null) {
            relList.put(rel.toJson());
            jsonData.put("relatives", relList);
            changes.firePropertyChange("relativesList", null, rel);
            saveChanges();
        }
    }

    public void create(EmergencyInfo emg) {
        if (emg != null) {
            emgList.put(emg.toJson());
            jsonData.put("emergencyInfos", emgList);
            changes.firePropertyChange("emergencyInfosList", null, emg);
            saveChanges();
        }
    }

    public void create(Appointment appt) {
        if (appt != null) {
            apptList.put(appt.toJson());
            jsonData.put("appointments", apptList);
            changes.firePropertyChange("appointmentsList", null, appt);
            saveChanges();
        }
    }

    public void update(User user) {
        this.user = user;
        jsonData.put("profile", user.toJson());
        saveChanges();
    }

    public void update(Doctor doc, int i) {
        if (doc != null && i != -1) {
            docList.put(i, doc.toJson());
            jsonData.put("doctors", docList);
            changes.firePropertyChange("doctorsList", null, doc);
            saveChanges();
        }
    }

    public void update(Relative rel, int i) {
        if (rel != null && i != -1) {
            relList.put(i, rel.toJson());
            jsonData.put("relatives", relList);
            changes.firePropertyChange("relativesList", null, rel);
            saveChanges();
        }
    }

    public void update(EmergencyInfo emg, int i) {
        if (emg != null && i != -1) {
            emgList.put(i, emg.toJson());
            jsonData.put("emergencyInfos", emgList);
            changes.firePropertyChange("emergencyInfosList", null, emg);
            saveChanges();
        }
    }

    public void update(Appointment appt, int i) {
        if (appt != null && i != -1) {
            apptList.put(i, appt.toJson());
            jsonData.put("appointments", apptList);
            changes.firePropertyChange("appointmentsList", null, appt);
            saveChanges();
        }
    }

    public void removeDoctor(int index) {
        if (index != -1) {
            docList.remove(index);
            jsonData.put("doctors", docList);
            changes.firePropertyChange("doctorsList", true, false);
            saveChanges();
        }
    }
    
    public void removeRelative(int index) {
        if (index != -1) {
            relList.remove(index);
            jsonData.put("relatives", relList);
            changes.firePropertyChange("relativesList", true, false);
            saveChanges();
        }
    }

    public void removeEmergencyInfo(int index) {
        if (index != -1) {
            emgList.remove(index);
            jsonData.put("emergencyInfos", emgList);
            changes.firePropertyChange("emergencyInfosList", true, false);
            saveChanges();
        }
    }

    public void removeAppointment(int index) {
        if (index != -1) {
            apptList.remove(index);
            jsonData.put("appointments", apptList);
            changes.firePropertyChange("appointmentsList", true, false);
            saveChanges();
        }
    }

    public User getUser() {
        return this.user;
    }

    public JSONArray getApptList() {
        return apptList;
    }

    public JSONArray getDoctorsList() {
        return docList;
    }

    public JSONArray getRelativesList() {
        return relList;
    }

    public JSONArray getEmgList() {
        return emgList;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("alguem me ajuda");
    }
}
