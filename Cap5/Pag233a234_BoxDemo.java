import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag233a234_BoxDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag233a234_BoxDemo () {
		// Passo 1{...
		setTitle("BoxDemo"); 
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		// layout BoxLayout: use X._AXIS ou Y_AXIS
		cp.setLayout(new BoxLayout(cp, BoxLayout.X_AXIS));
		// adição dos componentes
		cp.add(new JButton("Botão 1"));
		cp.add(new JButton("Botão 2"));
		cp.add(new JButton("Botão 3 Diferente"));
		cp.add(new JButton("Botão 4"));
	}
	// P.5{...}

	// Passo 6{...
	public static void main (String args[]) {
		new Pag233a234_BoxDemo().setVisible(true);
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
