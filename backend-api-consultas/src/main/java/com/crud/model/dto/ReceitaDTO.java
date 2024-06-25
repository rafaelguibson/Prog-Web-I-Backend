package com.crud.model.dto;
import com.crud.model.Ingrediente;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceitaDTO {
    private String nome;
    private List<Ingrediente> ingredientes;
    private String descricao;
    private String modoPreparo;
    private int tempoPreparo;
    private String rendimento;
    private int categoria;
}