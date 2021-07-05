package estoqueProjeto;

public class Produto {

private String nome;
private double preço;
private int quantidade;


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreço() {
	return preço;
}

public void setPreço(double preço) {
	this.preço = preço;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public Produto(String nome, double preço, int quantidade) {
	this.nome = nome;
	this.preço = preço;
	this.quantidade = quantidade;
}

public Produto(String nome, double preço) {
	this.nome = nome;
	this.preço = preço;
}


public double valorTotalEmEstoque() {
	return preço * quantidade; 
}

public void addProdutos (int quantidade) {
	this.quantidade += quantidade; 
}

public void removeProdutos (int quantidade) {
	this.quantidade -= quantidade; 
	}


public String toString() {
	return nome
			+ ", R$"
			+ String.format("%.2f",preço)
			+ ", "
			+ quantidade
			+ " Unidades, Total: R$ " 
			+ String.format("%.2f",valorTotalEmEstoque());
			
	
}

}
