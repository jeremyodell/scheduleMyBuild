package controllers;

import models.ScheduleBuild;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.schedule;

public class ScheduleController extends Controller {

	private static final Form<ScheduleBuild> scheduleForm = form(ScheduleBuild.class);
	public static Result list() {
		return TODO;
	}

	public static Result showBlank() {

		return ok(schedule.render(scheduleForm));
	}

	public static Result show(Long ean) {
		return TODO;
	}

	public static Result save() {
		Form<ScheduleBuild> boundForm = scheduleForm.bindFromRequest();
		ScheduleBuild scheduleBuild = boundForm.get();


		return ok(String.format("Saved product %s", scheduleBuild));
	}
}
