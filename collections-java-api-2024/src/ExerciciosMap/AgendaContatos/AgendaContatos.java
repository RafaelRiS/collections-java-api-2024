package ExerciciosMap.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }
        return agendaContatoMap.size();
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rafael", 40028922);
        agendaContatos.adicionarContato("Rafa", 8922);
        agendaContatos.adicionarContato("Rafael Ribeiro", 4232);
        agendaContatos.adicionarContato("Rafael R", 12322);
        agendaContatos.adicionarContato("Miguel", 91223);
        agendaContatos.adicionarContato("Leandro Pereira", 443922);
        agendaContatos.adicionarContato("Leandro Pereira", 4439);
        agendaContatos.adicionarContato("Leandro Pereira", 922);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Rafa");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Rafael"));
    }
}
