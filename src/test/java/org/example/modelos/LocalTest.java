package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalTest {
    private Local local;

    @BeforeEach
    public void configuracionInicial(){
        this.local= new Local();
    }
    @Test
    public void setCorrectoNit(){
        String nitValido="9999999999";
        this.local.setNit(nitValido);
        Assertions.assertEquals(nitValido, local.getNit());
    }

    @Test
    public void setIncorrectoNit(){
        String nitInvalido="22222222222222222";
        this.local.setNit(nitInvalido);
        Assertions.assertNotEquals(nitInvalido, local.getNit());
    }

    @Test
    public void setCorrectoNombreEmpresa(){
        String nombreEmpresaValido = "Districampo SAS";
        this.local.setNombre(nombreEmpresaValido);
        Assertions.assertEquals(nombreEmpresaValido, local.getNombre());
    }

    @Test
    public void setIncorrectoNombreEmpresa(){
        String nombreEmpresaInvalido = "Distribuidora de productos agropecuarios para el campo districampo SAS";
        this.local.setNombre(nombreEmpresaInvalido);
        Assertions.assertNotEquals(nombreEmpresaInvalido, local.getNombre());
    }
}