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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 *
 * @author admin
 */
@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String synopsis;
    private Long annee;

    @ManyToOne
    @JoinColumn(name = "PAYS_ID")
    private Pays pays;

    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private Genre genre;

    @OneToMany(mappedBy = "film", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Lien> liens = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Film_Realisateur")
    private List<Realisateur> realisateurs = new ArrayList<>();

    public Film(Long id, String titre, String synopsis, Long annee, Pays pays, Genre genre) {
        this.id = id;
        this.titre = titre;
        this.synopsis = synopsis;
        this.annee = annee;
        this.pays = pays;
        this.genre = genre;
    }

    public Film() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Lien> getLiens() {
        return liens;
    }

    public void setLiens(List<Lien> liens) {
        this.liens = liens;
    }

    public List<Realisateur> getRealisateurs() {
        return realisateurs;
    }

    public void setRealisateurs(List<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.FILM[ id=" + id + " ]";
    }

}
