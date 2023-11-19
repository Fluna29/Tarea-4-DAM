package com.prog04.principal;
import com.prog04.figuras.Rectangulo;

/**
 * En esta clase incorporamos el método main, para poder así crear nuestros objetos
 * y ejecutar nuestro programa incorporando las funciones creadas en el archivo Fecha.java
 * @author Francisco Luna
 */
public class Principal {
    
    /**
     *  Esta función da como retorno los siguientes mensajes, después de haber creado nuestros dos objetos:
     *  El rectángulo 1:
     *  El área es = 150.0
     *  La altura es = 15.0
     *  Es un rectángulo

     *  El rectángulo 2:
     *  El área es = 400.0
     *  La altura es = 20.0
     *  No es un rectángulo, es un cuadrado
     */
    public static void main (String[] args){

        //Creamos nuestros dos objetos rectángulos, vamos a llamarles rect1 y rect2
        Rectangulo rect1 = new Rectangulo(10f, 5f);
        Rectangulo rect2 = new Rectangulo(1f,20f);
        //Cambiamos los valores de los atributos de altura y base en el rect1 y en el rect2
        rect1.setAltura(15f);
        rect2.setBase(20f);

        //Escribimos el mensaje correspondiente al primer rectángulo
        System.out.println("\nEl rectángulo 1: " + rect1.toString());
        if (rect1.isCuadrado()){
            System.out.println("No es un rectángulo, es un cuadrado");
        }else {
            System.out.println("Es un rectángulo");
        }
        //Escribimos el mensaje correspondiente al segundo rectángulo
        System.out.println("\nEl rectángulo 2: " + rect2.toString());
        if (rect2.isCuadrado()){
            System.out.println("No es un rectángulo, es un cuadrado");
        }else {
            System.out.println("Es un rectángulo");
        }
    }
}