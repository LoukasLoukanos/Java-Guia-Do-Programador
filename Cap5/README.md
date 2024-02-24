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
        bConverter.setToolTipText("Efetua conversão do valor dado");

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


## **Pág. 228 à 236............Gerenciadores de Layout | Layout nulo | FlowLayout | GridLayout | BoxLayout | BorderLayout**
<details>
<summary></summary>

**Em Java a adição de componentes envolve duas estratégias:**
 - 1. Definição direta do tamanho e posicionamento dos componentes adicionados ao container (com Swind ou AWT):
   - (Layout Nulo ou Layout XY) → o Gerenciador de Layout (Layout Manager) é desativado.
 - 2. Delegação da tarefa de dimencionamento e posicionamento dos componentes para o gerenciador de layout do container (com Swind ou AWT):
   - (Layout Managers) → AWT e Swing: FlowLayout, GriLayout, BorderLayout, CardLayout, GridBagLayout; Swing: BoxLayout, GroupLayout, OverlayLayout e SpringLayout.
 - → Também é possível criar gerenciadores de Layout com critérios próprios para posições e dimensões por meio de classes que realizem as interfaces LayoutManager e LayoutManager2.

</br>

### **Layout Nulo:**

**(AWT ou Swing)**</br>
#### **→ Os gerenciadores de Layout são desativados no container, requerendo o adicionamento dos componentes explicitamente.**

O layout nulo (null layout) em Java, geralmente associado com null ou setLayout(null), permite que você posicione e dimensione os componentes manualmente, fornecendo controle absoluto sobre o layout da interface gráfica. No entanto, há algumas considerações importantes a serem feitas ao usar o layout nulo:
</br>

**Posicionamento Absoluto:** Com o layout nulo, você especifica explicitamente as coordenadas (x, y) para cada componente. Isso oferece controle preciso sobre onde os componentes são exibidos na tela.
</br>

**Tamanho Fixo:** No layout nulo, você também especifica o tamanho exato (largura e altura) dos componentes. Isso pode ser útil quando você precisa de componentes com tamanhos específicos.
</br>

**Problemas de Dimensionamento:** Uma desvantagem do layout nulo é que a aparência da interface gráfica pode não se ajustar bem a diferentes tamanhos de tela ou resoluções. Se a tela for redimensionada, os componentes não se ajustarão automaticamente.
</br>

**Dificuldade de Manutenção:** O layout nulo pode tornar o código menos modular e mais difícil de manter. À medida que a interface gráfica cresce em complexidade, pode se tornar desafiador manter o posicionamento adequado dos componentes.
</br>

**Dependência do Sistema Operacional:** Como o layout nulo define as coordenadas e tamanhos em pixels absolutos, pode haver problemas ao executar o aplicativo em sistemas operacionais com diferentes configurações de DPI (pontos por polegada).
</br>

**Uso Moderado:** Embora o layout nulo seja útil em certos casos, seu uso é geralmente desencorajado em favor de layouts gerenciados, como BorderLayout, GridLayout ou FlowLayout, que se adaptam melhor a diferentes ambientes e tamanhos de tela.
</br>

**Convenção de Nomenclatura:** O método setBounds é frequentemente utilizado no layout nulo para definir as coordenadas e o tamanho de um componente.
</br>

```java
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag229a230_NullDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag229a230_NullDemo () {
		// Passo 1{...
		setTitle("NullDemo");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		cp.setLayout(null); // layout desativado
		for (int i=0; i<5; i++) {
			JButton b = new JButton("Botão"+(i+1));
			b.setBounds(10+i*90, 30, 80, 20); // x, y, larg, alt #### ** → (uso de setBounds é mais comum quando se trabalha com layouts nulos)
			cp.add(b); // adição do componente
		}
	}
	// P.5{...}

	// Passo 6{...
	public static void main (String args[]) {
		new Pag229a230_NullDemo().setVisible(true);
	}
}


/* Lembrando:
   Passo 1 (Esboço da Janela)
   Passo 2 (Implementação de uma Subclasse de JFrame)
   Passo 3 (Declaração dos Componentes)
   Passo 4 (Implementação do Construtor)
   Passo 5 (Programação dos Processadores de Eventos)
   Passo 6 (Início da Aplicação GUI)
*/

```

