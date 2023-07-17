package org.example;

import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Usuario usuario =new Usuario();

        System.out.println("****Bienvenido****");
        System.out.println("1: Recogiendo datos del usuario: ");
        System.out.print("Ingresa tu nombre y apellido: ");
        usuario.setNombres(teclado.nextLine());
        System.out.print("Ingresa tu correo electrónico: ");
        usuario.setCorreo(teclado.nextLine());
        System.out.println("..............................");
        System.out.println(usuario);

    }
}