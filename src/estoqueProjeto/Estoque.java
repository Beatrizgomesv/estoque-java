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
System.out.print("Pre�o: ");
double pre�o = sc.nextDouble();
Produto produto = new Produto (nome, pre�o);


produto.setNome("Computador");
System.out.println("Produto atualizado: " + produto.getNome());
produto.setPre�o(1200);
System.out.println("Pre�o atualizado: " + produto.getPre�o());
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
