package controllers;

import models.ScheduleBuild;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
	private static final Form<ScheduleBuild> scheduleForm = form(ScheduleBuild.class);
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }
  
}