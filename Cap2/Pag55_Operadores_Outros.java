public class Pag55_Operadores_Outros {
	public static void main(String args[]) {
		/*|—————————————————————————————————————————————————————————————————|
		 *|_____________________OPERADORES RELACIONAIS______________________|
		 *|___OPERADOR___|___SIGNIFICADO____|__ASSOCIATIVIDADE__|__EXEMPLO__|
		 *|______==______|_Igual____________|_____Esquerda______|__a == b___|
		 *|______!=______|_Diferente________|_____Esquerda______|__a != b___|
		 *|______>_______|_Maior que________|_____Esquerda______|__a > b____|
		 *|______>=______|_Maior ou igual a_|_____Esquerda______|__a >= b___|
		 *|______<_______|_Menor que________|_____Esquerda______|__a < b____|
		 *|______<=______|_Menor ou igual a_|_____Esquerda______|__a <= b___|
		 *|—————————————————————————————————————————————————————————————————|*/
		int a = 15, b = 12;
		System.out.println("Valores: a = " + a + ", b = " + b);
		System.out.println("a == b   -> " + (a == b)); // false
		System.out.println("a != b   -> " + (a != b)); // true
		System.out.println("a < b   -> " + (a < b)); // false
		System.out.println("a > b   -> " + (a > b)); // true
		System.out.println("a <= b   -> " + (a <= b)); // false
		System.out.println("a >= b   -> " + (a >= b)); // true
		double k = 1.5, m = -1.9;
		boolean res0 = k == m; // "false, pois k é diferente de m" → res0 será false
		boolean res1 = k >= m; // true
		boolean res2 = k < m;  // false
		boolean res3 = k != m; // true
		System.out.println("res0   -> " + (res0)); // false


		/*|—————————————————————————————————————————————————————————————————————|
		 *|_________________________OPERADORES LÓGICOS__________________________|
		 *|___OPERADOR___|_____SIGNIFICADO______|__ASSOCIATIVIDADE__|__EXEMPLO__|
		 *|______&&______|_E lógico (and)_______|_____Esquerda______|__a && b___|
		 *|______||______|_Ou lógico (or)_______|_____Esquerda______|__a || b___|
		 *|______!_______|_Negação (not)________|_____Direita_______|____!a_____|
		 *|______^_______|_Ou eclusivo (xor)____|_____Direita_______|___a ^ b___|
		 *|—————————————————————————————————————————————————————————————————————|*/
		double x = 1.5, y = -1.9;
		res0 = (x > 0) && (y < 0); // && → and 
		res1 = (x == y) || (y > 0); // || → or
		res2 = !res3; // ! → not
		res3 = res1 ^ res2; // ^ → xor

		
		/*|———————————————————————————————————————————————————————————————————————————————————————|
		 *|___________________________OPERADORES DE ATRIBUIÇÃO COMPOSTA___________________________|
		 *|___OPERADOR___|______________SIGNIFICADO_______________|__ASSOCIATIVIDADE__|__EXEMPLO__|
		 *|______+=______|_Adição e atribuição____________________|_____Direita_______|__a += n___|
		 *|______-=______|_Subtração e atribuição_________________|_____Direita_______|__a -= n___|
		 *|______*=______|_Multiplicação e atribuição_____________|_____Direita_______|__a *= n___|
		 *|______/=______|_Divisão e atribuição___________________|_____Direita_______|__a /= n___|
		 *|______%=______|_Divisão inteira e atribuição___________|_____Direita_______|__a %= n___|
		 *|______&=______|_E (and) bitwise e atribuição___________|_____Direita_______|__a &= n___|
		 *|______|=______|_Ou (or) bitwise e atribuição___________|_____Direita_______|__a |= n___|
		 *|______^=______|_Ou (xor) bitwise e atribuição__________|_____Direita_______|__a ^= n___|
		 *|______>>=_____|_Rotação à direita e atribuição_________|_____Direita_______|__a >>= n__|
		 *|______<<=_____|_Rotação à esquerda e atribuição________|_____Direita_______|__a <<= n__|
		 *|______>>>=____|_Rotação à direita s/sinal e atribuição_|_____Direita_______|__a >>>= n_|
		 *|———————————————————————————————————————————————————————————————————————————————————————|*/		 
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


		/*|————————————————————————————————————————————————————————————|
		 *|____________________OPERADORES TERNÁRIOS____________________|
		 *| SINTAXE: <condição> ? <expressão_true> : <expressão_salse> |
		 *|————————————————————————————————————————————————————————————|*/
		double p = 12.34, q = 56.78;
		double max = p > q ? p : q;
		System.out.println("Utilizando operador ternário: " + max);
        int r = 100;
		System.out.println("A = " + r + (r > 50 ? " é " : "não é ") + "maior que 50.");
		

		/*|———————————————————————————————————————————————————————————————————————————————————|
		 *|________________________________OPERADORES BITWISE_________________________________|
		 *|___OPERADOR___|_____________SIGNIFICADO_____________|__ASSOCIATIVIDADE__|_EXEMPLO__|
		 *|______&_______|_E bit-a-bit(bitwise and)____________|_____Esquerda______|__a & b___|
		 *|______|_______|_Ou bit-a-bit(bitwise or)____________|_____Esquerda______|__a | b___|
		 *|______^_______|_Ou-eclusivo bit-a-bit (bitwise xor)_|_____Esquerda______|__a ^ b___|
		 *|______~_______|_Complemento de 2____________________|_____Direita_______|___~ a____|
		 *|______<<______|_Rotação à esquerda de n bits________|_____Esquerda______|__a << n__|
		 *|______>>______|_Rotação à direita de n bits_________|_____Esquerda______|__a >> n__|
		 *|______>>>_____|_Rotação à direita sem sinal_________|_____Esquerda______|__a >>> n_|
		 *|———————————————————————————————————————————————————————————————————————————————————|*/
	}
}
