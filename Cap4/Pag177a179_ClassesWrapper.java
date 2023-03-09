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
 Todos os objetos das classes wrapper são imuráveis, ie, depois de criados não podem ter seus valores alterados. Além disso, essas 
 classes são declaradas como final e, portanto, não podem ser estendidas.

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


_____________________________________________________________________________________________________________________________
Como qualquer classe Java todas as classes wrapper oferecem os métodos públicos disponiveis em object, dos quais se destacam:

• boolean equals (Cbject) → para realização de comparações;

• String toString() → que fornece uma representação textual do objeto, no caso, seu valor expresso como uma string (um objeto String). 


_____________________________________________________________________________________
As classes derivadas de Number, como Integer e Double, oferecem ainda outros métodos:

• byte txtevalar(), • double dalevalar(), • float floatvalue(), • int intvalue(), • Long LongValue() e • short shortValue():
    → retornam o valor encapsulado como um tipo primitivo

• boolean compareTo(Object) → que realiza comparações entre objetos das classes wrapper 


______________________________________________________________________________________________________
É preferível usar os métodos fábric valueOf em vez de seus construtores, ou seja, é possível escrever:

Integer inteiro = Integer.valueOf(4); 

Double real Double.valueOf(9.62);

Boolean logico Boolean.valueOf("true"); 

Character caractere Character.valueOf("");


________________________________________________________________________________________________
Para obter o valores encapsulados em objetos wrapper, é possível utilizar os métodos como segue:

long l = inteiro.longValue(); 

double d = inteiro.doubleValue();

float f = real.floatValue(); 

short s = real.shortValue();

boolean b = logico.booleanValue(); 

char c = caractere.charValue();


________________________________________________________________________________________________________________________________________________________
Para simplificar essas operações, foram introduzidos o encaixotamento (autoboxing ou boxing) e desencaixotamento (autounboxing ou unboxing) automáticos:

♦ Encaixotamento automático (autoboxing ou boxing):
→ permite atribuir valores primitivos para referências do tipo wrapper equivalentes ou mesmo do tipo produzindo a criação de um objeto wrapper:

Double objD = -2.75; // autoboxing → é equivalente a Double objD = new Double(-2.75);

Object objI= 13; // autoboxing → é equivalente a Object objI = new Integer(13);

A inicialização direta de arranjo também pode empregar o autoboxing: 
Double valores1[ ] = (-1.35, 0.75, 7.928): // valores são convertidos en Integer Object valores?[] = {0, 1, 2, 3, 4}


♦ Desencaixotamento automático (autounboxing ou unboxing):
→ De modo semelhante, a atribuição de objetos wrapper a variáveis de tipo primitivo provoca a extração automática de valores entre tipos equivalentes:

double vd = objD; // autounboxing → equivalente a double vd = objD.doubleValue();

int vi= objl; // autounboxing → equivalente a int vi= objI.intValue();

O autounboxing também é válido na manipulação de arranjo e seus elementos:

Integer array[] = new Integer [5];  // aloca arranjo de 5 elementos Integer

array[0] = 5; // boxing 

int x = array[0]; // unboxing → atribuição de array[0].intvalue() para vartável x


_____________________________________________________________________________________________________________________________
Para simplificar essas operações, principalmente as relacionadas com a inclusão de valores nas estruturas de dados oferecidas 
pelas coleções Java (que só aceitam objetos), foram introduzidos o encaixotamento e desencaixotamento automáticos:


♦ O encaixotamento automático (autoboxing ou boxing), permite atribuir valores 
primitivos para referências do tipo wrapper equivalentes ou mesmo do tipo:

Double objD = -2.75; // autoboxing → é equivalente a Double objD = new Double(-2.75);

Object objI= 13; // autoboxing → é equivalente a Object objI = new Integer(13);

Double valores1[ ] = (-1.35, 0.75, 7.928): // autoboxing → inicialização direta de arranjo
 
Integer Object valores2[] = {0, 1, 2, 3, 4} // autoboxing → inicialização direta de arranjo


♦ No desencaixotamento automático (autounboxing ou unboxing), a atribuição de objetos wrapper a 
variáveis de tipo primitivo provoca a extração automática de valores entre tipos equivalentes:

double vd = objD; // autounboxing → é quivalente a double vd = objD.doubleValue();

int vi= objl; // autounboxing → é quivalente a int vi= objI.intValue();

Integer array[] = new Integer [5]; // aloca arranjo de 5 elementos Integer

array[0]= 5; // boxing → atribut new Integer (5) à posição e do arranjo

int x = array[0]; // unboxing → atribui array[0].intvalue() para vartável x 
*/
