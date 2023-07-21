package gui;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        // Configurações do JFrame
        this.setSize(900, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Cria o painel principal
        Panel Panel = new Panel();
        Panel.setBounds(0, 0, 900, 100);
        Panel.setLayout(null);
        //topPanel.setBackground(new Color(0, 0, 150));

        // Adiciona o painel principal ao JFrame
        this.add(Panel);
                
        // Torna o JFrame visivel
        this.setVisible(true);
    }
}