package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import java.util.List;

public class SeleccionFecha implements Interaction {

    private Target btnCalendario;
    private Target seleccionarMes;
    private Target seleccionarAnio;
    private Target seleccionarDia;
    private String fechaBirthday;


    public SeleccionFecha(Target btnCalendario, Target seleccionarMes, Target seleccionarAnio, Target seleccionarDia, String fechaBirthday) {
        this.btnCalendario = btnCalendario;
        this.seleccionarMes = seleccionarMes;
        this.seleccionarAnio = seleccionarAnio;
        this.seleccionarDia = seleccionarDia;
        this.fechaBirthday = fechaBirthday;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        seleccionarFecha(fechaBirthday, actor);
    }

    public void seleccionarFecha(String fechaBirthday, Actor actor) {
        WebElementFacade abrirCalendario = btnCalendario.resolveFor(actor);
        if (abrirCalendario.isPresent()) {
            abrirCalendario.click();
            String[] splitFecha = fechaBirthday.split("-");
            seleccionarAnio(splitFecha[0], actor);
            seleccionarMes(splitFecha[1], actor);
            seleccionarDias(splitFecha[2], actor);
        }
    }

    public void seleccionarDias(String dia, Actor actor) {
        List<WebElementFacade> selectDia = seleccionarDia.resolveAllFor(actor);
        for (WebElementFacade listaDias : selectDia) {
            if (listaDias.getText().equals(dia)) {
                listaDias.click();
                break;
            }
        }
    }

    public void seleccionarMes(String mes, Actor actor) {
        WebElementFacade selectMes = seleccionarMes.resolveFor(actor);
        selectMes.selectByVisibleText(mes);
    }

    public void seleccionarAnio(String anio, Actor actor) {
        WebElementFacade selectAnio = seleccionarAnio.resolveFor(actor);
        selectAnio.selectByVisibleText(anio);
    }

    public static SeleccionFecha deLaInstalacion(Target btnCalendario, Target seleccionarMes, Target seleccionarAnio, Target seleccionarDia, String fechaInstalacion) {
        return new SeleccionFecha(btnCalendario, seleccionarMes, seleccionarAnio, seleccionarDia, fechaInstalacion);
    }


}
