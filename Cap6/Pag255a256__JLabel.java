import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Pag255a256__JLabel extends JFrame {
	public Pag255a256__JLabel () {
		super("Swing Labels com Ícones"); 
		
		setSize(300, 100); 
		
		setLayout(new GridLayout(2,2)); 

		add(new JLabel("Sem Ícone")); // componente JLabel de JComponent com texto
		String imgDir = "C:/JGP4/Cap06_SwingComp/img/";
		add(new JLabel(new ImageIcon(imgDir + "new16.gif"))); // componente JLabel de JComponent com imagem
		add(new JLabel(new ImageIcon(imgDir + "print16.gif"), JLabel.LEFT)); // componente JLabel de JComponent com imagem
		add(new JLabel("Ajuda", new ImageIcon(imgDir + "help16.gif"), JLabel.RIGHT)); // componente JLabel de JComponent com texto e imagem

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método 
	}

	public static void main (String a[]) {
		SwingUtilities.invokeLater( // expressão lambda para facilitar
			() -> { new Pag255a256__JLabel ().setVisible(true); }
		);
	}
}
