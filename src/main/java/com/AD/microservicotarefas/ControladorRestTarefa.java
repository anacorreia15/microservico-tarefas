package com.AD.microservicotarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControladorRestTarefa {
    @Autowired
    RepositorioTarefas repositorioTarefas;

    @PostMapping("/iniciartarefa")
    public Tarefa iniciarTarefa(@RequestBody Tarefa tarefa){
        return repositorioTarefas.save(tarefa);
    }

    @PutMapping("/updatetarefa")
    public Tarefa updateTarefa(@RequestBody Tarefa tarefa){
        return repositorioTarefas.save(tarefa);
    }

    @PostMapping("/findtarefa")
    public Optional<Tarefa> findTarefa(@RequestBody Integer id){
        return repositorioTarefas.findById(id);
    }

    @PostMapping("/findtarefahashusername")
    public Optional<Tarefa> findTarefaHashUsername(@RequestBody String hash, @RequestParam String username){
        return repositorioTarefas.findByHashAndUsername(hash, username);
    }

    @PostMapping("/findtarefahash")
    public Optional<Tarefa> findTarefaHash(@RequestBody String hash){
        return repositorioTarefas.findByHash(hash);
    }

    @PostMapping("/counttarefahash")
    public Integer countTarefaHash(@RequestBody String hash){
        return repositorioTarefas.countTarefaByHash(hash);
    }

    @PostMapping("/listartarefas")
    public List<Tarefa> listarTarefas(@RequestBody String username){return repositorioTarefas.findTarefasByUsername(username);}

    @GetMapping("/resultados/{id}")
    public Optional<Tarefa> visualizarResultados(@PathVariable Integer id){return repositorioTarefas.findById(id);}
}
