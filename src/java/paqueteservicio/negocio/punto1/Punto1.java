/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto1;

/**
 *
 * @author sbpinilla
 */
public class Punto1 {

    static public int formulaUno(int itemM, int itemN, int itemP) {

        try {
            return (itemM / itemN) + itemP;
        } catch (Exception e) {
            return 0;
        }
    }

    static public int formulaDos(int itemM, int itemN, int itemP, int itemQ) {

        try {
            return itemM + (itemN / (itemP - itemQ));
        } catch (Exception e) {
            return 0;
        }

    }

    static public int formulaTres(int itemM, int itemN, int itemP, int itemQ) {

        try {
            return itemM + (itemN / (itemP - itemQ));
        } catch (Exception e) {
            return 0;
        }
    }

    static public int formulaCuatro(int itemM, int itemN, int itemP, int itemQ, int itemR) {

        try {
            return (itemM + (itemN / itemP)) / (itemQ - (itemR / 5));
        } catch (Exception e) {
            return 0;
        }

    }

    static public int formulaCinco(int itemM, int itemN, int itemP, int itemQ) {

        try {
            return (itemM - itemN) / (itemP - itemQ);
        } catch (Exception e) {
            return 0;
        }

    }

    static public double formulaSeis(int itemB, int itemA, int itemC) {

        try {
            return -(itemB) + Math.sqrt(Math.pow(itemB, 2) - (4 * itemA * itemC)) / (2 * itemA);
        } catch (Exception e) {
            return 0;
        }

    }

}
