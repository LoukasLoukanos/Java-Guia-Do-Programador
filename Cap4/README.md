## **Pág. 147 à 151............Herança e sobreposição**
<details>
<summary></summary>

#### **Exemplo:**

```java
public class Pag147a151_HerancaeSobreposicao {

	protected double kProp, kLin;

	public Pag147a151_HerancaeSobreposicao (double kProp, double kLin) {
		this.kProp = kProp;
		this.kLin = kLin;
	}
	public double getKProp ( ) { 
		return kProp;
	}
	public double getKLin ( ) { 
		return kLin; 
	}
	public double converter (double valor) {
		return valor*kProp + kLin;
	}
	@Override // Sobreposição (mudança do corpo/bloco) do método toString
	public String toString ( ) {
		return "Pag147a151_HerancaeSobreposicao[kProp=" +kProp+",kLin= " + kLin+"]";
	}

	public static void main(String[] args) {
		// Um conversor de medidas em centímetros para polegadas poderia ser definido, instanciado e usado assim (com o jshell omitindo os comentários):

		//open Pag147a151_HerancaeSobreposicao.java   →   Carrega arquivo com código Java

		// instancia conversor com valores adequados
		Pag147a151_HerancaeSobreposicao c2p = new Pag147a151_HerancaeSobreposicao (0.3937, 0.0);

		// medida en cm
		double cm = 15;

		// conversão cn para pol
		double pol = c2p.converter (cm);

		//vars   →   exibe variáveis e seus valores (no jshell)
		System.out.println("cm: " + cm);
		System.out.println("pol: " + pol);
	}
	
}


/*
// Outros conversores podem ser criados como no exemplo acima↑, porém a infraestrutura da classe Pag147a151_HerancaeSobreposicao
// é aproveitada melhor na implementação de conversores específicos por meio da herança :
public class ArquivoExemplo_1 extends Pag147a151_HerancaeSobreposicao {
	public ArquivoExemplo_1( ) {
		// aciona o construtor da superclasse Pag147a151_HerancaeSobreposicao
		super(0.3937, 0.0);
	}
}

public class ArquivoExemplo_2 extends Pag147a151_HerancaeSobreposicao {
	public ArquivoExemplo_2 ( ) {
		// aciona o construtor da superclasse Pag147a151_HerancaeSobreposicao
		super(1.0, 273.0); 
	}
}

public class ArquivoExemplo_3 extends Pag147a151_HerancaeSobreposicao {
	public ArquivoExemplo_3 ( ) {
		// aciona o construtor da superclasse Pag147a151_HerancaeSobreposicao
		super(1.0, -273.0); 
	}
}

import java.util.Scanner;
public class ArquivoExemplo_4 {
	public static void main (String arg[ ]) {
		// prepara console
		Scanner sc = new Scanner(System.in); 

		System.out.print("Digite temperatura Celsius: ");
		// lê temp Celsius
		double tempC = sc.nextDouble();	 
		sc.close();
		// cria conversor Celsius p/ Kelvin e exibe info
		ArquivoExemplo_2 ck = new ArquivoExemplo_2();
		// uso implícito de toString()
		System.out.println("ck : "+ ck); 
		// conversão C-->K
		double tempK = ck.converter(tempC); 
		// resultado
		System.out.println("tempK = "+ tempK + "K"); 

		// cria conversor Kelvin p/ Celsius e exibe info
		ArquivoExemplo_3 kc = new ArquivoExemplo_3();
		// uso implícito de toString()
		System.out.println("kc : "+ kc); 
		// conversão K-->C
		tempC = kc.converter(tempK); 
		// resultado
		System.out.println("tempC = "+ tempC + "C"); 
	}
}
*/

```

</details>
</br>


## **Pág. 152 e 153............Classe Object**
<details>
<summary></summary>

#### **Exemplo:**

```java
public class Pag152e153_ClasseObject {
	public static void main (String args[]) {

		Object a = new Object(); // novo objeto a
		Object b = new Object(); // novo objeto b
		Object c = b; // referência c é o mesmo objeto b
		
		// equals(Object) determina se as referências usadas são relacionadas ao mesmo objeto
		System.out.println("a==b " + a.equals(b) + "\tb==a " + b.equals(a)); // produz: false, false
		System.out.println("c==b " + c.equals(b) + "\tb==c " + b.equals(c)); // produz: true, true	
		System.out.println("a==c " + a.equals(c) + "\tc==a " + c.equals(a)); // produz: false, false	
		
		

		String s = new String("Java");
		String t = "Jandl"; // instanciação implícita de String
		String u = s;

		// equals(String) são comparados os conteúdos de cada objeto
		System.out.println("s==t " + s.equals(t) + "\tt==s " + t.equals(s)); // produz: false, false
		System.out.println("s==u " + s.equals(u) + "\tu==s " + u.equals(s)); // produz: true, true
	}
}

```

</details>
</br>


## **Pág. 154 à 171............Interfaces | Polimorfismo**
<details>
<summary></summary>

- Interfaces:
  - Realização de interfaces;
  - Evolução de interfaces;
  - Métodos default;
  - Métodos estáticos;
  - Métodos privados;
  - Interfaces de marcação;
  - Interfaces funcionais;
- Polimorfismo:
  - Upcasting;
  - Downcasting;
- Classes abstratas.

ver diretório:
 - <a href="#">Pág154a171\jandl\jgp4</a>

</details>
</br>


