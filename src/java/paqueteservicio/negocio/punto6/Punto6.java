/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto6;

import java.util.List;

/**
 *
 * @author sbpinilla
 */
public class Punto6 {

    static public PesoDTO calcularPeso(List<Integer> listEstudiantes) {

        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;

        for (Integer nota : listEstudiantes) {

            if (nota >= 60) {
                numA = numA + 1;
            } else if (nota < 60 && nota > 50) {
                numB = numB + 1;
            } else if (nota <= 50 && nota >= 40) {
                numC = numC + 1;
            } else {
                numD = numD + 1;
            }
        }
        
        return new PesoDTO(numA, numB, numC, numD);

    }

}
