public class Pag50_OperadoresAritmeticos {
	public static void main(String args[]) {
		/*
		 * ______________________________________________________________________________
		 * OPERADORES ARITMÉTICOS
		 * -----------------------------------------------------------------------------
		 * -
		 * OPERADOR SIGNIFICADO ASSOCIATIVIDADE EXEMPLO
		 * + Adição Esquerda a + b
		 * - Subtração Esquerda a - b
		 * * Multiplicação Esquerda a * b
		 * / Divisão Esquerda a / b
		 * % Resto da Divisão inteira Esquerda a % b
		 * - Sinal negativo (- unário) Direita -a
		 * + Sinal positivo (+ unário) Direita +a
		 * ++ Incremento unitário Esquerda/Direita ++a ou a++
		 * -- Decremento unitário Esquerda/Direita --a ou a--
		 * ______________________________________________________________________________
		 */

		int a = 5, b = 2; // declara e inicia variáveis
		System.out.println("Valores: a = " + a + ", b = " + b);
		System.out.println(" -b = " + (-b)); // operações aritméticas
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("(float) a / b = " + ((float) a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("a++ = " + (a++));
		System.out.println("  b = " + (b));
		System.out.println("Valores: a = " + a + ", b = " + b);

		// VER FIGURA DOS TIPOS DE DADOS NA PÁGINA 50.

		// Promoção de tipos: tipo simples é convertido em tipo complexo
		short s = 3;
		int i = s; // s é promovido a inteiro
		System.out.println("Promoção de tipos: " + i);

		// Coerção de tipos (type casting): tipo complexo é convertido em tipo simples
		double d = 6.47;
		int x = (int) d; // a parte fracionária de d é truncada, x recebe d convertido em um tipo mais
							// simples
		System.out.println("Coerção de tipos (type casting): " + x);
	}
}
