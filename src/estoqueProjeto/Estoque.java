package estoqueProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner (System.in);		
	
	

System.out.println("Insira os dados do produto: ");
System.out.println("Nome: ");
String nome = sc.nextLine();
System.out.print("Preço: ");
double preço = sc.nextDouble();
Produto produto = new Produto (nome, preço);


produto.setNome("Computador");
System.out.println("Produto atualizado: " + produto.getNome());
produto.setPreço(1200);
System.out.println("Preço atualizado: " + produto.getPreço());
System.out.println();
System.out.println("Produto data: " + produto);

System.out.println();
System.out.println("Entre com o numero de produtos para adicionar ao estoque: ");
int quantidade = sc.nextInt();
produto.addProdutos(quantidade);


System.out.println();
System.out.println("Update dos produtos: " + produto);

System.out.println();
System.out.println("Entre com o numero de produtos a ser removido do estoque: ");
quantidade = sc.nextInt();
produto.removeProdutos(quantidade);

System.out.println();
System.out.println("Estoque atualizado: " + produto);

sc.close();









	sc.close();
	}

}
