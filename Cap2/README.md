## **Pág. 24 à 27............Programa minimo | Uso de maiúsculas e minúsculas | Comentários | Compilação e execução**
<details>
<summary></summary>

```java
public class Pag24_HelloWorld { // declaracao da classe HelloWorld
	// declaração do método main, que dá início ao programa
	public static void main (String args[]) {
		// impressão da mensagem
		System.out.println ("Hello world!");
	}
}

```

</details>
</br>


## **Pág. 28 à 38............Tipos de dados primitivos | Variáveis | Declaração de variáveis**
<details>
<summary></summary>

```java
public class Pag28_Eco {
	public static void main (String args[]) {
		for (int i=0; i<args.length; i++)
			System.out.print(args[i] + " ");
		System.out.println();
	}	
}

```

</details>
</br>


## **Pág. 39 à 41............Escopo de variáveis**
<details>
<summary></summary>

```java
public class Pag40_Escopo { // Início do bloco 0
	public static void main (String arg[]) { // Início do bloco 1
		int i = 5; // Variável do bloco 1
		{ // Início do bloco 2
			int j = 0; // Variável do bloco 2
			System.out.println(i);	// Uso de i dentro do seu escopo
			j = 5 * i;					// Uso de j dentro do seu escopo
			System.out.println(j);
			{ // Inicio do bloco 3
				System.out.println(i);	// Uso de i dentro do seu escopo
				System.out.println(j);	// Uso de j dentro do seu escopo
			}
		}
		System.out.println(i);	// Uso de i dentro do seu escopo
//→→→→→	System.out.println(j); ←←←←←// ERRO! Uso de j FORA do seu escopo
	}
}
/*
	"OS DE DENTRO VEEM OS DE FORA"
 	•escopos externos são visíveis nos escopos internos

	"OS DE FORA NÃO VEEM OS DE DENTRO"
 	•escopos internos são invisíveis nos escopos externos
*/

```

</details>
</br>


## **Pág. 42 à 45............Entrada e saída básicas (comuns e formatadas)**
<details>
<summary></summary>

```java
// ENTRADA COMUM E ENTRADA FORMATADA ——————————————————————————————————————————
import java.util.Scanner; // importação da classe Scanner do pacote java.util

public class Pag45_EntradaFormatada {
	public static void main (String args[]) {

		//int i = System.in.read(); // ENTRADA COMUM

		Scanner s = new Scanner(System.in); // Prepara entrada de dados criando o objeto leitor s para uso das ENTRADAS FORMATADAS
		
		System.out.println("Ola!"); // SAÍDA COMUM (com quebra de linha - ln'new line')
		System.out.print("Digite um inteiro: "); // SAÍDA COMUM sem finalizar a linha de exibição (sem quebra de linha).
		int valor = s.nextInt(); // ENTRADA FORMATADA. O método nextInt() realiza a leitura ("input") de um valor inteiro armazenando numa variável de tipo apropriado(int).
		
		s.nextLine(); // limpeza da entrada de dados do objeto leitor s após leitura de números da linha 9. Caso não seja chamado este método nextLine o programa não faz a leitura da próxima entrada.
		System.out.print("Digite seu nome: "); // SAÍDA COMUM sem finalizar a linha de exibição (sem quebra de linha).
		String nome = s.nextLine();// O método nextLine() realiza a leitura ("input") de uma sequência de caracteres armazenando numa variável de tipo apropriado(string).
		
		//s.nextLine(); //método necessário para limpeza da entrada de dados do objeto leitor s para o programa fazer a leitura da próxima entrada
		//double vDouble = s.nextDouble(); //a entrada é lida graças a chamada do método nextLine pelo objeto leitor s
		//...

		System.out.println("Valor: " + valor + "\nNome: " + nome); // saída do valor lido

		s.close(); // Fecha objeto leitor s, evitando a perda de recursos e impedindo o uso posterior do dispositivo de entrada
	}	
}

// SAÍDA COMUM E ENTRADA FORMATADA ——————————————————————————————————————————
import java.util.Scanner; // importação da classe Scanner do pacote java.util

public class Pag46_SaidaFormatada {
	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in); // Prepara entrada de dados criando o objeto leitor sc para uso das ENTRADAS FORMATADAS.

		System.out.print("Defina um limite: "); // SAÍDA COMUM sem finalizar a linha de exibição (sem quebra de linha).

		int limite = sc.nextInt(); // ENTRADA FORMATADA. O método nextInt() realiza a leitura ("input") de um valor inteiro armazenando numa variável de tipo apropriado(int).
		
		int soma = 0;
		
		for (int i=1; i<=limite; i++) {
			System.out.printf("%3da. soma parcial = %6d%n", i, soma); // SAÍDA FORMATADA. O método printf() é análogo à função printf() da linguagem C. Marcadores comuns são: %d para inteiros, %f para reais, %c para caracteres, %s para string.
			soma += i;
		}

		System.out.printf("Soma total[0..%3d] = %6d%n", limite, soma); // SAÍDA FORMATADA.

		sc.close(); // Fecha objeto leitor sc, evitando a perda de recursos e impedindo o uso posterior do dispositivo de entrada.
	}
}

```

</details>
</br>


