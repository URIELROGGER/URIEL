package Vendas;

public class BoloDePote extends Produto{
	final double Valor = 6.00;
	private int Quantidade = 0;

//	public double getValor() {
//		return Valor;
//	}
	public void AddQuantidade(int Quantidade){
		this.Quantidade += Quantidade;
	}
	
	public void DimQuantidade(int Quantidade){
		this.Quantidade -= Quantidade;
	}
	
	public void QuantidadeEstoque(){
		System.out.println("Estoque = " + Quantidade);
	}
	
	public void Preço(){
		System.out.println(Quantidade *= Valor);
	}
}