## **Pág. 172 à 176............Classes Aninhadas, Internas e Anônimas**
<details>
<summary></summary>

Em Java, as classes internas e classes aninhadas, podem ser usadas para diversos fins, tais como:</br>

 - Encapsulamento: Podem ser usadas para encapsular uma classe que é relevante apenas para a classe externa. Isso pode ajudar a reduzir a poluição do espaço de nomes e tornar o código mais fácil de ler e entender.

 - Acesso a membros privados: Podem acessar membros privados da classe externa, incluindo variáveis e métodos privados. Isso pode ser útil quando é necessário acessar ou modificar esses membros privados.

 - Implementação de interfaces: Podem implementar interfaces, o que pode ser útil para definir comportamentos específicos para uma classe externa. Isso pode ajudar a tornar o código mais modular e fácil de manter.

 - Criação de classes auxiliares: Podem ser usadas para criar classes auxiliares que são usadas apenas pela classe externa. Isso pode ajudar a evitar a criação de classes desnecessárias e tornar o código mais organizado.

#### **Exemplo:**

```java
// CLASSE EXTERNA ou outter class ou enclosing class
public class Pag172a176_Externa {

	private int valor; 

	public Pag172a176_Externa(int valor) { 
		this.valor = valor;
	}

	// CLASSE INTERNA (ou inner class)
	public class Aninhada { // o especificador da classe determina seu acesso externo: se pública, poderá ser acessada e instanciada; se privada, seu uso será exclusivo por parte da CLASSE EXTERNA
		public void exibir () {
			System.out.println("valor = "+ valor);
		}
	}

	// Carregamento da classe Pag172a176_Externa no shell:
	// open Pag172a176_Externa.java

	//instanciação da CLASSE EXTERNA (para referência de instanciação da CLASSE INTERNA):
	Pag172a176_Externa obj_externa = new Pag172a176_Externa (10);

	//instanciação da CLASSE INTERNA (a partir da referência do objeto da CLASSE EXTERNA):
	Pag172a176_Externa.Aninhada obj_interna = obj_externa.new Aninhada ();
}

```

</br>

As classes anônimas em Java são utilizadas para criar classes que não precisam de um nome específico e podem ser usadas apenas uma vez. Elas são criadas no momento da sua declaração e podem ser usadas para implementar uma interface ou uma classe abstrata. </br></br>

As classes anônimas são definidas dentro de uma expressão, em vez de serem definidas explicitamente como uma classe separada. Elas são úteis para criar objetos temporários ou para passar uma implementação personalizada como um parâmetro em um método. </br></br>

As classes anônimas são uma ferramenta útil para simplificar o código e evitar a necessidade de criar classes separadas para pequenas implementações de interfaces ou classes abstratas. No entanto, elas devem ser usadas com moderação, pois podem tornar o código mais difícil de entender se forem usadas em excesso. </br></br>

Resumindo: Classe Anônima → é uma classe interna auxiliar sem nome, definida (implicitamente) como uma subclasse ou como uma realização de uma interface, com o propósito de servir para a instanciação de um único objeto.

#### **Exemplo:**

```java

/* 
Um exemplo de uso de classe anônima é a implementação de um ActionListener
em uma interface gráfica de usuário. Um código pode ficar assim:
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // código de ação do botão aqui
    }
});
Nesse exemplo, estamos criando uma classe anônima que implementa a interface ActionListener 
e define o método actionPerformed para executar uma ação quando o botão é clicado.

__________________________________________________________________________________________
♦ Sem o uso de Classe interna anônima poderiamos ter:

class A extends SuperClasse {
	public void  metodo () {
		// bloco do método
	}
}

class B implements Interface {
	public void  metodo () {
		// bloco do método
	}
}

• Teríamos que instanciar objetos assim ↓:
A obj = new A ();
B obj = new B ();

__________________________________________________________________________________________
♦ Com o uso de Classe interna anônima podemos ter:

SuperClasse obj = new SuperClasse () { // classe interna anônima (definida implicitamente)
	public void  metodo () {
		// bloco do método
	}
}

Interface obj = new Interface () { // classe interna anônima (definida implicitamente)
	public void  metodo () {
		// bloco do método
	}
}

• Os objetos ja foram instanciados nas classes internas anônimas ↑  */

```

</br>

É possível declarar classes aninhadas estáticas de modo semelhante a nutt membros (campos e métodos). </br>

Quando a classe aninhada é estática, seu acesso se restringe aos membros estáticos da classe externa, de qualquer nível de acessibilidade. </br>

Classes aninhadas são elementos auxiliares e somente devem ser criadas quando sua implementação se limitar a dois ou três métodos simples. </br>

São muito utilizadas na criação de iterators (classes para navegação de coleções) e no processamento de eventos em aplicações dotadas de interfaces gráficas. </br>

#### **Exemplo:**

