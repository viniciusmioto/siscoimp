/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paradinhas.siscoimp.view;

/**
 *
 * @author gab
 */
public class AppointmentTemplate extends javax.swing.JPanel {
    
    static final int FINISHED = 1;
    static final int IN_PROGRESS = 2;
    static final int CANCELED = 3;
    
    
    /**
     * Creates new form AppointmentTemplate
     */
    public AppointmentTemplate(int status, String type, String date, String title) {
        initComponents(status, type, date, title);
    }
                         
    private void initComponents(int status, String type, String date, String title) {

        titleField = new javax.swing.JLabel();
        statusField = new javax.swing.JTextField();
        dateField = new javax.swing.JLabel();
        typeField = new javax.swing.JLabel();


        titleField.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        titleField.setText(title);

        statusField.setEditable(false);
        statusField.setBackground(new java.awt.Color(102, 255, 102));
        statusField.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        statusField.setForeground(new java.awt.Color(0, 0, 0));
        statusField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statusField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        switch (status){
            case FINISHED:
                statusField.setText("Concluído");
                statusField.setBackground(new java.awt.Color(102, 255, 102));
                break;
            case IN_PROGRESS:
                statusField.setText("Em andamento");
                statusField.setBackground(new java.awt.Color(255, 153, 51));
                break;
            case CANCELED:
                statusField.setText("Cancelado");
                statusField.setBackground(new java.awt.Color(255, 102, 102));
                break;
        }

        dateField.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        dateField.setText(date);

        typeField.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        
        typeField.setText(type);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(typeField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(dateField)
                .addGap(63, 63, 63)
                .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleField)
                        .addComponent(typeField)
                        .addComponent(dateField)))
                .addGap(15, 15, 15))
        );
    }                      


    // Variables declaration - do not modify                     
    private javax.swing.JLabel titleField;
    private javax.swing.JLabel dateField;
    private javax.swing.JLabel typeField;
    private javax.swing.JTextField statusField;
    // End of variables declaration                   
}
