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