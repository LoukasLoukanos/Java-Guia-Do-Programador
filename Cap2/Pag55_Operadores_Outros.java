public class Pag55_Operadores_Outros {
	public static void main(String args[]) {
		/*
		 * ______________________________________________________________________________
		 * OPERADORES RELACIONAIS
		 * -----------------------------------------------------------------------------
		 * -
		 * OPERADOR SIGNIFICADO ASSOCIATIVIDADE EXEMPLO
		 * == Igual Esquerda a == b
		 * != Diferente Esquerda a != b
		 * > Maior que Esquerda a > b
		 * >= Maior ou igual a Esquerda a >= b
		 * < Menor que Esquerda a < b
		 * <= Menor ou igual a Esquerda a <= b
		 * ______________________________________________________________________________
		 */
		int a = 15, b = 12;
		System.out.println("Valores: a = " + a + ", b = " + b);
		System.out.println("a == b -> " + (a == b)); // false
		System.out.println("a != b -> " + (a != b)); // true
		System.out.println("a < b -> " + (a < b)); // false
		System.out.println("a > b -> " + (a > b)); // true
		System.out.println("a <= b -> " + (a <= b)); // false
		System.out.println("a >= b -> " + (a >= b)); // true
		double k = 1.5, m = -1.9;
		boolean res0 = k == m; // "false, pois k é diferente de m" → res0 será false
		boolean res1 = k >= m; // true
		boolean res2 = k < m; // false
		boolean res3 = k != m; // true
		System.out.println("res0" + (res0)); // false

		/*
		 * ______________________________________________________________________________
		 * OPERADORES LÓGICOS
		 * -----------------------------------------------------------------------------
		 * -
		 * OPERADOR SIGNIFICADO ASSOCIATIVIDADE EXEMPLO
		 * && E lógico (and) Esquerda a && b
		 * || Ou lógico (or) Esquerda a || b
		 * ! Negação (not) Direita !a
		 * ^ Ou eclusivo (xor) Direita a ^ b
		 * ______________________________________________________________________________
		 */
		double x = 1.5, y = -1.9;
		res0 = (x > 0) && (y < 0); // && → and
		res1 = (x == y) || (y > 0); // || → or
		res2 = !res3; // ! → not
		res3 = res1 ^ res2; // ^ → xor

		/*
		 * ______________________________________________________________________________
		 * OPERADORES DE ATRIBUIÇÃO COMPOSTA
		 * -----------------------------------------------------------------------------
		 * -
		 * OPERADOR SIGNIFICADO ASSOCIATIVIDADE EXEMPLO
		 * += Adição e atribuição Direita a += n
		 * -= Subtração e atribuição Direita a -= n
		 * *= Multiplicação e atribuição Direita a *= n
		 * /= Divisão e atribuição Direita a /= n
		 * %= Divisão inteira e atribuição Direita a %= n
		 * &= E (and) bitwise e atribuição Direita a &= n
		 * |= Ou (or) bitwise e atribuição Direita a |= n
		 * ^= Ou (xor) bitwise e atribuição Direita a ^= n
		 * >>= Rotação à direita e atribuição Direita a >>= n
		 * <<= Rotação à esquerda e atribuição Direita a <<= n
		 * >>>= Rotação à direita s/sinal e atribuição Direita a >>>= n
		 * ______________________________________________________________________________
		 */
		// Os operadores de atribuição simples (=):
		x = x + 15;
		y = y - a;
		x = x * (a / b);
		x = x / (a * b);
		// Podem ser substituídos por operadores de atribuição composta:
		x += 15;
		y -= a;
		x *= (a / b);
		x /= (a * b);

		// Operadores Ternários
	}
}
