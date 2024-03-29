package CapaDatos;
// Generated 10/07/2015 12:08:40 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Proyectoft generated by hbm2java
 */
@Entity
@Table(name="proyectoft"
    ,catalog="procesosproyectofinaldb"
)
public class Proyectoft  implements java.io.Serializable {


     private Integer idproyectoft;
     private Direccion direccion;
     private SeccionDep seccionDep;
     private Usuario usuario;
     private String nombrePy;
     private String descripcionPy;
     private String comentarioPy;
     private Date fechaIniPy;
     private Integer porcentajePy;
     private Integer estadoPy;
     private String enlace;

    public Proyectoft() {
    }

	
    public Proyectoft(Direccion direccion, SeccionDep seccionDep, Usuario usuario, String descripcionPy, String comentarioPy, Date fechaIniPy) {
        this.direccion = direccion;
        this.seccionDep = seccionDep;
        this.usuario = usuario;
        this.descripcionPy = descripcionPy;
        this.comentarioPy = comentarioPy;
        this.fechaIniPy = fechaIniPy;
    }
    public Proyectoft(Direccion direccion, SeccionDep seccionDep, Usuario usuario, String nombrePy, String descripcionPy, String comentarioPy, Date fechaIniPy, Integer porcentajePy, Integer estadoPy, String enlace) {
       this.direccion = direccion;
       this.seccionDep = seccionDep;
       this.usuario = usuario;
       this.nombrePy = nombrePy;
       this.descripcionPy = descripcionPy;
       this.comentarioPy = comentarioPy;
       this.fechaIniPy = fechaIniPy;
       this.porcentajePy = porcentajePy;
       this.estadoPy = estadoPy;
       this.enlace = enlace;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idproyectoft", unique=true, nullable=false)
    public Integer getIdproyectoft() {
        return this.idproyectoft;
    }
    
    public void setIdproyectoft(Integer idproyectoft) {
        this.idproyectoft = idproyectoft;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="iddireccion", nullable=false)
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idseccion", nullable=false)
    public SeccionDep getSeccionDep() {
        return this.seccionDep;
    }
    
    public void setSeccionDep(SeccionDep seccionDep) {
        this.seccionDep = seccionDep;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idusu", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="nombre_py", length=45)
    public String getNombrePy() {
        return this.nombrePy;
    }
    
    public void setNombrePy(String nombrePy) {
        this.nombrePy = nombrePy;
    }

    
    @Column(name="descripcion_py", nullable=false, length=500)
    public String getDescripcionPy() {
        return this.descripcionPy;
    }
    
    public void setDescripcionPy(String descripcionPy) {
        this.descripcionPy = descripcionPy;
    }

    
    @Column(name="comentario_py", nullable=false, length=500)
    public String getComentarioPy() {
        return this.comentarioPy;
    }
    
    public void setComentarioPy(String comentarioPy) {
        this.comentarioPy = comentarioPy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_ini_py", nullable=false, length=19)
    public Date getFechaIniPy() {
        return this.fechaIniPy;
    }
    
    public void setFechaIniPy(Date fechaIniPy) {
        this.fechaIniPy = fechaIniPy;
    }

    
    @Column(name="porcentaje_py")
    public Integer getPorcentajePy() {
        return this.porcentajePy;
    }
    
    public void setPorcentajePy(Integer porcentajePy) {
        this.porcentajePy = porcentajePy;
    }

    
    @Column(name="estado_py")
    public Integer getEstadoPy() {
        return this.estadoPy;
    }
    
    public void setEstadoPy(Integer estadoPy) {
        this.estadoPy = estadoPy;
    }

    
    @Column(name="enlace", length=500)
    public String getEnlace() {
        return this.enlace;
    }
    
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }




}


