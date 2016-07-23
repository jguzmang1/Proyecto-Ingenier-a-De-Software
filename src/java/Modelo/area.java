package Modelo;



/**
 * @version 1.0
 * @created 14-Jul.-2016 7:58:34 p. m.
 */
public class area  {

	private int Id_area;
	private String nombre_area;
	private String estado_area ;
	public String  m_Departamento ;

	public area (){

	}

    public area(int Id_area, String nombre_area, String estado_area, String m_Departamento) {
        this.Id_area = Id_area;
        this.nombre_area = nombre_area;
        this.estado_area = estado_area;
        this.m_Departamento = m_Departamento;
    }

    public int getId_area() {
        return Id_area;
    }

    public void setId_area(int Id_area) {
        this.Id_area = Id_area;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }

    public String getEstado_area() {
        return estado_area;
    }

    public void setEstado_area(String estado_area) {
        this.estado_area = estado_area;
    }

    public String getM_Departamento() {
        return m_Departamento;
    }

    public void setM_Departamento(String m_Departamento) {
        this.m_Departamento = m_Departamento;
    }
        

	public void finalize() throws Throwable {

	}
}
  