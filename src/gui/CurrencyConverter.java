package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Converter;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JPanel implements ActionListener {
    private JTextField value;
    private JComboBox from;
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
        // Cria label da ComboBox from
        labelComboBoxFrom = new JLabel("Escolha a moeda para a qual você deseja girar seu dinheiro");
        labelComboBoxFrom.setBounds(10, 10, 430, 30);

        // Cria a ComboBox com moedas a serem convertidas
        from = new JComboBox(moedas);
        from.setBounds(10, 40, 430, 30);

        // Cria a caixa de valor a ser convertido
        value = new JTextField("1.00");
        value.setBounds(10, 80, 150, 30);

        // Cria o Botão de conversão
        convertButton = new JButton("Converter");
        convertButton.setBounds(330, 80, 110, 30);
        
        convertButton.addActionListener(this);

        // Cria label que exibe o resultado da conversão
        result = new JLabel("");
        result.setBounds(10, 130, 430, 30);
        result.setFont(new Font("Arial", Font.BOLD, 20));

        // Adiciona os componentes ao painel de conversão
        this.add(value);
        this.add(labelComboBoxFrom);
        this.add(from);
        this.add(convertButton);
        this.add(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Captura o item lelecionado na comboBox
        String selectedItem = (String) from.getSelectedItem();
        
        try {
            // Chama o método que realiza a conversão e seta o resultado na label
            converter = new Converter();
            result.setText("Resultado da conversão: " +
                            converter.conversion(selectedItem, value.getText()));
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(
                null, "Valor Inválido!", "Erro de Conversão", JOptionPane.ERROR_MESSAGE
            );
        }
    }
}