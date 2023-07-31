package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    private UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void configuracionInicial(){
        this.usuarioValidacion = new UsuarioValidacion();

    }

    @Test
    public void validarNombreUsuarioCorrecto(){
        String nombreValido = "Sandra Milena Rios Velez";//preparando
        Assertions.assertDoesNotThrow(()-> usuarioValidacion.validarNombre(nombreValido));
    }

    @Test
    public void validarNombreUsuarioIncorrecto(){
        String nombreInvalido = "Sandra 1234 Rios";
        Exception exception = Assertions.assertThrows(Exception.class, ()->usuarioValidacion.validarNombre(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(), exception.getMessage());
    }

}