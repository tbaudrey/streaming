/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * changement tttttttttttttttttt
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 *
 * @author admin
 */
@Entity
public class Pays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;

    public Pays(String nom) {
        this.nom = nom;
    }
    
    public Pays(){
        
    }

    public List<Serie> getPaysSerie() {
        return paysSerie;
    }

    public void setPaysSerie(List<Serie> paysSerie) {
        this.paysSerie = paysSerie;
    }

    public List<Film> getPaysFilm() {
        return paysFilm;
    }

    public void setPaysFilm(List<Film> paysFilm) {
        this.paysFilm = paysFilm;
    }
    
    @OneToMany(mappedBy = "pays", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Serie> paysSerie = new ArrayList<>();
    
    @OneToMany(mappedBy = "pays", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Film> paysFilm = new ArrayList<>();    
    
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Pays[ id=" + id + " ]";
    }
    
}
