/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author USER_ASUS
 */
public class Imprimir {

    public static void Imprimir(String a, String b, String c, String d, String e,
            double[] f, double g) {

        String mensaje;
        String notas = "";
        for (int i = 0; i < f.length; i++) {
            notas = String.format("%s%s\n", notas, f[i]);
        }

        mensaje = String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Empresa: %s\n"
                + "Ubicacion de la Empresa: %s\n"
                + "Notas: %s\n"
                + "Promedio: %.2f\n",
                a,
                b,
                c, d, e, notas, g);
        System.out.printf("%s", mensaje);

    }
}
