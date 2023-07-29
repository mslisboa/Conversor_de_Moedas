package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyConverter extends JPanel {
    private JTextField value;
    private JComboBox from;
    private JLabel labelTextFieldValue;
    private JLabel labelComboBoxFrom;
    private JButton convertButton;
    private String moedas[] = {
        "De Reais a Dólar",
        "De Reais a Euros",
        "De Reais a Libras Esterlinas",
        "De Reais a Peso Argentino",
        "De Reais a Peso Chileno",
        "De Dólares a Reais",
        "De Euros a Reais",
        "De Libras Esterlinas a Reais",
        "De Peso Argentino a Reais",
        "De Peso Chileno a Reais"
    };

    public CurrencyConverter() {
        
        // Cria a label da caixa de valor a ser convertido
        labelTextFieldValue = new JLabel("Valor");
        labelTextFieldValue.setBounds(10, 100, 250, 30);

        // Cria a caixa de valor a ser convertido
        value = new JTextField("0,00");
        value.setBounds(10, 130, 150, 30);

        // Cria label da ComboBox from
        labelComboBoxFrom = new JLabel("Converter de");
        labelComboBoxFrom.setBounds(240, 100, 250, 30);

        // Cria a ComboBox com moedas a serem convertidas
        from = new JComboBox(moedas);
        from.setBounds(225, 130, 485, 30);

        // Cria o Botão de conversão
        convertButton = new JButton("Converter");
        convertButton.setBounds(780, 130, 110, 30);
        convertButton.addActionListener(from);

        // Adiciona os componentes ao painel de conversão
        this.add(labelTextFieldValue);
        this.add(value);
        this.add(labelComboBoxFrom);
        this.add(from);
        this.add(convertButton);
    }
}