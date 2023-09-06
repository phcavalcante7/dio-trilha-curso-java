package collections.list;

import java.util.*;

public class ListaDeTarefas {
    private List<Tarefa> list;

    public ListaDeTarefas() {
        this.list = new ArrayList<Tarefa>();
    }

    public void addTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        list.add(tarefa);
    }

    public void removeTarefa(String descricao) {
        for (Tarefa tarefa : list) {
            if (tarefa.getDescricao().equals(descricao)) {
                list.remove(tarefa);
                break;
            }
        }
    }

    public int quantidadeTarefa() {
        return list.size();
    }

    public List<String> descricoesTarefas() {
        List<String> descricoes = new ArrayList<String>();
        for (Tarefa tarefa : list) {
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }
}
