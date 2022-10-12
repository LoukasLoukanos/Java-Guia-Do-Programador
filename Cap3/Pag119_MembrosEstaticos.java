public class Pag119_MembrosEstaticos {
	@SuppressWarnings("static-access") //esta notação é necessária para que o compilador não "reclame" do acesso a membros estáticos por meio de variáveis de intância. 

	//O método main(String[]) é declarado estático para que a JVM não necessite realizar a intanciaçõa de objetos, simplificando o procedimento de início das aplicações
	public static void main (String args[ ]) {
		//_____Membros estáticos podem ser usados diretamente por meio de suas classes ou de suas instâncias:_____

		//uso direto do método estático getInstancias() da classe Pag117e118_MembrosEstaticos, sem a necessidade de instanciação (estático pode ser usado sem a necessidade de instanciação) → (MANEIRA PREFERENCIAL)
		System.out.println("Numero de Instancias = " + Pag117e118_MembrosEstaticos.getInstancias()); //getInstancias() retorna no. de instâncias


		//uso do mesmo método estático getInstancias() a partir de uma instância de sua classe (maneira NÃO preferencial)
		Pag117e118_MembrosEstaticos obj = new Pag117e118_MembrosEstaticos(); 
		System.out.println("Numero de Instancias = " + obj.getInstancias()); //getInstancias() retorna no. de instâncias

		// uso de método não estático dobro() da classe Pag117e118_MembrosEstaticos, acessível graças à intanciação de sua classe ao objeto 'obj'↑ (NÃO estático so poderá ser acessível por meio de instâncias da classe)
		int x = 7; // declara e inicializa variável inteira com valor arbitrário
		System.out.println("O dobro de "+ x + " = "+ obj.dobro(x) ); //dobro() calcula o dobro
	}
}
