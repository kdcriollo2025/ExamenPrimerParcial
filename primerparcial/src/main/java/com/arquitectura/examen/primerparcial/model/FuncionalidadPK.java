package com.arquitectura.examen.primerparcial.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class FuncionalidadPK implements Serializable {

    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", length = 20, nullable = false)
    private String codigoFuncionalidad;
    @NotNull
    @Column(name = "COD_MODULO", length = 20, nullable = false)
    private String codigoModulo;

    public FuncionalidadPK() {
    }

    public FuncionalidadPK(@NotNull String codigoFuncionalidad, @NotNull String codigoModulo) {
        this.codigoFuncionalidad = codigoFuncionalidad;
        this.codigoModulo = codigoModulo;
    }

    public String getCodigoFuncionalidad() {
        return codigoFuncionalidad;
    }

    public void setCodigoFuncionalidad(String codigoFuncionalidad) {
        this.codigoFuncionalidad = codigoFuncionalidad;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        FuncionalidadPK other = (FuncionalidadPK) obj;
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
        return "FuncionalidadPK [codigoFuncionalidad=" + codigoFuncionalidad + ", codigoModulo=" + codigoModulo + "]";
    }

}
