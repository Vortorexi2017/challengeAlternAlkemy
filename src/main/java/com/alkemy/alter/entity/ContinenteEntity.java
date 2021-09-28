package com.alkemy.alter.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "'continente'")
public class ContinenteEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<PaisEntity> paises;
}
