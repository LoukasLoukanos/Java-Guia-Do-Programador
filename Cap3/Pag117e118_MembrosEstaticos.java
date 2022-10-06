public class Pag117e118_MembrosEstaticos {
	// armazena número de instâncias da classe
	private static int instancias = 0;

	// armazena último valor usado por metodo dobro(int)
	public int ultimoValor;
	
	// construtor que atualiza no. de instâncias
	public Pag117e118_MembrosEstaticos () {
		instancias++;
	
	}
	
	// retorna no. de instâncias
	public static int getInstancias () {
		return instancias;
	
	}
	// calcula o dobro
	public int dobro (int valor) {
		ultimoValor = valor; return 2*valor;
	}
}
