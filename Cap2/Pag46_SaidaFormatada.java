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
