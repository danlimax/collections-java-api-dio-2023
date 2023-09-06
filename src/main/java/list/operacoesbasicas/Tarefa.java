package main.java.list.operacoesbasicas;

public class Tarefa {
    // Atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString(){
        return descricao;
    }
}
