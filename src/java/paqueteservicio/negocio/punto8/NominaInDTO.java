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
public class NominaInDTO {

    private String cedula;
    private String nombre;
    private String dias;
    private String salario;
    private String horaExtDiurna;
    private String horaExtNocturna;
    private String horaExtFestivo;

    public NominaInDTO() {
    }

    public NominaInDTO(String cedula, String nombre, String dias, String salario, String horaExtDiurna, String horaExtNocturna, String horaExtFestivo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.dias = dias;
        this.salario = salario;
        this.horaExtDiurna = horaExtDiurna;
        this.horaExtNocturna = horaExtNocturna;
        this.horaExtFestivo = horaExtFestivo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getHoraExtDiurna() {
        return horaExtDiurna;
    }

    public void setHoraExtDiurna(String horaExtDiurna) {
        this.horaExtDiurna = horaExtDiurna;
    }

    public String getHoraExtNocturna() {
        return horaExtNocturna;
    }

    public void setHoraExtNocturna(String horaExtNocturna) {
        this.horaExtNocturna = horaExtNocturna;
    }

    public String getHoraExtFestivo() {
        return horaExtFestivo;
    }

    public void setHoraExtFestivo(String horaExtFestivo) {
        this.horaExtFestivo = horaExtFestivo;
    }

    
    
    
    
    
}
