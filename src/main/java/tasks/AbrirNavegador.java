package tasks;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.Picap;
public class AbrirNavegador implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new Picap()));
	}

	public static AbrirNavegador picap() {
		return instrumented(AbrirNavegador.class);  
	}
}
