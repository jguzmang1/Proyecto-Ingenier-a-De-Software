package Modelo;



/**
 * @version 1.0
 * @created 14-Jul.-2016 7:58:34 p. m.
 */
public class Departamento  {

	private int Id_departamento;
	private String nombre_departamento;
	private String estado_departamento;
	public Cargo m_Cargo;

	public Departamento (){

	}

    public Departamento(int Id_departamento, String nombre_departamento, String estado_departamento, Cargo m_Cargo) {
        this.Id_departamento = Id_departamento;
        this.nombre_departamento = nombre_departamento;
        this.estado_departamento = estado_departamento;
        this.m_Cargo = m_Cargo;
    }

    public int getId_departamento() {
        return Id_departamento;
    }

    public void setId_departamento(int Id_departamento) {
        this.Id_departamento = Id_departamento;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public String getEstado_departamento() {
        return estado_departamento;
    }

    public void setEstado_departamento(String estado_departamento) {
        this.estado_departamento = estado_departamento;
    }

    public Cargo getM_Cargo() {
        return m_Cargo;
    }

    public void setM_Cargo(Cargo m_Cargo) {
        this.m_Cargo = m_Cargo;
    }
        

	public void finalize() throws Throwable {

	}
}//end Departamento 