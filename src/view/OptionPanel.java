package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionPanel extends JPanel {
    private JLabel labelComboBox;
    private JComboBox conversionOptions;
    private String conversions[] = {"Conversor de Moeda"};

    public OptionPanel() {
        // Cria os componentes label e combobox
        labelComboBox = new JLabel("Escolha uma opção");
        conversionOptions = new JComboBox(conversions); // Passa para o combobox a lista de conversions

        // Posiciona o componentes
        labelComboBox.setBounds(10, 10, 430, 30);
        conversionOptions.setBounds(10, 40, 430, 30);

        // Adiciona os componentes ao painel principal
        this.add(labelComboBox);
        this.add(conversionOptions);
    }
}