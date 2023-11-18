package prog_fechas;

/**
 *
 * @author fluna
 */

public class Fechas {
    enum enumMes {
            ENERO, 
            FEBRERO, 
            MARZO,
            ABRIL,
            MAYO,
            JUNIO,
            JULIO,
            AGOSTO, 
            SEPTIEMBRE,
            OCTUBRE,
            NOVIEMBRE,
            DICIEMBRE,
        }
    private int dia;
    private enumMes mes;
    private int anio;
    public void fechas(int dia, enumMes mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
        public int getDia() {
            return dia;
        }
        public void setDia(int dia){
            dia = this.dia;
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

        public boolean isSummer(){
            switch (getMes) {
                case JUNIO:
                    return true;
                    break;
                case JULIO:
                    return true;
                    break;
                case AGOSTO:
                    return true;
                    break;
                default:
                    return false;
                    break;
            }
        }
        public String toString(){
            System.out.println(getDia + " de " + getMes + " del " + getAnio);
        }
        
    }
}
