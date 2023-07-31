package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    public void configuracionInicial(){
        this.usuario= new Usuario();
    }

    @Test
    public void setCorrectoNombres(){
        String nombreValido = "Sandra Milena Rios";
        this.usuario.setNombres(nombreValido);
        Assertions.assertEquals(nombreValido, usuario.getNombres());
    }

    @Test
    public void setIncorrectoNombres(){

        String nombreInvalido="Sandra1234 Rios";
        usuario.setNombres(nombreInvalido);
        Assertions.assertNotEquals(nombreInvalido, usuario.getNombres());
    }
}