```java
public class Pag172a176_OutraExterna {
	private static int valor;

	// CLASSE ANINHADA ESTÁTICA
	public static class AninhadaEstatica { 
		public void exibir () {
			System.out.println("valor = "+ valor);
		}
	}


	/* Classes aninhadas estáticas não são, formalmente, consideradas classes internas, porque não existe 
	uma relação de dependência tão forte como para classes internas. 
	Até mesmo a instanciação da CLASSE ANINHADA independe de uma instância da classe externa: */



	// Carregamento da classe Pag172a176_OutraExterna no shell:
	// open Pag172a176_OutraExterna.java

	// instanciação da CLASSE ANINHADA ESTÁTICA:
	Pag172a176_OutraExterna.AninhadaEstatica aninhadaEstatica = new Pag172a176_OutraExterna.AninhadaEstatica();

	
	
	/* Portanto, a sintaxe é diferente da usada para instanciar classe interna (a partir da referência do objeto da classe externa):
	
	→ instanciação da classe externa (para referência de instanciação da classe interna):
	Pag172a176_Externa obj_externa = new Pag172a176_Externa (10);

	→ instanciação da classe interna (a partir da referência do objeto da classe externa):
	Pag172a176_Externa.Aninhada obj_interna = obj_externa.new Aninhada ();  */
}

```

</br>

Classes aninhadas estáticas não são, formalmente, consideradas CLASSES INTERNAS.

#### **Exemplo:**

```java
import java.util.Scanner;

// CLASSE EXTERNA ou outter class ou enclosing class
public class Pag172a176_Lista {
	public static void main (String arg[]) {
		
		Nodo lista = null; 
		
		Scanner sc = new Scanner(System.in); 
		
		String aux;
		do { 
			System.out.println("Digite uma palavra (. encerra):");
			aux = sc.next();
			if (!aux.equals(".")) {
				Nodo novo = new Nodo(aux, lista);
				lista = novo;
			}
		} while (!aux.equals("."));
		sc.close();
		
		System.out.println("Lista das Palavras:\n");
		
		Nodo nodo = lista; 
		while (nodo!=null) {
			System.out.print(nodo.nome + " ");
			nodo = nodo.proximo;
		}
		System.out.println("<.>");
	}
	
	// CLASSE ANINHADA ESTÁTICA → (lembrando: "Classes aninhadas estáticas não são, formalmente, consideradas CLASSES INTERNAS". Ver: Pag172a176_OutraExterna)
	private static class Nodo {
		public String nome;
		public Nodo proximo;
	
		@SuppressWarnings("unused")
		public Nodo () { 
			this(null, null); 
		}
		public Nodo (String n, Nodo p) {
			nome = n; proximo = p;
		}
	}
}

```

</br>

Usar classes internas a métodos não é uma prática habitual, pois dificulta a legibilidade do código, além de ter justificativa de uso questionável na maior parte dos casos.

#### **Exemplo:**

```java
public class Pag172a176_EmMetodo {
	public static void main(String a[]) {
		Extra extra = new Extra();
		extra.info();
		extra.operacao(33);
		extra.info();
	}
}

class Extra { // classe externa (ou outter class ou enclosing class)
	private int total = 0;
	
	public void operacao(int v) {
		class Somador { // classe interna (ou inner class) a um método 
			public void soma(int v) {
				total += v; //acessa o atributo privado da classe externa
			}
		}
		// uso da classe interna do método
		Somador s = new Somador();
		s.soma(v);
	}
	
	public void info() {
		System.out.println("total = " + total);
	}
}

```

</details>
</br>


## **Pág. 177 à 179............Classes wrapper**
<details>
<summary></summary>

As classes wrapper encapsulam os tipos primitivos na forma de objetos agregando também funcionalidades de conversão e tratamento. </br>
Todos os objetos das classes wrapper são imuráveis, ie, depois de criados não podem ter seus valores alterados. Além disso, essas classes são declaradas como final e, portanto, não podem ser estendidas.

╔═════════════════╦════════════════════╦════════════════════╦═════════════════╗
║.................║...Tipo primitivo...║...Classe Wrapper...║...Superclasse...║
╠═════════════════╬════════════════════╬════════════════════╬═════════════════╣
║..lógico.........║..boolean...........║..Boolean...........║.................║
╠═════════════════╬════════════════════╬════════════════════╣.....Object......║
║..caractere......║..char..............║..Character.........║.................║
╠═════════════════╬════════════════════╬════════════════════╬═════════════════╣
║.................║..byte..............║..Byte..............║.................║
║.................╠════════════════════╬════════════════════╣.................║
║.................║..short.............║..Short.............║.................║
║...integral......╠════════════════════╬════════════════════╣.................║
║.................║..int...............║..Integer...........║.................║
║.................╠════════════════════╬════════════════════╣.....Number......║
║.................║..long..............║..Long..............║.................║
╠═════════════════╬════════════════════╬════════════════════╣.................║
║.................║..float.............║..Float.............║.................║
║.ponto flutuante.╠════════════════════╬════════════════════╣.................║
║.................║..double............║..Double............║.................║
╚═════════════════╩════════════════════╩════════════════════╩═════════════════╝

#### **Exemplo:**

