/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package paradinhas.siscoimp.view.doctor;

import paradinhas.siscoimp.models.Doctor;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import paradinhas.siscoimp.common.ImageManipulation;
import paradinhas.siscoimp.ctrl.Ctrlador;
import paradinhas.siscoimp.view.Profile;

/**
 *
 * @author vinicius
 */
public class DoctorCad extends javax.swing.JInternalFrame {

    File doctorFile;
    Doctor doc;
    int index = -1;
    boolean editingMode = false;

    /**
     * Creates new form DoctorsList
     */
    private void setCad(Doctor doc) {
        nameField.setText(doc.getName());
        phoneField.setText(doc.getPhone());
        addrField.setText(doc.getAddress());
        specField.setText(doc.getSpec());
        try {
            if (doc.getImagePath() != null) {
                doctorFile = new File(doc.getImagePath());
                if (!"".equals(doc.getImagePath())) {
                    picLabel.setIcon(ImageManipulation.createIconFromPath(doctorFile, 150, 150));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        editingMode = true;
    }

    public DoctorCad(Doctor doc, int index) {
        initComponents();
        if (doc != null) {
            this.index = index;
            setCad(doc);
        } else {
            deleteBtn.setVisible(false);
        }
    }

    public DoctorCad() {
        initComponents();
        deleteBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addrField = new javax.swing.JTextField();
        doctorPic = new javax.swing.JPanel();
        picLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        specField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Doutor");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel1.setText("Nome do Profissional");

        nameField.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel2.setText("Telefone");

        phoneField.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel3.setText("Endereço");

        addrField.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        addrField.setToolTipText("");

        doctorPic.setBackground(new java.awt.Color(204, 255, 204));
        doctorPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorPicMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout doctorPicLayout = new javax.swing.GroupLayout(doctorPic);
        doctorPic.setLayout(doctorPicLayout);
        doctorPicLayout.setHorizontalGroup(
            doctorPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        doctorPicLayout.setVerticalGroup(
            doctorPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        cancelBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
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

        specField.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        specField.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel4.setText("Especialidade");

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        deleteBtn.setText("Excluir");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(specField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(316, 316, 316))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addrField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doctorPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addrField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(specField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(saveBtn)
                                .addComponent(cancelBtn))
                            .addComponent(deleteBtn)))
                    .addComponent(doctorPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorPicMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image", "png", "jpg", "jpeg"));
        int response = fileChooser.showOpenDialog(this);
        if (response == JFileChooser.APPROVE_OPTION) {
            doctorFile = fileChooser.getSelectedFile().getAbsoluteFile();
            try {
                picLabel.setIcon(ImageManipulation.createIconFromPath(doctorFile, 150, 150));
            } catch (IOException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_doctorPicMouseClicked

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String filePath = "";
        if (doctorFile != null) {
            filePath = doctorFile.getAbsolutePath();
        }
        Doctor doc = new Doctor(nameField.getText(), addrField.getText(), phoneField.getText(), specField.getText(), filePath);
        if (editingMode) {
            Ctrlador.getInstance().update(doc, index);
        } else {
            Ctrlador.getInstance().create(doc);
        }
        dispose();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Ctrlador.getInstance().removeDoctor(index);
        dispose();
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel doctorPic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField specField;
    // End of variables declaration//GEN-END:variables
}
