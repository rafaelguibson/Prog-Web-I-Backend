package com.crud.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "INGREDIENTE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_ingrediente", nullable = false)
    private String nomeIngrediente;

    @Column(nullable = false)
    private double quantidade;

    @Column(name = "unidade_medida", nullable = false)
    private String unidadeMedida;

    // Many-to-one relationship with Receita entity
    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonManagedReference
    @JoinColumn(name = "receita_id", nullable = false)
    private Receita receita;
}