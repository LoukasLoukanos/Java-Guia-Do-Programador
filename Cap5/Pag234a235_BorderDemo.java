import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag234a235_BorderDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag234a235_BorderDemo () {
		// Passo 1{...
		setTitle("BorderDemo");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		// BorderLayout é default para JFrame

		// adição dos componentes
		cp.add(new JButton("Botão 1"),"North"); 
		cp.add(new JButton("Botão 2"),"South");
		cp.add(new JButton("Botão 3"),"East");
		cp.add(new JButton("Botão 4"),"West");
		cp.add(new JButton("Botão 5"),"Center");
	}
	// P.5{...

	// Passo 6{...
	public static void main (String args[]) {
		new Pag234a235_BorderDemo().setVisible(true);
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
