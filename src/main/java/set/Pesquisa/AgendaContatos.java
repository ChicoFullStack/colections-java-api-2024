package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();
        agendaContatos.adicionarContato("CHico", 123456);
        agendaContatos.adicionarContato("CHico 2", 0);
        agendaContatos.adicionarContato("CHico Assis", 888888);
        agendaContatos.adicionarContato("CHico Oliveira", 111111);
        agendaContatos.adicionarContato("Francisco de Assis", 123456);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisaPorNome("CHico"));

        //System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("CHico", 88888888));
        //agendaContatos.exibirContato();
    }
}
