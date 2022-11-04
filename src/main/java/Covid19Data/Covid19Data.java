package Covid19Data;

import java.time.LocalDate;


public class Covid19Data {
    private String region;
    private String aldersgruppe; // fra til
    private int tilfalde;
    private int dode;
    private int inlagtIntensiv;
    private int indlagte;
    //private LocalDate dato;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int tilfalde, int dode, int inlagtIntensiv,
                       int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.tilfalde = tilfalde;
        this.dode = dode;
        this.inlagtIntensiv = inlagtIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return region +" "+ aldersgruppe+" "+tilfalde+" "+dode+" "+inlagtIntensiv+" "+indlagte+" "+dato+"\n";
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getTilfalde() {
        return tilfalde;
    }

    public int getDode() {
        return dode;
    }

    public int getInlagtIntensiv() {
        return inlagtIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }
}
