package Exercicio3;

public class Faturamento {
	
	private Integer dia;
	private Double valor;
	
	public Faturamento(Integer dia, Double valor) {
		this.dia = dia;
		this.valor = valor;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
