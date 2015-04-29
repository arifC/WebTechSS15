package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result login(){

        return ok(login.render());
    }


    public static Result start() {
        return ok(home.render());
    }

    public static Result help() {
        return ok(help.render());
    }

    public static Result oberkoerper() {
        return ok(oberkoerper.render());
    }


}
