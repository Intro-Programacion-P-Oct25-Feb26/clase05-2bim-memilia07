/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Imprimir;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String ubicacion;

        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        empresa = DatoTrabajo.empresa();
        ubicacion = DatoTrabajo.ubicacion();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
       
        Imprimir.Imprimir(nombre, ciudad, apellidoRetornado, empresa,
                ubicacion, misNotas, promedio);

     
        
    }
    
}
/*
Genere un codigo que pida el nombre, apellido,y sus notas por teclado, y 
al final muestre el promedio total de sus notas, y que el rango de notas sea 4,
usar funciones en diferentes paquetes y clases y despues invocarlos en el main 
principal, y al final mostrar un mensaje con todo lo pedido.
 */
