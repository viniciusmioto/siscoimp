/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;

/**
 *
 * @author gab
 */
public abstract class ScrollListTemplate extends JPanel {

    private final JPanel mainList;
    private final JButton addElementBtn;

    public ScrollListTemplate() {
        setLayout(new BorderLayout());

        addElementBtn = new JButton();
        mainList = new JPanel(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        mainList.add(new JPanel(), gbc);

        JScrollPane mainListScroll = new JScrollPane(mainList);
        mainListScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(mainListScroll);

        addElementBtn.setText("Add");
        addElementBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                addListElementBtnActionPerformed(evt);
            }
        });

        add(addElementBtn, BorderLayout.SOUTH);
    }  
    
    public void addListElementBtnActionPerformed(ActionEvent evt) {
        JPanel panel = new JPanel();
        panel.add(new JLabel("template"));
        panel.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainList.add(panel, gbc, 0);

        validate();
        repaint();
    }
    
    public JPanel getMainList(){
        return this.mainList;            
    }        
}