```java
public class Pag177a179_ClassesWrapper {
	public static void main(String a[]) {
		
		// autoboxing: valores são convertidos em Float
		Float array1[ ] = { -4.65f, 0.18f, 7.329f };
		
		float soma = 0;
		
		// aloca array
		Double array2[] = new Double[array1.length]; 
		System.out.print("array1 [ ");
		
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
			
			// autounboxing
			float aux = array1[i]; 
			soma += aux;
			
			// autoboxing
			array2[i] = 2.0*aux; 
		}
		System.out.println("]\nSoma: "+ soma);
	}
}


/*_______________________________________________________________________________________________________________________________________
 * Como qualquer classe Java, todas as classes wrapper oferecem os métodos públicos disponíveis em Object, dos quais se destacam:
 * • boolean equals(Object) → para realização de comparações;
 * • String toString() → que fornece uma representação textual do objeto, no caso, seu valor expresso como uma string (um objeto String).
 
 * As classes derivadas de Number, como Integer e Double, oferecem ainda outros métodos:
 * • int compareTo(Object) → que realiza comparações entre objetos das classes wrapper
 * • byte byteValue(), • double doubleValue(), • float floatValue(), • int intValue(), • long longValue() e • short shortValue():
 *   → retornam o valor encapsulado como um tipo primitivo */

// É preferível usar os métodos fábrica valueOf em vez de seus construtores:
Integer inteiro = Integer.valueOf(4); 
Double real = Double.valueOf(9.62);
Boolean logico = Boolean.valueOf("true"); 
Character caractere = Character.valueOf('a');

// Para obter valores encapsulados em objetos wrapper:
long l = inteiro.longValue(); 
double d = real.doubleValue();
float f = real.floatValue(); 
short s = real.shortValue();
boolean b = logico.booleanValue(); 
char c = caractere.charValue();

//_______________________________________________________________________________________________________________________________________
// Simplificaçao de operações com encaixotamento (autoboxing ou boxing) e desencaixotamento (autounboxing ou unboxing) automáticos:
// ♦ Encaixotamento automático (autoboxing ou boxing):
// → permite atribuir valores primitivos para referências do tipo wrapper equivalentes ou mesmo do tipo produzindo a criação de um objeto wrapper:
Double objD = -2.75; // autoboxing → é equivalente a Double objD = new Double(-2.75);
Object objI= 13; // autoboxing → é equivalente a Object objI = new Integer(13);

// A inicialização direta de arranjo também pode empregar o autoboxing: 
Double valores1[] = {-1.35, 0.75, 7.928}; // valores são convertidos em Double
Integer valores2[] = {0, 1, 2, 3, 4}; // inicialização direta de arranjo


// ♦ Desencaixotamento automático (autounboxing ou unboxing):
// → De modo semelhante, a atribuição de objetos wrapper a variáveis de tipo primitivo provoca a extração automática de valores entre tipos equivalentes:
double vd = objD; // autounboxing → equivalente a double vd = objD.doubleValue();
int vi= (int) objI; // autounboxing → equivalente a int vi = objI.intValue();

// O autounboxing também é válido na manipulação de arranjo e seus elementos:
Integer array[] = new Integer [5];  // aloca arranjo de 5 elementos Integer
array[0] = 5; // boxing 
int x = array[0]; // unboxing → atribuição de array[0].intValue() para variável x
```

</details>
</br>


## **Pág. 180 e 181............Enumerações**
<details>
<summary></summary>

Um tipo enumerado (enumeration) é um conjunto de contantes utilizadas com frequencia para definir valores que não sofrem alterações. Para declarar um tipo enumerado utiliza-se a palavra reservada enum. Cada declaração enum gera uma classe que define variáveis estáticas e finais para cada constante e implementa as interfaces Comparable e Serializable. </br></br>

Também contém os métodos: values(), que retorna um arranjo das constantes; valueOf(String), que retorna a constante indicada pela String, além de equals(object), hasCode() e toString(). </br></br>

♦ Os cinco maiores benefícios de usar enumerações:
 - 1. Legibilidade: O uso de enums torna o código mais legível, já que é possível atribuir um nome significativo para cada valor possível. Isso torna mais fácil entender o propósito das variáveis e dos parâmetros que são definidos como enums.
 - 2. Segurança de tipo: Ao usar enums, é possível ter mais segurança de tipo do que ao usar constantes ou valores literais, já que apenas os valores definidos dentro da enumeração podem ser atribuídos a variáveis do tipo enum.
 - 3. Evolução: Se você precisar adicionar ou remover um valor de enumeração, não é necessário alterar o código em todos os lugares em que a enumeração é usada. Isso significa que a manutenção do código é mais fácil e menos propensa erros.
 - 4. Código mais claro e fácil de manter: Ao usar enumerações, o código se torna mais claro e fácil de manter, pois os valores possíveis são agrupados em um único lugar e podem ser referenciados por um nome significativo. Isso também torna o código mais fácil de ler e entender.
 - 5. Melhoria na produtividade: Com o uso de enumerações, a produtividade é melhorada, já que é possível escrever menos código e evitar erros comuns relacionados a digitação, como erros de ortografia ou de formatação.

</br>

→ Desvantagens de NÃO utilizar Enumerações: seu código é compilado junto das classes que a utilizam, assim a adição de constantes exige uma nova compilação; o uso das constantes requer o nome da classe como prefixo; as constantes não podem ser facilmente traduzidas em texto informativo; só podem ser usadas como valores primitivos; e, dado que as constantes são nomes associados a inteiros, não permitem checagem de tipo, pois se confundem com outras constantes definidas do mesmo modo.

→ Vantagens de UTILIZAR Enumerações: elas podem ser usadas como objetos, constituem um espaço de definição próprio, cada grupo de constantes define um tipo de dados diferente, checado durante a compilação, seu código, compilado separado das classes clientes, pode ser alterado livremente, os nomes das constan- tes são automaticamente usados como texto informativo.

#### **Exemplo:**

