import java.util.*;
//
public class Pag185_ListaSemGenerico  { // Classe não usa genéricos
	@SuppressWarnings({ "rawtypes", "unchecked" }) // evita que o compilador gere avisos
	public static void main(String a[]) {

		// cria lista simples (sem indicação de parâmetro de tipo)
		List num = new ArrayList();
		
		// ao efetuar inclusão, recuperação e soma de valores, sem emprego dos genéricos, não garante o uso consistente da lista, exigindo operações de coerção (downcasting)
		num.add(Integer.valueOf(10));
		num.add(Integer.valueOf(20));
		
		// a operação seguinte não gera erro na compilação
		num.add(new String("qualquer coisa"));
		
		int tot = 0;
		//uso de coerção
		tot += ((Integer)num.get(0)).intValue(); 
		// autounboxing
		tot += ((Integer)num.get(1)); 
		System.out.println("tot="+ tot);
	}
}
