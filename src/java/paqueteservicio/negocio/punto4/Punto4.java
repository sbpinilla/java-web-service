/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto4;

import java.util.List;

/**
 *
 * @author sbpinilla
 */
public class Punto4 {

    static public NotasDTO calcularNotas(List<Integer> listEstudiantes) {

        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numF = 0;

        for (Integer nota : listEstudiantes) {

            if (nota >= 90) {
                numA = numA + 1;
            } else if (nota < 90 && nota >= 80) {
                numB = numB + 1;
            } else if (nota < 80 && nota >= 70) {
                numC = numC + 1;
            } else if (nota == 69) {
                numD = numD + 1;
            } else {
                numF = numF + 1;
            }
        }

        return new NotasDTO(numA, numB, numC, numD, numF);

    }

}
