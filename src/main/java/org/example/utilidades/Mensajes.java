package org.example.utilidades;

public enum Mensajes {

    NOMBRE_SOLO_LETRAS("El nombre de usuario solo puede tener letras o espacios"),
    NOMBRE_MUY_CORTO("Señor usuario revisa la cantidad de caracteres, es muy pequeña"),
    NOMBRE_MUY_LARGO("Señor usuario, el nombre de la empresa no debe sobrepasar los 30 caracteres"),
    CORREO_INVALIDO("Señor usuario, el correo ingresado no es valido"),
    ZONA_INVALIDA("La zona ingresada no es valida"),
    NIT_SOLO_NUMEROS("El nit solo debe contener números"),
    NIT_CANTIDAD("El nit debe contener 10 números"),
    TITULO_SOLO_LETRAS("El titulo de la oferta solo puede contener letras"),
    TITULO_CANTIDAD_LETRAS("El titulo de la oferta no puede sobrepasar los 20 caracteres"),
    ERROR_FORMATO_FECHA("El formato de la fecha debe ser dd/MM/yyyy"),
    ERROR_FECHA("Error: La fecha de inicio no puede ser mayor a la fecha final."),
    ERROR_COSTO("El costo por cada persona no puede ser un valor negativo. "),
    CANTIDAD_PERSONAS("La cantidad máxima para una reserva es de 4 personas. ");

    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
