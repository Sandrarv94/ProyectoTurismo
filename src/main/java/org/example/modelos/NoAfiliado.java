package org.example.modelos;

public class NoAfiliado extends Usuario{

    private Integer numeroReserva;

    public NoAfiliado() {
    }

    public NoAfiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer numeroReserva) {
        super(id, documento, nombres, correo, ubicacion);
        this.numeroReserva = numeroReserva;
    }

    @Override
    public Double calcularAnualidad() {
        return this.getCostoAnual()+this.getIVA();
    }

    public Integer getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(Integer numeroReserva) {
        this.numeroReserva = numeroReserva;
    }
}
