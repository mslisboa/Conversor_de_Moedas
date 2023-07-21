package gui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private JLabel labelComboBox;
    private JComboBox conversionOptions;
    private String moedas[] = {"Conversor de Moeda"};

    public Panel() {
        // Cria os componentes label e combobox
        labelComboBox = new JLabel("Escolha uma opção");
        conversionOptions = new JComboBox(moedas); // Passa para o combobox a lista de moedas

        // Posiciona o componentes
        labelComboBox.setBounds(10, 10, 880, 30);
        conversionOptions.setBounds(10, 40, 880, 30);

        // Adiciona os componentes ao painel principal
        this.add(labelComboBox);
        this.add(conversionOptions);
    }
}