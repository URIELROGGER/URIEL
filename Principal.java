package Vendas;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		BoloDePote bdp = new BoloDePote();
		
		System.out.println("Digite:\n 1 = Para Venda\n 2 = Para Estoque");
		char opcao = sc.next().charAt(0);
		
		switch (opcao){
		case '1':
			//System.out.println("Digite a Quantidade!");
			//int Quantidade = sc.nextInt();
			//produto = new Produto(Vender(Quantidade));
			//produto.Vender(Quantidade);
			//System.out.println("Foi add!" + Quantidade + "Estoque atual:");
			//produto.QuantidadeEstoque();
			//bdp.Preço();
			
			System.out.println("Selecione o Produto!\n"  + "1 - Bolo De Pote\n" + "Outro");
			int opcaoProduto = sc.next().charAt(0);
			if(opcaoProduto == '1'){
				System.out.println("Digite a Quantidade!");
				int Quantidade = sc.nextInt();
				bdp.DimQuantidade(Quantidade);
				//produto.Vender(Quantidade);
				System.out.println("Foi add!" + Quantidade + "Estoque atual:");
				bdp.QuantidadeEstoque();
				//bdp.Preço();
			}
			break;
		case '2':
			System.out.println("Digite a Quantidade!");
			int Quantidade2 = sc.nextInt();
			//produto = new Produto(Estoque(Quantidade));
			produto.Estoque(Quantidade2);
			produto.QuantidadeEstoque();
			bdp.Preço();
			break;
		default:
			System.out.println("Opçao invalida!");
		}

	}

}
