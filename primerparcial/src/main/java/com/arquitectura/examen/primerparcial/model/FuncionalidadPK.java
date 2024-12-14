package com.arquitectura.examen.primerparcial.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class FuncionalidadPK implements Serializable {

    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", length = 20, nullable = false)
    private String codeProductType;
    @NotNull
    @Column(name = "COD_MODULO", length = 20, nullable = false)
    private String codeModulo;

    public FuncionalidadPK() {
    }

    public FuncionalidadPK(@NotNull String codeProductType, @NotNull String codeModulo) {
        this.codeProductType = codeProductType;
        this.codeModulo = codeModulo;
    }

    public String getCodeProductType() {
        return codeProductType;
    }

    public void setCodeProductType(String codeProductType) {
        this.codeProductType = codeProductType;
    }

    public String getCodeModulo() {
        return codeModulo;
    }

    public void setCodeModulo(String codeModulo) {
        this.codeModulo = codeModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeProductType == null) ? 0 : codeProductType.hashCode());
        result = prime * result + ((codeModulo == null) ? 0 : codeModulo.hashCode());
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
        if (codeProductType == null) {
            if (other.codeProductType != null)
                return false;
        } else if (!codeProductType.equals(other.codeProductType))
            return false;
        if (codeModulo == null) {
            if (other.codeModulo != null)
                return false;
        } else if (!codeModulo.equals(other.codeModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FuncionalidadPK [codeProductType=" + codeProductType + ", codeModulo=" + codeModulo + "]";
    }

    
}
