import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pag258__JToggleButton extends JFrame {
    private JToggleButton toggleButton;
    private JRadioButton radioButton1, radioButton2;
    private JCheckBox checkBox1, checkBox2;

    public pag258__JToggleButton() {
        // Configurações básicas do JFrame
        super("Exemplo de JToggleButton");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Criando JToggleButton para alternância manual
        toggleButton = new JToggleButton("Alternância Manual");
        toggleButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("JToggleButton pressionado.");
                } else {
                    System.out.println("JToggleButton liberado.");
                }
            }
        });
        add(toggleButton);

        // Criando JRadioButton para seleção única
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButton1 = new JRadioButton("Opção 1");
        radioButton2 = new JRadioButton("Opção 2");
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);

        // Criando JCheckBox para seleção múltipla
        checkBox1 = new JCheckBox("Opção A");
        checkBox2 = new JCheckBox("Opção B");
        add(checkBox1);
        add(checkBox2);

        // Configurações finais do JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new pag258__JToggleButton();
    }
}