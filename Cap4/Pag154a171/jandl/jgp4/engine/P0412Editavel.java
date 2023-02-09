package jandl.jgp4.engine;

public interface P0412Editavel {
	long chave = 0xABDCEF0; // constante da interface declarada implicitamente como public, static e final
	
	void editar(String conteudo); // método da interface declarada implicitamente como public e abstract
	
	// método default → com ele é possível implementar métodos completos nas interfaces, possibilitando a evolução das interfaces sem a necessidade de modificar e recompilar as classes que as realizam (implementam)
	default void limpar () { // esse método não existia, mas ao editar esta interface, criando-o com default, não será necessário modificar a classe P0415Editavel que implementa esta interface
		editar("");
	}
}
