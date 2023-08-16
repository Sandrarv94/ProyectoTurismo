package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    private ReservaValidacion reservaValidacion;

    @Test
    public void validarFormatoFechaCorrecto(){
        String formatoFechaCorrecto="12/08/2023";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> reservaValidacion.validarFormatoFecha(formatoFechaCorrecto));
    }

    @Test
    public void validarFormatoFechaIncorrecto(){
        String formatoFechaIncorrecto = "2023/12/08";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> reservaValidacion.validarFormatoFecha(formatoFechaIncorrecto));
    }

    @Test
    public void validarNumeroPersonasCorrecto(){
        Integer numeroPersonasValido=4;
        Exception exception = Assertions.assertThrows(Exception.class, ()-> reservaValidacion.validarNumeroPersonas(numeroPersonasValido));
    }

    @Test
    public void validarNumeroPersonasIncorrecto(){
        Integer numeroPersonasInvalido=6;
        Exception exception = Assertions.assertThrows(Exception.class, ()-> reservaValidacion.validarNumeroPersonas(numeroPersonasInvalido));
    }
}