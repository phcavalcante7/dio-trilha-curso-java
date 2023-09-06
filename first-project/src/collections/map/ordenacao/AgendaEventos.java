package collections.map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void addEvento(LocalDate data, String evento, String atracao) {
        this.eventos.put(data, new Evento(evento, atracao));
    }

    public void printarEventos() {
        Map <LocalDate,Evento> eventosTree = new TreeMap<>(eventos);
        System.out.println(eventosTree);
    }

    public void obterProximoEvento() {
        Map <LocalDate,Evento> ordered = new TreeMap<>(eventos);
        LocalDate today = LocalDate.now();

        for(var entry : ordered.entrySet()) {
            if(entry.getKey().isAfter(today) || entry.getKey().isEqual(today)) {
                System.out.println("Próximo evento: " + entry);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.addEvento(LocalDate.of(2026, 03, 1), "ER Event", "PH");
        agenda.addEvento(LocalDate.now(), "Haha", "BG3");
        agenda.addEvento(LocalDate.of(2023, 9, 7), "EM Event", "PH2");

        agenda.printarEventos();
        agenda.obterProximoEvento();
    }
}
