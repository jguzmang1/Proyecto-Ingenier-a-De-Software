/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitty;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan Pablo Guzmán G
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "empleado.findAll", query = "SELECT c FROM empleado c"),
    @NamedQuery(name = "empleado.findByIdentificacion", query = "SELECT c FROM empleado c WHERE c.identificacion = :identificacion"),
    @NamedQuery(name = "empleado.findByNombres", query = "SELECT c FROM empleado c WHERE c.nombres = :nombres"),
    @NamedQuery(name = "empleado.findByApellidos", query = "SELECT c FROM empleado c WHERE c.apellidos = :apellidos"),
    @NamedQuery(name = "empleado.findByArea", query = "SELECT c FROM empleado c WHERE c.Area = :Area"),
    @NamedQuery(name = "empleado.findByDepartamento", query = "SELECT c FROM empleado c WHERE c.Departamento = :Departamento"),
    @NamedQuery(name = "empleado.findByCargo", query = "SELECT c FROM empleado c WHERE c.Cargo = :Cargo"),
    @NamedQuery(name = "empleado.findBySalario", query = "SELECT c FROM empleado c WHERE c.Salario = :Salario"),
    @NamedQuery(name = "empleado.findByRol", query = "SELECT c FROM empleado c WHERE c.Rol = :Rol"),
    @NamedQuery(name = "empleado.findByEstado", query = "SELECT c FROM empleado c WHERE c.Estado = :Estado"),
    @NamedQuery(name = "empleado.findByPaswword", query = "SELECT c FROM empleado c WHERE c.password = :password")})

public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "area")
    private String area;
    @Basic(optional = false)
    @NotNull
    @Column(name = "departamento")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cargo")
    private String cargo;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "salario")
    private String salario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol")
    private String rol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "idActividad", referencedColumnName = "idActividad")
    @ManyToOne(optional = false)
    private Actividad idActividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private Collection<Actividad> reservaCollection;

    public Empleado() {
    }
    public Empleado(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public Empleado(String identificacion, String nombres, String apellidos, String area, String departamento, String cargo, String salario, String rol, String estado, String password, Actividad idActividad, Collection<Actividad> reservaCollection, Long id) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.area = area;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.rol = rol;
        this.estado = estado;
        this.password = password;
        this.idActividad = idActividad;
        this.reservaCollection = reservaCollection;
       
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Actividad getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Actividad idActividad) {
        this.idActividad = idActividad;
    }

    public Collection<Actividad> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Actividad> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacion != null ? identificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.identificacion == null && other.identificacion != null) || (this.identificacion != null && !this.identificacion.equals(other.identificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitty.Empleado[ identificacion=" + identificacion + " ]";
    }
    
}
