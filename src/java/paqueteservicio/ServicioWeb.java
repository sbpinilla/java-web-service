/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import paqueteservicio.negocio.punto1.Punto1;
import paqueteservicio.negocio.punto2.Punto2;
import paqueteservicio.negocio.punto3.Punto3;
import paqueteservicio.negocio.punto4.NotasDTO;
import paqueteservicio.negocio.punto4.Punto4;
import paqueteservicio.negocio.punto5.Punto5;
import paqueteservicio.negocio.punto6.PesoDTO;
import paqueteservicio.negocio.punto6.Punto6;
import paqueteservicio.negocio.punto7.Punto7;
import paqueteservicio.negocio.punto8.NominaInDTO;
import paqueteservicio.negocio.punto8.NominaOutDTO;
import paqueteservicio.negocio.punto8.Punto8;
import paqueteservicio.negocio.punto9.ProductoDTO;
import paqueteservicio.negocio.punto9.Punto9;

/**
 *
 * @author sbpinilla
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Suma")
    public Integer Suma(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        //TODO write your implementation code here:
        return numero1 + numero2;
    }

    /**
     * ---------------------- Web service punto 1 ----------------------
     */
    @WebMethod(operationName = "Punto1FormulaUno")
    public int punto1FormulaUno(
            @WebParam(name = "itemM") int itemM,
            @WebParam(name = "itemN") int itemN,
            @WebParam(name = "itemP") int itemP) {

        System.out.println("paqueteservicio.ServicioWeb.punto1FormulaUno()");
        return Punto1.formulaUno(itemM, itemN, itemP);

    }

    @WebMethod(operationName = "Punto1FormulaDos")
    public int punto1FormulaDos(
            @WebParam(name = "itemM") int itemM,
            @WebParam(name = "itemN") int itemN,
            @WebParam(name = "itemP") int itemP,
            @WebParam(name = "itemQ") int itemQ
    ) {

        System.out.println("paqueteservicio.ServicioWeb.punto1FormulaDos()");
        return Punto1.formulaDos(itemM, itemN, itemP, itemQ);
    }

    @WebMethod(operationName = "Punto1FormulaTres")
    public int punto1FormulaTres(
            @WebParam(name = "itemM") int itemM,
            @WebParam(name = "itemN") int itemN,
            @WebParam(name = "itemP") int itemP,
            @WebParam(name = "itemQ") int itemQ) {

        System.out.println("paqueteservicio.ServicioWeb.punto1FormulaTres()");

        return Punto1.formulaTres(itemM, itemN, itemP, itemQ);
    }

    @WebMethod(operationName = "Punto1FormulaCuatro")
    public int punto1FormulaCuatro(
            @WebParam(name = "itemM") int itemM,
            @WebParam(name = "itemN") int itemN,
            @WebParam(name = "itemP") int itemP,
            @WebParam(name = "itemQ") int itemQ,
            @WebParam(name = "itemR") int itemR) {

        System.out.println("paqueteservicio.ServicioWeb.punto1FormulaCuatro()");

        return Punto1.formulaCuatro(itemM, itemN, itemP, itemQ, itemR);

    }

    @WebMethod(operationName = "Punto1FormulaCinco")
    public int punto1FormulaCinco(
            @WebParam(name = "itemM") int itemM,
            @WebParam(name = "itemN") int itemN,
            @WebParam(name = "itemP") int itemP,
            @WebParam(name = "itemQ") int itemQ) {

        System.out.println("paqueteservicio.ServicioWeb.punto1FormulaCinco()");

        return Punto1.formulaCinco(itemM, itemN, itemP, itemQ);
    }

    @WebMethod(operationName = "Punto1FormulaSeis")
    public double punto1FormulaSeis(
            @WebParam(name = "itemB") int itemB,
            @WebParam(name = "itemA") int itemA,
            @WebParam(name = "itemC") int itemC) {
        System.out.println("paqueteservicio.ServicioWeb.punto1FormulaSeis()");
        return Punto1.formulaSeis(itemB, itemA, itemC);
    }

    /**
     * FIN -Web service punto 1
     */
    /**
     * ---------------------- Web service punto 2 ----------------------
     */
    @WebMethod(operationName = "Punto2CalcularPuntaje")
    public int calcularPuntaje(
            @WebParam(name = "numPreguntasB") int numPreguntasB,
            @WebParam(name = "numPreguntasC") int numPreguntasC,
            @WebParam(name = "numPreguntasI") int numPreguntasI) {

        System.out.println("paqueteservicio.ServicioWeb.calcularPuntaje()");
        return Punto2.calcularPuntaje(numPreguntasB, numPreguntasC, numPreguntasI);
    }

    /**
     * FIN -Web service punto 2
     */
    /**
     * ---------------------- Web service punto 3 ----------------------
     */
    @WebMethod(operationName = "Punto3CalcularCDS")
    public int calcularCDS(@WebParam(name = "numGb") int numGb) {

        System.out.println("paqueteservicio.ServicioWeb.calcularCDS()");
        return Punto3.calcularCDS(numGb);

    }

    /**
     * FIN - Web service punto 3
     */
    /**
     * ---------------------- Web service punto 4 ----------------------
     */
    @WebMethod(operationName = "Punto4CalcularNotas")
    public NotasDTO calcularNotas(
            @WebParam(name = "listEstudiantes") List<Integer> listEstudiantes) {

        System.out.println("paqueteservicio.ServicioWeb.calcularNotas()");

        return Punto4.calcularNotas(listEstudiantes);

    }

    /**
     * FIN - Web service punto 4
     */
    /**
     * ---------------------- Web service punto 5 ----------------------
     */
    @WebMethod(operationName = "Punto5CalcularPrecioBillete")
    public int calcularPrecioBillete(
            @WebParam(name = "numKilometros") int numKilometros,
            @WebParam(name = "numDiasF") int numDias) {

        System.out.println("paqueteservicio.ServicioWeb.calcularPrecioBillete()");
        return Punto5.calcularPrecioBillete(numKilometros, numDias);
    }

    /**
     * FIN - Web service punto 5
     */
    /**
     * ---------------------- Web service punto 6 ----------------------
     */
    @WebMethod(operationName = "Punto6CalcularPeso")
    public PesoDTO calcularPeso(
            @WebParam(name = "listEstudiantes") List<Integer> listEstudiantes) {

        System.out.println("paqueteservicio.ServicioWeb.calcularPeso()");
        return Punto6.calcularPeso(listEstudiantes);
    }

    /**
     * FIN - Web service punto 7
     */
    /**
     * ---------------------- Web service punto 7 ----------------------
     */
    @WebMethod(operationName = "Punto7CalcularMCD")
    public int calcularMCD(
            @WebParam(name = "numUno") int numUno,
            @WebParam(name = "numDos") int numDos) {

        System.out.println("paqueteservicio.ServicioWeb.calcularMCD()");
        return Punto7.calcularMCD(numUno, numDos);
    }

    /**
     * FIN - Web service punto 7
     */
    /**
     * ---------------------- Web service punto 8 ----------------------
     */
    @WebMethod(operationName = "Punto8CalcularNomina")
    public NominaOutDTO calcularNomina(
            @WebParam(name = "nominaInDTO") NominaInDTO nominaInDTO) {

        System.out.println("paqueteservicio.ServicioWeb.calcularNomina()");
        return Punto8.calcularNomina(nominaInDTO);
    }

    /**
     * FIN - Web service punto 8
     */
    /**
     * ---------------------- Web service punto 9 ----------------------
     */
    @WebMethod(operationName = "Punto9CalcularTotalProducto")
    public ProductoDTO calcularTotalProducto(
            @WebParam(name = "nominaInDTO") ProductoDTO producto) {

        System.out.println("paqueteservicio.ServicioWeb.calcularTotalProducto()");
        return Punto9.calcularTotalProducto(producto);
    }
}
