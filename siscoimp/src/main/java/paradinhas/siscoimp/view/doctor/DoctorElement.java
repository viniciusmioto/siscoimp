/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paradinhas.siscoimp.view.doctor;

import paradinhas.siscoimp.models.Doctor;
import paradinhas.siscoimp.view.MainFrame;
import paradinhas.siscoimp.view.templates.ElementTemplate;

/**
 *
 * @author gab
 */
public class DoctorElement extends ElementTemplate {
    
    private Doctor doc;
    private int index = -1;
    
    /**
     * Creates new form AppointmentTemplateD
     */
    public DoctorElement(Doctor doc, int index) {
        initComponents();
        this.index = index;
        this.doc = doc;
        nameField.setText(doc.getName());
        phoneField.setText(doc.getPhone());
        specField.setText(doc.getSpec());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JLabel();
        specField = new javax.swing.JLabel();
        phoneField = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        nameField.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        nameField.setText("nome");

        specField.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        specField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        specField.setText("especialidade");

        phoneField.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        phoneField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneField.setText("phone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(phoneField)
                .addGap(18, 18, 18)
                .addComponent(specField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specField)
                    .addComponent(phoneField)
                    .addComponent(nameField))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        MainFrame.getInstance().showDoctorCad(doc, index);
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameField;
    private javax.swing.JLabel phoneField;
    private javax.swing.JLabel specField;
    // End of variables declaration//GEN-END:variables
}