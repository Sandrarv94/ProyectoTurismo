package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class ReservaValidacion {
    protected Util util = new Util();

    public Boolean validarFormatoFecha(String fechaReserva) throws Exception{
        String  expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
        if(!util.buscarCoincidencia(expresionRegular, fechaReserva)){
            throw new Exception(Mensajes.ERROR_FORMATO_FECHA.getMensaje());
        } else{
            return true;
        }
    }

    public Boolean validarNumeroPersonas(Integer numeroPersonasReserva) throws Exception{

        if(numeroPersonasReserva>4){
            throw new Exception(Mensajes.CANTIDAD_PERSONAS.getMensaje());
        } else{
            return  true;
        }
    }
}
