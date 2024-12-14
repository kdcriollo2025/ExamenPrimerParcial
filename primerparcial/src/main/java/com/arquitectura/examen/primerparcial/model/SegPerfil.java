package com.arquitectura.examen.primerparcial.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_PERFIL")
public class SegPerfil implements Serializable{

    @Id
    @Column(name = "COD_PERFIL", length = 8)
    private String codigoPerfil;
    @NotNull
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    public SegPerfil() {
    }

    public SegPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoPerfil == null) ? 0 : codigoPerfil.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegPerfil other = (SegPerfil) obj;
        if (codigoPerfil == null) {
            if (other.codigoPerfil != null)
                return false;
        } else if (!codigoPerfil.equals(other.codigoPerfil))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfil [codigoPerfil=" + codigoPerfil + ", nombre=" + nombre + ", estado=" + estado + "]";
    }

}
