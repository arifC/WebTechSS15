package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result login(){return ok(login.render());
    }

    public static Result start() {return ok(home.render());
    }

    public static Result help() {return ok(help.render());
    }
    public static Result oberkoerper() {return ok(uebungen_oberkoerper.render());
    }
    public static Result studios(){return ok(studios.render());}
    public static Result knStudio(){return ok(studios_kn.render());}
    public static Result arme() {return ok(uebungen_arme.render());
    }
    public static Result beine() {return ok(uebungen_beine.render());
    }
    public static Result bauch() {return ok(uebungen_bauch.render());
    }
    public static Result impress() {return ok(impressum.render());
    }
    public static Result kontakt(){return ok(kontakt.render());
    }
    public static Result profil(){return ok(profil.render());
    }
    public static Result plaene_anfaenger(){return ok(plaene_anfaenger.render());
    }
    public static Result plaene_fortgesch(){return ok(plaene_fortgesch.render());
    }


    public static Result plaene_profi() {
        return ok(plaene_profi.render());
    }
}
