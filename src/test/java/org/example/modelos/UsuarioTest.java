package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    public void configuracionInicial(){
        this.usuario= new Usuario() {
            @Override
            public Double calcularAnualidad() {
                return null;
            }
        };
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

    @Test
    public void setCorrectoCorreo(){
        String correoValido = "sandra@gmail.com";
        this.usuario.setCorreo(correoValido);
        Assertions.assertEquals(correoValido, usuario.getCorreo());
    }

    @Test
    public void setIncorrectoCorreo(){

        String correoInvalido="sandrariosv.com";
        usuario.setCorreo(correoInvalido);
        Assertions.assertNotEquals(correoInvalido, usuario.getCorreo());
    }

    @Test
    public void setCorrectoUbicacion(){
        Integer ubicacionValida=4;
        usuario.setUbicacion(ubicacionValida);
        Assertions.assertEquals(ubicacionValida,usuario.getUbicacion());
    }

    @Test
    public void setIncorrectoUbicacion(){
        Integer ubicacionInvalida=5;
        usuario.setUbicacion(ubicacionInvalida);
        Assertions.assertNotEquals(ubicacionInvalida,usuario.getUbicacion());
    }
}


