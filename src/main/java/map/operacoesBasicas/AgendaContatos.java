package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("nome1", 45872598);
        agendaContatos.adicionarContato("nome1", 32536635);
        agendaContatos.adicionarContato("nome2", 45856738);
        agendaContatos.adicionarContato("nome4", 45872598);
        agendaContatos.adicionarContato("nome3", 426345638);
        agendaContatos.adicionarContato("nome5", 42872598);
        agendaContatos.adicionarContato("nome6", 456676778);

        agendaContatos.exibirContatos();
    }
}
