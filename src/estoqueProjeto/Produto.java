package estoqueProjeto;

public class Produto {

private String nome;
private double pre�o;
private int quantidade;


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPre�o() {
	return pre�o;
}

public void setPre�o(double pre�o) {
	this.pre�o = pre�o;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public Produto(String nome, double pre�o, int quantidade) {
	this.nome = nome;
	this.pre�o = pre�o;
	this.quantidade = quantidade;
}

public Produto(String nome, double pre�o) {
	this.nome = nome;
	this.pre�o = pre�o;
}


public double valorTotalEmEstoque() {
	return pre�o * quantidade; 
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
			+ String.format("%.2f",pre�o)
			+ ", "
			+ quantidade
			+ " Unidades, Total: R$ " 
			+ String.format("%.2f",valorTotalEmEstoque());
			
	
}

}
