public class Pag127_ExcecoesMonitoradas {
	// dimensões são campos privados
	private double largura, altura;
	// construtor default aciona outro construtor com this
	public Pag127_ExcecoesMonitoradas () throws Exception {
		this (2, 1);
	}
	// construtor parametrizado
	public Pag127_ExcecoesMonitoradas (double larg, double alt) throws Exception {
		this.setTamanho(larg, alt);
	}
	// métodos
	public void setTamanho (double largura, double altura) throws Exception {
		// verifica valor das variáveis locais
		if (largura>=0 && altura>=0) { 
			// campos recebem valor das variáveis locais
			this.largura = largura; // uso explícito de this
			this.altura = altura;
		} else {

			//→→→→→→→→→→ Se dimensões inadequadas lança exceção monitorada ←←←←←←←←←←←←←←←←←←
			throw new Exception("Dimensoes invalidas.");
			
	}	}
	// uso implícito de this: retorna valor de this.largura
	public double getLargura () {
		return largura;
	}
	// uso implícito de this: retorna valor de this.altura
	public double getAltura () {
		return altura;
	}
	@Override
	public String toString () {
		return "P0312Retangulo[largura=" + largura + 
			",altura=" + altura + "]";
	}
}
