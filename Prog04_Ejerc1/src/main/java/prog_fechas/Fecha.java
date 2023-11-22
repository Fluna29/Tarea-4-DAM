package prog_fechas;

/**
 * En esta clase vamos a enumerar los meses con un enum,
 * además de recibir datos como el día y el año,
 * y comparar así si estamos hablando de verano o no.
 * También para finalizar tenemos una función/método que lo que hace
 * es escribir la fecha en el formato largo, usando tanto el año como 
 * el día y el mes.
 * @author Francisco Luna
 */
public class Fecha {
    /**
     * Creamos un enumerador con los meses del año, para usarlo en el constructor.
     * @param enumMes
     */
    public enum enumMes {
            Enero, 
            Febrero, 
            Marzo,
            Abril,
            Mayo,
            Junio,
            Julio,
            Agosto, 
            Septiembre,
            Octubre,
            Noviembre,
            Diciembre,
        }

    private int dia;
    private enumMes mes;
    private int anio;

    /**
     * Aquí creamos un constructor llamado "fechas". con las variables creadas anteriormente
     * llamadas "dia", "mes" y "anio"
     * @param dia
     * @param mes
     * @param anio 
     */
    public Fecha (int dia, enumMes mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Getter del parámetro día.
     * @param dia
    */   
    public int getDia(){
        return dia;
    }
    /**
     * Setter del parametro día
     * @param dia
     */
    public void setDia(int dia){
        this.dia = dia;
    }
    /**
     * Getter del parámetro mes
     * @param mes
     */
    public enumMes getMes(){
        return mes;
    }
    /**
     * Setter del parámetro mes
     * @param mes
     */
    public void setMes(enumMes mes){
        this.mes = mes;
    }
    /**
     * Getter del parámetro anio
     * @param anio
     */
    public int getAnio(){
        return anio;
    }
    /**
     * Setter del parámetro anio
     * @param anio
     */
    public void setAnio(int anio){
        this.anio = anio;
    }

    /**
    * Esta función es un boolean, que nos dice si ese mes está situado en verano o no, para ello hace uso
    * del boolean.
    * Retorna true o false, dependendiendo de si es verano o no.
    */
    public boolean isSummer(){
        return (mes == enumMes.Junio || mes == enumMes.Julio || mes == enumMes.Agosto);
    }
    
    /**
     * En esta función convertimos el completo del mensaje y valores a String, 
     * mediante el uso de la función toString.
     * 
     * Retorna el siguiente mensaje (NºDia) de (mes) del (año), 
     * ejemplo: 15 de Enero de 2020
     * 
     */
    public String toString(){
        return (this.getDia()+ " de " + this.getMes() + " del " + getAnio());
    }
        
    
}
