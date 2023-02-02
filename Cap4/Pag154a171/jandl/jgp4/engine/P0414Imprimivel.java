package jandl.jgp4.engine;

public class P0414Imprimivel extends P0413Mensagem implements P0411Imprimivel {
			
	public P0414Imprimivel (String conteudo) {
		super(conteudo);
	}
		
	@Override
	public void imprimir () {
		imprimirNoConsole();
	}
		
	@Override
	public void imprimirNoConsole (){
		System.out.println(P0411Imprimivel.INICIO);
		System.out.println(getConteudo());
		System.out.println(P0411Imprimivel.FIM);
	}
}
