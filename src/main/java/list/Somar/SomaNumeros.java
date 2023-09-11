package main.java.list.Somar;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Soma> numerosList;
    private int somar;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(new Soma(numero));

    }

    public void calcularSoma() {

        for (Soma n : numerosList) {
            somar += n.getNumero();
        }

        System.out.println("Total: " + somar);
    }

    public void encontrarMaiorNumero() {
        int valorMaximo = numerosList.get(0).getNumero();

        for (Soma n : numerosList) {
            if (valorMaximo < n.getNumero()) {
                valorMaximo = n.getNumero();

            }
        }
        System.out.println("maior número: " + valorMaximo);
    }

    public void encontrarMenorNumero() {
        int valorMinimo = numerosList.get(0).getNumero();

        for (Soma n : numerosList) {
            if (valorMinimo > n.getNumero()) {
                valorMinimo = n.getNumero();
            }
        }
        System.out.println("menor numero: " + valorMinimo);
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros listaDeNumero = new SomaNumeros();
        listaDeNumero.adicionarNumero(7);
        listaDeNumero.adicionarNumero(8);
        listaDeNumero.adicionarNumero(6);
        listaDeNumero.adicionarNumero(18);
        listaDeNumero.calcularSoma();
        listaDeNumero.encontrarMaiorNumero();
        listaDeNumero.encontrarMenorNumero();
        listaDeNumero.exibirNumeros();
    }
}
