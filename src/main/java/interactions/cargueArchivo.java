package interactions;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Interaction;


import net.serenitybdd.screenplay.targets.Target;


public class cargueArchivo implements Interaction {

	private Target idCarguePlantilla;

	private String rutaPlantilla;

	public cargueArchivo(Target idCarguePlantilla, String rutaPlantilla) {

		this.idCarguePlantilla = idCarguePlantilla;

		this.rutaPlantilla = rutaPlantilla;

	}

	@Override

	public <T extends Actor> void performAs(T actor) {

		WebElementFacade campoCargue = idCarguePlantilla.resolveFor(actor);

		campoCargue.sendKeys(rutaPlantilla);

	}

	public static cargueArchivo enAdministrador(Target idCarguePlantilla, String rutaPlantilla) {

		return new cargueArchivo(idCarguePlantilla, rutaPlantilla);

	}

}
