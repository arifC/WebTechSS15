package models;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Bewertung extends Model{
    @Constraints.Max(10)
    private double ausstattung;
    @Constraints.Max(10)
    private double service;
    @Constraints.Max(10)
    private double preis;
    @Constraints.Max(10)
    private double lage;

    public Bewertung(double ausstattung, double service, double preis, double lage){
        this.ausstattung = ausstattung;
        this.service = service;
        this.preis = preis;
        this.lage = lage;
    }

    public double getAusstattung() {
        return ausstattung;
    }

    public void setAusstattung(double ausstattung) {
        this.ausstattung = ausstattung;
    }

    public double getService() {
        return service;
    }

    public void setService(double service) {
        this.service = service;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getLage() {
        return lage;
    }

    public void setLage(double lage) {
        this.lage = lage;
    }

}
