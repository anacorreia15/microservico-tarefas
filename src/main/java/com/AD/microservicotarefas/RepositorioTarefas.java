package com.AD.microservicotarefas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorioTarefas extends JpaRepository<Tarefa, Integer> {

    public Optional<Tarefa> findById(int id);
    //public Optional<Tarefa> updateById(int id);

}