```java
public class Pag180e181_Enumeracoes {
    // • Declaração SEM uso de Enumerações:
    public static final int COMPACTAR_SEM_ENUMERACAO = 0;
    public static final int DESCOMPACTAR_SEM_ENUMERACAO = 1;

    // • Declaração COM uso de Enumerações:
    public enum Com_enum {
        COMPACTAR_COM_ENUMERACAO, DESCOMPACTAR_COM_ENUMERACAO
    };

    /* • Declaração COM uso de Enumerações sofisticado:
    Podem ser construídos como uma classe, desde que sejam observadas algumas regras:
    (I) as constantes da enumeração devem ser colocadas no início da classe e
    deve-se usar os construtores disponíveis;
    (II) os campos devem ser declarados como final;
    (III) os construtores não devem possuir um especificador de acesso e devem
    suportar as constantes declaradas;
    (IV) os métodos gerados automaticamente não podem ser sobrepostos. */
    public enum Com_enum_sofisticado {
        COMPACTAR("Compactacao", 0), // regra (I)
        DESCOMPACTAR("Descompactacao", 1);

        private final String nome; // regra (II)
        private final int valor;

        Com_enum_sofisticado(String n, int v) { // regra (III)
            nome = n;
            valor = v;
        }

        public int getValor() {
            return valor;
        }

        public String getNome() {
            return nome;
        }

        public String toString() {
            return nome + "(" + valor + ")";
        }
    }

    // Operação COM uso de Enumerações:
    public static void main(String a[]) {
        // ♦ Operação COM uso de Enumerações simples:
        for (Com_enum opcao : Com_enum.values()) {
            System.out.println(opcao);
        }

        // ♦ Operação COM uso de Enumerações sofisticado:
        for (Com_enum_sofisticado constante : Com_enum_sofisticado.values()) {
            // usa operaçõres da enumeração
            System.out.printf("%-25s #%02d: %-20s\n", constante,
                    constante.getValor(), constante.getNome());
            switch (constante) {
                case COMPACTAR_COM_ENUMERACAO:
                    System.out.println("Opcao de compactacao");
                    break;
                case DESCOMPACTAR_COM_ENUMERACAO:
                    System.out.println("Opcao de descompactacao");
                    break;
            }
        }
    }
}
// outros exemplos para facilitar a compreenção:___________________________
// Sem Enumeração:
public class SemEnum {
    public static final int SEGUNDA_FEIRA = 1;
    public static final int TERCA_FEIRA = 2;
    public static final int QUARTA_FEIRA = 3;
    public static final int QUINTA_FEIRA = 4;
    public static final int SEXTA_FEIRA = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;
    
    public static void main(String[] args) {
        int diaDaSemana = SEGUNDA_FEIRA;
        
        if (diaDaSemana == SABADO || diaDaSemana == DOMINGO) {
            System.out.println("Hoje é fim de semana!");
        } else {
            System.out.println("Hoje é dia útil.");
        }
    }
}

// Com enumeração:
public class ComEnum {
    public enum DiaDaSemana {
        SEGUNDA_FEIRA, TERCA_FEIRA, QUARTA_FEIRA, QUINTA_FEIRA, SEXTA_FEIRA, SABADO, DOMINGO;
    }
    
    public static void main(String[] args) {
        DiaDaSemana diaDaSemana = DiaDaSemana.SEGUNDA_FEIRA;
        
        if (diaDaSemana == DiaDaSemana.SABADO || diaDaSemana == DiaDaSemana.DOMINGO) {
            System.out.println("Hoje é fim de semana!");
        } else {
            System.out.println("Hoje é dia útil.");
        }
    }
}

```

</details>
</br>


## **Pág. 182 à 192............Genéricos**
<details>
<summary></summary>

ver diretório:
 - <a href="#">Pag182a192</a>

### ***Modo genérico em Java***

O modo genérico em Java é uma técnica que permite escrever classes e métodos que possam trabalhar com diferentes tipos de dados, de forma genérica e flexível. Em outras palavras, é uma forma de criar código reutilizável e que possa ser adaptado a diferentes situações sem a necessidade de escrever várias versões do mesmo código. Embora o modo genérico possa ajudar a reduzir a necessidade de sobrecarga de métodos em algumas situações, não é uma solução direta para o problema de overload, que ocorre quando há dois ou mais métodos com o mesmo nome e diferentes parâmetros de entrada.</br></br>

### **Razões pelas quais é recomendado usar o modo genérico em Java:**
O uso de genéricos em Java, sempre que possível, pode trazer muitos benefícios ao código, como *segurança de tipo, reutilização de código, clareza do código e facilidade de manutenção*.

 - ***Segurança de tipo:*** o uso de genéricos em Java ajuda a garantir que o tipo correto seja usado em cada situação. Isso ajuda a evitar erros de compilação e execução relacionados a tipos.

 - ***Reutilização de código:*** o uso de genéricos em Java pode tornar o código mais flexível e reutilizável, permitindo que ele seja usado com diferentes tipos de objetos. Isso pode economizar tempo e esforço na codificação.

 - ***Clareza do código:*** o uso de genéricos em Java pode tornar o código mais claro e fácil de entender, especialmente quando se trabalha com coleções de objetos.

 - ***Facilidade de manutenção:*** o uso de genéricos em Java pode tornar o código mais fácil de manter, pois permite que as alterações sejam feitas em um único lugar em vez de em vários lugares no código.</br></br>


