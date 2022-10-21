public class Pag123_FinalizadoresEColetaDeLixo {
	private static int instancias=0;
	private int id;
	protected long[] data;
	public Pag123_FinalizadoresEColetaDeLixo  () {
		id = instancias++;
		data = new long[1_000_000];
		System.out.println("Objeto.Objeto() [id="+id+"]");
	}
	
	public static int getInstancias() {
		return instancias;
	}
	
	public int getId () { 
		return id; 
	}
	
	@Override
	protected void finalize () {
		instancias--;
		System.out.println("Objeto.finalize() [id="+id+"]");
	}
}
