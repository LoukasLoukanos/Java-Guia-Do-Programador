import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class pag260a262__JTextField extends JFrame implements ActionListener {
	// componentes ativos
	private JLabel lRes;
	private JButton bConv;
	private JTextField tfC; // componente JTextField de JComponent
	
	public  pag260a262__JTextField () {
		setTitle("Conversor C->F"); // ajusta título
		// layout grade 2x2
		setLayout(new GridLayout(2 ,2, 1, 1)); 
		
		add(tfC = new JTextField()); // componente JTextField de JComponent
		add(new JLabel("Celsius", JLabel.RIGHT));
		ImageIcon icon = new ImageIcon("C:/JGP4/Cap06_SwingComp/img/about16.gif");
		add(bConv = new JButton("Converter", icon));
		add(lRes = new JLabel("Fahrenheit", JLabel.RIGHT));
		
		// registro do listener para o componente JTextField
		tfC.addActionListener(this); 
		tfC.setToolTipText("Temperatura em Celsius");
		// registro do listener para o componente JButton
		bConv.addActionListener(this); 
		bConv.setToolTipText("Converte temperatura para Fahrenheit");
		
		// botão como default
		getRootPane().setDefaultButton(bConv); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método 
		// autodimensiona janela
		pack(); 
	}
	
	@Override
	public void actionPerformed (ActionEvent e) { // implementação do listener na classe
		try { // conversão de temperatura
			float temp = 1.8f*Float.parseFloat(tfC.getText())+32; // uso do componente JTextField
			lRes.setText(temp+"F");
		} catch (NumberFormatException nfe) {
			lRes.setText("Valor inválido!");
	}	}
	
	public static void main (String a[]) {
		SwingUtilities.invokeLater( // expressão lambda para facilitar
			() -> { new pag260a262__JTextField ().setVisible(true); }
		);
	}
}
