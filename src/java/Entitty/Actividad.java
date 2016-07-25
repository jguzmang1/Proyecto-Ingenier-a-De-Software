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
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "actividad.findAll", query = "SELECT a FROM actividad a"),
    @NamedQuery(name = "actividad.findById", query = "SELECT a FROM actividad a WHERE a.Id = :Id"),
    @NamedQuery(name = "actividad.findByFecha", query = "SELECT a FROM actividad a WHERE a.Fecha = :Fecha"),
    @NamedQuery(name = "actividad.findByDescripcion_Actividad", query = "SELECT a FROM actividad a WHERE a.Descripcion_Actividad = :Descripcion_Actividad"),
    @NamedQuery(name = "actividad.findByTiempo_actividad", query = "SELECT a FROM actividad a WHERE a.Tiempo_actividad = :Tiempo_actividad")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @JoinColumn(name = "identificacion", referencedColumnName = "identificaciom")
    @ManyToOne(optional = false)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer Id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "fecha")
    @Id
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Descripcion_Actividad")
    private String Descripcion_Actividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tiempo_actividad")
    private int Tiempo_actividad;

    public Actividad() {
    }
    public Actividad(Integer Id) {
        this.Id = Id;
    }

    public Actividad(Integer Id, String fecha, String Descripcion_Actividad, int Tiempo_actividad) {
        this.Id = Id;
        this.fecha = fecha;
        this.Descripcion_Actividad = Descripcion_Actividad;
        this.Tiempo_actividad = Tiempo_actividad;
    }
  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Id != null ? Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.Id == null && other.Id != null) || (this.Id != null && !this.Id.equals(other.Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitty.ActividadJpa[ Id=" + Id + " ]";
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
