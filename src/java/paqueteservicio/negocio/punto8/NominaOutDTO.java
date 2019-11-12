/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio.negocio.punto8;

/**
 *
 * @author sbpinilla
 */
public class NominaOutDTO {

    private int resSalario;
    private int resHoraExtDiurna;
    private int resHoraExtNocturna;
    private int resHoraExtFestivo;
    private int subTransporte;
    private int subDeducido;
    private int total;

    public NominaOutDTO() {
    }

    public NominaOutDTO(int resSalario, int resHoraExtDiurna, int resHoraExtNocturna, int resHoraExtFestivo, int subTransporte, int subDeducido, int total) {
        this.resSalario = resSalario;
        this.resHoraExtDiurna = resHoraExtDiurna;
        this.resHoraExtNocturna = resHoraExtNocturna;
        this.resHoraExtFestivo = resHoraExtFestivo;
        this.subTransporte = subTransporte;
        this.subDeducido = subDeducido;
        this.total = total;
    }
    
    

    public int getResSalario() {
        return resSalario;
    }

    public void setResSalario(int resSalario) {
        this.resSalario = resSalario;
    }

    public int getResHoraExtDiurna() {
        return resHoraExtDiurna;
    }

    public void setResHoraExtDiurna(int resHoraExtDiurna) {
        this.resHoraExtDiurna = resHoraExtDiurna;
    }

    public int getResHoraExtNocturna() {
        return resHoraExtNocturna;
    }

    public void setResHoraExtNocturna(int resHoraExtNocturna) {
        this.resHoraExtNocturna = resHoraExtNocturna;
    }

    public int getResHoraExtFestivo() {
        return resHoraExtFestivo;
    }

    public void setResHoraExtFestivo(int resHoraExtFestivo) {
        this.resHoraExtFestivo = resHoraExtFestivo;
    }

    public int getSubTransporte() {
        return subTransporte;
    }

    public void setSubTransporte(int subTransporte) {
        this.subTransporte = subTransporte;
    }

    public int getSubDeducido() {
        return subDeducido;
    }

    public void setSubDeducido(int subDeducido) {
        this.subDeducido = subDeducido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    

}
