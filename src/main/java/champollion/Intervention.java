package champollion;

import java.util.Date;

public class Intervention {
    private Date debut;
    private int duree;
    private boolean annulee;
    private int heureDebut;
    private TypeIntervention type;

    public Intervention(TypeIntervention type) {
        this.type = type;
    }
}
