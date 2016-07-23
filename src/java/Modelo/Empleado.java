package Modelo;



/**
 * @author Juan Pablo Guzm�n G
 * @version 1.0
 * @created 14-Jul.-2016 7:58:34 p. m.
 */
public class Empleado  {

	private int Identificacion;
	private String Nombres;
	private String Apellidos ;
	private String area;
	private String Departamento ;
	private String Cargo ;
	private String Salario ;
	private String Rol;
	private String Estado ;
	private String usuario ;
	private String password;
	public Actividad  m_Actividad ;
	public Cargo m_Cargo;

	public Empleado (){

	}

    public Empleado(int Identificacion, String Nombres, String Apellidos, String area, String Departamento, String Cargo, String Salario, String Rol, String Estado, String usuario, String password, Actividad m_Actividad, Cargo m_Cargo) {
        this.Identificacion = Identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.area = area;
        this.Departamento = Departamento;
        this.Cargo = Cargo;
        this.Salario = Salario;
        this.Rol = Rol;
        this.Estado = Estado;
        this.usuario = usuario;
        this.password = password;
        this.m_Actividad = m_Actividad;
        this.m_Cargo = m_Cargo;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Actividad getM_Actividad() {
        return m_Actividad;
    }

    public void setM_Actividad(Actividad m_Actividad) {
        this.m_Actividad = m_Actividad;
    }

    public Cargo getM_Cargo() {
        return m_Cargo;
    }

    public void setM_Cargo(Cargo m_Cargo) {
        this.m_Cargo = m_Cargo;
    }
        

	public void finalize() throws Throwable {

	}
}//end Empleado 