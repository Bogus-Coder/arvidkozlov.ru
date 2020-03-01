package ru.arvidkozlov.calc.primefaces;

import org.slf4j.LoggerFactory;
import ru.arvidkozlov.calc.data.CalculatorData;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class CalcForm {

    private final CalculatorData data = new CalculatorData();

    private String result;

    public CalculatorData getData() {
        return data;
    }

    public void calculate(ActionEvent event) {

        try {
            result = data.calculate();
            LoggerFactory.getLogger(CalcForm.class).info(result.replaceAll("<br/>", "\r\n"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getLocalizedMessage(), null));
        }
    }

    public String getResult() {
        return result;
    }
}
