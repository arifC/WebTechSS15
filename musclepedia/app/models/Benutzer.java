package models;

import play.data.format.*;
import play.data.validation.*;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.UUID;

@Entity
public class Benutzer{

    @Id
    private UUID benutzer_id;

    private String name;
    private String email;
    private String passwort;

    public Benutzer(UUID id, String name,String mail,String passwort){
        this.benutzer_id = id;
        this.name = name;
        this.email = mail;
        this.passwort = passwort;
    }

    public void changePasswort(String altpw, String neupw, String neuwiederholung){//beispielmethode
        if(altpw==passwort){
            if(neupw==neuwiederholung){
                this.passwort=neupw;
            }else
                    System.out.println("Wiederholung stimmt nicht");

        }else
            System.out.println("Passwort falsch");
    }
}
