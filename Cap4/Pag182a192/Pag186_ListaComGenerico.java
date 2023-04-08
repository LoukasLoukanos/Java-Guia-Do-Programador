import java.util.*;

public class Pag186_ListaComGenerico { // Classe usa genéricos

	public static void main (String a[]) {
		
		// cria lista com indicação de parâmetro de tipo
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(Integer.valueOf(10)); // adiciona Integer
		num.add(20); // auto-boxing
		
		// operação seguinte geraria erro na compilação
		// num.add(new String("qualquer coisa"));
		
		int tot = 0;
		//tot+=((Integer) num.get(0)).intValue(); → Coerção (ou Cast/Downcasting) não é necessária↓ graças ao modo genérico
		tot += num.get(0).intValue();

		//tot+=((Integer) num.get(1)); → Autounboxing (ou Automatic Unboxing) não é necessária↓ graças ao modo genérico
		tot += num.get(1);
		System.out.println("tot="+ tot);
	}
}
