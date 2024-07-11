package ExemploSet.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = contatoSet;
    }

    public void adicionarContato(String nome, int numero) {
        if (contatoSet == null) {
            contatoSet = new HashSet<>();
        }
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public  Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {

        Set<Contato> contatos =new HashSet<>();

        AgendaContatos agendaContatos = new AgendaContatos(contatos);

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Rafael", 40028922);
        agendaContatos.adicionarContato("Rafael", 4002);
        agendaContatos.adicionarContato("Rafael Ribeiro", 0);
        agendaContatos.adicionarContato("Rafael R", 40234);
        agendaContatos.adicionarContato("Leandro Pereira", 222);

        System.out.println(agendaContatos.pesquisarPorNome("Rafael"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarContato("Rafael Ribeiro", 2000));

        agendaContatos.exibirContato();

    }
}
