package Modelo;



/**
 * @author Juan Pablo Guzm�n G
 * @version 1.0
 * @created 14-Jul.-2016 7:58:34 p. m.
 */
public class Actividad  {

	private int id;
	private String Fecha;
	private String Descripcion_Actividad;
	private int Tiempo_actividad ;

	public Actividad (){

	}

    public Actividad(int id, String Fecha, String Descripcion_Actividad, int Tiempo_actividad) {
        this.id = id;
        this.Fecha = Fecha;
        this.Descripcion_Actividad = Descripcion_Actividad;
        this.Tiempo_actividad = Tiempo_actividad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripcion_Actividad() {
        return Descripcion_Actividad;
    }

    public void setDescripcion_Actividad(String Descripcion_Actividad) {
        this.Descripcion_Actividad = Descripcion_Actividad;
    }

    public int getTiempo_actividad() {
        return Tiempo_actividad;
    }

    public void setTiempo_actividad(int Tiempo_actividad) {
        this.Tiempo_actividad = Tiempo_actividad;
    }
        

	public void finalize() throws Throwable {

	}
	public void validaFranjaHoraria(){

	}

	public void validaHoraExtra(){

	}
}//end Actividad 