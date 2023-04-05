import java.util.Arrays;

public class Pag184_ComGenerico {

	public static void main(String a[]) {
		Integer aI[] = { -2, 4, 7, 10, 8, 5, 1, -1 };
		Double aD[] = { -2.6, 4.4, 7.8, 9.5, 8.6, 5.7, 1.3, -1.9 };

		System.out.println("Maior Integer: " + maior(aI) + " de " + Arrays.toString(aI));
		System.out.println("Maior Double : " + maior(aD) + " de " + Arrays.toString(aD));
	}

	// método genérico (resolve o problema de código duplicado por overloads)
	@SuppressWarnings({ "rawtypes", "unchecked" }) // evita que o compilador gere avisos
	public static <T extends Comparable> T maior(T array[]) {
		/* ↑sintaxe:↓
		 * acesso modificador <Parametro_de_dipo> Retorno nome_metodo (parametros) {}
		 * → obs: recomenda-se uma letra maiuscula para Parametro_de_dipo:
		 * E: para elemento
		 * K: para chaves
		 * V: para valores
		 * T e S: para outros tipos
		 */
		T maior = array[0];
		for (T elemento : array)
			if (maior.compareTo(elemento) < 0) {
				maior = elemento;
			}
		return maior;
	}
}
