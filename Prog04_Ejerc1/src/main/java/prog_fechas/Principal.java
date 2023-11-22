package prog_fechas;
import prog_fechas.Fecha.enumMes;

/**
 * En esta clase incorporamos el método main, para poder así crear nuestros objetos
 * y ejecutar nuestro programa incorporando las funciones creadas en el archivo Fecha.java
 * @author Francisco Luna
 */
public class Principal {

    /**
     * Esta función da como retorno los siguientes mensajes, después de haber creado nuestros dos objetos:
     * 
     * Primera fecha, inicializada con el primer constructor
     * La fecha es: 20 de Febrero del 2000
     * No es verano
     * 
     * Segunda fecha, inicializada con el segundo constructor
     * La fecha 2 contiene el año 2015
     * La fecha es: 15 de Julio del 2015
     * Es verano
     * @param args
     */
    public static void main (String[] args){
        //Creamos el primer objeto con el nombre "objFecha1"
        prog_fechas.Fecha objFecha1 = new prog_fechas.Fecha(1, enumMes.Enero, 2001);
        //Aquí cambiamos los atributos del primer objeto
        objFecha1.setMes(enumMes.Febrero);
        objFecha1.setDia(20);
        objFecha1.setAnio(2000);
        //Enviamos el primer mensaje
        System.out.println("\nPrimera fecha, inicializada con el primer constructor");
        System.out.println("La fecha es: " + objFecha1.toString());
        if (objFecha1.isSummer()) {
            System.out.println("Es verano");
            
        }else {
            System.out.println("No es verano");
        }

        //Creamos el segundo objeto con el nombre "objFecha2"
        prog_fechas.Fecha objFecha2 = new prog_fechas.Fecha(21, enumMes.Diciembre, 2022);
        //Cambiamos los atributos del segundo objeto
        objFecha2.setMes(enumMes.Julio);
        objFecha2.setDia(15);
        objFecha2.setAnio(2015);
        //Enviamos el segundo mensaje
        System.out.println("\nSegunda fecha, inicializada con el segundo constructor");
        System.out.println("La fecha 2 contiene el año " + objFecha2.getAnio());
        System.out.println("La fecha es: " + objFecha2.toString());
        if (objFecha2.isSummer()) {
            System.out.println("Es verano");
            
        }else {
            System.out.println("No es verano");
        }
    }
}