## **Pág. 46 à 55............Operadores e expressões**
<details>
<summary></summary>

### ***OPERADORES ARITMÉTICOS***

| OPERADOR | SIGNIFICADO | ASSOCIATIVIDADE | EXEMPLO | 
|:-:|:-:|:-:|:-:|
| + | Adição | Esquerda | a + b | 
| - | Subtração | Esquerda | a - b | 
| * | Multiplicação | Esquerda | a * b | 
| / | Divisão | Esquerda | a / b | 
| % | Resto da Divisão inteira | Esquerda | a % b | 
| - | Sinal negativo (- unário) | Direita | -a | 
| + | Sinal positivo (+ unário) | Direita | +a | 
| ++ | Incremento unitário | Esquerda/Direita | ++a ou a++ | 
| -- | Decremento unitário | Esquerda/Direita | --a ou a-- |

#### **Exemplos:**

```java
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
```
</br>

### ***OPERADORES RELACIONAIS***

| OPERADOR | SIGNIFICADO | ASSOCIATIVIDADE | EXEMPLO | 
|:-:|:-:|:-:|:-:|
| == | Igual | Esquerda | a == b | 
| != | Diferente | Esquerda | a != b | 
| > | Maior que | Esquerda | a > b | 
| >= | Maior ou igual a | Esquerda | a >= b | 
| < | Menor que | Esquerda | a < b | 
| <= | Menor ou igual a | Esquerda | a <= b |

#### **Exemplos:**

```java
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
```
</br>

### ***OPERADORES LÓGICOS***

| OPERADOR | SIGNIFICADO | ASSOCIATIVIDADE | EXEMPLO | 
|:-:|:-:|:-:|:-:|
| && | E lógico (and) | Esquerda | a && b | 
| ll | Ou lógico (or) | Esquerda | a ll b | 
| ! | Negação (not) | Direita | !a | 
| ^ | Ou eclusivo (xor) | Direita | a ^ b |

#### **Exemplos:**

```java
double x = 1.5, y = -1.9;
res0 = (x > 0) && (y < 0); // && → and 
res1 = (x == y) || (y > 0); // || → or
res2 = !res3; // ! → not
res3 = res1 ^ res2; // ^ → xor
```
</br>

### ***OPERADORES DE ATRIBUIÇÃO COMPOSTA***

| OPERADOR | SIGNIFICADO | ASSOCIATIVIDADE | EXEMPLO | 
|:-:|:-:|:-:|:-:|
| += | Adição e atribuição | Direita | a += n |
| -= | Subtração e atribuição | Direita | a -= n |
| *= | Multiplicação e atribuição | Direita | a *= n |
| /= | Divisão e atribuição | Direita | a /= n |
| %= | Divisão inteira e atribuição | Direita | a %= n |
| &= | E (and) bitwise e atribuição | Direita | a &= n |
| l= | Ou (or) bitwise e atribuição | Direita | a l= n |
| ^= | Ou (xor) bitwise e atribuição | Direita|a ^= n |
| >>= | Rotação à direita e atribuição | Direita | a >>= n |
| <<= | Rotação à esquerda e atribuição | Direita | a <<= n |
| >>>= | Rotação à direita s/sinal e atribuição | Direita | a >>>= n |

#### **Exemplos:**

```java	 
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
```
</br>

### ***OPERADORES TERNÁRIOS***

|  | OPERADORES TERNÁRIOS | 
|:-:|:-:|
| SINTAXE | <condição> ? <expressão_true> : <expressão_salse> |

#### **Exemplos:**

```java
double p = 12.34, q = 56.78;
double max = p > q ? p : q;
System.out.println("Utilizando operador ternário: " + max);
int r = 100;
System.out.println("A = " + r + (r > 50 ? " é " : "não é ") + "maior que 50.");
```
</br>

### ***OPERADORES BITWISE***
| OPERADOR | SIGNIFICADO | ASSOCIATIVIDADE | EXEMPLO | 
|:-:|:-:|:-:|:-:|
| & | E bit-a-bit(bitwise and) | Esquerda | a & b | 
| l | Ou bit-a-bit(bitwise or) | Esquerda | a l b | 
| ^ | Ou-eclusivo bit-a-bit (bitwise xor) | Esquerda | a ^ b | 
| ~ | Complemento de 2 | Direita | ~ a | 
| << | Rotação à esquerda de n bits | Esquerda | a << n | 
| >> | Rotação à direita de n bits | Esquerda | a >> n | 
| >>> | Rotação à direita sem sinal | Esquerda | a >>> n |


#### **Exemplos:**

```java
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

```
</br>

### ***PROCEDÊNCIA DE OPERADORES***

| NÍVEL | OPERADORES |
| :-: | :-: | 
| 01 | []().(seletor) | 
| 02 | ++~instanceofnew-(unário)(cast) | 
| 03 | */% | 
| 04 | +- | 
| 05 | <<>>>>> | 
| 06 | <><=>= | 
| 07 | ==!= | 
| 08 | & | 
| 09 | ~ | 
| 10 | l | 
| 11 | && | 
| 12 | ll | 
| 12 | ?: | 
| 14 | =op= | 
| 15 | , | 
| 16 | ->(operador lambda) |

</details>
</br>


