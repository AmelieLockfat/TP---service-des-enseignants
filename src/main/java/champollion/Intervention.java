package champollion;

import java.util.Date;

public class Intervention {
    private Salle salle;
    private Date debut;
    private int duree;
    private boolean annulee;
    private int heureDebut;
    private TypeIntervention type;

    public TypeIntervention getType() {
        return type;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public boolean isAnnulee() {
        return annulee;
    }

    public void setAnnulee(boolean annulee) {
        this.annulee = annulee;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setType(TypeIntervention type) {
        this.type = type;
    }

    public Intervention(TypeIntervention type) {
        this.type = type;
    }
}
