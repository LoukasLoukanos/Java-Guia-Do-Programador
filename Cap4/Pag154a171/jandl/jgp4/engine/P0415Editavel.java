package jandl.jgp4.engine;
// → Classes podem herdar de apenas uma superclasse, mas podem implementar diversas interfaces (semelhante à herança múltipla)

// herda da classe pai P0413Mensagem e implementa as interfaces P0411Imprimivel e P0412Editavel, simulando o mecanismo de herança múltipla.
public class P0415Editavel extends P0413Mensagem implements P0411Imprimivel, P0412Editavel {

	// herança da classe pai —super—, P0413Mensagem
	public P0415Editavel (String conteudo) {
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
		System.out.println(P0411Imprimivel.INICIO + getConteudo() + P0411Imprimivel.FIM);
	}

	// implementação da interface P0412Editavel
	@Override
	public void editar (String conteudo) {
		setConteudo(conteudo);
	}
}
