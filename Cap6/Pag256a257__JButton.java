import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Pag256a257__JButton extends JFrame implements ActionListener {
	private JLabel label1;
	private JButton button1;
	// contador de clicks
	private int count=0;
	private final String msg = "Número de clicks: ";

	public Pag256a257__JButton () {
		setTitle("Swing Button"); // ajusta título
		Container cp = getContentPane(); // painel de conteúdo
		cp.setLayout(new FlowLayout()); // ajusta layout FlowLayout
		cp.setBackground(Color.orange); // ajusta cor de fundo

		// instanciação e adição
		cp.add(button1 = new JButton("Botão Swing")); // componente JButton de JComponent com texto
		cp.add(label1 = new JLabel(msg + count)); // componente JLabel de JComponent
		
		// listener que registra este objeto
		button1.addActionListener(this);
		button1.setMnemonic('S'); // tecla de atalho
		button1.setToolTipText("Clique aqui para contar."); // dica

		setSize(300, 75);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método 
	}

	@Override
	public void actionPerformed (ActionEvent e) { // ação do botão
		++count;
		label1.setText(msg + count);
	}

	public static void main (String a[]) {
		SwingUtilities.invokeLater( // expressão lambda para facilitar
			() -> { new Pag256a257__JButton ().setVisible(true); }
		);
	}

}
