import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class pag264a265__JPasswordField_part2 extends JFrame {
	private JLabel lRes;
	private JPasswordField pf; // componente JPasswordField de JComponent
	private JButton bAnalisar;

	public pag264a265__JPasswordField_part2() {
		setTitle("Senhas"); // ajusta titulo
		// layout grade 1x2
		setLayout(new GridLayout(1, 4, 1, 1));
		add(new JLabel("Senha", JLabel.RIGHT));
		add(pf = new JPasswordField(10)); // componente JPasswordField de JComponent
		add(bAnalisar = new JButton("Analisar"));
		// resultado
		add(lRes = new JLabel());
		
		// para rótulo não ser transparente
		lRes.setOpaque(true);
		bAnalisar.addActionListener((e) -> { // expressão lambda
			pag264a265__JPasswordField_part1 forca = pag264a265__JPasswordField_part1
				.evaluateStrength(pf.getPassword());
			lRes.setText(forca.toString());
			lRes.setBackground(forca.getColor());
		});
		
		// botao como default
		getRootPane().setDefaultButton(bAnalisar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método 
		// autodimensiona janela
		pack();
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater( // expressão lambda para facilitar
			() -> { new pag264a265__JPasswordField_part2().setVisible(true); }
		);
	}
}
