package com.arquitectura.examen.primerparcial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_MODULO")
public class SegModulo {

    @Id
    @Column(name = "COD_MODULO", length = 8)
    private String codigoModulo;
    @NotNull
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "ESTADO", length = 100, nullable = false)
    private String estado;
    @NotNull
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private Integer version;

}
