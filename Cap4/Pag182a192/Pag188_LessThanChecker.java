public class Pag188_LessThanChecker implements Pag188_Checker<Boolean,Double> {
	@Override
	public Boolean check(Double left, Double right) {
		// comparação dos argumentos
		return left < right;
	}
}
