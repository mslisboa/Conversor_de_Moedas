package gui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel {
    private JLabel result;
    
    public ResultPanel() {
        this.setBackground(Color.BLUE);
        
        result = new JLabel("Ola mundo");
    }
}