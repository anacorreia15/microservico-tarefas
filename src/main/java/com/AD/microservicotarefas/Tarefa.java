package com.AD.microservicotarefas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String estado;
    private String nomeImagem;
    private String hash;

    @Embedded
    @AttributeOverride(name = "predictions", column = @Column(length = 5000))
    private VisionInferenceResultDTO visionInferenceResultDTO; //informacoes sobre a detecao

    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    public Tarefa(String estado, String nomeImagem, LocalDateTime dataInicio, String hash, String username) {
        this.estado = estado;
        this.nomeImagem = nomeImagem;
        this.dataInicio = dataInicio;
        this.hash = hash;
        this.username = username;
    }
}
