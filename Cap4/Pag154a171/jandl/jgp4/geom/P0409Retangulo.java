package jandl.jgp4.geom;

public class P0409Retangulo extends P0407Forma {
	public P0409Retangulo (double altura, double largura) {
		super(2); // uso obrigatório do construtor da superclasse (pai) P0407Forma
		setMedida(0, altura); // ajuste da medida da altura pelo construtor (inicializador)
		setMedida(1, largura); // ajuste da medida da largura pelo construtor (inicializador)
	}

	// implementação do método abstrato area() Sensato, pois o cálculo da área depende da forma específica
	@Override // indicando a sobreposição do método abstrato ↓
	public double area () {
		return getMedida(0)*getMedida(1);

	}
	// operação específica extra
	public double perimetro () {
		return 2*(getMedida(0)+getMedida(1));
	}
}
