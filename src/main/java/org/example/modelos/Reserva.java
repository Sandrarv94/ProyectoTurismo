package org.example.modelos;

import org.example.validaciones.OfertaValidacion;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;

    private Integer numeroPersonasReserva;
    private ReservaValidacion validacion = new ReservaValidacion();

    public Integer getNumeroPersonasReserva() {
        return numeroPersonasReserva;
    }

    public void setNumeroPersonasReserva(Integer numeroPersonasReserva) {
        try{
            this.validacion.validarNumeroPersonas(numeroPersonasReserva);
            this.numeroPersonasReserva = numeroPersonasReserva;
        } catch (Exception error){
            System.out.println(error.getMessage());
        }
    }


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReseva, Integer numeroPersonasReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReseva;
        this.numeroPersonasReserva = numeroPersonasReserva;
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
        return fechaReserva;
    }

    public void setFechaReseva(String fechaReserva) {

        try{
            this.validacion.validarFormatoFecha(fechaReserva);
            this.fechaReserva= LocalDate.parse(fechaReserva,formatter);
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }
}
