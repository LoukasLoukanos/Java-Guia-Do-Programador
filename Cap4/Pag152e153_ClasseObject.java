public class Pag152e153_ClasseObject {
	public static void main (String args[]) {

		Object a = new Object(); // novo objeto a
		Object b = new Object(); // novo objeto b
		Object c = b; // referência c é o mesmo objeto b
		
		// equals(Object) determina se as referências usadas são relacionadas ao mesmo objeto
		System.out.println("a==b " + a.equals(b) + "\tb==a " + b.equals(a)); // produz: false, false
		System.out.println("c==b " + c.equals(b) + "\tb==c " + b.equals(c)); // produz: true, true	
		System.out.println("a==c " + a.equals(c) + "\tc==a " + c.equals(a)); // produz: false, false	
		
		

		String s = new String("Java");
		String t = "Jandl"; // instanciação implícita de String
		String u = s;

		// equals(String) são comparados os conteúdos de cada objeto
		System.out.println("s==t " + s.equals(t) + "\tt==s " + t.equals(s)); // produz: false, false
		System.out.println("s==u " + s.equals(u) + "\tu==s " + u.equals(s)); // produz: true, true
	}
}
