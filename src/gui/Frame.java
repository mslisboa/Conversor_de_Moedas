package gui;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        super("Conversor de Moedas");
        
        // Configurações do JFrame
        this.setSize(900, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Cria o painel de opções
        OptionPanel optionPanel = new OptionPanel();
        optionPanel.setBounds(0, 0, 900, 100);
        optionPanel.setLayout(null);

        // Cria o painel de conversão de moedas
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.setBounds(0, 100, 900, 500);
        currencyConverter.setLayout(null);

        ResultPanel resultPanel = new ResultPanel();
        resultPanel.setBounds(10, 300, 880, 230);

        // Adiciona o painel principal ao JFrame
        this.add(resultPanel);
        this.add(currencyConverter);
        this.add(optionPanel);
                
        // Torna o JFrame visivel
        this.setVisible(true);
    }
}