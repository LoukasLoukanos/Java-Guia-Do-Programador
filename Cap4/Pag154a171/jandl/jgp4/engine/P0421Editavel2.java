package jandl.jgp4.engine;

// herda da classe pai P0415Editavel e implementa a interface d emarcação P0420Especial.
public class P0421Editavel2 extends P0415Editavel implements P0420Especial {

	// herança da classe pai —super—, P0415Editavel, que por sua vez recebe a herança da classe pai —super—, P0413Mensagem
	public P0421Editavel2 (String conteudo) {
		super(conteudo);
	}

	/* Esta classe implementa uma interface de marcação (P0420Especial) portanto ela deve seguir as regras 
	ou contratos associados a esta interface. Mesmo que a interface seja de marcação (não tenha nenhum 
	método ou constante definido nela) */

	public void operadorEspecialInstanceof () {

		Object obj = new P0421Editavel2("Java 16");

		/*o operador instanceof permite identificaar se objetos são instâncias de classes específicas ou se realizam interfaces particulares*/
		System.out.println(obj instanceof P0421Editavel2); // true
		System.out.println(obj instanceof String); // false
		System.out.println(obj instanceof P0420Especial); // true
	
	}
}
