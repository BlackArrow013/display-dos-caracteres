
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
    private int day;
    // El mes establecido en el calendario en valor numérico o entero.
    private int month;
    // El año establecido en el calendario en valor numérico o entero.
    private int year;

    /**
     * El constructor del calendario, creará la fecha por defecto 01-01-01
     */
    public CalendarioBasico()
    {
        day = 01;
        month = 01;
        year = 2001;
    }

    /**
     * Permite avanzar la fecha del calendario en un día.
     */
    public void avanzarFecha()
    {
        day += 1;
        if (day > 30) {
            month += 1;
            day = 01;
        }
        if (month > 12) {
            year += 1;
            month = 01;
        }
    }

    /**
     * Permite establecer la fecha del calendario alterando la preestablecida.
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
    }

    /**
     * Devuelve en forma de tipo String la fecha en la que nos encontramos 
     * según un calendario. El formato es el siguiente: dd/mm/aa.
     */
    public String obtenerFecha()
    {
        String dosNumDay = String.valueOf(day);
        String dosNumMonth = String.valueOf(month);
        String dosNumYear = String.valueOf(year);
        if (dosNumDay.length() < 2) {
            dosNumDay = "0" + String.valueOf(day);
        }
        if (dosNumMonth.length() < 2) {
            dosNumMonth = "0" + String.valueOf(month);
        }
        return dosNumDay + "-" + dosNumMonth + "-" + dosNumYear.substring(2,4);

    }

}