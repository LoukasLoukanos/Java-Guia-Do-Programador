package jandl.jgp4.engine;
/* → Classes podem herdar de apenas uma superclasse, mas podem implementar diversas interfaces (semelhante à herança múltipla).
Obs: "Realizar" e "implementar" são termos usados de forma intercambiável para se referir ao mesmo conceito na programação. 
No contexto da programação, ambos os termos se referem à ação de uma classe implementar as definições de uma interface, 
fornecendo implementações concretas para seus métodos e propriedades.No entanto, "implementar" é um termo mais comumente usado na 
programação orientada a objetos, enquanto "realizar" é mais comumente usado em linguagens de programação orientadas a protocolos, 
como Swift. Portanto, em Java o correto é dizer que as classes IMPLEMENTAM interfaces. */


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
