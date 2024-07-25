package co.com.ejercicio.software.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class) //-> Para trabajar con Cucumber y Serenity
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "co.com.ejercicio.software.stepsDefinitions", //Screenplay
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
        plugin = "pretty",
        tags = "@buyProducts"
)
public class buyRunner {

}
