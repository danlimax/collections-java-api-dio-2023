package main.java.map.pesquisa;

public class Produto {
    // atributos
    private String nome;
    private double preço;
    private int quantidade;

    public Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preço=" + preço + ", quantidade=" + quantidade + "]";
    }

}
