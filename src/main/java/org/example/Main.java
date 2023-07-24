package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Usuario usuario =new Usuario();
        Local local = new Local();
        Oferta oferta =new Oferta();
        Reserva reserva = new Reserva();

        System.out.println("****Bienvenido****");
        System.out.println("1: Recogiendo datos del usuario: ");
        System.out.print("Ingresa tu nombre y apellido: ");
        usuario.setNombres(teclado.nextLine());
        System.out.print("Ingresa tu correo electrónico: ");
        usuario.setCorreo(teclado.nextLine());
        System.out.println("Ingresa el numero de ubicación de tu zona: ");
        usuario.setUbicacion(teclado.nextInt());
        System.out.println("..............................");
        System.out.println(usuario);
        System.out.println("2: Recogiendo datos del local: ");
        System.out.print("Ingresa el NIT de la empresa: ");
        local.setNit(teclado.nextLine());
        System.out.println("Ingresa el nombre de la empresa: ");
        local.setNombre(teclado.nextLine());
        System.out.println("Ingresa el numero de ubicación de tu zona: ");
        local.setUbicacion(teclado.nextInt());
        System.out.println("Ingresa la descripción del local: ");
        local.setDescripcion(teclado.nextLine());
        System.out.println("..............................");
        System.out.println(local);
        System.out.println("3. Recogiendo datos de la Oferta: ");
        System.out.println("Ingresa el titulo de la oferta: ");
        oferta.setTitulo(teclado.nextLine());
        System.out.println("Ingresa la descripción de la oferta: ");
        oferta.setDescripcion(teclado.nextLine());
        System.out.println("Ingresa la fecha de inicio de la oferta (el formato requerido es dd/MM/yyyy): ");
        oferta.setFechaInicio(teclado.next());
        System.out.println("Ingresa la fecha final de la oferta: ");
        oferta.setFechaFin(teclado.next());
        System.out.println("Ingresa el costo por persona: ");
        oferta.setCostoPersona(teclado.nextDouble());
        System.out.println("Ingresa el id del Local: ");
        oferta.setIdLocal(teclado.nextInt());
        System.out.println("..............................");
        System.out.println(oferta);
        System.out.println("4. Recogiendo datos de la reserva: ");
        System.out.println("Ingresa el id del usuario: ");
        reserva.setIdUsuario(teclado.nextInt());
        System.out.println("Ingresa el id de la oferta: ");
        reserva.setIdOferta(teclado.nextInt());
        System.out.println("Ingresa el valor total del costo: ");
        reserva.setCostoTotal(teclado.nextDouble());
        System.out.println("Ingresa la fecha de la reserva: ");
        reserva.setFechaReseva(teclado.next());
    }
}