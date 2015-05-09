
package models;


public class Benutzer {
    private String name;
    private String email;
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
