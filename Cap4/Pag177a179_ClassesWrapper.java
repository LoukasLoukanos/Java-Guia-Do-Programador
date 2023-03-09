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


/*
 as classes wrapper encapsulam os tipos primitivos na forma de objetos agregando também funcionalidades de conversão e tratamento.

Tipo primitivo

lógico 	boolean  Boolean

caractere  char  Character

			byte Byte

			short Short

integral	int  Int

			long Long

					float	Float
ponto flutuante
					double  Double


Classe wrapper
_________________


Como qualquer classe Java todas as classes wrapper oferecem os métodos públi cos disponiveis em object, dos quais se destacam:

• boolean equals (Cbject), para realização de comparações;

• String toString(), que fornece uma representação textual do objeto, no caso,

seu valor expresso como uma string (um objeto String). As classes derivadas de Number, como Integer e Double, oferecem ainda outros métodos:

⚫byte txtevalar(), double dalevalar(), float floatvalue(), int intvalue(), Long LongValue()

e short shortValue(), que retornam o valor encapsulado como um tipo primitivo, • boolean compareTo(Object), que realiza comparações entre objetos das classes

wrapper A predominância dos métodos estáticos nas subclasses de Nurber enfatiza o fato de

serem classes auxiliares Para criar objetos Integer, Double ou outros, é preferível usar os métodos fábric

value of em vez de seus construtores, ou seja, é possível escrever.

Integer inteiro = Integer.valueOf(4); Double real Double.valueOf(9.62);

Boolean logico Boolean.valueOf("true"); Character caractere Character.valueOf("");

Para obter o valor numérico encapsulado em objetos wrapper, é possível utilizar

os métodos definidos na classe Number, como segue:

long 1= inteiro. Lonsivalue(); double d= inteiro.dolealue();

float f real florales(); short s = real.shortValue();

// ocorre silenciosa perda de precisão

Além desses métodos, cujo uso pode ser evitado com o autounboxing (Seção 4.72), cada classe wrapper inclui vários métodos para conversão entre valores de tipos

primitivos e objetos wrapper. Em especial, os tipos Boolean e Character, que represen- tam valores não numéricos, contém métodos diferenciados para operações lógicas e manipulação do formato Unicode, além de operações triviais:

boolean b= logico.booleanValue(); char c= caractere.charValue();

Todos os objetos das classes wrapper são imuráveis, ie, depois de criados não podem ter seus valores alterados. Além disso, essas classes são declaradas como (final e, portanto, não podem ser estendidas.

Umumétodo fibre, em geral, um método estático capaz de criar um tipo especifico de objeto, com ou sem necessidade de argumentos. O uso de métodos fábrica, um padrão de projeto conhecido como Eactory Method, permite maior flexibilidade na criação de objetos


________________


Até a versão 5 do Java, a criação de objetos das classes wrapper e a valores neles encapsulados exigiam código como o mostrado nesta seção. Para simplificar essas operações, principalmente as relacionadas com a inclusão de valores nas estruturas de dados oferecidas pelas coleções Java (que só aceitam objetos), foram introduzidos o encaixotamento e desencaixotamento automáticos

4.7.1 Encaixotamento automático

O encaixotamento automático (autoboxing ou boxing), permite atribuir valores primitivos para referências do tipo wrapper equivalentes ou mesmo do tipo

produzindo a criação de um objeto wrapper. Assim: // é equivalente a Double objD= new Double(-2.75);

Double objD= -2.75; // autoboxing

Il é equivalente a Object objI = new Integer(13);

Object objI= 13; // autoboxing

// valores são convertidos en Double

A inicialização direta de arranjo também pode empregar o autoboxing: Double valores1[ ] = (-1.35, 0.75, 7.928): // valores são convertidos en Integer Object valores?[] = {0, 1, 2, 3, 4}

4.7.2 Desencaixotamento automático

De modo semelhante, a atribuição de objetos wrapper a variáveis de tipo primi tivo provoca a extração automática de valores entre tipos equivalentes) o que é chamado de desencaixotamento automático (autounboxing ou unboxing):

// equivalente a double vd = objD.doubleValue();

double vd = objD; // autounboxing

// equivalente a int vi= objI.intValue();

int vi= objl; // autounboxing

O autounboxing também é válido na manipulação de arranjo e seus elementos:

// aloca arranjo de 5 elementos Integer

Integer array[] = new Integer [5]; Note // atribut new Integer (5) à posição e do arranjo

array[0]= 5; // boxing // atribut array[0].intvalue() para vartável x int x = array[0]; // unboxing

O Exemplo 430 aplica o encaixotamento e desencaixotamento automáticos.



____________

Até a versão 5 do Java, a criação de objetos das classes wrapper e a valores neles encapsulados exigiam código como o mostrado nesta seção. Para simplificar essas operações, principalmente as relacionadas com a inclusão de valores nas estruturas de dados oferecidas pelas coleções Java (que só aceitam objetos), foram introduzidos o encaixotamento e desencaixotamento automáticos

4.7.1 Encaixotamento automático

O encaixotamento automático (autoboxing ou boxing), permite atribuir valores primitivos para referências do tipo wrapper equivalentes ou mesmo do tipo

produzindo a criação de um objeto wrapper. Assim: // é equivalente a Double objD= new Double(-2.75);

Double objD= -2.75; // autoboxing

Il é equivalente a Object objI = new Integer(13);

Object objI= 13; // autoboxing

// valores são convertidos en Double

A inicialização direta de arranjo também pode empregar o autoboxing: Double valores1[ ] = (-1.35, 0.75, 7.928): // valores são convertidos en Integer Object valores?[] = {0, 1, 2, 3, 4}

4.7.2 Desencaixotamento automático

De modo semelhante, a atribuição de objetos wrapper a variáveis de tipo primi tivo provoca a extração automática de valores entre tipos equivalentes) o que é chamado de desencaixotamento automático (autounboxing ou unboxing):

// equivalente a double vd = objD.doubleValue();

double vd = objD; // autounboxing

// equivalente a int vi= objI.intValue();

int vi= objl; // autounboxing

O autounboxing também é válido na manipulação de arranjo e seus elementos:

// aloca arranjo de 5 elementos Integer

Integer array[] = new Integer [5]; Note // atribut new Integer (5) à posição e do arranjo

array[0]= 5; // boxing // atribut array[0].intvalue() para vartável x int x = array[0]; // unboxing

O Exemplo 430 aplica o encaixotamento e desencaixotamento automáticos.

  
*/