package jandl.jgp4.geom;

public class P0410Triangulo extends P0407Forma {
	public P0410Triangulo (double l1, double l2, double l3) {
		super(3); // uso obrigatório do construtor da superclasse (pai) P0407Forma
		setMedida(0, l1); // ajuste da medida dos lados
		setMedida(1, l2); // ajuste da medida dos lados
		setMedida(2, l3); // ajuste da medida dos lados
	}

	// implementação do método abstrato area() usando fórmula de Herão
	@Override // indicando a sobreposição do método abstrato ↓
	public double area () {
		double sp = (getMedida(0) + getMedida(1) + getMedida(2))/2;
		double aux = sp * (sp-getMedida(0))*(sp-getMedida(1)) * (sp-getMedida(2));
		return Math.sqrt(aux);
	}
}
