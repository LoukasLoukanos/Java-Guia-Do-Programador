import java.util.Scanner; // importação da classe Scanner do pacote java.util

public class Pag43_EntradaSaida {
	public static void main (String args[]) {
		System.out.println("Ola!"); // Saída comum
		System.out.print("Digite um inteiro: "); // Saída comum sem finalizar a linha de exibição possibilitando adicionar outras mensagens na mesma linha.
		Scanner s = new Scanner(System.in); // Prepara entrada de dados criando o objeto leitor s
		int valor = s.nextInt();	 // O método nextInt() realiza a leitura("input") de um valor inteiro armazenando numa variável de tipo apropriado(int). Mas poderia ser nextByte ou nextFloat, etc.
		System.out.println("Valor = " + valor); // Saída do valor lido
		s.close(); // Fecha objeto leitor s, evitando a perda de recursos e impedindo o uso posterior do dispositivo de entrada
	}	
}
