public class Pag50_OperadoresAritmeticos {
	public static void main (String args[]) {
		/*|———————————————————————————————————————————————————————————————————————————————————|
		 *|______________________________OPERADORES ARITMÉTICOS_______________________________|
		 *|___OPERADOR___|________SIGNIFICADO_________|___ASSOCIATIVIDADE____|____EXEMPLO_____|
		 *|______+_______|_Adição_____________________|_____Esquerda_________|_____a + b______|
		 *|______-_______|_Subtração__________________|_____Esquerda_________|_____a - b______|
		 *|______*_______|_Multiplicação______________|_____Esquerda_________|_____a * b______|
		 *|______/_______|_Divisão____________________|_____Esquerda_________|_____a / b______|
		 *|______%_______|_Resto da Divisão inteira___|_____Esquerda_________|_____a % b______|
		 *|______-_______|_Sinal negativo (- unário)__|_____Direita__________|_______-a_______|
		 *|______+_______|_Sinal positivo (+ unário)__|_____Direita__________|_______+a_______|
		 *|______++______|_Incremento unitário________|_____Esquerda/Direita_|___++a ou a++___|
		 *|______--______|_Decremento unitário________|_____Esquerda/Direita_|___--a ou a--___|
		 *|———————————————————————————————————————————————————————————————————————————————————|*/


		int a = 5, b = 2; // declara e inicia variáveis
		System.out.println("Valores: a = " + a + ", b = " + b); 
		System.out.println(" -b = " + (-b)); // operações aritméticas
		System.out.println("a + b = " + (a + b)); 
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("(float) a / b = " + ((float)a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("a++ = " + (a++));
		System.out.println("  b = " + ( b));
		System.out.println("Valores: a = " + a + ", b = " + b);

		//VER FIGURA DOS TIPOS DE DADOS NA PÁGINA 50.

		//Promoção de tipos: tipo simples é convertido em tipo complexo
		short s = 3;
		int i = s; //s é promovido a inteiro
		System.out.println("Promoção de tipos: " + i);

		//Coerção de tipos (type casting): tipo complexo é convertido em tipo simples
		double d = 6.47;
		int x = (int) d; //a parte fracionária de d é truncada, x recebe d convertido em um tipo mais simples
		System.out.println("Coerção de tipos (type casting): " + x);
	}
}
