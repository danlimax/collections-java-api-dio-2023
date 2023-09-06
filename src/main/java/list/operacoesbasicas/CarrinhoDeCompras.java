package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaCompras;
    public double total;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();

    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        listaCompras.add(new Item(nome, preco, quantidade));
    }

    public void deletarItem(String nome) {
        List<Item> removerItem = new ArrayList<>();
        for (Item i : listaCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                removerItem.add(i);
            }

        }
        listaCompras.removeAll(removerItem);

    }

    public void mostrarItens() {
        System.out.println(listaCompras);
    }

    public void calcularTotal() {

        for (Item p : listaCompras) {
            total += p.getPreco() * p.getQuantidade();

        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listaCompras = new CarrinhoDeCompras();

        listaCompras.adicionarItem("Leite em pó", 7.50, 7);
        listaCompras.adicionarItem("Farinha de milho", 2.50, 4);
        listaCompras.adicionarItem("Barra de chocolate ", 5.50, 3);
        listaCompras.adicionarItem("Sabão em pó ", 18.50, 2);
        listaCompras.deletarItem("Leite em pó");
        listaCompras.adicionarItem("Carne", 25.50, 2);
        listaCompras.mostrarItens();
        listaCompras.calcularTotal();
    }

}