### **Situações em que pode ser usado o modo genérico em Java:**
O modo genérico em Java pode ser usado em *classes, interfaces, métodos, campos, coleções e arrays*.

 - ***Classes genéricas:*** é possível criar classes genéricas que podem ser usadas com diferentes tipos de objetos. Por exemplo, uma classe de lista genérica que pode ser usada com diferentes tipos de objetos.

 - ***Interfaces genéricas:*** interfaces genéricas podem ser usadas para definir comportamentos genéricos que podem ser implementados por diferentes tipos de objetos. Por exemplo, uma interface genérica para ordenação de objetos.

 - ***Métodos genéricos:*** é possível criar métodos genéricos que podem ser usados com diferentes tipos de objetos. Por exemplo, um método de busca genérico que pode ser usado para pesquisar diferentes tipos de objetos.

 - ***Campos genéricos:*** campos genéricos podem ser usados em classes e interfaces genéricas para representar tipos genéricos de objetos. Por exemplo, um campo de lista genérica em uma classe de usuário que pode conter diferentes tipos de objetos.

 - ***Coleções genéricas:*** a biblioteca padrão do Java inclui muitas coleções genéricas, como List, Set e Map, que podem ser usadas para armazenar e manipular diferentes tipos de objetos.

 - ***Arrays genéricos:*** a partir do Java 5, é possível criar arrays genéricos usando sintaxe de varargs. Isso permite que você crie arrays que podem armazenar diferentes tipos de objetos.</br></br>

### **Sintaxes básicas para usar genéricos em Java:**
→ Obs: Letras coringa são convenções e podem ser substituídas por outras letras ou palavras que fazem mais sentido no contexto do código. O importante é usar uma letra ou palavra que seja clara e fácil de entender para quem está lendo o código.

#### **As letras coringa usadas para o modo genérico em Java são:**
`E`: usada para representar um elemento em uma coleção, como em `List<E>` ou `Set<E>`;</br>
`K`: usada para representar uma chave em um mapa, como em `Map<K, V>`;</br>
`V`: usada para representar um valor em um mapa, como em `Map<K, V>`;</br>
`N`: usada para representar um número, como em `Number` ou `Comparable<N>`;</br>
`T`: usada para representar um tipo em geral, como em `Class<T>` ou `Comparable<T>`;</br>
`S`: usada para representar um segundo tipo em geral, como em `Map<S, T>`.</br>

A sintaxe básica para usar genéricos em Java envolve a adição de um tipo genérico entre colchetes (<>). O tipo genérico pode ser usado em *classes, interfaces, métodos, campos, coleções e arrays*.

 - ***Classes genéricas:***
```java
class NomeDaClasse<T> {
   // código da classe
}
```

 - ***Interfaces genéricas:***
```java
interface NomeDaInterface<T> {
    // código da interface
}
```

 - ***Métodos genéricos:***
```java
<T> retornoDoMetodo nomeDoMetodo(T parametro) {
    // código do método
}
```

 - ***Campos genéricos:***
```java
class NomeDaClasse<T> {
    T nomeDoCampo;
}
```

 - ***Coleções genéricas:***
```java
List<T> lista = new ArrayList<>();
```

 - ***Arrays genéricos:***
```java
T[] array = (T[]) new Object[tamanho];
```
</br>

### **Exemplo:** 
Classe genérica chamada "Lista", que armazena uma lista de elementos de qualquer tipo:
```java
public class Lista<T> {
    private T[] elementos;
    
    public Lista(T[] elementos) {
        this.elementos = elementos;
    }
    
    public T get(int indice) {
        return elementos[indice];
    }
    
    public void set(int indice, T elemento) {
        elementos[indice] = elemento;
    }
}
```
Nesse exemplo, a classe "Lista" é parametrizada pelo tipo "T", que pode ser substituído por qualquer tipo concreto no momento da utilização da classe. </br>

Podemos criar uma lista de strings da seguinte forma:
```java
String[] elementos = {"foo", "bar", "baz"};
Lista<String> lista = new Lista<String>(elementos);
```
Dessa forma, a lista criada aceitará apenas strings como elementos, garantindo a segurança de tipos em tempo de compilação.

</details>
</br>


## **Pág. 193 à 203............Expressões lambda**
<details>
<summary></summary>

ver diretório:
 - <a href="#">Pag193a203</a>

### ***Expressões lambda***

As expressões lambda foram incluídas no Java 8 como uma maneira concisa de definir métodos diretamente no local de sua utilização nos casos em que essa funcionalidade será usada apenas uma vez.

A vantagem das expressões lambda em Java é sua simplicidade, na sintaxe, uma expressão lambda (ou apenas um lambda) é uma função anônima, ou seja, um método sem a declaração do próprio nome; no qual são omitidos seu modificador de acesso e o tipo do valor de retorno; e cuja lista tipada de parâmetros formais torna-se uma lista simples de parâmetros.

### ***Regras, normas e permissões da sintaxe:***

 - Os parenteses iniciais podem ser omitidos quando a expressão lambda contém um único parâmetro, mas são obrigatórios quando um parâmetro não é requerido ou quando são dois ou mais.

 - Os tipos dos parâmetros não precisam ser indicados quando o compilador pode inferi-los a partir do contexto de uso da expressão.

 - Quando a expressão contém somente uma expressão (forma pura), não é necessária a diretiva return.

 - As chaves são necessárias apenas quando a expressão lambda inclui várias diretivas, o que exige o uso explícito da diretiva return.

#### **Exemplos:**

