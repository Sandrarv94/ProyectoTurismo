package org.example.modelos;

import java.time.LocalDate;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReseva;

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReseva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReseva = fechaReseva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReseva() {
        return fechaReseva;
    }

    public void setFechaReseva(LocalDate fechaReseva) {
        this.fechaReseva = fechaReseva;
    }
}
