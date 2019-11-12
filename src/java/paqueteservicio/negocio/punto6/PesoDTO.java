/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto6;

/**
 *
 * @author sbpinilla
 */
public class PesoDTO {
    
    private int numA;
    private int numB;
    private int numC;
    private int numD;

    public PesoDTO(int numA, int numB, int numC, int numD) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
        this.numD = numD;
    }

    
    
    
    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }
    
    
    
    
    
}
