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

    public static Result oberkoerper() {return ok(oberkoerper.render());
    }

    public static Result studios(){return ok(studios.render());}

    public static Result knStudio(){return ok(knStudios.render());}

    public static Result arme() {return ok(arme.render());
    }

    public static Result beine() {return ok(beine.render());
    }

    public static Result bauch() {return ok(bauch.render());
    }


}
