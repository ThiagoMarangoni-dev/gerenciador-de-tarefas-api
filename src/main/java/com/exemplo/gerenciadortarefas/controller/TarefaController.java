package com.exemplo.gerenciadortarefas.controller;

import com.exemplo.gerenciadortarefas.model.Tarefa;
import com.exemplo.gerenciadortarefas.service.TarefaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    private final TarefaService servico;

    public TarefaController(TarefaService servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return servico.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscar(@PathVariable Long id) {
        return servico.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return servico.salvar(tarefa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return servico.buscarPorId(id).map(t -> {
            t.setTitulo(tarefa.getTitulo());
            t.setDescricao(tarefa.getDescricao());
            t.setConcluida(tarefa.isConcluida());
            return ResponseEntity.ok(servico.salvar(t));
        }).orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Optional<Tarefa> tarefaOptional = servico.buscarPorId(id);

        if (tarefaOptional.isPresent()) {
            servico.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
