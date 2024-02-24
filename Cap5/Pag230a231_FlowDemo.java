import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag230a231_FlowDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag230a231_FlowDemo () {
		// Passo 1{...
		setTitle("FlowDemo");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		cp.setLayout(new FlowLayout());	 // layout FlowLayout
		for (int i=0; i<5; i++) {
			JButton b = new JButton("Botão "+(i+1));
			cp.add(b); // adição do componente
		}
	}
	// P.5{...}

	// Passo 6{...
	public static void main (String args[]) {
		new Pag230a231_FlowDemo().setVisible(true); 
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
