package com.exemplo.gerenciadortarefas.service;

import com.exemplo.gerenciadortarefas.model.Tarefa;
import com.exemplo.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repositorio;

    public TarefaService(TarefaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public List<Tarefa> listarTodas() {
        return repositorio.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repositorio.save(tarefa);
    }

    public void deletar(Long id) {
        repositorio.deleteById(id);
    }
}
