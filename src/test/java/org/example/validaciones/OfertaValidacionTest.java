package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    private OfertaValidacion ofertaValidacion;

    @Test
    public void validarTituloCorrecto(){
        String tituloValido="pague uno lleve dos";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarTitulo(tituloValido));
    }

    @Test
    public void validarTituloIncorrecto(){
        String tituloInvalido="pague uno lleve dos test test test test";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarTitulo(tituloInvalido));
    }

    @Test
    public void validarFormatoFechaInicioCorrecto(){
        String formatoFechaInicioValida="12/08/2023";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarFormatoFechaInicio(formatoFechaInicioValida));
    }

    @Test
    public void validarFormatoFechaFInicioIncorrecto(){
        String formatoFechaInicioInvalida="2025/08/12";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarFormatoFechaInicio(formatoFechaInicioInvalida));
    }

    @Test
    public void validarFormatoFechaFinCorrecto(){
        String formatoFechaFinValida="12/08/2023";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarFormatoFechaFin(formatoFechaFinValida));

    }

    @Test
    public void validarFormatoFechaFinIncorrecto(){
        String formatoFechaFinInvalida="2025/08/12";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarFormatoFechaInicio(formatoFechaFinInvalida));
    }

    @Test
    public void validarFechaCorrecta(){
        String fechaInicioCorrecta="16/08/2023";
        String fechaFinCorrecta="18/08/2023";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarFecha(LocalDate.parse(fechaInicioCorrecta), LocalDate.parse(fechaFinCorrecta)));
    }

    @Test
    public void validarFechaIncorrecta(){
        String fechaInicioIncorrecta="18/08/2023";
        String fechaFinIncorrecta="16/08/2023";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> ofertaValidacion.validarFecha(LocalDate.parse(fechaInicioIncorrecta), LocalDate.parse(fechaFinIncorrecta)));

    }

    @Test
    public void validarCostoPersonaCorrecta(){
        Double costoCorrecto= 7500.0;
        Exception exception = Assertions.assertThrows(Exception.class, ()->ofertaValidacion.validarCostoPersona(costoCorrecto));
    }

    @Test
    public void validarCostoPersonaIncorrecta(){
        Double costoIncorrecto = 0.0;
        Exception exception = Assertions.assertThrows(Exception.class, ()->ofertaValidacion.validarCostoPersona(costoIncorrecto));
    }
}