public class Pag147a151_HerancaeSobreposicao {
	
	protected double kProp, kLin;
	
	public Pag147a151_HerancaeSobreposicao (double kProp, double kLin) {
		this.kProp = kProp;
		this.kLin = kLin;
	}
	public double getKProp ( ) { 
		return kProp;
	}
	public double getKLin ( ) { 
		return kLin; 
	}
	public double converter (double valor) {
		return valor*kProp + kLin;
	}
	@Override // Sobreposição (mudança do corpo/bloco) do método toString
	public String toString ( ) {
		return "Pag147a151_HerancaeSobreposicao[kProp=" +kProp+",kLin= " + kLin+"]";
	}

public class Aplicacao {
	public static void main(String[] args) {
		// Um conversor de medidas em centímetros para polegadas poderia ser definido, instanciado e usado assim (com o jshell omitindo os comentários):

		//open Pag147a151_HerancaeSobreposicao.java   →   Carrega arquivo com código Java

		// instancia conversor com valores adequados
		Pag147a151_HerancaeSobreposicao c2p = new Pag147a151_HerancaeSobreposicao (0.3937, 0.0);

		// medida en cm
		double cm = 15;

		// conversão cn para pol
		double pol = c2p.converter (cm);

		//vars   →   exibe variáveis e seus valores
	}
}



// Outros conversores podem ser criados como no exemplo acima↑, porém a infraestrutura da classe Pag147a151_HerancaeSobreposicao
// é aproveitada melhor na implementação de conversores específicos por meio da herança :
public class ArquivoExemplo_1 extends Pag147a151_HerancaeSobreposicao {
	public ArquivoExemplo_1( ) {
		// aciona o construtor da superclasse Pag147a151_HerancaeSobreposicao
		super(0.3937, 0.0);
	}
}

public class ArquivoExemplo_2 extends Pag147a151_HerancaeSobreposicao {
	public ArquivoExemplo_2 ( ) {
		// aciona o construtor da superclasse Pag147a151_HerancaeSobreposicao
		super(1.0, 273.0); 
	}
}

public class ArquivoExemplo_3 extends Pag147a151_HerancaeSobreposicao {
	public ArquivoExemplo_3 ( ) {
		// aciona o construtor da superclasse Pag147a151_HerancaeSobreposicao
		super(1.0, -273.0); 
	}
}

import java.util.Scanner;
public class ArquivoExemplo_4 {
	public static void main (String arg[ ]) {
		// prepara console
		Scanner sc = new Scanner(System.in); 

		System.out.print("Digite temperatura Celsius: ");
		// lê temp Celsius
		double tempC = sc.nextDouble();	 
		sc.close();
		// cria conversor Celsius p/ Kelvin e exibe info
		ArquivoExemplo_2 ck = new ArquivoExemplo_2();
		// uso implícito de toString()
		System.out.println("ck : "+ ck); 
		// conversão C-->K
		double tempK = ck.converter(tempC); 
		// resultado
		System.out.println("tempK = "+ tempK + "K"); 

		// cria conversor Kelvin p/ Celsius e exibe info
		ArquivoExemplo_3 kc = new ArquivoExemplo_3();
		// uso implícito de toString()
		System.out.println("kc : "+ kc); 
		// conversão K-->C
		tempC = kc.converter(tempK); 
		// resultado
		System.out.println("tempC = "+ tempC + "C"); 
	}
}

