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
public class Punto8 {

    static public NominaOutDTO calcularNomina(NominaInDTO nominaInDTO) {

        String cedula = nominaInDTO.getCedula();
        String nombre = nominaInDTO.getNombre();
        String dias = nominaInDTO.getDias();
        String salario = nominaInDTO.getSalario() ;
        String horaExtDiurna = nominaInDTO.getHoraExtDiurna() ;
        String horaExtNocturna = nominaInDTO.getHoraExtNocturna();
        String horaExtFestivo = nominaInDTO.getHoraExtFestivo();

        int resSalario;
        int resHoraExtDiurna;
        int resHoraExtNocturna;
        int resHoraExtFestivo;
        int subTransporte;
        int subDeducido;
        int total;

        //salario
        resSalario = (Integer.parseInt(salario) / 30) * (Integer.parseInt(dias));

        // valor hora ext diurna
        if (horaExtDiurna != null && !horaExtDiurna.equals("")) {
            resHoraExtDiurna = (int) (((Integer.parseInt(salario) / 240) * Integer.parseInt(horaExtDiurna)) * (1.25));
        } else {
            resHoraExtDiurna = 0;
        }

        // valor hora ext nocturna
        if (horaExtNocturna != null && !horaExtNocturna.equals("")) {
            resHoraExtNocturna = (int) (((Integer.parseInt(salario) / 240) * Integer.parseInt(horaExtNocturna)) * (1.75));
        } else {
            resHoraExtNocturna = 0;
        }

        // valor hora ext festivo
        if (horaExtFestivo != null && !horaExtFestivo.equals("")) {
            resHoraExtFestivo = (int) (((Integer.parseInt(salario) / 240) * Integer.parseInt(horaExtFestivo)) * (2));
        } else {
            resHoraExtFestivo = 0;
        }

        // Sub transporte
        if (Integer.parseInt(salario) <= 1658000) {
            subTransporte = (97000 / 30) * Integer.parseInt(dias);

        } else {
            subTransporte = 0;

        }

        total = resSalario + resHoraExtDiurna + resHoraExtNocturna + resHoraExtFestivo;

        subDeducido = ((total * 8) / 100);

        if ((828116 * 4) < total) {
            subDeducido = subDeducido + ((total * 1) / 100);
        }

        total = total + subTransporte - subDeducido;

        System.out.println("calcularNomina");

        NominaOutDTO nominaOutDTO = new NominaOutDTO(resSalario, resHoraExtDiurna, resHoraExtNocturna, resHoraExtFestivo, subTransporte, subDeducido, total);
  
        return nominaOutDTO;
    }

}
