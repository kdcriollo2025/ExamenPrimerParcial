package com.arquitectura.examen.primerparcial.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_REGISTRO_SESION")
public class SegRegistroSesion implements Serializable{

    @Column(name = "SECUENCIA")
    private Integer secuencia;
    @NotNull
    @Column(name = "CodigoUsuario", length = 32 ,nullable = false)
    private String codigoUsuario;
    @NotNull
    @Column(name = "FECHA_CONEXION", nullable = false)
    private LocalDate fechaConexion;
    @NotNull
    @Column(name = "IP_CONEXION", length = 24 ,nullable = false)
    private String ipConexion;
    @NotNull
    @Column(name = "RESULTADO", length = 3 ,nullable = false)
    private String resultado;
    @NotNull
    @Column(name = "CODIGO_ERROR", length = 5 ,nullable = false)
    private String codigoError;

    public SegRegistroSesion() {
    }

    public SegRegistroSesion(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public LocalDate getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(LocalDate fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((secuencia == null) ? 0 : secuencia.hashCode());
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
        SegRegistroSesion other = (SegRegistroSesion) obj;
        if (secuencia == null) {
            if (other.secuencia != null)
                return false;
        } else if (!secuencia.equals(other.secuencia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegRegistroSesion [secuencia=" + secuencia + ", codigoUsuario=" + codigoUsuario + ", fechaConexion="
                + fechaConexion + ", ipConexion=" + ipConexion + ", resultado=" + resultado + ", codigoError="
                + codigoError + "]";
    }

    
}