## **Pág. 56 à 72............Estruturas de controle**
<details>
<summary></summary>

### ***ESTRUTURAS DE CONTROLE***

♦ ***1° - Estrutura de Repetição Simples:*** Cláusula ***for*** simples e Cláusula ***for*** avançada </br>
♦ ***2° - Estrutura de Repetição Condicionais:*** Cláusula ***while*** e Cláusula ***do while*** </br>
♦ ***3° - Estrutura de Desvio de Fluxo Condicional Simples:*** Cláusula ***if*** e Cláusula ***else*** </br>
♦ ***4° - Estrutura de Desvio de Fluxo Condicional Múltiplo:*** Cláusula ***switch*** </br>
♦ ***5° - Estrutura de Desvio de Fluxo Incondicional:*** Cláusula ***break*** e Cláusula ***continue*** </br>

Definições:
 - Diretiva/declaração (Statement): → Instrução (em Java são separadas por ;)
 - Bloco (blocks): → Grupo de diretivas/declarações (statements)
 - Cláusula (Clause): → Procedimento

</br>

#### ♦ ***1° - Estrutura de Repetição Simples:*** Cláusula ***for*** simples e Cláusula ***for*** avançada

```java
public class Pag60_Diretivas_for_simples_e_avançada {
	public static void main (String args[]) {

		/* _______________________________________________________________________
         * 1°-Estruturas de Repetição Simples: Cláusula (Clause) for simples
		 * Semântica:
		 * for ([inicialização]; [condição]; [incremento ou decremento])
		 * 	< diretiva; ou { bloco } > */

		// Exemplo: Cláusula (Clause) for simples
		int j; // uma Diretiva(Statement) →(;)
		for (j=0; j<10; j++) { //Cláusula (Clause) for simples → ([inicialização]; [condição]; [incremento++])
			System.out.println(j); //{ bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		// Exemplo: Cláusula (Clause) for simples
		for (int i=0; i<=10; i+=2) { //Cláusula (Clause) for simples → ([inicialização]; [condição]; [incremento+=])
			System.out.println(i); //{ bloco }  →um grupo de diretivas(statments), ao invés de uma diretiva;
		}


		/* _______________________________________________________________________
         * 1°-Estruturas de Repetição Simples: Cláusula (Clause) for avançada
		 * Semântica:
		 * for ([TipoElemento] <variável> : <espressão>)
		 * 	<diretiva; ou { bloco }>
		 */

		double arranjo[] = { 1.1964, 6.1995, 6.1935, 7.1931, 12.1968 }; // uma Diretiva(Statement) →(;)
		
		// Exemplo: Cláusula (Clause) for simples:
		System.out.print("For Comum: [ "); // uma Diretiva(Statement) →(;)
		int tamanho = arranjo.length; // uma Diretiva(Statement) →(;)
		for (int i=0; i<tamanho; i++) //Cláusula (Clause) for simples → ([inicialização]; [condição]; [incremento++])
			System.out.print(arranjo[i] + " "); //diretiva; →ao invés de { bloco }, um grupo de diretivas(statments)

		// Exemplo: Cláusula (Clause) for avançada:
		System.out.print("For Avancado: [ "); // uma Diretiva(Statement) →(;)
		for (double elemento: arranjo) System.out.print(elemento + " "); //Cláusula (Clause) for avançado → ([TipoElemento] <variável> : <espressão>)
	}
}

```

</br>

#### ♦ ***2° - Estrutura de Repetição Condicionais:*** Cláusula ***while*** e Cláusula ***do while***

```java
import java.util.Scanner;
public class Pag62_Diretiva_While_e_DoWhile {
	@SuppressWarnings("resource")
	public static void main (String args[]) {

		/* _________________________________________________________________________
         * 2°-Estruturas de Repetição Condicional: Cláusula (Clause) while
		 * Semântica:
		 * 	while ( < condição > )
		 * 		< diretiva; ou { bloco } > */

		// Exemplo: Cláusula (Clause) while:
		Scanner s = new Scanner(System.in); // uma Diretiva(Statement) →(;)
		System.out.print("Valor inteiro para while: "); // uma Diretiva(Statement) →(;)
		int j = s.nextInt(); // uma Diretiva(Statement) →(;)
		while (j >= 0) { // Diretiva(Statement) while → ( < condição > )
			System.out.println("(while) " + j); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
			j--; // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		// Exemplo: Cláusula (Clause) for simples equivalente (1°-Estrutura de Repetição Simples):
		// OBS: A DIRETIVA FOR MOSTROU-SE SER DE MENOR TEMPO DE EXECUÇÃO PARA EM COMPARAÇÃO COM A DIRETIVA WHILE (PARA ESSA INSTRUÇÃO)!
		System.out.print("Valor inteiro para for: ");
		int i = s.nextInt();
		for (; i>=0; i--) { //Cláusula (Clause) for simples → ([inicialização]; [condição]; [decremento--])
			System.out.println("(for simples) " + i); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		/* ______________________________________________________________________
         * 2°-Estruturas de Repetição Condicional: Cláusula (Clause) do while
		 * Semântica:
		 * 	do {
		 * 		diretiva;
		 * } while ( < condição > ); */

		// Exemplo: Cláusula (Clause) do while:
		System.out.print("Valor inteiro inferior: "); // uma Diretiva(Statement) →(;)
		int min = s.nextInt(); // uma Diretiva(Statement) →(;)
		System.out.print("Valor inteiro superior: "); // uma Diretiva(Statement) →(;)
		int max = s.nextInt(); // uma Diretiva(Statement) →(;)
		
		do {
			System.out.println(min + " < " + max); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
			min++; max--; // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		} while (min < max); // Cláusula (Clause) while → ( < condição > );

		System.out.println(min + " == " + max + " Valores igualados!"); // uma Diretiva(Statement) →(;)
	}

}

```

