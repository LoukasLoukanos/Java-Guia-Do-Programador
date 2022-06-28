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
        byte w = 0x1F, z = 0x10;
		System.out.println("Valores w = " + w + ", z = " + z);
		// w = 1F (Hexadecimal(0x)) = 31 (Decimal) = 37 (Octal) = 0001 1111 (Binário)
		// z = 10 (Hexadecimal(0x)) = 16 (Decimal) = 20 (Octal) = 0001 0000 (Binário)

		System.out.println("(w & z): Decimal = " + (w & z) + " ou Binário = " + Integer.toBinaryString(w & z)); // output: Decimal = 16 ou Binário = 10000
		/* w = 1F = 0001 1111 
		 * z = 10 = 0001 0000
		 * w & z => —————————
		 * w & z => 0001 0000 = (16dec) */

		System.out.println("(w | z): Decimal = " + (w | z) + " ou Binário = " + Integer.toBinaryString(w | z)); // output: Decimal = 31 ou Binário = 11111
		/* w = 1F = 0001 1111 
		 * z = 10 = 0001 0000
		 * w | z => —————————
		 * w | z => 0001 1111 = (31dec) */

		System.out.println("(w ^ z): Decimal = " + (w ^ z) + " ou Binário = " + Integer.toBinaryString(w ^ z)); // output: Decimal = 15 ou Binário = 1111
		/* w = 1F = 0001 1111 
		 * z = 10 = 0001 0000
		 * w ^ z => —————————
		 * w ^ z => 0000 1111 = (15dec) */
	
		System.out.println("(~ z): Decimal = " + (~ z) + " ou Binário = " + Integer.toBinaryString(~ z)); // output: Decimal = -17 ou Binário = 11111111111111111111111111101111
		/* z = 16dec = 0001 0000
		 *~z = -z +1 → (complemento de 1(-)) + (1) = (complemento de 2(~))
		 *-z = 1110 1111 → (complemento de 1(-))
		 *~z = 1110 1111 +1 = 1111 0000 = -16 → (complemento de 2(~)) 
		 * o resultado é -16, porém o retorno é -17. */

		System.out.println("(~ w): Decimal = " + (~ w) + " ou Binário = " + Integer.toBinaryString(~ w)); // output: Decimal = -32 ou Binário = 11111111111111111111111111100000
		/* w = 31dec = 0001 1111
		 *~w = -w +1 → (complemento de 1(-)) + (1) = (complemento de 2(~))
		 *-w = 1110 0000 → (complemento de 1(-))
		 *~w = 1110 0000 +1 = 1110 0001 = -31 → (complemento de 2(~))
		 * o resultado é -31, porém o retorno é -32. */

		System.out.println("(w >> 4): Decimal = " + (w >> 4) + " ou Binário = " + Integer.toBinaryString(w >> 4)); // output: Decimal = 1 ou Binário = 1
		/* → Rotação de 4 unidades(binárias) para à direita OU divisão por 2(ao decimal) 4vezes:
		 * w = +31 = 0001 1111 ,
		 * w >> 4 = 0000 0001 , 1111 = 0000 0001 = (1dec) → Rotação de 4 unidades(binárias) para à direita
		 * OU
		 * w >> 4 = 31/2/2/2/2 = (1dec) → divisão por 2(ao decimal) 4vezes*/

		System.out.println("(w << 4): Decimal = " + (w << 4) + " ou Binário = " + Integer.toBinaryString(w << 4)); // output: Decimal = 496 ou Binário = 111110000
		/* → Rotação de 4 unidades(binárias) para à esquerda OU multiplicação por 2(ao decimal) 4vezes:
		 * w = +31 = 0001 1111 ,
		 * w << 4 = 0001 1111 0000 , = (496dec) → Rotação de 4 unidades(binárias) para à esquerda
		 * OU
		 * w << 4 = 31*2*2*2*2 = (496dec) → multiplicação por 2(ao decimal) 4vezes*/

		System.out.println("(-w >> 4): Decimal = " + (-w >> 4) + " ou Binário = " + Integer.toBinaryString(-w >> 4)); // output: Decimal = -2 ou Binário = 11111111111111111111111111111110
		/* → Rotação de 4 unidades(binárias) para à direita OU divisão por 2(ao decimal) 4vezes:
		 *-w >> 4 = -31/2/2/2/2 = -1,9375 ≅ (-2dec) → divisão por 2(ao decimal) 4vezes
		 */

		System.out.println("(-w << 4): Decimal = " + (-w << 4) + " ou Binário = " + Integer.toBinaryString(-w << 4)); // output: -496 ou Binário = 11111111111111111111111000010000
		/* → Rotação de 4 unidades(binárias) para à esquerda OU multiplicação por 2(ao decimal) 4vezes:
		 *-w << 4 = -31*2*2*2*2 = (-496dec) → multiplicação por 2(ao decimal) 4vezes
		 */

		System.out.println("(-w >>> 4): Decimal = " + (-w >>> 4) + " ou Binário = " + Integer.toBinaryString(-w >>> 4)); // output: Decimal = 268435454 ou Binário = 111111111111111111111111111
		
		
		/*|—————————————————————————————————————————————————————————|
		 *|________________PROCEDÊNCIA DE OPERADORES________________|
		 *|____NÍVEL___|________________OPERADORES__________________|
		 *|_____01_____|___[]_()_.(seletor)_________________________|
		 *|_____02_____|___++_~_instanceof_new_-(unário)_(cast)_____|
		 *|_____03_____|___*_/_%____________________________________|
		 *|_____04_____|___+_-______________________________________|
		 *|_____05_____|___<<_>>_>>>________________________________|
		 *|_____06_____|___<_>_<=_>=________________________________|
		 *|_____07_____|___==_!=____________________________________|
		 *|_____08_____|___&________________________________________|
		 *|_____09_____|___~________________________________________|
		 *|_____10_____|___|________________________________________|
		 *|_____11_____|___&&_______________________________________|
		 *|_____12_____|___||_______________________________________|
		 *|_____12_____|___?:_______________________________________|
		 *|_____14_____|___=_op=____________________________________|
		 *|_____15_____|___,________________________________________|
		 *|_____16_____|___->(operador lambda)______________________|
		 *|—————————————————————————————————————————————————————————|*/
		
	}
}
