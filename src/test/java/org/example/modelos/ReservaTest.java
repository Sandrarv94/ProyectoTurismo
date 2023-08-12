package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    private Reserva reserva;

    @BeforeEach
    public void configuracionInicial(){this.reserva = new Reserva();}

    @Test
    public void setCorrectoNumeroPersonas(){
        Integer numeroPersonasValido =2;
        this.reserva.setNumeroPersonasReserva(numeroPersonasValido);
        Assertions.assertEquals(numeroPersonasValido, reserva.getNumeroPersonasReserva());
    }

    @Test
    public void setIncorrectoNumeroPersonas(){
        Integer numeroPersonasInvalido=6;
        this.reserva.setNumeroPersonasReserva(numeroPersonasInvalido);
        Assertions.assertNotEquals(numeroPersonasInvalido, reserva.getNumeroPersonasReserva());
    }

}