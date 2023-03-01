public class Pag172a176_EmMetodo {
	public static void main(String a[]) {
		Extra extra = new Extra();
		extra.info();
		extra.operacao(33);
		extra.info();
	}
}

class Extra { // classe externa (ou outter class ou enclosing class)
	private int total = 0;
	
	// Usar classes internas a métodos não é uma prática habitual, pois dificulta a legibilidade 
	// do código, além de ter justificativa de uso questionável na maior parte dos casos
	public void operacao(int v) {
		class Somador { // classe interna (ou inner class) a um método 
			public void soma(int v) {
				total += v; //acessa o atributo privado da classe externa
			}
		}
		// uso da classe interna do método
		Somador s = new Somador();
		s.soma(v);
	}
	
	public void info() {
		System.out.println("total = " + total);
	}
}