</br>

### **FlowLayout:**

**(AWT ou Swing)**</br>
#### **→ Gerenciador de Layout derivado de LayoutManager, o mais simples, os componentes são dispostos em linhas da esquerda para a direita.**

O FlowLayout em Java é um dos gerenciadores de layout fornecidos pelo Swing para organizar componentes em um contêiner. Aqui estão algumas características importantes do FlowLayout:
</br>

**Organização em Linha:** O FlowLayout organiza os componentes em uma única linha, seguindo a orientação especificada (horizontal ou vertical).
Quando os componentes atingem a borda do contêiner, eles continuam na próxima linha (ou coluna, dependendo da orientação).
</br>

**Alinhamento:** Os componentes dentro de um FlowLayout podem ser alinhados à esquerda, ao centro ou à direita na linha (ou na coluna).
O alinhamento padrão é à esquerda.
</br>

**Espaçamento:** O FlowLayout adiciona automaticamente espaçamento entre os componentes e entre os componentes e as bordas do contêiner.
O espaçamento é ajustado automaticamente para manter uma aparência uniforme.
</br>

**Ajuste Dinâmico:** O FlowLayout pode ajustar dinamicamente o tamanho dos componentes se o contêiner for redimensionado.
O tamanho dos componentes pode mudar para caber na largura (ou altura) do contêiner.
</br>

**Uso Comum em Barras de Ferramentas:** O FlowLayout é frequentemente usado em barras de ferramentas e áreas onde os componentes devem ser organizados em uma única linha com espaçamento uniforme.
</br>

**Construtor:** O construtor do FlowLayout permite especificar a orientação (FlowLayout.LEFT, FlowLayout.CENTER, FlowLayout.RIGHT, FlowLayout.LEADING, ou FlowLayout.TRAILING), o espaçamento horizontal e vertical.
</br>

**Gerenciamento Simples:** O FlowLayout é fácil de usar e é útil em situações em que a organização simples em linha é suficiente.
</br>

```java
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag230a231_FlowDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag230a231_FlowDemo () {
		// Passo 1{...
		setTitle("FlowDemo");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		cp.setLayout(new FlowLayout());	 // layout FlowLayout
		for (int i=0; i<5; i++) {
			JButton b = new JButton("Botão "+(i+1));
			cp.add(b); // adição do componente
		}
	}
	// P.5{...}

	// Passo 6{...
	public static void main (String args[]) {
		new Pag230a231_FlowDemo().setVisible(true); 
	}
}

```

</br>

### **GridLayout:**

**(AWT ou Swing)**</br>
#### **→ Gerenciador de Layout derivado de LayoutManager, organiza os componentes numa grade retangular imaginária de células de mesmo tamanho organizadas da esquerda para a direita e de cima para baixo.**

O GridLayout em Java é um gerenciador de layout que organiza os componentes em uma grade retangular. Aqui estão algumas características importantes do GridLayout:

**Organização em Grade:** O GridLayout organiza os componentes em linhas e colunas, criando uma grade retangular.
Os componentes são distribuídos de forma igual na grade.
</br>

**Número Fixo de Linhas e Colunas:** O número de linhas e colunas no GridLayout é especificado durante a criação do layout.
Todos os componentes ocupam um espaço igual na grade.
</br>

**Espaçamento Igual:** O GridLayout mantém um espaçamento uniforme entre os componentes, tanto horizontal quanto verticalmente.
</br>

**Adaptação Dinâmica:** Se o contêiner for redimensionado, o GridLayout ajusta dinamicamente o tamanho dos componentes para manter a grade uniforme.
</br>

**Tamanho Fixo dos Componentes:** Todos os componentes em um GridLayout têm o mesmo tamanho, ocupando uma célula da grade.
</br>

**Construtor:** O construtor do GridLayout aceita dois argumentos: o número de linhas e o número de colunas.
</br>

