/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paradinhas.siscoimp.view;

/**
 *
 * @author gab
 */
public class MainFrame extends javax.swing.JFrame {
    static private MainFrame mainFrame;
    private AppointmentsList apptList;
    private DoctorsList docList;
    private Profile profile;
    private DoctorCad docCad;
    private RelativesCad relatives;
    private AppointmentCad apptCad;
    
    /**
     * Creates new form MainFrame
     */
    private MainFrame() {
        initComponents();
    }
    
    static public MainFrame getInstance() {
        if (mainFrame == null) {
            mainFrame = new MainFrame();
        }
        return mainFrame;
    }
    
    public void showAppointmentCad(){
        if(apptCad == null || apptCad.isClosed()) {   
            apptCad = new AppointmentCad();
            desktopPaneCtrl.add(apptCad);
        }
        apptCad.setVisible(true);
    }
    
    public void showDoctorCad(){
        if(docCad == null || docCad.isClosed()) {   
            docCad = new DoctorCad();
            desktopPaneCtrl.add(docCad);
        }
        docCad.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        desktopPaneCtrl = new javax.swing.JDesktopPane();
        profileBtn = new javax.swing.JButton();
        appointmentBtn = new javax.swing.JButton();
        doctorsBtn = new javax.swing.JButton();
        relativesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISCOIMP");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1231, 35));

        desktopPaneCtrl.setBackground(new java.awt.Color(0, 0, 0));
        desktopPaneCtrl.setForeground(new java.awt.Color(0, 0, 0));
        desktopPaneCtrl.setToolTipText("");

        javax.swing.GroupLayout desktopPaneCtrlLayout = new javax.swing.GroupLayout(desktopPaneCtrl);
        desktopPaneCtrl.setLayout(desktopPaneCtrlLayout);
        desktopPaneCtrlLayout.setHorizontalGroup(
            desktopPaneCtrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1231, Short.MAX_VALUE)
        );
        desktopPaneCtrlLayout.setVerticalGroup(
            desktopPaneCtrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        profileBtn.setBackground(new java.awt.Color(204, 255, 204));
        profileBtn.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        profileBtn.setText("Perfil");
        profileBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        profileBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        appointmentBtn.setBackground(new java.awt.Color(204, 255, 204));
        appointmentBtn.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        appointmentBtn.setText("Agendamentos");
        appointmentBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        appointmentBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        appointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentBtnActionPerformed(evt);
            }
        });

        doctorsBtn.setBackground(new java.awt.Color(204, 255, 204));
        doctorsBtn.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        doctorsBtn.setText("Médicos");
        doctorsBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        doctorsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        doctorsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsBtnActionPerformed(evt);
            }
        });

        relativesBtn.setBackground(new java.awt.Color(204, 255, 204));
        relativesBtn.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        relativesBtn.setText("Familiares");
        relativesBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        relativesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        relativesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relativesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointmentBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relativesBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(desktopPaneCtrl)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileBtn)
                    .addComponent(appointmentBtn)
                    .addComponent(doctorsBtn)
                    .addComponent(relativesBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPaneCtrl))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        if(profile == null || profile.isClosed()){
            profile = new Profile();
            desktopPaneCtrl.add(profile);
        }
        profile.setVisible(true);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void appointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentBtnActionPerformed
        if(apptList == null || apptList.isClosed()) {   
            apptList = new AppointmentsList();
            desktopPaneCtrl.add(apptList);
        }
        apptList.setVisible(true);
    }//GEN-LAST:event_appointmentBtnActionPerformed

    private void doctorsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsBtnActionPerformed
        if(docList == null || docList.isClosed()) {   
            docList = new DoctorsList();
            desktopPaneCtrl.add(docList);
        }
        docList.setVisible(true);
    }//GEN-LAST:event_doctorsBtnActionPerformed

    private void relativesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relativesBtnActionPerformed
        // TODO add your handling code here:
        if(relatives == null || relatives.isClosed()){
            relatives = new RelativesCad();
            desktopPaneCtrl.add(relatives);
        }
        relatives.setVisible(true);
    }//GEN-LAST:event_relativesBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentBtn;
    private javax.swing.JDesktopPane desktopPaneCtrl;
    private javax.swing.JButton doctorsBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton relativesBtn;
    // End of variables declaration//GEN-END:variables
}
