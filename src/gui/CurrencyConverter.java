package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Converter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JPanel implements ActionListener {
    private JTextField value;
    private JComboBox from;
    private JLabel labelTextFieldValue;
    private JLabel labelComboBoxFrom;
    private JButton convertButton;
    private Converter converter;
    private JLabel result; //
    private String moedas[] = {
        "De Real a Dólar",
        "De Real a Euro",
        "De Real a Libra Esterlina",
        "De Real a Peso Argentino",
        "De Real a Peso Chileno",
        "De Dólar a Real",
        "De Euro a Real",
        "De Libra Esterlina a Real",
        "De Peso Argentino a Real",
        "De Peso Chileno a Real"
    };

    public CurrencyConverter() {
        // Cria a label da caixa de valor a ser convertido
        labelTextFieldValue = new JLabel("Valor");
        labelTextFieldValue.setBounds(10, 100, 250, 30);

        // Cria a caixa de valor a ser convertido
        value = new JTextField("0.00");
        value.setBounds(10, 130, 150, 30);

        // Cria label da ComboBox from
        labelComboBoxFrom = new JLabel("Escolha a moeda para a qual você deseja girar seu dinheiro");
        labelComboBoxFrom.setBounds(225, 100, 485, 30);

        // Cria a ComboBox com moedas a serem convertidas
        from = new JComboBox(moedas);
        from.setBounds(225, 130, 485, 30);

        // Cria o Botão de conversão
        convertButton = new JButton("Converter");
        convertButton.setBounds(780, 130, 110, 30);
        convertButton.addActionListener(this);

        result = new JLabel("");
        result.setBounds(10, 250, 880, 30);

        // Adiciona os componentes ao painel de conversão
        this.add(labelTextFieldValue);
        this.add(value);
        this.add(labelComboBoxFrom);
        this.add(from);
        this.add(convertButton);
        this.add(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedItem = (String) from.getSelectedItem();
        double valueToConverter = Double.parseDouble(value.getText());

        converter = new Converter();
        double convertedValue = converter.conversion(selectedItem, valueToConverter);
        result.setText("Resultado da conversão: " + convertedValue);
    }
}