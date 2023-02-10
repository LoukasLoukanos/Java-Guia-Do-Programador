package jandl.jgp4.engine;
/* → Classes podem herdar de apenas uma superclasse, mas podem implementar diversas interfaces (semelhante à herança múltipla).
Obs: "Realizar" e "implementar" são termos usados de forma intercambiável para se referir ao mesmo conceito na programação. 
No contexto da programação, ambos os termos se referem à ação de uma classe implementar as definições de uma interface, 
fornecendo implementações concretas para seus métodos e propriedades.No entanto, "implementar" é um termo mais comumente usado na 
programação orientada a objetos, enquanto "realizar" é mais comumente usado em linguagens de programação orientadas a protocolos, 
como Swift. Ambas as palavras são sinônimos no contexto de programação e podem ser usadas para se referir à mesma ação.*/


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
