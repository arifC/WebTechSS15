package models;

import play.data.format.*;
import play.db.ebean.*;
import javax.persistence.*;
import play.data.validation.*;
import javax.persistence.Entity;


@Entity
public class Benutzer{
    @Id
    public int benutzer_id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private int passwort;
    private Trainingsplan myPlan= new Trainingsplan("Custom Plan");

    public void addToPlan(Uebungen u){
        myPlan.addUebung(u);
    }
    public void deleteFromPlan(Uebungen u){
        myPlan.deleteUebung(u);
    }
    public void showPlan(){
        //wie sollen wir die hier ausgeben??
        myPlan.showPlan();
    }

    public Benutzer(String name,String mail,int passwort){
        this.name = name;
        this.email= mail;
        this.passwort=passwort;
    }
    public void changePasswort(int altpw, int neupw, int neuwiederholung){//beispielmethode
        if(altpw==passwort){
            if(neupw==neuwiederholung){
                this.passwort=neupw;
            }else
                    System.out.println("Wiederholung stimmt nicht");

        }else
            System.out.println("Passwort falsch");
    }
}
