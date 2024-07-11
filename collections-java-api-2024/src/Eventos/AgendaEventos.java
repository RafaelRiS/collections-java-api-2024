package Eventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dataSet = eventoMap.keySet();
        Collections<Evento> values = eventoMap.values();*/
        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + entry.getValue() + " acontecera na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JUNE, 14), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2005, Month.JANUARY, 2), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2014, Month.AUGUST, 12), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 5), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 20), "Evento 5", "Atracao 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
