package org.example.validaciones;

import org.example.modelos.Local;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {
    private LocalValidacion localValidacion;

    @Test
    public void validarNitCorrecto(){
        String nitValido="9999999999";
        Exception exception =Assertions.assertThrows(Exception.class, ()-> localValidacion.validarNit(nitValido));
    }

    @Test
    public void validarNitIncorrecto(){
        String nitInvalido="999999999999999";
        Exception exception =Assertions.assertThrows(Exception.class, ()-> localValidacion.validarNit(nitInvalido));
    }

    @Test
    public void validarNombreCorrecto(){
        String nombreValido = "Districampo SAS";
        Exception excepcion = Assertions.assertThrows(Exception.class, ()-> localValidacion.validarNombre(nombreValido));
    }

    @Test
    public void validarNombreIncorrecto(){
        String nombreInvalido = "Distribuidora de productos agropecuarios para el campo districampo SAS";
        Exception excepcion = Assertions.assertThrows(Exception.class, ()-> localValidacion.validarNombre(nombreInvalido));
    }

}