</br>

#### ♦ ***3° - Estrutura de Desvio de Fluxo Condicional Simples:*** Cláusula ***if*** e Cláusula ***else***

```java
public class Pag65_diretiva_if_e_else {
	public static void main (String args[]) {

		/* _________________________________________________________
         * 3°-Estrutura de Desvio de Fluxo Condicional Simples: Cláusula (Clause) if e else
		 * Semântica:
		 * if ( < condição > )
		 * 	< diretiva1; ou { bloco1 }>
		 * else
		 *  < diretiva1; ou { bloco1 }> 
		 * OBS: A sintaxe Java determina que uma cláusula else sempre pertence à diretiva if imediatamente anterior.
		 * O uso de chaves{} permite modificar esta regra: */
		
		// Exemplo: Cláusula (Clause) if e else:
		int a = 80, b = 50;
		if (a > b) { // condição1 → se a chave fosse após a condição2 então else seria pertencente à diretiva if da condição2
			if (a > 80) // condição2
			System.out.println("a > b && a > 80"); // diretiva2
		} else { //else pertence à diretiva if da condição1, graças às chaves{}
			System.out.println("a < b"); // diretiva2
		}

		// Exemplo: Cláusula (Clause) if e else:
		if (args.length > 0) { // testa presença de argumentos
			// converte 1o argumento para inteiro
			int max = Integer.parseInt(args[0]);
			for (int j=0; j<max; j++) {
				System.out.print(j + " ");
			}
			System.out.println("\nFim da Contagem");
		}
		else System.out.println("Fim do Programa");
	}
}

```

</br>

#### ♦ ***4° - Estrutura de Desvio de Fluxo Condicional Múltiplo:*** Cláusula ***switch***

```java
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//importações↑ para o 2° exemplo
import java.util.Calendar;
import java.util.Scanner;
//importações↑ para o 3° exemplo
public class Pag67_Diretiva_switch {
	public static void main (String args[]) {

		/* _________________________________________________________
         * •4°-Estrutura de Desvio de Fluxo Condicional Múltiplo: Cláusula (Clause) switch
		 * Semântica:
		 * switch ( <expressão_ordinal ou condição> ) {
		 *	case <ordinal1/condição1>:
				diretiva1;
		 * 		[break;]
		 *	case <ordinal/condição2>:
				diretiva2;
		 * 		[break;]
		 * 	[defalt:
		 * 		diretiva_defalf;]
		 * } 
		 * → Expressões ordinais: (0, 1, 2, 3,...); ('A', 'B', 'C')*/
		
		 
		// ________________
        // 1° exemplo: Cláusula (Clause) switch com um caractere de argumento:
		if (args.length > 0) { // testa presença de argumentos
			switch(args[0].charAt(0)) { // avalia inicial do 1o argumento
				// argumento com inicial a minúscula ou maiúscula
				case 'a': case 'A': //"casos amontoados" → podem ser substituidos por "casos melhorados", com o uso de vírgulas, incorporado ao JAVA 14↓
					System.out.println("Vogal A.");
					break; //sai do laço
				case 'e', 'E': //"casos melhorados", com o uso de vírgulas
					System.out.println("Vogal E.");
					break;
				case 'i', 'I': //"casos melhorados", com o uso de vírgulas
				 	System.out.println("Vogal I.");
					break;
				case 'o', 'O': //"casos melhorados", com o uso de vírgulas
					System.out.println("Vogal O.");
					break;
				case 'u', 'U': //"casos melhorados", com o uso de vírgulas
					System.out.println("Vogal U.");
					break;
				default: // inicial nao é uma vogal
					System.out.println("Nao e uma vogal.");
			}
		} else {
			System.out.println("Nao foi fornecido argumento.");
		}


        //________________
		// 2° exemplo: Cláusula (Clause) switch com String de argumento:
		if (args.length > 0) { // testa presença de argumentos
			switch(args[0].toLowerCase()) { // o argumento args[] do tipo string é convertido em minúsculas por meio do método toLowerCase()
				case "data":
				 	System.out.println(DateFormat.getDateInstance().format(new Date()));
					break;
				case "hora":
				 	System.out.println(DateFormat.getTimeInstance().format(new Date()));
					break;
				case "nova-data":
				 	System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
					break;
				case "nova-hora":
				 	System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
					break;
				default:
					System.out.println("Comando nao reconhecido.");
			}
		} else {
			System.out.println("Nao foi fornecido argumento.");
		}


        //________________
		// 3° exemplo: Cláusula (Clause) switch como expressão (preview feature) com o uso do operador lambda ->:
		Scanner s = new Scanner(System.in); // Prepara entrada de dados criando o objeto leitor s para uso das ENTRADAS FORMATADAS (Pag45_EntradaFormatada)
		System.out.print("Digite no. do mes [1-12]? ");
		int mes = s.nextInt();
		// switch como expressão
		int ndias = switch(mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> 31; //com o operador lambda -> não se usa break para o caso
			case 4, 6, 9, 11 -> 30; //com o operador lambda -> não se usa break para o caso
			default -> 28 + (Calendar.getInstance().get(Calendar.YEAR)%4==0 ? 1 : 0);
		}; // fim do switch
		System.out.printf("Mes #%d tem %d dias.\n", 	mes, ndias);
		s.close(); // Fecha objeto leitor s, evitando a perda de recursos e impedindo o uso posterior do dispositivo de entrada
	}
}

```

