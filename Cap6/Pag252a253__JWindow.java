import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

@SuppressWarnings("serial")
public class Pag252a253__JWindow extends JWindow {
	public Pag252a253__JWindow () {
		setLocation(150, 150);
		JLabel label = new JLabel("<HTML><U>Fechar</U></HTML>", JLabel.RIGHT); // componente JLabel de JComponent↓
		label.addMouseListener(new MouseAdapter() { //classe anônima
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);  //fecha aplicação
		}	}	);
		add("North", label); // componente JLabel de JComponent↑
		add("Center", new JLabel(new ImageIcon("./img/JGP.png")));  // ←componente JLabel de JComponent
		pack();
	}
	public static void main (String a[]) {
		new Pag252a253__JWindow ().setVisible(true);
	}
}
