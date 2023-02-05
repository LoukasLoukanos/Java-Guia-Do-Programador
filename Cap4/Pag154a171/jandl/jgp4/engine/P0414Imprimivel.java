package jandl.jgp4.engine;
// → Classes podem herdar de apenas uma superclasse, mas podem implementar diversas interfaces (semelhante à herança múltipla)

// herda da classe pai P0413Mensagem e implementa a interface P0411Imprimivel
public class P0414Imprimivel extends P0413Mensagem implements P0411Imprimivel {
			
	// herança da classe pai —super—, P0413Mensagem
	public P0414Imprimivel (String conteudo) {
		super(conteudo);
	}
		
	// implementação da interface P0411Imprimivel
	@Override
	public void imprimir () {
		imprimirNoConsole();
	}
		
	// implementação da interface P0411Imprimivel
	@Override
	public void imprimirNoConsole (){
		System.out.println(P0411Imprimivel.INICIO);
		System.out.println(getConteudo());
		System.out.println(P0411Imprimivel.FIM);
	}
}
