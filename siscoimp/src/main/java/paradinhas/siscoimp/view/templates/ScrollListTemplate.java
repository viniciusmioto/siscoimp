/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.view.templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;

/**
 *
 * @author gab
 */
public class ScrollListTemplate extends JPanel {

    private JPanel mainList;

    public ScrollListTemplate() {
        initComponents();
    }  
    
    private void initComponents(){
        setLayout(new BorderLayout());

        mainList = new JPanel(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        mainList.add(new JPanel(), gbc);

        JScrollPane mainListScroll = new JScrollPane(mainList);
        mainListScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(mainListScroll);
        
    }
    
    public JPanel getMainList(){
        return this.mainList;            
    }    
    
    public void addToList(ElementTemplate element) {
        JPanel panel = new JPanel();
        panel.add(element);
        panel.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainList.add(panel, gbc, 0);
        validate();
        repaint();
    }    
}
