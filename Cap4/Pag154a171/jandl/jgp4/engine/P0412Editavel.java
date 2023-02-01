package jandl.jgp4.engine;

public interface P0412Editavel {
	long chave = 0xABDCEF0; // constante da interface declarada implicitamente como public, static e final
	
	void editar(String conteudo); // método da interface declarada implicitamente como public e abstract
	
	// método default (alteração exemplo 4.17)
	default void limpar () {
		editar("");
	}
}
