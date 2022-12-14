/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paradinhas.siscoimp.view.relatives;

import paradinhas.siscoimp.ctrl.Ctrlador;
import paradinhas.siscoimp.models.Relative;
import paradinhas.siscoimp.view.MainFrame;
import paradinhas.siscoimp.view.templates.ElementTemplate;

/**
 *
 * @author gab
 */
public class RelativeElement extends ElementTemplate {

    private Relative rel;
    int index;
    
    /**
     * Creates new form AppointmentTemplateD
     */
    public RelativeElement(Relative rel, int i) {
        initComponents();
        this.rel = rel;
        index = i;
        nameField.setText(rel.getName());
        phoneField.setText(rel.getPhone());
        kinField.setText(rel.getKinship());
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
        kinField = new javax.swing.JLabel();
        phoneField = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        nameField.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        nameField.setText("nome");

        kinField.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        kinField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kinField.setText("parentesco");

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
                .addComponent(kinField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kinField)
                    .addComponent(phoneField)
                    .addComponent(nameField))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        MainFrame.getInstance().showRelativeCad(rel, index);
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kinField;
    private javax.swing.JLabel nameField;
    private javax.swing.JLabel phoneField;
    // End of variables declaration//GEN-END:variables
}
