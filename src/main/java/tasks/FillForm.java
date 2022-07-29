package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Picap;
import static userinterfaces.Picap.*;

import java.io.File;

import org.mockito.internal.matchers.Find;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

import interactions.Gender;
import interactions.Hobbie;
import interactions.SeleccionFecha;


@SuppressWarnings("unused")
public class FillForm implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("CAMILO").into(NAME), Enter.theValue("DUCON").into(LAST_NAME),
				Enter.theValue("CAMILODUCON@GMAIL.COM").into(EMAIL));
		actor.attemptsTo(Gender.form("Female"));
		actor.attemptsTo(Enter.theValue("3213726333").into(PHONE));
		actor.attemptsTo(SeleccionFecha.deLaInstalacion(btnOpenCalendar, SELECT_MOUNTH, SELECT_YEAR, SELECT_DAY, "1991-February-05"));
		actor.attemptsTo(Hobbie.form("Reading"));
	}

	public static FillForm intoPicap() {
		return instrumented(FillForm.class);
	}

}
