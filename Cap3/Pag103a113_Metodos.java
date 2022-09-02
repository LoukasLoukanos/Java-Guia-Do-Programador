/*__________MÉTODOS__________
 * É comum que os métodos sejam referidos conforme o efeito que produzem: 
 * • métodos de alteração (ou mutação): modificam o valor dos campos de um objeto, alterando seu estado;
 * • métodos de observação: apenas retornam um valor contido num campo do objeto, ou o resultado de algum cálculo, sem que o estado do objeto seja alterado;
 * • métodos de produção: são capazes de retornar um outro objeto, do mesmo tipo, contendo uma cópia ou uma parte dos dados que contém;
 * • métodos de criação (usualmente criados na forma de construtores): permitem a criação de novos objetos;
 * • métodos de destruição: são responsáveis pela remoção de um objeto da memória. */

 public class Pag103a113_Metodos {
	public int hor, min, seg;
	public void setHorario(int h, int m, int s) {
		hor = h;
		min = m;
		seg = s;
	}
	public String toString() {
		return hor + ":" + min + ":" + seg;
	}
}
