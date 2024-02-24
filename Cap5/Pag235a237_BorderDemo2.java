import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag235a237_BorderDemo2 extends JFrame {
	private JButton bFechar;
	// P.3{...}

	// Passo 4{...
	public Pag235a237_BorderDemo2() {
		// Passo 1{...

		super("BorderDemo2");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane(); // container
		
		// layout FlowLayout
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JButton(new ImageIcon("./img/cut16.gif")));
		p1.add(new JButton(new ImageIcon("./img/copy16.gif")));
		p1.add(new JButton(new ImageIcon("./img/paste16.gif")));
		cp.add("North", p1);
		
		// Painel Lateral
		p1 = new JPanel();
		JPanel p2 = new JPanel(new GridLayout(2, 1, 5, 5));
		p2.add(new JButton("Abrir"));
		p2.add(bFechar = new JButton("Fechar"));
		p1.add(p2);
		cp.add("East", p1);
		// Componente central
		cp.add(new JScrollPane(new JTextArea()), "Center");

		// Listener com lambda
		bFechar.addActionListener((e) -> { bFecharClick(); });
	}

	// Passo 5{...
	private void bFecharClick() {
		System.exit(0);
	}

	// Passo 6{...
	public static void main(String args[]) {
		new Pag235a237_BorderDemo2().setVisible(true);
	}
}


/* Lembrando:
   Passo 1 (Esboço da Janela)
   Passo 2 (Implementação de uma Subclasse de JFrame)
   Passo 3 (Declaração dos Componentes)
   Passo 4 (Implementação do Construtor)
   Passo 5 (Programação dos Processadores de Eventos)
   Passo 6 (Início da Aplicação GUI)
*/
