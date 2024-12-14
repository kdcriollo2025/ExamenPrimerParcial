package com.arquitectura.examen.primerparcial.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_USUARIO")
public class SegUsuario {

    @Id
    @Column(name = "COD_USUARIO", length = 30)
    private String codigoUsuario;

    @NotNull
    @Column(name = "COD_PERFIL", length = 8, nullable = false)
    private String codigoperfil;
    @NotNull
    @Column(name = "MAIL", length = 128, nullable = false)
    private String mail;
    @NotNull
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "TELEFONO", length = 10, nullable = false)
    private String telefono;
    @NotNull
    @Column(name = "CLAVE", length = 64, nullable = false)
    private String clave;
    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @NotNull
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;
    @NotNull
    @Column(name = "FECHA_CAMBIO_CLAVE", nullable = false)
    private LocalDate fechaCambioClave;
    @NotNull
    @Column(name = "NUMERO_INTENTOS_FALLIDOS", length = 3, nullable = false)
    private Integer numeroIntentosFallidos;
    @NotNull
    @Column(name = "FECHA_ULTIMA_SESION", nullable = false)
    private LocalDate fechaUltimaSesion;
    @NotNull
    @Column(name = "SUELDO", precision = 10, scale = 2, nullable = false)
    private BigDecimal sueldo;

    public SegUsuario() {
    }

    public SegUsuario(String codigoUsuario, @NotNull String codigoperfil) {
        this.codigoUsuario = codigoUsuario;
        this.codigoperfil = codigoperfil;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getCodigoperfil() {
        return codigoperfil;
    }

    public void setCodigoperfil(String codigoperfil) {
        this.codigoperfil = codigoperfil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCambioClave() {
        return fechaCambioClave;
    }

    public void setFechaCambioClave(LocalDate fechaCambioClave) {
        this.fechaCambioClave = fechaCambioClave;
    }

    public Integer getNumeroIntentosFallidos() {
        return numeroIntentosFallidos;
    }

    public void setNumeroIntentosFallidos(Integer numeroIntentosFaliidos) {
        this.numeroIntentosFallidos = numeroIntentosFaliidos;
    }

    public LocalDate getFechaUltimaSesion() {
        return fechaUltimaSesion;
    }

    public void setFechaUltimaSesion(LocalDate fechaUltimaSesion) {
        this.fechaUltimaSesion = fechaUltimaSesion;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoUsuario == null) ? 0 : codigoUsuario.hashCode());
        result = prime * result + ((codigoperfil == null) ? 0 : codigoperfil.hashCode());
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
        SegUsuario other = (SegUsuario) obj;
        if (codigoUsuario == null) {
            if (other.codigoUsuario != null)
                return false;
        } else if (!codigoUsuario.equals(other.codigoUsuario))
            return false;
        if (codigoperfil == null) {
            if (other.codigoperfil != null)
                return false;
        } else if (!codigoperfil.equals(other.codigoperfil))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegUsuario [codigoUsuario=" + codigoUsuario + ", codigoperfil=" + codigoperfil + ", mail=" + mail
                + ", nombre=" + nombre + ", telefono=" + telefono + ", clave=" + clave + ", estado=" + estado
                + ", fechaCreacion=" + fechaCreacion + ", fechaCambioClave=" + fechaCambioClave
                + ", numeroIntentosFaliidos=" + numeroIntentosFallidos + ", fechaUltimaSesion=" + fechaUltimaSesion
                + ", sueldo=" + sueldo + "]";
    }

    

   

    

}