</br>

#### ♦ ***5° - Estrutura de Desvio de Fluxo Incondicional:*** Cláusula ***break*** e Cláusula ***continue***

```java
import java.util.Scanner;

public class Pag72_Diretiva_break {
	public static void main (String args[]) {

		/* _______________________________________________________________
         * 5°-Estrutura de Desvio de Fluxo Incondicional: Cláusula (Clause) break
		 * A diretiva break provoca a interrupção em estrutura de repetição for, while e do while e estrutura de desvio switch */
		
		// Exemplo: Cláusula (Clause) break em for:
		// leitura do número máximo de pares desejados
		System.out.print("Maximo no pares ? ");
		Scanner s = new Scanner(System.in); // Prepara entrada de dados criando o objeto leitor s para uso das ENTRADAS FORMATADAS (Pag45_EntradaFormatada)
		int max = s.nextInt(); // variável p/ número máximo de pares
		int pares = 0; // variável p/ contar pares encontrados
		for (int i=1; i<1000; i++) { // for com variável imediata
			if (i%2==0) {
				pares++;
				System.out.printf("i = %4d  pares = %4d%n", i, pares); 
			}
			if (pares==max) { break; } // break provoca a interrupção
		}
		s.close(); // Fecha objeto leitor s, evitando a perda de recursos e impedindo o uso posterior do dispositivo de entrada

		
		/* _______________________________________________________________
         * 5°-Estrutura de Desvio de Fluxo Incondicional: Cláusula (Clause) continue
		 * A Cláusula (Clause) break provoca a interrupção em estrutura de repetição for, while e do while, fazendo com que a
		 * estrutura de repetição continue direto para a próxima iteração, pulando as Cláusula (Clause) seguintes finais...*/
		
		// Exemplo: Cláusula (Clause) continue em for:
		int soma = 0; // variável para armazenar soma
		for (int i=0; i<=100; i++) { // laco de 0 a 100
			// abrevia iteração se múltiplo de 2, 3 ou 5
			if (i%2==0 || i%3==0 || i%5==0) { //se o contador é multiplo se 2, 3 ou 5
				System.out.println("i = "+ i + " multiplo de 2, 3 ou 5");
				continue; // provoca a interrupção da estrutura de repetição e continua direto para a próxima iteração
			}
			// processamento normal para demais casos, se if não for True
			soma = soma + i;
			System.out.println("i = " + i + "  soma = "+ soma);
		}
} }

```

</details>
</br>


## **Pág. 73 à 82............Estruturas de controle de erros Arranjos e matrizes**
<details>
<summary></summary>

