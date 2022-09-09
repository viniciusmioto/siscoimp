package paradinhas.siscoimp.view;

import javax.swing.*;

public class Screen extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;

    public Screen() {
        setContentPane(mainPanel);
        setTitle("Screen!");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
