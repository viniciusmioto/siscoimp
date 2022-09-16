/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package paradinhas.siscoimp.view.appointment;

import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.json.JSONArray;
import org.json.JSONObject;
import paradinhas.siscoimp.ctrl.Ctrlador;
import paradinhas.siscoimp.view.Profile;
import paradinhas.siscoimp.models.Appointment;
import paradinhas.siscoimp.models.Doctor;
import paradinhas.siscoimp.models.Appointment.AppointmentType;

/**
 *
 * @author vinicius
 */
public class AppointmentsCad extends javax.swing.JInternalFrame {

    private String selectedFilePath = "";
    Appointment appt;
    int index = -1;
    boolean editingMode = false;

    /**
     * Creates new form AppointmentCad
     */
    private void setCad(Appointment appt) {
        JSONArray docs = Ctrlador.getInstance().getDoctorsList();
        for (Object t : docs) {
            Doctor doc = new Doctor();
            doc.fromJson(new JSONObject(t.toString()));
            doctorBox.addItem(doc);
        }

        titleField.setText(appt.getTitle());
        
        int docIndex = 0;
        String docName = appt.getDoctor().getName();
        for (int i = 0; i < doctorBox.getItemCount(); i++){
            if (docName.equals(doctorBox.getItemAt(i).getName())){
                docIndex = i;
                doctorBox.setSelectedIndex(docIndex);
                break;
            }
        }
        
        if (!appt.getFilePath().equals("")){
            this.selectedFilePath = appt.getFilePath();
            fileLabel.setText(selectedFilePath); 
        }
        
        descriptionField.setText(appt.getDesc());
        dateField.setText(new SimpleDateFormat("dd/MM/yyyy").format(appt.getDate()));
        setType(appt.getType());
        editingMode = true;
    }

    public AppointmentsCad(Appointment appt, int index) {
        initComponents();
        if (appt != null) {
            this.index = index;
            setCad(appt);
        } else {
            deleteBtn.setVisible(false);
        }

    }

    public AppointmentsCad() {
        initComponents();
        deleteBtn.setVisible(false);

        JSONArray docs = Ctrlador.getInstance().getDoctorsList();
        for (Object t : docs) {
            Doctor doc = new Doctor();
            doc.fromJson(new JSONObject(t.toString()));
            doctorBox.addItem(doc);
        }

    }

    private void setType(AppointmentType type) {
        switch (type) {
            case CONSULT:
                rdBtnAppt.setSelected(true);
                break;
            default:
                rdBtnExam.setSelected(true);
        }
    }

    private AppointmentType getType() {
        if (rdBtnAppt.isSelected()) {
            return AppointmentType.CONSULT;
        }
        return AppointmentType.EXAM;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupType = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdBtnExam = new javax.swing.JRadioButton();
        rdBtnAppt = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        doctorBox = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        uploadBtn = new javax.swing.JButton();
        fileLabel = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        dateField = new javax.swing.JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
        titleField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Agendamento");

        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel1.setText("Descrição");

        jLabel2.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel2.setText("Data");

        jLabel3.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel3.setText("Doutor");

        btnGroupType.add(rdBtnExam);
        rdBtnExam.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        rdBtnExam.setSelected(true);
        rdBtnExam.setText("Exame");

        btnGroupType.add(rdBtnAppt);
        rdBtnAppt.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        rdBtnAppt.setText("Consulta");

        jLabel4.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel5.setText("Título");

        doctorBox.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        doctorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorBoxActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(204, 255, 204));
        saveBtn.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        saveBtn.setText("Salvar");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        uploadBtn.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        uploadBtn.setText("Selecionar");
        uploadBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        fileLabel.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        fileLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fileLabel.setText("Selecione um arquivo");
        fileLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLabelMouseClicked(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        deleteBtn.setText("Excluir");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        dateField.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N

        titleField.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N

        descriptionField.setColumns(20);
        descriptionField.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        descriptionField.setRows(5);
        jScrollPane1.setViewportView(descriptionField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(doctorBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uploadBtn))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(rdBtnExam, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdBtnAppt))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdBtnExam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdBtnAppt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileLabel)
                    .addComponent(uploadBtn))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorBoxActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        Date date = new Date();
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dateField.getText());
        } catch (Exception e) {
            System.out.println("data errado");
        }     

        appt = new Appointment(getType(),  titleField.getText(), descriptionField.getText(), date, (Doctor) doctorBox.getSelectedItem(), selectedFilePath);
        appt.updateAppointmentStatus();
        if (editingMode) {
            Ctrlador.getInstance().update(appt, index);
        } else {
            Ctrlador.getInstance().create(appt);
        }
        dispose();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int response = chooser.showOpenDialog(this);
        if (response == JFileChooser.APPROVE_OPTION) {
            selectedFilePath = chooser.getSelectedFile().getAbsolutePath();
            fileLabel.setText(selectedFilePath);
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void fileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLabelMouseClicked
        // TODO add your handling code here:
        if (selectedFilePath != null) {
            try {
                Desktop.getDesktop().open(new File(selectedFilePath));
            } catch (Exception ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_fileLabelMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Ctrlador.getInstance().removeAppointment(index);
        dispose();
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupType;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JFormattedTextField dateField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JComboBox<Doctor> doctorBox;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdBtnAppt;
    private javax.swing.JRadioButton rdBtnExam;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}