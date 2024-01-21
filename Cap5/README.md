## Diferenças entre as duas bibliotecas de interface gráfica de usuário (GUI) de Java — Biblioteca AWT (Abstract Window Toolkit) e Biblioteca Swing —:
<details>
<summary></summary>

**Recursos Adicionais:** Swing oferece uma gama mais ampla de componentes e recursos do que a AWT. Por exemplo, a AWT tem um conjunto limitado de componentes, enquanto a Swing tem uma variedade mais extensa, incluindo tabelas, árvores, abas e outros.

**Desempenho:** Em alguns casos, a AWT pode ter melhor desempenho por utilizar componentes nativos. No entanto, o desempenho da Swing melhorou ao longo do tempo, e a flexibilidade e riqueza de recursos muitas vezes superam qualquer pequena diferença de desempenho.

**Threads:** Swing é projetada para trabalhar bem com a Event Dispatch Thread (EDT), facilitando a manipulação de eventos e garantindo uma interface gráfica responsiva. AWT não tem um modelo de threads tão bem definido.
Geralmente, Swing é preferido por oferecer uma experiência mais consistente, rica e flexível em termos de interface gráfica do usuário, tornando-a a escolha predominante para o desenvolvimento de GUI em Java moderno.

**Componentes Swing:** A biblioteca Swing fornece uma ampla variedade de componentes gráficos, como JFrame (janela principal), JButton (botão), JTextField (campo de texto), JLabel (rótulo), JCheckBox (caixa de seleção), JComboBox (lista suspensa), entre outros. Esses componentes são organizados hierarquicamente e podem ser combinados para criar interfaces gráficas complexas.

**Modelo de Eventos:** A Swing utiliza um modelo de eventos para lidar com as interações do usuário. Os eventos, como cliques de mouse e pressionamentos de tecla, são gerados pelos componentes Swing e tratados por ouvintes de eventos (event listeners).

**Gerenciadores de Layout (Layout Managers):** Os gerenciadores de layout são responsáveis pela organização e disposição dos componentes dentro de um contêiner (por exemplo, um JPanel). Eles garantem que os componentes sejam posicionados e redimensionados adequadamente quando a interface gráfica é exibida ou redimensionada.

**Threads Swing:** A Swing é projetada para ser usada em ambientes gráficos interativos e, portanto, requer um cuidado especial com relação às threads. As operações relacionadas à interface gráfica devem ser executadas na Event Dispatch Thread (EDT) para garantir a sincronização e a resposta adequada aos eventos.

**Look and Feel:** A Swing permite a personalização do "look and feel" (aparência e comportamento) dos componentes gráficos. Você pode escolher entre diferentes estilos visuais, como o "Metal", "Nimbus" e "Windows", para adaptar a aparência do aplicativo ao sistema operacional em execução.

***Portanto, a biblioteca Swing em Java é geralmente preferida sobre a AWT para o desenvolvimento de interfaces gráficas de usuário (GUI) devido às suas vantagens em consistência visual, flexibilidade, variedade de componentes e recursos, personalização do "look and feel", e um modelo de eventos mais robusto.***

## Uso da biblioteca Swing

**CONCEITOS IMPORTANTES:**</br>
**1. Eventos (Events):** </br>
Eventos representam a ocorrência de alguma ação ou mudança de estado em um componente de interface gráfica, como um botão sendo clicado, um campo de texto sendo preenchido, etc.
Em Java, eventos podem ser gerados por diferentes componentes de GUI, como botões, caixas de texto, listas, etc.

**2. Ouvintes de Eventos (Event Listeners):** </br>
Ouvintes de eventos são objetos que agem como "escutadores" e "respondem" a eventos específicos.
Eles implementam interfaces específicas relacionadas ao tipo de evento que desejam tratar. Por exemplo, se você quiser lidar com eventos de clique de botão, implementaria a interface ActionListener.

</details>
</br>


