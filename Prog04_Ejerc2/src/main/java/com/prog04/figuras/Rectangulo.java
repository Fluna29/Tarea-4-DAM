package com.prog04.figuras;
/**
 * En esta clase vamos a declarar los atributos de un rectángulo
 * tales como base y altura, declararemos además un constructor
 * que inicialice estos atributos al valor 0,
 * además vamos a declarar los siguientes métodos:
 *  -Métodos para actualizar y obtener el valor de cada atributo
 *  -Un método que devuelva el área del rectángulo
 *  -Un método que devuelve una cadena de texto conteniendo su área y su altura
 *  -Un método que devuelve un booleano indicando si el rectángulo es un cuadrado o no
 *  @author Francisco Luna
 */
public class Rectangulo {
    /**
     * Declaramos las variables base y altura
     * @param base
     * @param altura
     * @param area
     */
    private float base;
    private float altura;

    //Creamos un constructor vacío para inicializar las variables base y altura
    public Rectangulo (){
        this.base = 0;
        this.altura = 0;
    }

    //Creamos el constructor del rectangulo
    public Rectangulo (float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    //Getter de la base
    public float getBase (){
        return base;        
    }
    //Setter de la base
    public void  setBase (float base){
        this.base = base;
    }
    //Getter de la altura
    public float getAltura (){
        return altura;
    }
    //Setter de la altura
    public void setAltura (float altura){
        this.altura = altura;
    }
    //Getter del área, para conseguir el área usamos un return de la base por la altura.
    public float getArea(){
        return this.base * this.altura;
    }

    public String toString(){
        return ("\nEl área es = " + this.getArea() + "\nLa altura es = " + this.getAltura());
    }

    public boolean isCuadrado (){
        return this.getBase() == this.getAltura();
    }

}