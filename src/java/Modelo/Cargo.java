package Modelo;



/**
 * @version 1.0
 * @created 23-Jul.-2016 9:47:47 p. m.
 */
public class Cargo {

	private int Id_cargo;
	private String Nombre_cargo;
	private int Costo_hora;
	private int Costo_extra;
	private String Estado_cargo;
	public Departamento  m_Departamento ;
	public Empleado  m_Empleado ;

	public Cargo(){

	}

	public void finalize() throws Throwable {

	}
	public int getId_cargo(){
		return 0;
	}

	public String getNombre_cargo(){
		return "";
	}

	public int getCosto_hora(){
		return 0;
	}

	public int getCosto_extra(){
		return 0;
	}

	public String getEstado_cargo(){
		return "";
	}

	public void setNombre_cargo(){

	}

	public void setCosto_hora(){

	}

	public void setCosto_extra(){

	}

	public void setEstado_hora(){

	}
}//end Cargo