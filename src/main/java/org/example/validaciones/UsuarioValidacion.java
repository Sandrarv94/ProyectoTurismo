package org.example.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    public UsuarioValidacion() {

    }

    //metodos ordinarios para validar datos
    public Boolean validarNombre(String nombres)throws Exception{
        String  expresionRegular = "^[a-zA-Z]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombres);
        if(!coincidencia.matches()){
            throw new Exception("Señor usuario su nombre solo puede tener letras");
        } else if(nombres.length()<10){
            throw new Exception("Señor usuario revisa la cantidad de caracteres, es muy pequeña");
        } else{
            return true;
        }

    }
}