## **Pág. 219 à 228............Componentes | Construindo uma aplicação gráfica | Esboço da janela | Implementação de uma subclasse de Jframe | Declaração dos componentes ativos | Implementação do construtor | Programação dos processadores de eventos (event listners) | Início da aplicação GUI**
<details>
<summary></summary>

### Os seis passos para a implementação de uma aplicação gráfica em Swing:
 - **Passo 1: Esboço da Janela**
   - Desenho da janela pretendida que inclui: disposição dos componentes (layout), identificação e tipo dos componentes, especificação das ações do usuário e reações correspondentes.
 - **Passo 2: Implementação de uma Subclasse de JFrame**
   - Construção de uma subclasse de JFrame para cada janela.
 - **Passo 3: Declaração dos Componentes**
   - Declaração dos componentes ativos como campos privados da classe criada e, opcionalmente, dos componentes não ativos.
 - **Passo 4: Implementação do Construtor**
   - Definição de construtor capaz de organizar os componentes na interface e registrar os eventos necessários.
 - **Passo 5: Programação dos Processadores de Eventos**
   - Implementação dos métodos que processarão os eventos selecionados.
 - **Passo 6: Início da Aplicação GUI**
   - Caso a janela seja a principal da aplicação (primeira janela a ser utilizada), é adequado incluir o método main(String[]).

</br>

*→ A disposição dos passos geralmente é organizada na seguinte órdem:*

```java
/*
[begin2—
    [begin3——end3]
    [begin4—
        [begin1——end1]
    —end4]
    [begin5——end5]
    [begin6——end6]
—end2]
*/
```

</br>

***Exemplo simples:***

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//[↓ PASSO 2: Implementação de uma Subclasse de JFrame______________________________
public class MinhaJanela extends JFrame {

    //[↓ PASSO 3: Declaração dos Componentes____________________________________________
    private JButton meuBotao;
    //_________________________________________________________________________PASSO 3 ↑]


    //[↓ PASSO 4: Implementação do Construtor___________________________________________
    public MinhaJanela() {

        meuBotao = new JButton("Clique Aqui");
        getContentPane().add(meuBotao);
        
        //[↓ PASSO 1: Esboço da Janela______________________________________________________
        setTitle("Minha Janela Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //_________________________________________________________________________PASSO 1 ↑]


        // ♦ [(ou) Maneira 1/2↓]: Adicionando um ouvinte de evento (Event Listener) ao botão com classe anônima
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Este método é chamado quando o botão é clicado
                JOptionPane.showMessageDialog(null, "Você clicou no botão!");
            }
        });

        // ♦ [(ou) Maneira 2/2↑]: Adicionando um ouvinte de evento (Event Listener) ao botão substituindo a classe anônima por uma expressão lambda
        meuBotao.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Você clicou no botão!");
        });
    }
    //_________________________________________________________________________PASSO 4 ↑]


    /*[↓ PASSO 5: Programação dos Processadores de Eventos______________________________
     *  Métodos que processarão os eventos capturados pelos ouvintes 
     *  de evento (Event Listeners) declarados no método construtor
     *_________________________________________________________________________PASSO 5 ↑]*/


    //[↓ PASSO 6: Início da Aplicação GUI_______________________________________________
    public static void main(String[] args) {
        // Cria uma instância da classe principal
        MinhaJanela minhaJanela = new MinhaJanela();
        // Torna a janela visível
        minhaJanela.setVisible(true);
    }
    //_________________________________________________________________________PASSO 6 ↑]
}
//_________________________________________________________________________PASSO 2 ↑]

```

</br>

***Exemplo avançado:***

```java
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

```

</details>
</br>


## **Pág. xxx à xxx............Nome | Nome**
<details>
<summary></summary>

```java
//code
```

</details>
</br>


## **Pág. xxx à xxx............Nome | Nome**
<details>
<summary></summary>

```java
//code
```

</details>
</br>