import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag229a230_NullDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag229a230_NullDemo () {
		// Passo 1{...
		setTitle("NullDemo");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		cp.setLayout(null); // layout desativado
		for (int i=0; i<5; i++) {
			JButton b = new JButton("Botão"+(i+1));
			b.setBounds(10+i*90, 30, 80, 20); // x, y, larg, alt
			cp.add(b); // adição do componente
		}
	}
	// P.5{...}

	// Passo 6{...
	public static void main (String args[]) {
		new Pag229a230_NullDemo().setVisible(true);
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