**Uso Comum em Aplicações com Grade:** O GridLayout é frequentemente usado em situações em que os componentes precisam ser organizados em uma grade regular, como em aplicativos de planilhas.
</br>

**Alinhamento:** O GridLayout não fornece opções de alinhamento individual para cada componente, pois todos os componentes têm o mesmo tamanho.
</br>

**Flexibilidade Limitada:** Enquanto o GridLayout oferece organização em grade, ele pode ter limitações em termos de layout flexível em comparação com outros gerenciadores de layout mais avançados.
</br>

```java
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag232a233_GridDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag232a233_GridDemo () {
		// Passo 1{...
		setTitle("GridDemo");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		cp.setLayout(new GridLayout(2, 3)); // layout GridLayout
		for (int i=0; i<5; i++) {
			JButton b = new JButton("Botão "+(i+1));
			cp.add(b); // adição do componente
		}
	}
	// P.5{...}

	// Passo 6{...
	public static void main (String args[]) {
		new Pag232a233_GridDemo().setVisible(true);
	}
}

```

</br>

### **BoxLayout:**

**(AWT ou Swing)**</br>
#### **→ Gerenciador de Layout derivado de LayoutManager2, distribui os elementos em uma linha vertical (Y_AXIS) ou horizontal (X_AXIS) e permite que os mesmos sejam dispostos ocupando espaços diferentes.**

O BoxLayout em Java é um gerenciador de layout que organiza componentes em uma única linha ou coluna, permitindo que os componentes sejam empilhados horizontal ou verticalmente. Aqui estão algumas características importantes do BoxLayout:
</br>

**Orientação Vertical ou Horizontal:** BoxLayout permite organizar os componentes em uma única linha (horizontal) ou coluna (vertical).
A orientação é especificada ao criar o BoxLayout usando as constantes BoxLayout.X_AXIS ou BoxLayout.Y_AXIS.
</br>

**Flexibilidade na Distribuição:** Componentes podem ter tamanhos variáveis e são organizados conforme necessário.
Os componentes podem ter diferentes larguras (orientação horizontal) ou alturas (orientação vertical).
</br>

**Alinhamento Individual:** Cada componente pode ser alinhado individualmente dentro de seu espaço alocado.
O alinhamento é controlado usando constantes como Component.LEFT_ALIGNMENT, Component.CENTER_ALIGNMENT, e Component.RIGHT_ALIGNMENT.
</br>

**Preenchimento e Espaçamento:** É possível adicionar espaçamento entre os componentes usando Box.createHorizontalStrut ou Box.createVerticalStrut. O preenchimento pode ser adicionado usando Box.createHorizontalGlue ou Box.createVerticalGlue.
</br>

**Uso Comum em Caixas de Diálogo e Painéis Simples:** BoxLayout é frequentemente usado em caixas de diálogo, barras de ferramentas e outras interfaces de usuário simples.
</br>

**Ajuste Dinâmico:** Se o contêiner for redimensionado, o BoxLayout ajusta dinamicamente o layout dos componentes.
</br>

**Construtor:** O construtor do BoxLayout aceita dois argumentos: o contêiner a ser organizado e a orientação (horizontal ou vertical).
</br>

```java
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag233a234_BoxDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag233a234_BoxDemo () {
		// Passo 1{...
		setTitle("BoxDemo"); 
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		// layout BoxLayout: use X._AXIS ou Y_AXIS
		cp.setLayout(new BoxLayout(cp, BoxLayout.X_AXIS));
		// adição dos componentes
		cp.add(new JButton("Botão 1"));
		cp.add(new JButton("Botão 2"));
		cp.add(new JButton("Botão 3 Diferente"));
		cp.add(new JButton("Botão 4"));
	}
	// P.5{...}

	// Passo 6{...
	public static void main (String args[]) {
		new Pag233a234_BoxDemo().setVisible(true);
	}
}

```

</br>

### **BorderLayout:**

