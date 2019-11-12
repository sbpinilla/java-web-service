/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto5;

/**
 *
 * @author sbpinilla
 */
public class Punto5 {

    static public int calcularPrecioBillete(int numKilometros, int numDias) {

        int resultado = numKilometros * 20000;

        if (numDias > 7 && numKilometros > 800) {

            System.out.println("---------> resultado:" + resultado);
            System.out.println("---------> porcentaje:" + ((resultado * 30) / 100));

            resultado = resultado - ((resultado * 30) / 100);

            System.out.println("---------> total" + resultado);
        }

        return resultado;

    }

}
