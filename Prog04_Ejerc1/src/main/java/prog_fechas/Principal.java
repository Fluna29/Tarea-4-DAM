package prog_fechas;
import prog_fechas.Fecha.enumMes;
/**
 * En esta clase incorporamos el método main, para poder así ejecutar nuestros objetos y nuestro programa
 * @author fluna
 */

public class Principal {

    public static void main (String[] args){
        prog_fechas.Fecha objFecha1 = new prog_fechas.Fecha();

        objFecha1.setMes(enumMes.febrero);
        objFecha1.setDia(20);
        objFecha1.setAnio(2000);

        System.out.println("\nPrimera fecha, inicializada con el primer constructor");
        System.out.println("La fecha es: " + objFecha1.toString());
        if (objFecha1.isSummer()) {
            System.out.println("Es verano");
            
        }else {
            System.out.println("No es verano");
        }

        prog_fechas.Fecha objFecha2 = new prog_fechas.Fecha();

        objFecha2.setMes(enumMes.julio);
        objFecha2.setDia(15);
        objFecha2.setAnio(2015);

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
