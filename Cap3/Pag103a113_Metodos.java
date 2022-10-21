/*__________MÉTODOS__________
 * É comum que os métodos sejam referidos conforme o efeito que produzem: 
 * • métodos de alteração (ou mutação): modificam o valor dos campos de um objeto, alterando seu estado;
 * • métodos de observação: apenas retornam um valor contido num campo do objeto, ou o resultado de algum cálculo, sem que o estado do objeto seja alterado;
 * • métodos de produção: são capazes de retornar um outro objeto, do mesmo tipo, contendo uma cópia ou uma parte dos dados que contém;
 * • métodos de criação (usualmente criados na forma de construtores): permitem a criação de novos objetos;
 * • métodos de destruição: são responsáveis pela remoção de um objeto da memória. */

 public class Pag103a113_Metodos {
	//___SIMPLES_____________________________________________
	public int hor, min, seg;
	public void setHorar(int h, int m, int s) {
		hor = h;
		min = m;
		seg = s;
	}
	public String toString() {
		return hor + ":" + min + ":" + seg;
	}

    //___MELHORADA___________________________________________
	// três atributos int de acesso restrito
	private int hora, minu, segu; 
	// métodos de acesso (leitura) dos campos restritos
	public int getHoras () {
		return hora;
	}
	public int getMinutos () {
		return minu;
	}
	public int getSegundos () { 
		return segu;
	}
	// métodos de alteração (escrita) dos campos restritos
	public void setHoras (int h) {
		if(h>=0 && h<24) hor = h;
	}
	public void setMinutos (int m) {
		if(m>=0 && m<60) min = m;
	}
	public void setSegundos (int s) {
		if(s>=0 && s<60) seg = s;
	}
	public void setHorario (int h, int m, int s) {
		setHoras(h);
		setMinutos(m);
		setSegundos(s);
	}
	// representação textual dos objetos Hora
	public String toString_ () {
		return String.format("%02d:%02d:%02d",
			getHoras(), getMinutos(), getSegundos());
	}
	
 }