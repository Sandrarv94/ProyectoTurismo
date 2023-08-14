package org.example.modelos;

import org.example.interfaces.Deduccion;
import org.example.interfaces.Reporte;
import org.example.utilidades.MetodosPago;

public class Afiliado extends Usuario implements Deduccion, Reporte {

    private Integer valorMembresia;
    private MetodosPago metodoPago;
    private String documentoReferido;

    public Afiliado() {
    }

    public Afiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorMembresia, MetodosPago metodoPago, String documentoReferido) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorMembresia = valorMembresia;
        this.metodoPago = metodoPago;
        this.documentoReferido = documentoReferido;
    }

    @Override
    public Double calcularAnualidad() {
        return this.getCostoAnual()-(this.getValorMembresia()*0.2);
    }

    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public MetodosPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodosPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }

    public Double aplicarIvaMembresia(){
        return this.valorMembresia+this.getIVA()*this.valorMembresia;
    }

    @Override
    public void calcularDeduccionAnualidad() {

    }

    @Override
    public Double calcularDescuentoMensualidad() {
        return null;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void modificarReporte(Integer id) {

    }
}
