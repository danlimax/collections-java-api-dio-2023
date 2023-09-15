package main.java.list.somar;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {
    private List<Integer> numberList;
    private int total = 0;

    public SomarNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void adicionarNumero(int number) {
        numberList.add(number);
    }

    public Integer somarLista() {

        for (Integer n : numberList) {
            total += n;
        }
        return total;

    }

    public void exibirNumeros() {
        System.out.println(numberList);
    }

    public static void main(String[] args) {
        SomarNumeros listNumeros = new SomarNumeros();
        listNumeros.adicionarNumero(8);
        listNumeros.adicionarNumero(5);
        listNumeros.adicionarNumero(6);
        listNumeros.adicionarNumero(4);
        System.out.println("Total: " + listNumeros.somarLista());
        listNumeros.exibirNumeros();
    }
}
