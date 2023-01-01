import pag133e134_criacao_de_pacotes.subpacote.Code; // uso simples da diretiva import → com pack.subpack.Classe
import java.lang.Math; // uso simples da diretiva import
import static java.lang.Math.*; // uso da diretiva import com static (permite usar contantes declaradas em classes externas sem que sejam qualificadas → linha 25, diferente da linha 18) * nesse caso importa tudo da classe .Math

public class Pag137e138_Importacao {
	public static void main(String[] args) {

		// uso da importação da linha 1_____________
		for(int n=0; n<10; n++) {
			System.out.printf("Fibo: %6d Arit: %6d Geom: %6d\n",
				Code.fibonacci(n),
				Code.aritmetica(0, 2, n),
				Code.geometrica(1, 3, n));


		// uso da importação da linha 2_____________
		double raio = Double.parseDouble(args[0]);
		double perim = 2 * Math.PI * raio; // uso da constante PI de forma qualificada (referenciando a classe .Math antes)
		System.out.println("raio = " + raio + ", perim = " + perim);
		}


		// uso da importação da linha 3_____________
		double raio = Double.parseDouble(args[0]);
		double perim = 2 * PI * raio; // uso da constante PI de forma abreviada (sem referenciar a classe .Math antes)
		System.out.println("raio = " + raio + ", perim = " + perim);
	}
}