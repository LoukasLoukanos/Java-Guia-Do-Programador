import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Pag248a250__JFreme extends JFrame {
	public Pag248a250__JFreme () {
		super("Swing Frame Um"); 

		setBounds(50, 50, 250, 100); // posição x, y | tamanho x, y 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método System.exit(0)
	}

	public static void main (String a[]) {
		new Pag248a250__JFreme().setVisible(true);
	}
}
