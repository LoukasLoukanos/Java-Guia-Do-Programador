/* É possível declarar classes aninhadas estáticas de modo semelhante a nutt membros (campos e métodos).

  Quando a classe aninhada é estática, seu acesso se restringe aos membros está ticos da classe externa, 
  de qualquer nível de acessibilidade.

  (Classes aninhadas são elementos auxiliares e somente devem ser criadas quando sua implementação se 
  limitar a dois ou três métodos simples. São muito utilizadas na criação de iterators (classes para 
  navegação de coleções) e no processamento de eventos em aplicações dotadas de interfaces gráficas.  */

public class Pag172a176_OutraExterna {
	private static int valor;

	// CLASSE ANINHADA ESTÁTICA
	public static class AninhadaEstatica { 
		public void exibir () {
			System.out.println("valor = "+ valor);
		}
	}


	/* Classes aninhadas estáticas não são, formalmente, consideradas classes internas, porque não existe 
	uma relação de dependência tão forte como para classes internas. 
	Até mesmo a instanciação da CLASSE ANINHADA independe de uma instância da classe externa: */



	// Carregamento da classe Pag172a176_OutraExterna no shell:
	// open Pag172a176_OutraExterna.java

	// instanciação da CLASSE ANINHADA ESTÁTICA:
	Pag172a176_OutraExterna.AninhadaEstatica aninhadaEstatica = new Pag172a176_OutraExterna.AninhadaEstatica();

	
	
	/* Portanto, a sintaxe é diferente da usada para instanciar classe interna (a partir da referência do objeto da classe externa):
	
	→ instanciação da classe externa (para referência de instanciação da classe interna):
	Pag172a176_Externa obj_externa = new Pag172a176_Externa (10);

	→ instanciação da classe interna (a partir da referência do objeto da classe externa):
	Pag172a176_Externa.Aninhada obj_interna = obj_externa.new Aninhada ();  */
}
