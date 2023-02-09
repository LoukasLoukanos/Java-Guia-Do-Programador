package jandl.jgp4.engine;
// → Interfaces podem ser reusadas ao modificar suas funcionalidades por meio da herança, definindo-se subinterfaces

// herda da interface pai P0412Editavel
public interface P0416Editavel2 extends P0412Editavel {
	
	// Método estático → todas as classes que implementarem esta interface, compartilharão esse método e 
	// poderão ser usados sem objetos, i.e., sem instâncias dessas classes que implementarem esta interface.
	static String transformar (String conteudo, int shift) {
		char[] array = conteudo.toCharArray();
		return new String(deslocamento(array, shift));
	}

	/* Uso do método estático 'transformar'↑ sem instâncias de objetos de classes que implementem esta interface:
	 * String resultado = Editável2.transformar("Java", 4);
	 *     output: 'Neze' */
	

	// Método estático privado → por ser privado têm uso restrito aos demais membros de sua interface. 
	// Porém este método presta um serviço para o método 'transformar'↑, promovendo seu reúso por outros métodos.
	private static char[] deslocamento(char[] array, int shift) {
		for(int p=0; p<array.length; p++) {
			array[p] = (char) ((array[p] + shift)>122 ?
					65 + shift++ : array[p] + shift);
		}
		return array;
	}
	
	// método abstrato
	public void anexar (String conteudo);
}
