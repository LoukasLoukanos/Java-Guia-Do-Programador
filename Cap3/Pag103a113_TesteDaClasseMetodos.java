import java.util.Scanner;

public class Pag103a113_TesteDaClasseMetodos {
	public static void main (String a[]) {
        //EXEMPLO DE INSTÂNCIA DE OBJETOS DA CLASSE:_____________________
	    // declara e instancia objeto tipo Pag103a113_Metodos
	    Pag103a113_Metodos obj_horario = new Pag103a113_Metodos (); 
    
	    // ajusta objeto com valores válidos
	    obj_horario.setHorario(15, 30, 10);
	    
	    // exibe hora
	    System.out.println("Hora: "+ obj_horario.toString()); 
    
	    // prepara console
	    Scanner sc = new Scanner(System.in); 
	    // lê valores de hora, minuto e segundo em variáveis auxiliares
	    System.out.print("Horas ? ");
	    int h = sc.nextInt();
	    System.out.print("Minutos ? ");	
	    int m = sc.nextInt();
	    System.out.print("Segundos ? ");
	    int s = sc.nextInt();
	    sc.close();
    
	    // ajusta objeto com valores dados
	    obj_horario.setHorario(h, m, s);
    
	    // exibe hora
	    System.out.println("Hora: "+ obj_horario.toString());
	    if (obj_horario.getHoras()>=18 || obj_horario.getHoras()<6) {
	    	System.out.println("E noite!");
	    } else {
	    	System.out.println("E dia!");
        }
	}
}
