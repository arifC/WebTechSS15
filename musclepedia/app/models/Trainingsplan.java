package models;

import play.data.format.*;
import play.data.validation.*;
import javax.persistence.Entity;
import java.util.Collection;
import java.util.TreeMap;
import java.util.SortedMap;

//@Entity
public class Trainingsplan {
    public int Plan_id;
    private String typ;
    private SortedMap<Integer,Uebungen> uebungsliste = new TreeMap<Integer, Uebungen>();
    public Trainingsplan(String typ){
        this.typ=typ;
    }

    public void addUebung(Uebungen u){
        uebungsliste.put(u.uebung_id,u);
    }
    public void deleteUebung(Uebungen u){
        uebungsliste.remove(u.uebung_id);
    }
    public Collection<Uebungen> showPlan(){
        return uebungsliste.values();
    }

}
