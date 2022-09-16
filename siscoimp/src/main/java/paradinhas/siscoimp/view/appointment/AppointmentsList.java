/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package paradinhas.siscoimp.view.appointment;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import paradinhas.siscoimp.view.templates.ScrollListTemplate;
import org.json.JSONArray;
import org.json.JSONObject;
import paradinhas.siscoimp.ctrl.Ctrlador;
import paradinhas.siscoimp.models.Appointment;
import paradinhas.siscoimp.models.Appointment.AppointmentStatus;
import paradinhas.siscoimp.view.MainFrame;

/**
 *
 * @author gab
 */
public class AppointmentsList extends javax.swing.JInternalFrame implements PropertyChangeListener {

    private JSONArray appts;
    AppointmentStatus filter;
    String textFilter = "";

    /**
     * Creates new form AppointmentsList
     */
    private void populateList() {
        if (filter != null) {
            System.out.println(filter.name());
        }
        mainListFrame.removeAll();
        appts = Ctrlador.getInstance().getApptList();
        if ((appts != null) && !(appts.isEmpty())) {
            ScrollListTemplate scrollList = new ScrollListTemplate();
            int i = 0;
            for (Object t : appts) {
                JSONObject docJson = new JSONObject(t.toString());
                Appointment appt = new Appointment();
                appt.fromJson(docJson);
                System.out.println(appt.getStatus().name());
                if (filter == null || filter.equals(appt.getStatus())) {
                    if (textFilter.equals("") || appt.getTitle().toLowerCase().startsWith(textFilter.toLowerCase())) {
                        scrollList.addToList(new AppointmentElement(appt, i));
                    }
                }
                i++;
            }
            mainListFrame.add(scrollList);
        }
        revalidate();
        repaint();
    }

    public AppointmentsList() {
        initComponents();
        Ctrlador.getInstance().addPropertyChangeListener(this);
        populateList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        canceladoButton = new javax.swing.JTextField();
        andamentoButton = new javax.swing.JTextField();
        concluidoButton = new javax.swing.JTextField();
        mainListFrame = new javax.swing.JPanel();
        registerAppt = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Compromissos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jTextField1.setToolTipText("Filtro");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        canceladoButton.setEditable(false);
        canceladoButton.setBackground(new java.awt.Color(255, 102, 102));
        canceladoButton.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        canceladoButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        canceladoButton.setText("Expirado");
        canceladoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        canceladoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canceladoButtonMouseClicked(evt);
            }
        });

        andamentoButton.setEditable(false);
        andamentoButton.setBackground(new java.awt.Color(255, 153, 51));
        andamentoButton.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        andamentoButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        andamentoButton.setText("Em andamento");
        andamentoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        andamentoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                andamentoButtonMouseClicked(evt);
            }
        });
        andamentoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andamentoButtonActionPerformed(evt);
            }
        });

        concluidoButton.setEditable(false);
        concluidoButton.setBackground(new java.awt.Color(102, 255, 102));
        concluidoButton.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        concluidoButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        concluidoButton.setText("Concluído");
        concluidoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        concluidoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                concluidoButtonMouseClicked(evt);
            }
        });

        mainListFrame.setLayout(new javax.swing.BoxLayout(mainListFrame, javax.swing.BoxLayout.LINE_AXIS));

        registerAppt.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        registerAppt.setText("Cadastrar");
        registerAppt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerApptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(canceladoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(andamentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(concluidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(mainListFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(registerAppt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canceladoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andamentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(concluidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainListFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerAppt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerApptActionPerformed
        MainFrame.getInstance().showAppointmentCad();
    }//GEN-LAST:event_registerApptActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Ctrlador.getInstance().removePropertyChangeListener(this);
    }//GEN-LAST:event_formInternalFrameClosing

    private void andamentoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andamentoButtonActionPerformed

    }//GEN-LAST:event_andamentoButtonActionPerformed

    private void canceladoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canceladoButtonMouseClicked
        filter = AppointmentStatus.EXPIRED;
        populateList();
    }//GEN-LAST:event_canceladoButtonMouseClicked

    private void andamentoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_andamentoButtonMouseClicked
        filter = AppointmentStatus.IN_PROGRESS;
        populateList();
    }//GEN-LAST:event_andamentoButtonMouseClicked

    private void concluidoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_concluidoButtonMouseClicked
        filter = AppointmentStatus.CONCLUDED;
        populateList();
    }//GEN-LAST:event_concluidoButtonMouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        textFilter = jTextField1.getText();
        System.out.println(textFilter);
        populateList();
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField andamentoButton;
    private javax.swing.JTextField canceladoButton;
    private javax.swing.JTextField concluidoButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainListFrame;
    private javax.swing.JButton registerAppt;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("appointmentsList")) {
            populateList();
        }
    }
}
