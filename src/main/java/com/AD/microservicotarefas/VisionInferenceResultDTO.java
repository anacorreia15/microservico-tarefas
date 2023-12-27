package com.AD.microservicotarefas;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class  VisionInferenceResultDTO {

    private boolean success;
    private String message;
    private String error;
    ArrayList< Object > predictions = new ArrayList < Object > ();
    private float count;
    private String command;
    private String moduleId;
    private String executionProvider;
    private boolean canUseGPU;
    private float inferenceMs;
    private float processMs;
    private float analysisRoundTripMs;

}