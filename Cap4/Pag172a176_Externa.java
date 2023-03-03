/*Em Java, as classes internas e classes aninhadas, podem ser usadas para diversos fins, tais como:

→ Encapsulamento: Podem ser usadas para encapsular uma classe que é relevante apenas para a classe externa. 
Isso pode ajudar a reduzir a poluição do espaço de nomes e tornar o código mais fácil de ler e entender.

→ Acesso a membros privados: Podem acessar membros privados da classe externa, incluindo variáveis e métodos 
privados. Isso pode ser útil quando é necessário acessar ou modificar esses membros privados.

→ Implementação de interfaces: Podem implementar interfaces, o que pode ser útil para definir comportamentos 
específicos para uma classe externa. Isso pode ajudar a tornar o código mais modular e fácil de manter.

→ Criação de classes auxiliares: Podem ser usadas para criar classes auxiliares que são usadas apenas pela 
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



/* As classes anônimas em Java são utilizadas para criar classes que não precisam de um nome específico 
e podem ser usadas apenas uma vez. Elas são criadas no momento da sua declaração e podem ser usadas para 
implementar uma interface ou uma classe abstrata.

As classes anônimas são definidas dentro de uma expressão, em vez de serem definidas explicitamente como 
uma classe separada. Elas são úteis para criar objetos temporários ou para passar uma implementação 
personalizada como um parâmetro em um método.


Um exemplo de uso de classe anônima é a implementação de um ActionListener 
em uma interface gráfica de usuário. Um código pode ficar assim:
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // código de ação do botão aqui
    }
});
Nesse exemplo, estamos criando uma classe anônima que implementa a interface ActionListener 
e define o método actionPerformed para executar uma ação quando o botão é clicado.


As classes anônimas são uma ferramenta útil para simplificar o código e evitar a necessidade de criar classes 
separadas para pequenas implementações de interfaces ou classes abstratas. No entanto, elas devem ser usadas 
com moderação, pois podem tornar o código mais difícil de entender se forem usadas em excesso.

Resumindo: Classe Anônima → é uma classe interna auxiliar sem nome, definida (implicitamente) como uma subclasse 
ou como uma realização de uma interface, com o propósito de servir para a instanciação de um único objeto.

__________________________________________________________________________________________
♦ Sem o uso de Classe interna anônima poderiamos ter:

class A extends SuperClasse {
	public void  metodo () {
		// bloco do método
	}
}

class B implements Interface {
	public void  metodo () {
		// bloco do método
	}
}

• Teríamos que instanciar objetos assim ↓:
A obj = new A ();
B obj = new B ();

__________________________________________________________________________________________
♦ Com o uso de Classe interna anônima podemos ter:

SuperClasse obj = new SuperClasse () { // classe interna anônima (definida implicitamente)
	public void  metodo () {
		// bloco do método
	}
}

Interface obj = new Interface () { // classe interna anônima (definida implicitamente)
	public void  metodo () {
		// bloco do método
	}
}

• Os objetos ja foram instanciados nas classes internas anônimas ↑  */
