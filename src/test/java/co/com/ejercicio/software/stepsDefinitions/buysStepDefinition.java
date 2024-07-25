package co.com.ejercicio.software.stepsDefinitions;

import co.com.ejercicio.software.cart.FormCart;
import co.com.ejercicio.software.cart.Search;
import co.com.ejercicio.software.navigate.Navigate;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class buysStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) navegar a la pagina principal")
    public void homeCart(String actor) {
        theActorCalled(actor).attemptsTo(Navigate.OpenHomePage());
    }
    @When("buscar {string}")
    public void search(String product) {
        withCurrentActor(
                Search.product(product)
        );
    }

    @And("añadir al carrito")
    public void addCart() {
        withCurrentActor(
                FormCart.addCart()
        );
    }

    @And("verificar")
    public void items() throws InterruptedException {
        Target spanTotal = Target.the("total carrito").located(By.id("cart-total"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(spanTotal).text().contains("2 item")
        );

    }

    @When("Dar click en shoppind cart")
    public void goCart(){
        withCurrentActor(
                FormCart.cartButton()
        );
    }

    @When("Seleccionar guest checkout")
    public void goGuest(){
        withCurrentActor(
                FormCart.guestChechout()
        );
    }

    @When("llenar formulario {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillCheckoutForm(String firstname, String lastname, String email, String telephone, String address, String city, String postcode, String county, String zone){
        withCurrentActor(
                FormCart.checkoutForm(firstname, lastname, email, telephone, address, city, postcode, county, zone)
        );
    }



    @When("Dar click boton continue")
    public void clickOnContinue() {
        withCurrentActor(
                FormCart.continueShipping()
        );
    }

    @When("aceptar condiciones")
    public void acceptConditions() {
        withCurrentActor(
                FormCart.termsAndConditions(),
                FormCart.continuePayment()
        );
    }


    @When("confirmar compra")
    public void confirmCompra() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                FormCart.confirmOrder()
        );
    }

    @Then("Validar mensaje {string}")
    public void validatesMessage(String message) throws InterruptedException {
        Target confirmOrder = Target.the("message").located(By.xpath("//div[@id='content']/h1"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(confirmOrder).text().contains(message)
        );
    }




}
