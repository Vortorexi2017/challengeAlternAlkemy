package com.alkemy.alter.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "'pais'")
public class PaisEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String denominacion;

    @Column
    private Long cantidadHabitantes;

    @Column
    private Long superficie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id")
    private ContinenteEntity continente;

    @ManyToMany(mappedBy = "pais", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<IconoGeograficoEntity> icono;


}
