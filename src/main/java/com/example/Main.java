package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Valor de cuenta de un restaurante
        Scanner input = new Scanner(System.in);
        System.out.println("El valor de la cuenta: ");
        double valorcuenta = input.nextDouble();

        double iva = valorcuenta + 0.50;

        System.out.println("valor de la cuenta: " + iva);

        // porcentaje de propina
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de propina que desea dejar a nuestro servicio: ");
        double porcentajePropina = scanner.nextDouble();

        System.out.println("El porcentaje de la propina es: " + porcentajePropina + "%");

        double porcentaje = iva * porcentajePropina / 100;

        System.out.println("El valor de la propina es: " + porcentaje);

        double valortotal = iva + porcentaje;

        System.out.println("Su valor total de la cuenta es: " + valortotal);

        //calcular el precio de un taxi 
        Scanner distancia = new Scanner(System.in);
        System.out.println("Ingrese la distancia de viaje: ");
        Double taxi = distancia.nextDouble();

        System.out.println("La distancia del viaje es: " + taxi);

        Scanner tiempoEspera = new Scanner(System.in);
        System.out.println("Ingrese el tiempo de espera: ");
        Double Espera = tiempoEspera.nextDouble();

        System.out.println("Timepo de espera: " + Espera + " Minutos");

        Double tarifaBase = 4000.0;

        Double valorKilometro = 900.0;

        Double valorMinuto = 150.0;

        Double distanciavalor = valorKilometro * taxi;

        Double tiempoValor = Espera * valorMinuto;

        Double sumatotal = tarifaBase + distanciavalor + tiempoValor;

        System.out.println("El precio total del viaje fue: " + sumatotal);



        // Decodificando un mensaje secreto 



        String Mensaje = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        String m1 = Mensaje.replace('0', 'o');
        String m2 = m1.replace('3', 'e');
        String m3 = m2.replace('4', 'a');

        String m4 = m3.trim();
        String m5 = m4.toUpperCase();
        String mensajeDecodificado = m5;

        System.out.println(mensajeDecodificado);
        
    }
}