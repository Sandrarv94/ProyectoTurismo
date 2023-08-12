package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfertaTest {
    private Oferta oferta;

    @BeforeEach
    public void configuracionInicial(){
        this.oferta= new Oferta();
    }

    @Test
    public void setCorrectoTitulo(){
        String tituloValido="pague uno lleve dos";
        this.oferta.setTitulo(tituloValido);
        Assertions.assertEquals(tituloValido, oferta.getTitulo());
    }

    @Test
    public void setIncorrectoTitulo(){
        String tituloInvalido="pague uno lleve dos test test test test";
        this.oferta.setTitulo(tituloInvalido);
        Assertions.assertNotEquals(tituloInvalido, oferta.getTitulo());
    }

    @Test
    public void setCorrectoFechaInicio(){
        String fechaInicioValida="12/08/2023";
        this.oferta.setFechaInicio(fechaInicioValida);
        Assertions.assertEquals(fechaInicioValida, oferta.getFechaInicio());
    }

    @Test
    public void setIncorrectoFechaInicio(){
        String fechaInicioInvalida="12/08/2023";
        this.oferta.setFechaInicio(fechaInicioInvalida);
        Assertions.assertNotEquals(fechaInicioInvalida, oferta.getFechaInicio());
    }

    @Test
    public void setCorrectoCostoPersona(){
        Double costoPersonaValido = 2500.0;
        this.oferta.setCostoPersona(costoPersonaValido);
        Assertions.assertEquals(costoPersonaValido, oferta.getCostoPersona());

    }

    @Test
    public void setIncorrectoCostoPersona(){
        Double costoPersonaInvalido = -2500.0;
        this.oferta.setCostoPersona(costoPersonaInvalido);
        Assertions.assertNotEquals(costoPersonaInvalido, oferta.getCostoPersona());

    }
}