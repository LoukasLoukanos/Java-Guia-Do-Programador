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

		/* •Diretivas(Statements): → São as instruções do programa, em Java são separadas por ;
	 	 * •Bloco: → São grupos de Diretivas(Statements)
	 	 * 
	 	 * ESTRUTURAS DE CONTROLE: 
	 	 * •1°-Estrutura de Repetição Simples: diretiva for simples e diretiva for avançada
	 	 * •2°-Estrutura de Repetição Condicionais: diretiva while e diretiva do while
	 	 * •3°-Estrutura de Desvio de Fluxo Condicional Simples: diretiva if e diretiva else
		 * •4°-Estrutura de Desvio de Fluxo Condicional Múltiplo: diretiva switch
		 * •5°-Estrutura de Desvio de Fluxo Incondicional: diretiva break e diretiva continue */


		/* •4°-Estrutura de Desvio de Fluxo Condicional Múltiplo: diretiva (Statement) switch_________________________________________________________
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
		
		 
		// 1° exemplo: Diretiva(Statement) switch com um caractere de argumento:________________
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


		// 2° exemplo: Diretiva(Statement) switch com String de argumento:_______________________
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


		// 3° exemplo: Diretiva(Statement) switch como expressão (preview feature) com o uso do operador lambda ->:_______________________
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