**(AWT ou Swing)**</br>
#### **→ Gerenciador de Layout derivado de LayoutManager2, o mais sofisticado, a disposição dos componentes podem ser definidas em em regiões distintas (superior(North), inferior(South), esquerda(west), direita(East) e central(Center)).**

O BorderLayout em Java é um gerenciador de layout que organiza os componentes em cinco áreas: norte, sul, leste, oeste e centro. Aqui estão algumas características importantes do BorderLayout:
</br>

**Cinco Áreas Distintas:** O BorderLayout divide o contêiner em cinco áreas: norte (PAGE_START), sul (PAGE_END), leste (LINE_END), oeste (LINE_START) e centro (CENTER).
Componentes adicionados ao contêiner são colocados em uma dessas áreas.
</br>

**Estica para Ocupar Espaço Disponível:** A área central (CENTER) estica para ocupar todo o espaço restante no contêiner, enquanto as outras áreas ocupam apenas o espaço necessário para acomodar seus componentes.
</br>

**Adição de Componentes:** Para adicionar um componente a uma área específica, você usa métodos como add(BorderLayout.NORTH, componente).
</br>

**Prioridade de Componentes no Centro:** Se um componente for adicionado à área central, ele terá prioridade e ocupará todo o espaço disponível.
</br>

**Uso Comum em Páginas Principais de Aplicações:** BorderLayout é frequentemente usado em páginas principais de aplicações, onde componentes principais, como barras de menu, barras de ferramentas ou áreas de visualização, são posicionados.
</br>

**Flexibilidade no Tamanho de Componentes:** Os componentes nas áreas norte e sul podem ter alturas variáveis, enquanto os componentes nas áreas leste e oeste podem ter larguras variáveis.
</br>

**Redimensionamento Dinâmico:** Se o contêiner for redimensionado, os componentes nas áreas norte, sul, leste e oeste mantêm suas dimensões preferenciais, e o componente central se ajusta dinamicamente ao espaço restante.
</br>

**Construtor:** O construtor do BorderLayout não requer argumentos. O layout padrão é criado com as áreas inicialmente vazias.
</br>

```java
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag234a235_BorderDemo extends JFrame {
	// P.3{...}

	// Passo 4{...
	public Pag234a235_BorderDemo () {
		// Passo 1{...
		setTitle("BorderDemo");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane(); // container
		// BorderLayout é default para JFrame

		// adição dos componentes
		cp.add(new JButton("Botão 1"),"North"); 
		cp.add(new JButton("Botão 2"),"South");
		cp.add(new JButton("Botão 3"),"East");
		cp.add(new JButton("Botão 4"),"West");
		cp.add(new JButton("Botão 5"),"Center");
	}
	// P.5{...

	// Passo 6{...
	public static void main (String args[]) {
		new Pag234a235_BorderDemo().setVisible(true);
	}
}

```

</br>

### **BorderLayout 2:**

```java
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
// Passo 2{...
public class Pag235a237_BorderDemo2 extends JFrame {
	private JButton bFechar;
	// P.3{...}

	// Passo 4{...
	public Pag235a237_BorderDemo2() {
		// Passo 1{...

		super("BorderDemo2");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane(); // container
		
		// layout FlowLayout
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JButton(new ImageIcon("./img/cut16.gif")));
		p1.add(new JButton(new ImageIcon("./img/copy16.gif")));
		p1.add(new JButton(new ImageIcon("./img/paste16.gif")));
		cp.add("North", p1);
		
		// Painel Lateral
		p1 = new JPanel();
		JPanel p2 = new JPanel(new GridLayout(2, 1, 5, 5));
		p2.add(new JButton("Abrir"));
		p2.add(bFechar = new JButton("Fechar"));
		p1.add(p2);
		cp.add("East", p1);
		// Componente central
		cp.add(new JScrollPane(new JTextArea()), "Center");

		// Listener com lambda
		bFechar.addActionListener((e) -> { bFecharClick(); });
	}

	// Passo 5{...
	private void bFecharClick() {
		System.exit(0);
	}

	// Passo 6{...
	public static void main(String args[]) {
		new Pag235a237_BorderDemo2().setVisible(true);
	}
}

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
