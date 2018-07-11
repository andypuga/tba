package com.sicon.tba.entidades;

import javax.persistence.*;

@Entity
@Table(name = "TBA_CIUDAD")
public class TbaCiudad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CIUDAD")
    private Integer idCiudad;
    @ManyToOne
    @JoinColumn(name="ID_PROVINCIA")
    private TbaProvincia idProvincia ;
    @Column(name = "NOMBRE_CIUDAD")
    private String nombreCiudad;
    @Column(name = "CODIGO_CIUDAD")
    private String CodigoCuidad;

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public TbaProvincia getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(TbaProvincia idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCodigoCuidad() {
        return CodigoCuidad;
    }

    public void setCodigoCuidad(String codigoCuidad) {
        CodigoCuidad = codigoCuidad;
    }
}
