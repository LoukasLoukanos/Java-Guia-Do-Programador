import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Pag253a255__JLabel extends JFrame {
	public Pag253a255__JLabel () {
		super("Swing Labels"); 
		
		setSize(400, 100); 
		
		setLayout(new GridLayout(2,2)); 
		add(new JLabel("Rótulo à Esquerda")); // componente JLabel de JComponent
		add(new JLabel("Rótulo à Direita", JLabel.RIGHT)); // componente JLabel de JComponent
		add(new JLabel("Rótulo Centralizado", JLabel.CENTER)); // componente JLabel de JComponent
		add(new JLabel("<html><font color=#FF0000>Swing</font>" +
			           " é <i>diferente</i>!</html>")); // componente JLabel de JComponent
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método 
	}
	
	public static void main (String a[]) {
		SwingUtilities.invokeLater( // expressão lambda para facilitar
			() -> { new Pag253a255__JLabel ().setVisible(true); }
		);
	}
}
