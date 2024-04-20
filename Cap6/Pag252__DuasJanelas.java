import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Pag252__DuasJanelas extends JFrame {
	public Pag252__DuasJanelas () {
		super("Swing Frame Dois");
		
		setBounds(50, 50, 250, 90); // posição x, y | tamanho x, y 
		
		setResizable(false); // tamanho inalterável pelo usuário
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método 
		
		add(new JLabel("Janela")); // componente JLabel de JComponent
	}

	public static void main (String a[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Pag252__DuasJanelas principal = new Pag252__DuasJanelas (); // janela principal
				
				principal.setVisible(true);
				
				Pag251a252__JDialog dialogo = new Pag251a252__JDialog (principal, true); // janela de diálogo

				dialogo.setVisible(true);
			}
		});
	}
}
