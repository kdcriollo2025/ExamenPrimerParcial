package com.arquitectura.examen.primerparcial.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_MODULO")
public class SegModulo implements Serializable{

    @Id
    @Column(name = "COD_MODULO", length = 8)
    private String codigoModulo;
    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @NotNull
    @Column(name = "VERSION", length = 4, nullable = false)
    private Integer version;

    public SegModulo() {
    }

    public SegModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoModulo == null) ? 0 : codigoModulo.hashCode());
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
        SegModulo other = (SegModulo) obj;
        if (codigoModulo == null) {
            if (other.codigoModulo != null)
                return false;
        } else if (!codigoModulo.equals(other.codigoModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegModulo [codigoModulo=" + codigoModulo + ", nombre=" + nombre + ", estado=" + estado + ", version="
                + version + "]";
    }

}
