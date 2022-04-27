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