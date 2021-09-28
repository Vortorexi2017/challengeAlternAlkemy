package com.alkemy.alter.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "'icono'")
public class IconoGeograficoEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    @Column
    private Date fechaCreacion;

    @Column
    private Long altura;

    @Column
    private String historia;


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "icon_pais",
            joinColumns = { @JoinColumn(name = "icon_id") },
            inverseJoinColumns = { @JoinColumn(name = "pais_id") }
    )
    private List<PaisEntity> pais;



}
