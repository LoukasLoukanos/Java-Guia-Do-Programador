package jandl.jgp4.geom;

import static java.lang.Math.*;

public class P0408Circunferencia extends P0407Forma { // declarar a classe como abstract é redundante → já foi declarado na classe pai

	public P0408Circunferencia (double raio) {
		super(1); // uso obrigatório do construtor da superclasse (pai) P0407Forma
		setRaio(raio); // ajuste da medida do raio pelo construtor (inicializador)
	}

	// implementação do método abstrato area(). Sensato, pois o cálculo da área depende da forma específica
	@Override // indicando a sobreposição do método abstrato ↓
	public double area () {
		return PI*Math.pow(getMedida(0), 2);
	}

	// reajuste da medida do raio após a definição inicializadora do construtor P0408Circunferencia (double)
	public void setRaio(double raio) {
		setMedida(0, raio);
	}
	
	// operação específica extra
	public static int comparador(P0408Circunferencia a, P0408Circunferencia b) {
		return (int) (a.area() - b.area());
	}
	
	// operação específica extra
	public int comparador2(P0408Circunferencia b) {
		return (int) (this.area() - b.area());
	}

}
