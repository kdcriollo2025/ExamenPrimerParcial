package com.arquitectura.examen.primerparcial.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class PerfilFuncionalidadPK implements Serializable {
    @NotNull
    @Column(name = "COD_PERFIL", length = 8, nullable = false)
    private String codigoPerfil;
    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", length = 4, nullable = false)
    private Integer codigoFuncionalidad;
    @NotNull
    @Column(name = "COD_MODULO", length = 16, nullable = false)
    private Integer codigoModulo;

    public PerfilFuncionalidadPK() {
    }

    public PerfilFuncionalidadPK(@NotNull String codigoPerfil, @NotNull Integer codigoFuncionalidad,
            @NotNull Integer codigoModulo) {
        this.codigoPerfil = codigoPerfil;
        this.codigoFuncionalidad = codigoFuncionalidad;
        this.codigoModulo = codigoModulo;
    }

    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public Integer getCodigoFuncionalidad() {
        return codigoFuncionalidad;
    }

    public void setCodigoFuncionalidad(Integer codigoFuncionalidad) {
        this.codigoFuncionalidad = codigoFuncionalidad;
    }

    public Integer getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(Integer codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoPerfil == null) ? 0 : codigoPerfil.hashCode());
        result = prime * result + ((codigoFuncionalidad == null) ? 0 : codigoFuncionalidad.hashCode());
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
        PerfilFuncionalidadPK other = (PerfilFuncionalidadPK) obj;
        if (codigoPerfil == null) {
            if (other.codigoPerfil != null)
                return false;
        } else if (!codigoPerfil.equals(other.codigoPerfil))
            return false;
        if (codigoFuncionalidad == null) {
            if (other.codigoFuncionalidad != null)
                return false;
        } else if (!codigoFuncionalidad.equals(other.codigoFuncionalidad))
            return false;
        if (codigoModulo == null) {
            if (other.codigoModulo != null)
                return false;
        } else if (!codigoModulo.equals(other.codigoModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PerfilFuncionalidadPK [codigoPerfil=" + codigoPerfil + ", codigoFuncionalidad=" + codigoFuncionalidad
                + ", codigoModulo=" + codigoModulo + "]";
    }

    
}
