/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa

    // método que permita preguntar al usuario la dirección de la empresa
    public static String empresa() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String empresa;

        System.out.println("Ingrese el nombre de la empresa");
        empresa = entrada.nextLine();

        return empresa;
    }

    public static String ubicacion() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String ubicacion;
        System.out.println("Ingrese la ubicacion de la empresa");
        ubicacion = entrada.nextLine();
        return ubicacion;
    }
}

