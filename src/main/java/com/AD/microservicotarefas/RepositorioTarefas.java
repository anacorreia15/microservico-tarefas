package com.AD.microservicotarefas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositorioTarefas extends JpaRepository<Tarefa, Integer> {

    public Optional<Tarefa> findById(int id);
    public Optional<Tarefa> findByHashAndUsername(String hash, String username);

    public Optional<Tarefa> findByHash(String hash);
    public  Integer countTarefaByHash(String hash);

    public List<Tarefa> findTarefasByUsername(String username);

    public List<Tarefa> findAllBy();

}
