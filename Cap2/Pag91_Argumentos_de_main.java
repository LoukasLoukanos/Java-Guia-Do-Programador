public class Pag91_Argumentos_de_main {
	public static void main(String args[]) { // ex: input args[Peter Jandl 2020 3.14]
		for (int i=0; i<args.length; i++) { //args.length = 4
			System.out.printf("Argumento #%d: %s ", i, args[i]); 
			// args[i=0] → Peter (caso C) 
			// args[i=1] → Jandl (caso C) 
			// args[i=2] → 2020  (caso B)
			// args[i=3] → 3.14  (caso A)
			try { // verifica se arg[i] é inteiro // caso A
				int n = Integer.parseInt(args[i]);
				System.out.printf("(inteiro=%d)%n", n); // caso A
			} catch (NumberFormatException e1) { // caso B
				// se ocorre exceção não é inteiro
				try { // verifica se arg[i] é real
					double d = Double.parseDouble(args[i]);
					System.out.printf("(real=%f)%n", d); // caso B
				} catch (NumberFormatException e2) { // caso C
					// se ocorre exceção não é real
					System.out.printf("(String=\"%s\")%n", args[i]); // caso C
				}
			}
		}
	}
}