```java
// SINTAXE BASE:
(listaParânetros) -> expressão

// exemplo 1:
(a) -> 2*a*a - 0.5*a - 1.3

// exemplo 2:
(int n) -> {
    int soma = 0;
    for (int i=1; i<=n; i++) soma += i;
    return soma;
}

// exemplo 3: O uso de var permite tornar um parâmetro final, o que impede sua alteração dentro do lambda.
(var x) -> Math.pow(x, 2) + 2*x + 1 

// exemplo 4: Ordenação de uma lista de objetos com base em um atributo específico:
List<Pessoa> pessoas = Arrays.asList(new Pessoa("João", 30), new Pessoa("Maria", 25), new Pessoa("Pedro", 35));
Collections.sort(pessoas, (p1, p2) -> p1.getIdade() - p2.getIdade());
System.out.println(pessoas);
// output: [Pessoa [nome=Maria, idade=25], Pessoa [nome=João, idade=30], Pessoa [nome=Pedro, idade=35]]

// exemplo 5: Filtragem de itens em uma lista com base em uma condição específica:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> filtro = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
System.out.println(filtro);
// output: [2, 4, 6, 8, 10]

// exemplo 6 : Mapeamento de valores de uma lista para outra lista com base em uma função específica:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> mapeamento = numeros.stream().map(n -> n * n).collect(Collectors.toList());
System.out.println(mapeamento);
// output: [1, 4, 9, 16, 25]

// exemplo 7: Redução de uma lista em um único valor com base em uma função específica:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
int reducao = numeros.stream().reduce(0, (a, b) -> a + b);
System.out.println(reducao);
// output: 15
```

</details>
</br>


## **Pág. 203 à 210............Referências para método**
<details>
<summary></summary>

ver diretório:
- <a href="#">Pag203a210</a>

### ***Referências para métodos***

Referências de métodos em Java são uma forma concisa e funcional de referenciar um método existente em uma classe, sem a necessidade de definir uma nova classe ou interface para implementar esse método.

Em vez de implementar uma nova classe ou interface para definir o método, você pode usar uma referência a um método existente como um parâmetro para outro método ou expressão lambda. Isso torna o código mais legível e conciso, além de reduzir a quantidade de código necessário para implementar a funcionalidade desejada.

Existem diferentes tipos de referências de método em Java, incluindo referências a métodos estáticos e de instância, bem como referências a construtores. As referências de método são frequentemente usadas como argumentos para outros métodos, como em expressões lambda e programação funcional. Elas permitem que os métodos sejam passados como objetos, o que oferece uma grande flexibilidade na programação.

### **Tipos de referências de métodos e sua sintaxe:**
| Tipo de Referência | Sintaxe |
| -------- | -------- |
| Método estático | NomeClasse::MetodoEstatico |
| Método de isntância de objeto específico | objeto::metodoInstancia |
| Método de isntância de objeto arbitrário de tipo | NomeClasse::metodoInstancia |
| Construtor | NomeClasse::new |


#### ***Referência de método estático: é usada para referenciar um método estático de uma classe. Exemplo:***

```java
public class Exemplo {
   public static int dobro(int n) {
      return n * 2;
   }
   
   public static void main(String[] args) {
      // referência de método estático
      IntFunction<Integer> metodo = Exemplo::dobro; // → NomeClasse::MetodoEstatico
      
      // chamada do método usando a referência
      int resultado = metodo.apply(5);
   }
}
```

#### ***Referência de método de instância de objeto específico: é usada para referenciar um método de instância de um objeto específico. Exemplo:***

```java
public class Exemplo {
   private int valor;
   
   public Exemplo(int valor) {
      this.valor = valor;
   }
   
   public int triplo() {
      return valor * 3;
   }
   
   public static void main(String[] args) {
      // referência de método de instância de objeto específico
      Exemplo e = new Exemplo(5);
      IntSupplier metodo = e::triplo; // → objeto::metodoInstancia
      
      // chamada do método usando a referência
      int resultado = metodo.getAsInt();
   }
}
```

#### ***Referência de método de instância de objeto arbitrário de tipo: é usada para referenciar um método de instância de um objeto arbitrário de um tipo específico. Exemplo:***

```java
public class Exemplo {
   private int valor;
   
   public Exemplo(int valor) {
      this.valor = valor;
   }
   
   public int triplo() {
      return valor * 3;
   }
   
   public static void main(String[] args) {
      // referência de método de instância de objeto arbitrário de tipo
      IntFunction<Integer> metodo = Exemplo::triplo; // → NomeClasse::metodoInstancia
      
      // chamada do método usando a referência
      int resultado = metodo.apply(new Exemplo(5));
   }
}
```

#### ***Referência de construtor: é usada para referenciar um construtor de uma classe. Exemplo:***

```java
public class Exemplo {
   private int valor;
   
   public Exemplo(int valor) {
      this.valor = valor;
   }
   
   public static void main(String[] args) {
      // referência de construtor
      IntFunction<Exemplo> construtor = Exemplo::new; // → NomeClasse::new
      
      // criação de um objeto usando a referência de construtor
      Exemplo e = construtor.apply(5);
   }
}
```

</details>
</br>


## **Pág. 211 à 218............Registro | Formatadores**
<details>
<summary></summary>

ver diretório:
- <a href="#">Pag211a218</a>

### ***Registro (record)***

Em Java, um registro (ou record, em inglês) é um novo tipo de classe introduzido a partir do Java 16. Ele é usado para representar dados imutáveis e é projetado para tornar a criação e o uso de objetos de dados simples e concisos.

