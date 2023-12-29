package com.AD.microservicotarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ControladorRestTarefa {
    @Autowired
    RepositorioTarefas repositorioTarefas;

    @PostMapping("/iniciartarefa")
    public Tarefa iniciarTarefa(@RequestBody Tarefa tarefa){
        return repositorioTarefas.save(tarefa);
    }

    @PostMapping("/updatetarefa")
    public Tarefa updateTarefa(@RequestBody Tarefa tarefa){
        return repositorioTarefas.save(tarefa);
    }

    @PostMapping("/findtarefa")
    public Optional<Tarefa> findTarefa(@RequestBody Integer id){
        return repositorioTarefas.findById(id);
    }
}
