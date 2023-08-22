package modelo;

public class Prato {
	
	private Integer numero;
	private String nome;
	private Double valor;
	
	
	public Prato(Integer numero, String nome, Double valor) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.valor = valor;
		
		
		//return String.format(Prato, this.modelo, this.anoFabricacao, fab);
	}
		
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
