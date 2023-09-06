package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();

    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        listaCompras.add(new Item(nome, preco, quantidade));
    }

    public void mostrarItens() {
        System.out.println(listaCompras);
    }

    public void calcularTotal(Double preco, Integer quantidade) {

    }

    public static void main(String[] args) {
        CarrinhoDeCompras listaCompras = new CarrinhoDeCompras();

        listaCompras.adicionarItem("Leite em pó", 7.50, 7);
        listaCompras.adicionarItem("Farinha de milho", 2.50, 4);
        listaCompras.adicionarItem("Barra de chocolate ", 5.50, 3);
        listaCompras.adicionarItem("Sabão em pó ", 18.50, 2);
        listaCompras.mostrarItens();
        listaCompras.calcularTotal(null, null);
    }

}
