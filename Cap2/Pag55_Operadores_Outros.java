public class Pag55_Operadores_Outros {
	public static void main(String args[]) {
		// Operadores relacionias:
		int a = 15, b = 12;
		System.out.println("Valores: a = " + a + ", b = " + b);
		System.out.println("a == b -> " + (a == b)); // false
		System.out.println("a != b -> " + (a != b)); // true
		System.out.println("a < b -> " + (a < b)); // false
		System.out.println("a > b -> " + (a > b)); // true
		System.out.println("a <= b -> " + (a <= b)); // false
		System.out.println("a >= b -> " + (a >= b)); // true

		double k = 1.5, m = -1.9;
		boolean res0 = k == m; // "false, pois k é diferente de m" → res0 será false
		System.out.println("res0" + (res0)); // false
		boolean res1 = k >= m; // true
		boolean res2 = k < m; // false
		boolean res3 = k != m; // true

		// Operadores lógicos:
	}
}
