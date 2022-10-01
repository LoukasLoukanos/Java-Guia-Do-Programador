//overload ou sobrecarga de método: mudança da assinatura do método.
//override ou sobreposição de método: mudança do corpo do método.
public class Pag114a116_Overload {
	// campos públicos: não existem restrições p/ valores de x e y
	public double x, y;
	// constr. default: ponto definido na origem (0, 0)
	public Pag114a116_Overload ( ) {
		x = 0; y = 0;
	}
	// constr. parametrizado: ponto definido na instanciação
	public Pag114a116_Overload (double px, double py) {
		x = px; y = py;
	}
	// determina distância entre instância e coordenada dada
	public double distancia (double px, double py) {
		return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
	}
	// determina distância entre instância e ponto dado
	public double distancia (Pag114a116_Overload p) {
		return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
	}
	// fornece representação textual dos objetos
	public String toString( ) {
		return "Pag114a116_Overload[x="+ x + ",y="+ y + "]";
	}
}
