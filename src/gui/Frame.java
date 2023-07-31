package gui;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        super("Conversor de Moedas");
        
        // Configurações do JFrame
        this.setSize(450, 320);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Cria o painel de opções
        OptionPanel optionPanel = new OptionPanel();
        optionPanel.setBounds(0, 0, 450, 100);
        optionPanel.setLayout(null);

        // Cria o painel de conversão de moedas
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.setBounds(0, 100, 450, 200);
        currencyConverter.setLayout(null);

        // Adiciona o painel principal ao JFrame
        this.add(currencyConverter);
        this.add(optionPanel);
                
        // Torna o JFrame visivel
        this.setVisible(true);
    }
}