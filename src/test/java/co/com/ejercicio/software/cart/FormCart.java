package co.com.ejercicio.software.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormCart {
    public static Performable addCart() {
        return Task.where("{0} adds product",
                Click.on(FormSearch.ADD_CART)
        );
    }

    public static Performable cartButton(){
        return Task.where("{0} cart button",
                Click.on(FormSearch.VIEW_CART)
        );
    }


    public static Performable guestChechout() {
        return Task.where("{0} guest checkout",
                Click.on(FormAcceptCheckout.CHECKOUT),
                Click.on(FormAcceptCheckout.GUEST),
                Click.on(FormAcceptCheckout.CONTINUE)
        );
    }

    public static Performable checkoutForm(String firstname, String lastname, String email, String telephone,
                                               String address, String city, String postcode, String country, String zone) {
        return Task.where("{0} checkout form",
                        Enter.theValue(firstname).into(FormAcceptCheckout.FIRST_NAME),
                        Enter.theValue(lastname).into(FormAcceptCheckout.LAST_NAME),
                        Enter.theValue(email).into(FormAcceptCheckout.EMAIL),
                        Enter.theValue(telephone).into(FormAcceptCheckout.TELEPHONE),
                        Enter.theValue(address).into(FormAcceptCheckout.ADDRESS),
                        Enter.theValue(city).into(FormAcceptCheckout.CITY),
                        Enter.theValue(postcode).into(FormAcceptCheckout.POSTCODE),
                        Click.on(FormAcceptCheckout.COUNTRY),
                        SelectFromOptions.byVisibleText(country).from(FormAcceptCheckout.COUNTRY),
                        Click.on(FormAcceptCheckout.ZONE),
                        SelectFromOptions.byVisibleText(zone).from(FormAcceptCheckout.ZONE),
                        Click.on(FormAcceptCheckout.CONTINUE_SHOPPING)
                )
                .with("firstname").of(firstname)
                .with("lastname").of(lastname)
                .with("email").of(email)
                .with("telephone").of(telephone)
                .with("address").of(address)
                .with("city").of(city)
                .with("postcode").of(postcode)
                .with("country").of(country)
                .with("zone").of(zone);
    }

    public static Performable continueShipping(){
        return Task.where("{0} clicks on continue",
                Click.on(FormAcceptCheckout.CONTINUE_SHOPPING1));
    }

    public static Performable continuePayment(){
        return Task.where("{0} clicks on continue",
                Click.on(FormAcceptCheckout.CONTINUE_SHOPPING2));
    }


    public static Performable termsAndConditions(){
        return Task.where("{0} terms and conditions",
                Click.on(FormAcceptCheckout.AGREE_TERMS));
    }

    public static Performable confirmOrder(){
        return Task.where("{0} confirms the order",
                Click.on(FormAcceptCheckout.CONFIRM_ORDER));
    }

}
