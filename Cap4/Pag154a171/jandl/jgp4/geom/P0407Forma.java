package jandl.jgp4.geom;

// O emprego do modificador abstract é útil para definir um protótipo, i.e., um método sem bloco de código
// Implicações → torna impossível instanciar objetos da classe (pois há o pressuposto de que existem métodos incompletos)
// Obs: mesmo sem métodos abstratos, uma classe pode ser declarada abstract para evitar a instanciação de seus objetos. Contanto, objetos de subclasses que herdem desta superclasse poderão ser instanciados.
public abstract class P0407Forma {

	private double medida[]; // declaração do array 'medidas' de forma privada para obrigar o uso dos métodos setMedida(int, double) e getMedida(int)
	
	public P0407Forma(int numMedidas) { // Construtor parametrizado
		medida = new double[numMedidas]; // aloca o array 'medidas' que foi declarado
	}

	// Métodos_________________________________________________________________________________
	public double getMedida(int i) { // obtém uma medida
		if (i<0 || i>=medida.length) {
			throw new RuntimeException("Numero invalido de medida.");
		}
		return medida[i];
	}
	
	public int getNumMedidas () { // retorna no. de medidas
		return medida.length;
	}
	
	// é protected para permitir que futuras subclasses decidam colocar sua exibição como públic, tornando alteráveis as medidas do objeto (public para protected não é permitido)
	protected void setMedida (int i, double m) { // ajusta uma medida
		if (i<0 || i>=medida.length) {
			throw new RuntimeException("Numero invalido de medida.");
		}
		if (m<0) {
			throw new RuntimeException("Medida #"+ i + "invalida.");
		}
		medida[i] = m;
	}
	
	@Override // representação textual
	public String toString () {
		StringBuffer sb = new StringBuffer(getClass().getName());
		sb.append("[medidas:");
		for(int i=0; i<medida.length-1; i++) {
			sb.append(medida[i]);  sb.append(",");
		}
		sb.append(medida[medida.length-1]);
		sb.append("]");
		return sb.toString();
	}
	
	public abstract double area (); // método abstrato que determinará a área
}
