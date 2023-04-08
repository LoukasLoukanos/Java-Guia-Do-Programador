import java.util.*;

public class Pag185_ListaSemGenerico { // Classe não usa genéricos
	@SuppressWarnings({ "rawtypes", "unchecked" }) // evita que o compilador gere avisos
	public static void main(String a[]) {
		/* Sem o uso de genéricos, é possível adicionar objetos de qualquer tipo a uma lista, 
		 * o que pode levar a problemas de tipo na recuperação e uso posterior desses objetos. 
		 * Ou seja, Efetuar inclusão, recuperação e soma de valores, sem emprego dos genéricos,
		 * não é garantido o uso consistente da lista, exigindo operações de Coerção
		 * (ou Cast/Downcasting) e Autounboxing (ou Automatic Unboxing).*/

		// cria lista simples (sem indicação de parâmetro de tipo)
		List num = new ArrayList();

		num.add(Integer.valueOf(10));
		num.add(Integer.valueOf(20));

		// a operação seguinte não gera erro na compilação → pode levar a problemas de tipo na recuperação e uso posterior
		num.add(new String("qualquer coisa"));

		int tot = 0;

		/* Uso de Coerção (ou Cast/Downcasting) → é a conversão explícita de um tipo de
		 * dado para outro tipo. Em Java, isso é feito usando a sintaxe de parênteses ():*/
		tot += ((Integer) num.get(0)).intValue(); // → o objeto Integer retornado pelo método "get(0)" é convertido
														// explicitamente para o tipo primitivo int, usando o método
														// "intValue()"

		// Autounboxing (ou Automatic Unboxing) → é a conversão automática de um objeto
		// de uma classe de wrapper (como Integer ou Double) para seu tipo primitivo
		// correspondente (int ou double):
		tot += ((Integer) num.get(1));// → o objeto Integer retornado pelo método "get(1)" é automaticamente
											// convertido para o valor int correspondente, devido à atribuição direta do
											// valor do objeto Integer à variável int "tot"

		System.out.println("tot=" + tot);
	}
}
