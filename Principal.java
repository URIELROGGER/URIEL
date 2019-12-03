package Vendas;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		BoloDePote bdp = new BoloDePote();
		char opcao;
		
		do{
			System.out.println("Digite:\n 1 = Para Venda\n 2 = Para Estoque");
			opcao = sc.next().charAt(0);
			int opcaoProduto;
			
			switch (opcao){
			case '1': // Venda!!!
				do {
					System.out.println("Selecione o Produto!\n"  + "1 - Bolo De Pote\n" + "2 - Outro");
					opcaoProduto = sc.next().charAt(0);
					switch (opcaoProduto){
					case '1': // Bolo de Pote!!!
						System.out.println("Digite a Quantidade!");
						int Quantidade = sc.nextInt();
						bdp.DimQuantidade(Quantidade);
						System.out.println("Foi add!" + Quantidade + "Estoque atual:");
						bdp.QuantidadeEstoque();
						break;	
				
					case '2':
						
						break;
					
					default:
						System.out.println("Opçao invalida!");
						
					}
				}while(opcaoProduto != 1 || opcaoProduto != 2);
				break;
				
			case '2': //Estoque!!!
				System.out.println("Digite a Quantidade!");
				int Quantidade2 = sc.nextInt();
				//produto = new Produto(Estoque(Quantidade));
				produto.Estoque(Quantidade2);
				produto.QuantidadeEstoque();
				bdp.Preço();
				break;
			default:
				System.out.println("Opçao invalida!");
				break;
			}
		}while(opcao != 1 || opcao != 2);	
	}
}
