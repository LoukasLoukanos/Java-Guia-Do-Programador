//__________________________________________________________________________________________________
//__________VER código atualizado com a versão 7 do Java: Pag132_TratamentoDeExcecoes.java__________
public class Pag131_RelancamentoDeExcecoes_ABSOLETO { //SIMPLIFICADO
	@SuppressWarnings("deprecation")
	public static Object create (String className)
		throws Exception {
		try {
			Class<?> classe = Class.forName(className);
			return classe.newInstance();
		} catch (ClassNotFoundException e) {
			throw e; // rethrow
		} catch (InstantiationException e) {
			// tratamento local
			System.out.println(e + "\nObjeto nao criado");
			return null;
		} catch (IllegalAccessException e) {
			throw e; // rethrow
		}
	}
	public static void main(String... a) {
		try {
			Object o = create(a[0]);
			if (o != null) {
				System.out.println("Objeto: " + o.getClass());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "\nFalta argumento com nome da classe!");
		// catch genérico
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
