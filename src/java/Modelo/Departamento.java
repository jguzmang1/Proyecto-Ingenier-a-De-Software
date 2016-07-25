package Modelo;

import java.awt.geom.Area;



/**
 * @version 1.0
 * @created 23-Jul.-2016 9:46:12 p. m.
 */
public class Departamento  {

	private int Id_departamento;
	private String nombre_departamento;
	private String estado_departamento;
	public Area  m_Area ;

	public Departamento (){

	}

    public Departamento(int Id_departamento, String nombre_departamento, String estado_departamento, Area m_Area) {
        this.Id_departamento = Id_departamento;
        this.nombre_departamento = nombre_departamento;
        this.estado_departamento = estado_departamento;
        this.m_Area = m_Area;
    }

	public void finalize() throws Throwable {

	}
	public int getId_departamento(){
		return 0;
	}

	public String getnombre_departamento(){
		return "";
	}

	public String getestado_departamento(){
		return "";
	}

	public void setnombre_departamento (){

	}

	public void setestado_departamento(){

	}
}//end Departamento 