```java
import java.io.*; 
import java.util.Scanner; 

public class Pag73a82_Estruturas_de_controle_de_erros {
	public static void main (String args[]) {

		/* •Diretiva/declaração (Statement): → Instrução do programa (em Java são separadas por ;)
	 	 * •Bloco (blocks): → Grupo de diretivas/declarações (statements)
		 * •Cláusula (Clause): → Procedimento nativo da liguagem
		 * 
		 * ♦Controle de erros com as cláusulas try catch finally e assert
		 * Sintaxe:
		 * 	try [(recurso = inicialização)] {
		 *		diretivas;
		 * } catch ( <exceptin1> ) {
		 *		diretiva_de_tratamento_de_erro1;
		 * } [ catch ( <exceptin2> ) {
		 *		diretiva_de_tratamento_de_erro2;
		 * }] [ finaly {
		 *		diretiva_de_execução_garantida;
		 * }]
		 *
		 * obs: a cláusula finaly garante a execução de um trecho final de código. */

		 
		//Aplicação com teste convencional(sem controle de erros com a diretiva try catch)
		if (args.length > 0) { // testa presença de argumentos
			int j = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} else { // sinaliza problema
			System.out.println("Falta um argumento inteiro.");
		}


		//Aplicação com uso de controle de erros com a diretiva try catch)
		try { // Tentativa
			int i = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
			while (i >= 0) {
				System.out.println(i); 
				i--;
			}
		} catch (Exception e) { // sinaliza problemas encontrados. Com o uso de Exception será tratado qualquer tipo de erro.
			System.out.println("Argumento nao foi dado ou nao e inteiro.");
		}


		//Usando várias cláusulas catch
		try { // Tentativa
			int j = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {// Captura o erro de falta de argumentos
			System.out.println("Nao foi fornecido um argumento.");

		} catch (NumberFormatException e2) { // Captura o erro de argumento inadequado
			System.out.println("Argumento nao e um inteiro.");
		}


        // Capturar várias exceções diferrentes em uma única clausula multi-catch com o uso de → |
		try { // Tentativa
			int j = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // Captura dois erros através do uso do multi-catch → |: o erro de falta de argumentos e de argumento inadequado
			System.out.println("Argumento nao fornecido ou invalido.");
		} 


		// Gerando um trexo final sempre executável diante da diretiva catch, através da cláusula finaly.
		int p = 5; // valor default
		try { // Tentativa
			p = Integer.parseInt(args[0]);
		} catch (Exception e) { // sinaliza problemas encontrados. Com o uso de Exception será tratado qualquer tipo de erro.
			System.out.println("Argumento invalido ou ausente. Usando default.");
		} finally { // execução de um trecho final de código com a cláusula finaly, independente execução da diretiva catch
			while (p >= 0) {	
				System.out.println(p);
				p--;
			}
		}


		/* Uma asserção torna possível saber de uma situação de que não deveria ocontecer. Funciona como um teste para o código:
		 * caso a condição avaliada da asserção seja verdadeira, o programa ignora a asserção, mas caso seja falso será lançada a
		 * exceção do tipo AssertioinError.
		 * 
		 * •As asserções precisam ser habilitadas:
		 * > java -ea NomeArquivo // sem a extenção .java
		 * --------ou--------
		 * > java -enableassertions NomeArquivo // sem a extenção .java
		 * •Para desabilitá-las:
		 * > java -da NomeArquivo // sem a extenção .java
		 * --------ou--------
		 * > java -disableassertions NomeArquivo // sem a extenção .java */
		Scanner sc = new Scanner(System.in); // cria leitor de dados
		System.out.print("Forneca inteiro>9: ");
		int valor = sc.nextInt(); // lê valor inteiro
		assert valor>9;	// caso o valor da asserção seja menor que 9 será lançada a exceção do tipo AssertioinError
		int soma=0;		// declara variável para soma
		for (int i=1; i<valor; i++) { // realiza laço para efetuar soma
			soma+=i;
			assert soma<99: "soma(" + soma + ")>=99"; // esperado soma<99
		}
		System.out.println("soma[1.."+ valor + "] = " + soma);
		sc.close(); 


		/* try catch para realização monitorada da operação close(), para 'recurso_try_sem_recurso', utilizando a cláusula finally 
		 * com a estrutura de desvio de fluxo condicional simples, cláusula (Clause) if - (Pag65_.java...).  Se mostra uma tarefa 
		 * repetitiva cujo código resultante é pouco legível. A solução, para um código mais legível, é fazer uso do Automatic
		 * Resource Management (ARM) ou try-com-recursos (try-with-resources), abaixo ↓↓↓. */
		// Exemplo 1 - de código pouco legível SEM uso do recurso try-com-recurso—————————————————————————————————————————————————
		InputStream recurso_try_sem_recurso = null;
		try { // ♦tentativa SEM uso do recurso try-com-recurso
			recurso_try_sem_recurso = new FileInputStream(args[0]); 
			System.out.println("Arquivo " + args[0] + " aberto.");
		} catch (IOException e1) { // ♦captura o erro da tentativa
			System.out.println(e1); 
		// Realização monitorada da operação close(), para 'recurso_try_sem_recurso', COM finally e COM if: ↓↓↓
		} finally {
			if (recurso_try_sem_recurso != null) try { // ♦tentativa SEM uso do recurso try-com-recurso
				recurso_try_sem_recurso.close();
				System.out.println("Arquivo " + args[0] + " fechado.");
			} catch (IOException e2) {} // ♦captura o erro da tentativa
		} //Exemplo 1 - FIM_______________________________________________________________________________________________________

		/* Exemplo 2 - de código mais legível COM uso do recurso try-com-recurso——————————————————————————————————————————————————
		 * Realização monitorada da operação close(), para 'recurso_try_com_recurso', SEM finally e SEM if. O uso da sintaxe 
		 * try-com-recurso remove a necessidade de utilizar a cláusula finally, contendo testes e fechamento dos recursos↓↓↓ */
		try (InputStream recurso_try_com_recurso = new FileInputStream(args[0]);) { // ♦tentativa COM uso do recurso try-com-recurso
			System.out.println("Arquivo " + args[0] + " aberto.");
		} catch (IOException e1) { // ♦captura o erro da tentativa
			System.out.println(e1);
		}
		System.out.println("Arquivo " + args[0] + " fechado.");
		//Exemplo 2 - FIM_________________________________________________________________________________________________________


	/*  Simplificação no uso do ARM Automatic Resource Management (ARM) ou try-com-recursos (try-with-resources):
	 * → melhora a legibiilidade do try-com-recursos, declarando-se o recurso antes de usá-lo em try-com-recursos.  */
		String s = "Java - Guia do Programador, 4a Ed.";
		processaRecurso(s);
	} // fim do método construtor — main —
	public static void processaRecurso(String s) {
		StringReader recurso = new StringReader(s); // o objeto 'recurso' do tipo StringReader, é declarado e instanciado antes
		try (recurso) { // ♦tentativa COM uso do recurso try-com-recurso
			int espacos = 0, c;
			while ((c = recurso.read()) != -1) {
				if (c == 32) espacos++;
			}
			System.out.println("Espacos = " + espacos);
		} catch (IOException e1) { // ♦captura o erro da tentativa
			System.out.println(e1);
		}
		System.out.println("Recurso processado.");
	}
}

```

