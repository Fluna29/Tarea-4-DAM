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
    public enum enumMes {
            enero, 
            febrero, 
            marzo,
            abril,
            mayo,
            junio,
            julio,
            agosto, 
            septiembre,
            octubre,
            noviembre,
            diciembre,
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
    
    public void fechas(int dia, enumMes mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }   
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public enumMes getMes(){
        return mes;
    }
    public void setMes(enumMes mes){
        this.mes = mes;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    /**
    * Esta función es un boolean, que nos dice si ese mes está situado en verano o no, para ello hace uso
    * del boolean.
    */
    
    public boolean isSummer(){
        return (mes == enumMes.junio || mes == enumMes.julio || mes == enumMes.agosto);
    }
    
    public String toString(){
        return (this.getDia()+ " de " + this.getMes() + " del " + getAnio());
    }
        
    
}
