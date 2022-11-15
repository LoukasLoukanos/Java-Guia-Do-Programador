//_______________________________________________________________________________________________________________
//__________Código atualizado FinalRethrow com a versão 7 do Java (código repetitivo simplificado):______________
public class Pag132_RelancamentoDeExcecoes_ATUALIZADO {
	//VER Rethrow ABSOLETOS: Pag130_RelancamentoDeExcecoes_ABSOLETO.java e Pag131_RelancamentoDeExcecoes_ABSOLETO.java
	@SuppressWarnings("deprecation")
	public static Object create (String className)
		throws Exception {
		try {
			Class<?> classe = Class.forName(className);
			return classe.newInstance();
		} catch (InstantiationException e) {
			// tratamento local
			System.out.println(e + "\nObjeto nao criado");
			return null;
		} catch (final Exception e) {
			throw e; // final rethrow
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
		// multi-catch
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
