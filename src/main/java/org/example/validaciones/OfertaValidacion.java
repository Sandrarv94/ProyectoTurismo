package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class OfertaValidacion {
    protected Util util = new Util();

    public Boolean validarTitulo(String titulo)throws Exception{
        String  expresionRegular = "^[a-zA-Z ñ]+$";
        if(!util.buscarCoincidencia(expresionRegular, titulo)){
            throw new Exception(Mensajes.TITULO_SOLO_LETRAS.getMensaje());
        } else if(titulo.length()>20){
            throw new Exception(Mensajes.TITULO_CANTIDAD_LETRAS.getMensaje());
        } else{
            return true;
        }

    }
    public Boolean validarFormatoFechaInicio(String fechaInicio) throws Exception{
        String  expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
        if(!util.buscarCoincidencia(expresionRegular, fechaInicio)){
            throw new Exception(Mensajes.ERROR_FORMATO_FECHA.getMensaje());
        } else{
            return true;
        }
    }

    public Boolean validarFormatoFechaFin(String fechaFin) throws Exception{
        String  expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
        if(!util.buscarCoincidencia(expresionRegular, fechaFin)){
            throw new Exception(Mensajes.ERROR_FORMATO_FECHA.getMensaje());
        } else{
            return true;
        }
    }
    public Boolean validarFecha(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if (fechaInicio.isAfter(fechaFin)) {
            throw new Exception(Mensajes.ERROR_FECHA.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarCostoPersona(Double costoPersona) throws Exception{
        if(costoPersona<0){
            throw new Exception(Mensajes.ERROR_COSTO.getMensaje());
        } else{
            return true;
        }
    }


}
