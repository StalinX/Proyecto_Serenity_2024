package co.com.ejercicio.software.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search {
    public static Performable product(String product) {
        return Task.where("{0} attempts to search for #product",
                Clear.field(FormSearch.SEARCH_ELEMENT),
                Enter.theValue(product).into(FormSearch.SEARCH_ELEMENT),
                Click.on(FormSearch.SEARCH_BUTTON)
        ).with("product").of(product);
    }
}
