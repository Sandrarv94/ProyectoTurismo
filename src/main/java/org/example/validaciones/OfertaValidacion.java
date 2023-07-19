package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;

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

    //public Boolean validarFecha(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{

    //}
}
