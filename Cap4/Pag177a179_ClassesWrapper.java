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