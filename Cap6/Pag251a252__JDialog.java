import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Pag251a252__JDialog extends JDialog {

	public Pag251a252__JDialog (Frame resp, boolean modal) {
		
		super(resp, "Swing Dialog", modal);
		setSize(250, 90); 
		
		setLocation(resp.getX() + getWidth() + 10, resp.getY());
		
		add(new JLabel("Dialogo")); // componente JLabel de JComponent
	}
}
