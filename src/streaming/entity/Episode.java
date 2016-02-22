/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
public class Episode implements Serializable {
    

    public List<Lien> getEpisodelien() {
        return Episodelien;
    }

    public void setEpisodelien(List<Lien> Episodelien) {
        this.Episodelien = Episodelien;
    }

    public Saison getSaison() {
        return saison;
    }

    public void setSaison(Saison saison) {
        this.saison = saison;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long numEpi;
    private String titre;

    public Episode(Long numEpi, String titre) {
        this.numEpi = numEpi;
        this.titre = titre;
    }
    
    public Episode(){
        
    }

    public Long getNumEpi() {
        return numEpi;
    }

    public void setNumEpi(Long numEpi) {
        this.numEpi = numEpi;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    @OneToMany(mappedBy = "episode", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Lien> Episodelien = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "SAISON_ID")
    private Saison saison;
    
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
        if (!(object instanceof Episode)) {
            return false;
        }
        Episode other = (Episode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Episode[ id=" + id + " ]";
    }
    
}
