/*Em Java, as classes internas, também conhecidas como classes aninhadas, podem ser usadas para diversos fins, tais como:

→ Encapsulamento: As classes internas podem ser usadas para encapsular uma classe que é relevante apenas para a classe externa. 
Isso pode ajudar a reduzir a poluição do espaço de nomes e tornar o código mais fácil de ler e entender.

→ Acesso a membros privados: As classes internas podem acessar membros privados da classe externa, incluindo variáveis e métodos 
privados. Isso pode ser útil quando a classe interna precisa acessar ou modificar esses membros privados.

→ Implementação de interfaces: As classes internas podem implementar interfaces, o que pode ser útil para definir comportamentos 
específicos para uma classe externa. Isso pode ajudar a tornar o código mais modular e fácil de manter.

→ Criação de classes auxiliares: As classes internas podem ser usadas para criar classes auxiliares que são usadas apenas pela 
classe externa. Isso pode ajudar a evitar a criação de classes desnecessárias e tornar o código mais organizado. */

// CLASSE EXTERNA ou outter class ou enclosing class
public class Pag172a176_Externa {

	private int valor; 

	public Pag172a176_Externa(int valor) { 
		this.valor = valor;
	}

	// CLASSE INTERNA (ou inner class)
	public class Aninhada { // o especificador da classe determina seu acesso externo: se pública, poderá ser acessada e instanciada; se privada, seu uso será exclusivo por parte da CLASSE EXTERNA
		public void exibir () {
			System.out.println("valor = "+ valor);
		}
	}

	// Carregamento da classe Pag172a176_Externa no shell:
	// open Pag172a176_Externa.java

	//instanciação da CLASSE EXTERNA (para referência de instanciação da CLASSE INTERNA):
	Pag172a176_Externa obj_externa = new Pag172a176_Externa (10);

	//instanciação da CLASSE INTERNA (a partir da referência do objeto da CLASSE EXTERNA):
	Pag172a176_Externa.Aninhada obj_interna = obj_externa.new Aninhada ();
}
