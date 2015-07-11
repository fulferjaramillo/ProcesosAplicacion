package CapaDatos;
// Generated 10/07/2015 12:08:40 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SeccionDep generated by hbm2java
 */
@Entity
@Table(name = "seccion_dep", catalog = "procesosproyectofinaldb"
)
public class SeccionDep implements java.io.Serializable {

    private int idseccion;
    private String nombreS;
    private Set propuestas = new HashSet(0);
    private Set proyectofts = new HashSet(0);
    private Set proyectofts_1 = new HashSet(0);
    private Set usuarios = new HashSet(0);

    public SeccionDep() {
    }

    public SeccionDep(int idseccion) {
        this.idseccion = idseccion;
    }

    public SeccionDep(int idseccion, String nombreS, Set propuestas, Set proyectofts, Set proyectofts_1, Set usuarios) {
        this.idseccion = idseccion;
        this.nombreS = nombreS;
        this.propuestas = propuestas;
        this.proyectofts = proyectofts;
        this.proyectofts_1 = proyectofts_1;
        this.usuarios = usuarios;
    }

    @Id
    @Column(name = "idseccion", unique = true, nullable = false)
    public int getIdseccion() {
        return this.idseccion;
    }

    public void setIdseccion(int idseccion) {
        this.idseccion = idseccion;
    }

    @Column(name = "nombre_s", length = 45)
    public String getNombreS() {
        return this.nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seccionDep")
    public Set getPropuestas() {
        return this.propuestas;
    }

    public void setPropuestas(Set propuestas) {
        this.propuestas = propuestas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seccionDep")
    public Set getProyectofts() {
        return this.proyectofts;
    }

    public void setProyectofts(Set proyectofts) {
        this.proyectofts = proyectofts;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seccionDep")
    public Set getProyectofts_1() {
        return this.proyectofts_1;
    }

    public void setProyectofts_1(Set proyectofts_1) {
        this.proyectofts_1 = proyectofts_1;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seccionDep")
    public Set getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

}