</details>
</br>


## **Pág. 83 à 89............Argumentos da linha de comando**
<details>
<summary></summary>

```java
import java.util.Scanner;
import java.util.Arrays;

public class Pag83a90_Arranjos_e_Matrizes {
	public static void main (String args[]) {
		/* Arranjos———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
		 * •Declaração:
		 * → <Tipo> identificador[]; // forma comum
		 * → <Tipo>[] identificador; // forma preferencial
		 * 
		 * •Alocação: // Arranjos são objetos portanto devem ser alocados com new
		 * → identificador = new <Tipo> [tamanho]; 
		 * 
		 * •Declaração com alocação:
		 * → <Tipo> identificador[] = new <Tipo> [tamanho];
		 * → <Tipo>[] identificador = new <Tipo> [tamanho]; // forma preferencial 
		 * 
		 * ♦ São criadas e preenchidas com valores nulos: 0 (zero) para tipos numéricos; false para tipo booleano; null para tipo objeto 
		 * ♦ Exceção ArrayIndexOutOfBoundsException quando empregados índices inválidos (negativos ou maiores que length-1) */


		// uso da diretiva for comum com arranjos_______________________________________________________________________
		int a[] = new int[10]; // declara e aloca arranjo inteiro
		Scanner sc = new Scanner(System.in); 
		for (int i=0; i<a.length; i++) { // laço for comum destinado ao preenchimento de arranjo (comparação linha 67)
			System.out.print("a[" + i + "]? ");
			a[i] = sc.nextInt();
		}
		int soma = 0; 
		for (int i=0; i<a.length; i++) { // laço for comum destinado a exibição de arranjo (comparação linha 51)
			System.out.println("a[" + i + "] = "+ a[i]);
			soma += a[i];
		}
		System.out.println("Soma = "+ soma);
		sc.close();


		// uso da diretiva for avançada com arranjos____________________________________________________________________
		Scanner sc2 = new Scanner(System.in); 
		System.out.print("No de elementos ? ");  
		int tamanho = sc2.nextInt();
		assert tamanho>0; // uso de assert → pág 81
		int arranjo[] = new int[tamanho]; // declara e aloca arranjo inteiro
		for (int i=0; i<tamanho; i++) {  // laço for comum destinado ao preenchimento de arranjo (comparação linha 67)
			System.out.print("Elemento["+ i + "]? ");
			arranjo[i] = sc2.nextInt();
		}
		sc2.close();
		int soma2 = 0;
		System.out.print("[ ");
		for (int elemento: arranjo) { // laço for avançado destinado a exibição de arranjo (comparação linha 30)
			soma2 += elemento; 
			System.out.print(elemento + " ");
		}
		System.out.println("] soma2 = " + soma2);


		// Operações com arranjos (classe Arrays)_______________________________________________________________________
		Scanner sc3 = new Scanner(System.in);
		System.out.print("No de elementos ? ");
		int tamanho_arranjo = sc3.nextInt();

		System.out.print("Preenchimento real? ");
		double valor = sc3.nextDouble();

		double arranjo1[] = new double[tamanho_arranjo];
		Arrays.fill(arranjo1, valor); // o método fill da classe Arrays preenche o arranjo → substitui um laço comum destinado ao preenchimento como o da linha 25 e da linha 44
		
		System.out.println(Arrays.toString(arranjo1)); // o método toString da classe Arrays exibe o arranjo 
		
		System.out.print("Posicao inicial da copia? "); 
		int de = sc3.nextInt();
		System.out.print("Posicao final da copia? ");
		int para = sc3.nextInt();
		
		double arranjo2[] = Arrays.copyOfRange(arranjo1, de, para); // o método copyOfRange da classe Arrays copia de um índice a outro índice
		double arranjo3[] = Arrays.copyOf(arranjo1, arranjo1.length); // o método copyOf da classe Arrays copia do início até um índice
		
		System.out.println("Copia parcial:\n" + Arrays.toString(arranjo2)); // o método toString da classe Arrays exibe o arranjo 
		System.out.println("Copia total:\n" + Arrays.toString(arranjo3)); // o método toString da classe Arrays exibe o arranjo 
		sc3.close();

		double arr1[] = {13.5, -1.4, 327, 0, 12, 3};
		double arr2[] = Arrays.copyOf(arr1, arr1.length); // cópia do arr1 para mantê-lo inalterável (pois o método sort, abaixo↓, faz com que os elementos do arranjo sejam reposicionados)
		Arrays.sort(arr2); // o método sort da classe Arrays faz a ordenação do argumento arranjo, utilizando internamente o algoritmo QuickSort (o mais rápido conhecido para ordenação, portanto o mais indicado)

		/* Matrizes———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
		 * •Declaração:
		 * → <Tipo> identificador[][]...[]; // forma comum
		 * → <Tipo>[][]...[] identificador; // forma preferencial
		 * 
		 * •Alocação:
		 * → identificador = new <Tipo> [dimensão_1][dimensão_2]...[dimensão_N]; 
		 * 
		 * •Declaração com alocação:
		 * → <Tipo> identificador[][]...[] = new <Tipo> [dimensão_1][dimensão_2]...[dimensão_N];
		 * → <Tipo>[][]...[] identificador = new <Tipo> [dimensão_1][dimensão_2]...[dimensão_N]; // forma preferencial 
		 * 
		 * ♦ São criadas e preenchidas com valores nulos: 0 (zero) para tipos numéricos; false para tipo booleano; null para tipo objeto
		 * ♦ Exceção ArrayIndexOutOfBoundsException quando empregados índices inválidos (negativos ou maiores que length-1) */
		
		
		// Declaração e uso de matriz comum_____________________________________________________________________________
		double mb[][] = new double[3][4]; // declara e aloca matriz 3x4
		for (int l=0; l<mb.length; l++) { // mb.length faz a leitura da quantidade de linhas
			for (int c=0; c<mb[l].length; c++) { // mb[l].length faz a leitura da quantidade de colunas da linha l
				mb[l][c] = l*mb[l].length + c; // aloca o valor da operação na coluna c da linha l na matriz mb
		}	}
		for (int l=0; l<mb.length; l++) { // mb.length faz a leitura da quantidade de linhas
			for (int c=0; c<mb[l].length; c++) { // mb[l].length faz a leitura da quantidade de colunas da linha l
				System.out.print(mb[l][c] + "\t"); // exibe cada elemento referente a cada coluna de cada linha da matriz
			}
			System.out.println();
		}
	

		// Declaração e uso de matriz triangular_______________________________________________________________________
		double mt[][]; // declara matriz
		mt = new double[4][]; // aloca matriz parcialmente
		int aux = 0; // variável auxiliar
		for (int l=0; l<mt.length; l++) { // mt.length faz a leitura da quantidade de linhas
			mt[l] = new double[l+1]; // completa alocação
			for (int c=0; c<mt[l].length; c++) { // mt[l].length faz a leitura da quantidade de colunas da linha l
				mt[l][c] = aux++; // aloca aux na coluna c da linha l na matriz mt
		}	}
		for (int l=0; l<mt.length; l++) { // exibe matriz
			for (int c=0; c<mt[l].length; c++) {
				System.out.print(mt[l][c] + "\t");
			}
			System.out.println();
		}
	}
}

```

