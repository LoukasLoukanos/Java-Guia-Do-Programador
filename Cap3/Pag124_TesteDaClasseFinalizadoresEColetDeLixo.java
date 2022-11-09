public class Pag124_TesteDaClasseFinalizadoresEColetDeLixo {
	public static void main (String a[]) {
		System.out.println("Instancias = "+ Pag123_FinalizadoresEColetaDeLixo.getInstancias());
		for (int i=0; i<10; i++) {
			Pag123_FinalizadoresEColetaDeLixo o = new Pag123_FinalizadoresEColetaDeLixo ();
			System.out.println(o);
		}
		System.out.println("Instancias = "+ Pag123_FinalizadoresEColetaDeLixo.getInstancias());
		System.gc(); // aciona garbage collector
		System.out.println("Instancias = "+ Pag123_FinalizadoresEColetaDeLixo.getInstancias());
	}
}
