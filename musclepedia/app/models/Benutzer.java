
package models;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Benutzer extends Model
    @Id
    public long benutzer_id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private int passwort;
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
