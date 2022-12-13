package champollion;

import java.util.ArrayList;

public class Enseignant extends Personne {
    public ArrayList<ServicePrevu> ServicePrevu = new ArrayList<ServicePrevu>();
    public ArrayList<Intervention> InterventionsPrevues = new ArrayList<Intervention>();

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     */
    public int heuresPrevues() {
        double hP = 0;
        for (ServicePrevu sp : ServicePrevu) {
            hP = hP + (sp.getVolumeCM() * 1.5) + sp.getVolumeTP() * 0.75 + sp.getVolumeTD();
        }
        int heuresP = (int) Math.round(hP);
        return heuresP;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     */
    public int heuresPrevuesPourUE(UE ue) {
        double hP = 0;
        for (ServicePrevu sp : ServicePrevu) {
            if (sp.getUeconcerne() == ue) {
                hP = hP + (sp.getVolumeCM() * 1.5) + sp.getVolumeTP() * 0.75 + sp.getVolumeTD();
            }
        }
        int heuresP = (int) Math.round(hP);
        return heuresP;
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue       l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        ServicePrevu S = new ServicePrevu(ue, volumeCM, volumeTD, volumeTP);
        ServicePrevu.add(S);
    }

    public void ajouteIntervention(Intervention inter) {
        InterventionsPrevues.add(inter);
    }

    public boolean enSousService() {
        boolean test = false;
        if (heuresPrevues() < 192) {
            test = true;
        }
        return test;
    }

    public int resteAPlanifier(UE ue, TypeIntervention type) {
        int RP = 0;
        for (ServicePrevu sp : ServicePrevu) {
            if (sp.getUeconcerne() == ue) {

            }


        }
return RP
    }
}