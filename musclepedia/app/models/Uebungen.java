package models;

import play.data.format.*;
import play.data.validation.*;
import javax.persistence.Entity;
//@Entity
public class Uebungen {
    public int uebung_id;
    private String name;
    private Muskel mu;
    private String beschreibung;
    private String schwierigkeit;

    public Uebungen(String name, Muskel muskel,String beschreibung,String schwierigkeit){
        this.name=name;
        this.mu= muskel;
        this.beschreibung = beschreibung;
        this.schwierigkeit=schwierigkeit;
    }


}
