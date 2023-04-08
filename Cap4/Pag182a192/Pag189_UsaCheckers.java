public class Pag189_UsaCheckers {
	public static void main(String[] args) {
		// Uso de implementação específica da Interface Pag188_Checker pela Classe Pag188_LessThanChecker:
		Pag188_Checker<Boolean, Double> checker1 = new Pag188_LessThanChecker();
		System.out.println("10.0 < 4.5 = " + checker1.check(10.0, 4.5));
		
		// Uso de implementação específica da Interface Pag188_Checker pela Classe Anônima (definida e 
		// instanciada ao mesmo tempo, sem ser declarada explicitamente como Pag188_LessThanChecker):
		Pag188_Checker<Double, Integer> checker2 = new Pag188_Checker <Double, Integer>() {
				@Override
				public Double check(Integer left, Integer right) {
					return (left-right)/(double)left;
			}
		};
		
		int x = 8, y = 4;
		System.out.println(x + " ? " + y + " = " + 
			checker2.check(x, y));
	}
}
