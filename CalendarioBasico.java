
/**
 * La idea de este ejercicio es crear un calendario básico con el día, el mes
 * y el año en el que nos encontremos, y modificarlo a nuestro antojo. Cada mes
 * tendrá treinta días, todos y cada uno de los meses.
 *
 * @author (Jorge Jaular)
 * @version (30-10-2017)
 */
public class CalendarioBasico
{
    // El día establecido en el calendario en valor numérico o entero.
    private DisplayDosCaracteres day;
    // El mes establecido en el calendario en valor numérico o entero.
    private DisplayDosCaracteres month;
    // El año establecido en el calendario en valor numérico o entero.
    private DisplayDosCaracteres year;

    /**
     * El constructor del calendario, creará la fecha por defecto 01-01-01
     */
    public CalendarioBasico()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(2100);             
    }

    /**
     * Permite avanzar la fecha del calendario en un día.
     */
    public void avanzarFecha()
    {
        day.incrementaValorAlmacenado();
        if (day.getValorAlmacenado() == 1) {
            month.incrementaValorAlmacenado();
            if (month.getValorAlmacenado() == 1) {
                year.incrementaValorAlmacenado();
            }
        }
    }

    /**
     * Permite establecer la fecha del calendario alterando la preestablecida.
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day.setValorAlmacenado(dia);
        month.setValorAlmacenado(mes);
        year.setValorAlmacenado(ano);
    }

    /**
     * Devuelve en forma de tipo String la fecha en la que nos encontramos 
     * según un calendario. El formato es el siguiente: dd/mm/aa.
     */
    public String obtenerFecha()
    {
        day.getTextoDelDisplay();
        month.getTextoDelDisplay();
        year.getTextoDelDisplay();
        return day.getTextoDelDisplay() + "-" + month.getTextoDelDisplay() + "-" + year.getTextoDelDisplay();
    }

}