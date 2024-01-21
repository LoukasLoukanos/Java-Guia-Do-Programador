// importação dos pacotes típicos para GUI
import java.awt.*;
import javax.swing.*;
// pacote para formatador decimal
import java.text.*;

@SuppressWarnings("serial") // informa ao compilador para não gerar um aviso relacionado à ausência do campo 'serialVersionUID' para a classe Pag219a228_SeisPassos
//[↓ PASSO 2: Implementação de uma Subclasse de JFrame______________________________
public class Pag219a228_SeisPassos extends JFrame {
    
    //[↓ PASSO 3: Declaração dos Componentes____________________________________________
    private JTextField tfValor1, tfValor2; // componentes ativos
    private JButton bLimpar, bConverter; // componentes ativos
    private JLabel lUnidade1, lUnidade2; // componentes não ativos
    DecimalFormat df = new DecimalFormat("#,##0.00"); // formatador decimal
    //_________________________________________________________________________PASSO 3 ↑]


    //[↓ PASSO 4: Implementação do Construtor___________________________________________
    public Pag219a228_SeisPassos () {

        // instancia componentes
        lUnidade1 = new JLabel("Celsius");
        lUnidade2 = new JLabel("Farenheit");
        tfValor1 = new JTextField();
        tfValor2 = new JTextField();
        bLimpar = new JButton("Limpar");
        bLimpar.setToolTipText("Limpa as caixas de entrada");
        bConverter = new JButton("Converter");
        bConverter.setToolTipText("Efetua convers\u00E3o do valor dado");

        // obtém container
        Container cp = getContentPane();
        
		// ajusta layout
        cp.setLayout(new GridLayout(3,2,5,5));
        /* adição dos componentes na ordem: da esquerda para a direita, de cima para baixo.
		   [ 1° ] [ 2° ]
		   [ 3° ] [ 4° ]
		   [ 5° ] [ 6° ] */
        cp.add(lUnidade1);  // [ 1° ]
        cp.add(tfValor1);   // [ 2° ]
        cp.add(lUnidade2);  // [ 3° ]
        cp.add(tfValor2);   // [ 4° ]
        cp.add(bLimpar);    // [ 5° ]
        cp.add(bConverter); // [ 6° ]


        //[↓ PASSO 1: Esboço da Janela ↓______________________________________________________
        setTitle("Conversor");
        cp.setBackground(Color.orange);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        //_________________________________________________________________________PASSO 1 ↑]


        // ouvintes de evento (Event Listeners) com expressão lambda
        bLimpar.addActionListener( (e) -> { 
			bLimparClick(); 
		});

        bConverter.addActionListener( (e) -> { 
			bConverterClick(); 
		});
    }
    //_________________________________________________________________________PASSO 4 ↑]


    //[↓ PASSO 5: Programação dos Processadores de Eventos______________________________
    private void bLimparClick () { // limpa caixas de texto
        tfValor1.setText("");
        tfValor2.setText("");
    }

    private void bConverterClick () {// efetua conversão
        // C -> F se tfValor2 vazia e tfValor1 com conteúdo
        if (tfValor2.getText().equals("") &&
            !tfValor1.getText().equals("")) {
            try {
                double res = 9*Double.parseDouble(tfValor1.getText())/5 + 32;
                tfValor1.setText("");
                tfValor2.setText("" + df.format(res));
            } catch (NumberFormatException exc) {
                tfValor1.selectAll();
                tfValor1.requestFocus();
                Toolkit.getDefaultToolkit().beep();
            }
        // F -> C se tfValor1 vazia e tfValor2 com conteúdo
        } else if (tfValor1.getText().equals("") &&
            !tfValor2.getText().equals("")) {
            try {
                double res = 5*(Double.parseDouble(tfValor2.getText())-32)/9;
                tfValor2.setText("");
                tfValor1.setText("" + df.format(res));
            } catch (NumberFormatException exc) {
                tfValor2.selectAll();
                tfValor2.requestFocus();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    //_________________________________________________________________________PASSO 5 ↑]


    //[↓ PASSO 6: Início da Aplicação GUI_______________________________________________
    public static void main (String a[]) { // início da aplicação
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run () {
                // instanciação e exibição da janela principal
                new Pag219a228_SeisPassos().setVisible(true);
        }   });
    }
    //_________________________________________________________________________PASSO 6 ↑]
}
//_________________________________________________________________________PASSO 2 ↑]
