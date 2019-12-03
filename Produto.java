package Vendas;

public class Produto {
	private String Nome;
	private double Valor;
	protected int Quantidade;
	
	
	
	public Produto(int quantidade) {
		this.Quantidade = quantidade;
	}
	
	public Produto() {
		super();
	}

	public Produto(String nome, int quantidade) {
		this.Nome = nome;
		this.Quantidade = quantidade;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	public void Vender(int quantidade){
		this.Quantidade -= quantidade;
	}
	
	public void Estoque(int quantidade){
		this.Quantidade += quantidade;
	}
	
	public void QuantidadeEstoque (){
		System.out.println(Quantidade);
	}
	
//	public void Preço(){
//		System.out.println(this.Quantidade *= Valor);
//	}
	
	
}