Um registro em Java é declarado usando a palavra-chave "record" e define um conjunto fixo de campos que são inicializados no construtor do registro. Ele também fornece implementações padrão para métodos como equals(), hashCode() e toString().

Além disso, um registro em Java pode ser desestruturado, o que significa que seus campos podem ser acessados individualmente sem a necessidade de chamar métodos getters ou definir variáveis locais separadas para cada campo.

Em resumo, um registro em Java é uma classe simples e concisa que é usada para representar dados imutáveis e é projetada para ser fácil de criar, usar e manipular.

#### **Exemplo simples de uso de registro em Java:**

```java
public record Pessoa(String nome, int idade) {}

// Criando uma nova pessoa
Pessoa pessoa = new Pessoa("João", 30);

// Acessando os campos do registro
System.out.println("Nome: " + pessoa.nome());
System.out.println("Idade: " + pessoa.idade());

// Desestruturando o registro
String nome = pessoa.nome();
int idade = pessoa.idade();
System.out.println(nome + " tem " + idade + " anos.");

```

### ***Formatadores***

Os formatadores em Java são uma ferramenta importante para garantir a legibilidade e a padronização na exibição de dados em um programa, facilitando a compreensão do usuário e tornando a interface mais amigável.

Existem vários tipos de formatadores em Java, cada um com uma finalidade específica. Alguns dos principais tipos de formatadores são:
 - DecimalFormat: utilizado para formatar números de acordo com um padrão definido pelo desenvolvedor.
 - SimpleDateFormat: utilizado para formatar datas e horas em diferentes padrões.
 - MessageFormat: utilizado para formatar mensagens de texto, substituindo variáveis ou argumentos por valores específicos.
 - ChoiceFormat: utilizado para formatar valores numéricos em diferentes formas, dependendo do seu valor.
 - NumberFormat: utilizado como classe base para formatadores de números, permitindo que diferentes tipos de números sejam formatados.
 - DateTimeFormatter: introduzido no Java 8, utilizado para formatar datas e horas de acordo com padrões definidos.
 - DecimalStyle: introduzido no Java 8, utilizado para definir as configurações de formatação de números decimais, como separador de milhar e separador decimal.
 
#### **Exemplo simples de uso de formatadores em Java:**

```java
import java.text.DecimalFormat; // para utilizar DecimalFormat
import java.util.Locale; // para utilizar o Locale.US

// Formata um número decimal usando um objeto do tipo DecimalFormat → linha 72
// Formata um número decimal usando a classe String.format → linha 77
public class ExemploFormatador {

    public static void main(String[] args) {
        
        double numero = 12345.6789;

        // objeto DecimalFormat com o padrão "#,##0.00", que significa que o número deve ser formatado com separador de milhar e duas casas decimais
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String numeroFormatado = df.format(numero); // chamamos o método format() do objeto df, passando o número a ser formatado como parâmetro
        System.out.println(numeroFormatado); // exibe "12.345,68"

        // utilizamos a classe String.format com o padrão "%.2f" e Locale.US para garantir a formatação correta em inglês
        String numeroFormatado = String.format(Locale.US, "%.2f", numero);
        System.out.println(numeroFormatado); // exibe "12345.68"
    }
}
```

 - #### ***Caracteres usados pelo formatador Decimal.format:***
   | Caractere | Posição | Significado ou efeito produzido |
   | - | - | - |
   | 0 | Número | Digito |
   | # | Número | Digito, zero à esquerda ausente |
   | . | Número | Separador decimal |
   | - | Número | Sinal negativo |
   | , | Número | Separador de grupo |
   | E | Número | Separa mantissa e expoente da notação científica |
   | ; | Separador | Separa os subpadrões positivo e negativo |
   | % | Prefixo ou sufixo | Multiplica por 100 e exibe como porcentagem |
   | \u2030 | Prefixo ou sufixo | Multiplica por 1000 e exibe como valor por mil |
   | \u00A4 | Prefixo ou sufixo | Símbolo local de moeda (se duplicado, mostra símbolo internacional da moeda) |
   | ' | Prefixo ou sufixo | Delimitador para uso de caractere especial no padrão |

 - #### ***Caracteres usados pelo formatador String.format:***
   | Conversão | Tipo | Resultado |
   | - | - | - |
   | b, B | geral | Se arg é null, resulta false; se boolean, resulta seu valor, senão true. |
   | h, H | geral | Produz Integer.toHexString(arg.hashCode()). |
   | s, S | geral | Produz arg.toString ou arg formatTo. |
   | c, C | caractere | Caractere Unicode correspondente. |
   | d | inteiro | Inteiro decimal correspondente. |
   | o | inteiro | Inteiro octal correspondente. |
   | x, X | inteiro | Inteiro hexadecimal correspondente. |
   | e, E | ponto-flutuante | Real decimal em notação científica. |
   | f | ponto-flutuante | Real decimal com precisão padrão ou indicada. |
   | g, G | ponto-flutuante | Real decimal em notação científica computadorizada. |
   | a, A | ponto-flutuante | Real hexadecimal correspondente. |
   | t, T | data-hora | Produza conversão de data-hora como toString. |
   | % | porcentagem | Produz o próprio literal %. |
   | n | quebra de linha | Resulta na quebra de linha especifica da plataforma. |

</details>
</br>
