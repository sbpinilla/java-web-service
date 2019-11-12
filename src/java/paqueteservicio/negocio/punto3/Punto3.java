/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto3;

/**
 *
 * @author sbpinilla
 */
public class Punto3 {

    static public int calcularCDS(int numGb) {

        // ceil redondea el resultado hacia arriba 
        System.out.println("---------->" + ((numGb * 1024.0) / 700.0));
        return (int) Math.ceil((numGb * 1024.0) / 700.0);

    }

}
