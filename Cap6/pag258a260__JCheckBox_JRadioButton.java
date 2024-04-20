import java.awt.GridLayout;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class pag258a260__JCheckBox_JRadioButton extends JFrame {
	// array para radiobutton
	private JRadioButton rb[] = new JRadioButton[3]; // componente JRadioButton de JComponent
	// array para checkbox
	private JCheckBox cb[] = new JCheckBox[3]; // componente JCheckBox de JComponent
	// rótulos
	private JLabel lRadio, lCheck; // componentes JLabel de JComponent

	public  pag258a260__JCheckBox_JRadioButton () {
		setTitle("Swing Option Buttons"); // ajusta título
		
		setLayout(new GridLayout(1,2)); // layout grade 1x2
		
		// painel auxiliar para JRadioButton
		JPanel pRadio = new JPanel(new GridLayout(4,1));
		pRadio.setBorder(BorderFactory.createEtchedBorder());
		
		// painel auxiliar para JCheckBox
		JPanel pCheck = new JPanel(new GridLayout(4,1));
		pCheck.setBorder(BorderFactory.createEtchedBorder());

		// listeners para radiobuttons e checkboxes com expressões lambda
		ItemListener ril = (e) -> { // ril→ radiobutto-item-listener
			JRadioButton rb = (JRadioButton) e.getSource();
			String item = rb.getText();
			lRadio.setText("Seleção: " + item.charAt(item.length() - 1));
		};
		ItemListener cil = (e) -> { // cil→ checkbox-item-listener
			StringBuffer itens = new StringBuffer("Seleção: ");
			for (int i = 0; i < 3; i++)
				itens.append(cb[i].isSelected() ? (i + 1) + " " : "");
			lCheck.setText(itens.toString());
		};

		// grupo para radiobutton
		ButtonGroup bg = new ButtonGroup();

		// laço para montar painéis
		for (int i=0; i<3; i++) {
			pRadio.add(rb[i] = new JRadioButton("Alternativa "+ (i+1)));
			rb[i].addItemListener(ril); // usa referência de método ril
			bg.add(rb[i]);

			pCheck.add(cb[i] = new JCheckBox("Alternativa "+ (i+1)));
			cb[i].addItemListener(cil); // usa referência de método cil
		}
		pRadio.add(lRadio = new JLabel("Seleção: "));
		add(pRadio); // adiciona ao painel de conteúdo

		pCheck.add(lCheck = new JLabel("Seleção: "));
		add(pCheck); // adiciona ao painel de conteúdo

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.EXIT_ON_CLOSE oculta e destrói a janela, encerra a JVM em uso com o método 

		// autodimensiona janela
		pack();
	}

	public static void main (String a[]) {
		SwingUtilities.invokeLater( // expressão lambda para facilitar
			() -> { new pag258a260__JCheckBox_JRadioButton ().setVisible(true); }
		);
	}
}
