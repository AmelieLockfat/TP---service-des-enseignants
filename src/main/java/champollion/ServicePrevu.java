package champollion;

import java.util.ArrayList;

public class ServicePrevu {
    private UE ueconcerne;
	private int volumeCM;
    private int volumeTD;
    private int volumeTP;
    private ArrayList<Intervention> Interventions;

    public ServicePrevu(UE ueconcerne, int volumeCM, int volumeTD, int volumeTP, ArrayList<Intervention> interventions) {
        this.ueconcerne = ueconcerne;
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
        Interventions = interventions;
    }

    public ServicePrevu(UE ueconcerne, int volumeCM, int volumeTD, int volumeTP) {
        this.ueconcerne = ueconcerne;
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
    }

    public UE getUeconcerne() {
        return ueconcerne;
    }

    public int getVolumeCM() {
        return volumeCM;
    }

    public void setVolumeTP(int volumeTP) {
        this.volumeTP = volumeTP;
    }

    public ArrayList<Intervention> getInterventions() {
        return Interventions;
    }

    public void setInterventions(ArrayList<Intervention> interventions) {
        Interventions = interventions;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public void setVolumeTD(int volumeTD) {
        this.volumeTD = volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public void setVolumeCM(int volumeCM) {
        this.volumeCM = volumeCM;
    }

    @Override
    public String toString() {
        return "ServicePrevu{" +
                "ueconcerne=" + ueconcerne +
                ", volumeCM=" + volumeCM +
                ", volumeTD=" + volumeTD +
                ", volumeTP=" + volumeTP +
                '}';
    }
}
