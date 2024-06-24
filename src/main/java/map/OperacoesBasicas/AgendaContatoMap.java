package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatoMap {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatoMap() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatoMap agendaContatos = new AgendaContatoMap();

        agendaContatos.adicionarContato("Chico", 1234);
        agendaContatos.adicionarContato("Chico", 3333);
        agendaContatos.adicionarContato("Chico assis", 2222);
        agendaContatos.adicionarContato("Chico oliveira", 4444);
        agendaContatos.adicionarContato("Maria Silva", 5555);
        agendaContatos.adicionarContato("Chico", 6666);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Chico oliveira");

        agendaContatos.exibirContatos();

    }

}
