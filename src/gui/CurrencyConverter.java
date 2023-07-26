package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyConverter extends JPanel {
    private JTextField value;
    private JComboBox from;
    private JComboBox to;
    private JLabel labelTextFieldValue;
    private JLabel labelComboBoxFrom;
    private JLabel labelComboBoxTo;
    private JButton convertButton;
    private String moedas[] = {
        "Real",
        "Dólar",
        "Euro",
        "Libra Esterlina",
        "Peso Argentino",
        "Peso Chileno"
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
        from.setBounds(240, 130, 250, 30);

        // Cria label da ComboBox to
        labelComboBoxTo = new JLabel("Para");
        labelComboBoxTo.setBounds(540, 100, 250, 30);

        // Cria a ComboBox com moedas para qual será convertido o valor
        to = new JComboBox(moedas);
        to.setBounds(510, 130, 250, 30);

        // Cria o Botão de conversão
        convertButton = new JButton("Converter");
        convertButton.setBounds(780, 130, 110, 30);

        // Adiciona os componentes ao painel de conversão
        this.add(labelTextFieldValue);
        this.add(value);
        this.add(labelComboBoxFrom);
        this.add(from);
        this.add(labelComboBoxTo);
        this.add(to);
        this.add(convertButton);
    }
}