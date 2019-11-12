/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto7;

/**
 *
 * @author sbpinilla
 */
public class Punto7 {

    static public int calcularMCD(int numUno, int numDos) {

        int nMayor, nMenor, mcd;

        if (numUno >= numDos) {
            nMayor = numUno;
            nMenor = numDos;
        } else {
            nMayor = numDos;
            nMenor = numUno;
        }

        mcd = obtenerMmcd(nMenor, nMayor);

        return mcd;
    }

    static private int obtenerMmcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return obtenerMmcd(b, a % b);
        }
    }

}
