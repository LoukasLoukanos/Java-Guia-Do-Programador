public class Pag117e118_MembrosEstaticos {
	// armazena número de instâncias da classe
	private static int instancias = 0;

	// armazena último valor usado por metodo dobro(int)
	public int ultimoValor;
	
	// construtor que atualiza no. de instâncias (construtores não podem ser declarados estáticos)
	public Pag117e118_MembrosEstaticos () {
		instancias++;
	
	}
	//_____Membros estáticos podem ser usados diretamente por meio de suas classes ou de suas instâncias:_____

	// método estático que retorna no. de instâncias (estático → :. poderá ser usado sem a necessidade de instanciação)
	public static int getInstancias () {
		return instancias;
	
	}
	// método não estático que calcula o dobro (NÃO estático → :. será acessível apenas por meio de instâncias da classe)
	public int dobro (int valor) {
		ultimoValor = valor; return 2*valor;
	}

	//uso direto dO método estático getInstancias() a partir de sua classe, sem a necessidade de instanciação (PREFERENCIAL)
	int x = Pag117e118_MembrosEstaticos.getInstancias();

	//uso do método estático getInstancias() a partir de uma instância de sua classe 
	Pag117e118_MembrosEstaticos obj = new Pag117e118_MembrosEstaticos();
	//int y = obj.getInstancias();

}
