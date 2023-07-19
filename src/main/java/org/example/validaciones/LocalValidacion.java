package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion {
    protected Util util = new Util();

    public LocalValidacion() {
    }

    public Boolean validarNit(String nit) throws Exception{
        String  expresionRegular = "^[0-9]+$";
        if(!util.buscarCoincidencia(expresionRegular, nit)){
            throw new Exception(Mensajes.NIT_SOLO_NUMEROS.getMensaje());
        } else if(nit.length()<10){
            throw new Exception(Mensajes.NIT_CANTIDAD.getMensaje());
        } else if(nit.length()>10){
            throw new Exception(Mensajes.NIT_CANTIDAD.getMensaje());
        } else{
            return true;
        }
    }

    public Boolean validarNombre(String nombre)throws Exception{
        String  expresionRegular = "^[a-zA-Z ñ]+$";
        if(!util.buscarCoincidencia(expresionRegular, nombre)){
            throw new Exception(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje());
        } else if(nombre.length()>30){
            throw new Exception(Mensajes.NOMBRE_MUY_LARGO.getMensaje());
        } else{
            return true;
        }

    }


}