</details>
</br>


## **Pág. 90 à 93............Especificadores e modificadores especiais**
<details>
<summary></summary>

```java
public class Pag91_Argumentos_de_main {
	public static void main(String args[]) { // ex: input args[Peter Jandl 2020 3.14]
		for (int i=0; i<args.length; i++) { //args.length = 4
			System.out.printf("Argumento #%d: %s ", i, args[i]); 
			// args[i=0] → Peter (caso C) 
			// args[i=1] → Jandl (caso C) 
			// args[i=2] → 2020  (caso B)
			// args[i=3] → 3.14  (caso A)
			try { // verifica se arg[i] é inteiro // caso A
				int n = Integer.parseInt(args[i]);
				System.out.printf("(inteiro=%d)%n", n); // caso A
			} catch (NumberFormatException e1) { // caso B
				// se ocorre exceção não é inteiro
				try { // verifica se arg[i] é real
					double d = Double.parseDouble(args[i]);
					System.out.printf("(real=%f)%n", d); // caso B
				} catch (NumberFormatException e2) { // caso C
					// se ocorre exceção não é real
					System.out.printf("(String=\"%s\")%n", args[i]); // caso C
				}
			}
		}
	}
}

```

</details>
</br>


## **Pág. 94 e 95............Anotações**
<details>
<summary></summary>

```java
public class Pag94_AnotacoesJava {
	public static void main(String[] args) {
		System.out.println("Valor aleatorio: " + Anotacoes.random());
	}
}
// As anotações são meetainformações incluída no código do programa, com o objetivo de fornecer indicações para 
// ferramentas que vão manipulá-lo, ou seja, servem como diretivas para compiladores, IDEs ou outros programas.
class Anotacoes {
	@Deprecated //marca o método anotado (.random, nesse exemplo) como absoleto, isto é, que não deveria ser utilizado.
	public static double random() { return Math.random(); }	

	@Override // indica que o método anotado (toString(), nesse exemplo) substitui o existente em sua superclasse (o compilador gera erro caso não ocorra a sobreposição, ou seja, caso não seja usado esta anotação)
	//→ Lembrando: •Override(Sobreposição de Métodos):reescrever o método herdado da superclasse com a mesma assinatura, alterando o corpo do método
    //→ Lembrando: •Overload(Sobrecarga de Métodos):escrever vários métodos com o mesmo nome, com parâmetros e assinaturas(identificação) diferentes
	@SuppressWarnings("unused") // ordena que o compilador suprima os avisos gerados por um elemento (classe, método ou diretiva) e seus subelementos (evita que o compilador gere mensagens indicando que a variável x não foi utilizada).
	public String toString() {
		int x;
		return "ExemploAnotação";
	}
}

```

</details>
</br>
