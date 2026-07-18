package com.jondarsor.wedding_planner_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "bodas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Boda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String novioA;

    @Column(nullable = false)
    private String novioB;

    private LocalDate fechaBoda;

    private Integer numeroInvitados;

    private Double presupuesto;
}