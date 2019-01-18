package co.com.eafit.definitions;

import co.com.eafit.steps.DemoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DemoDefinition {
	
	@Steps
	DemoStep demoStep;
	
	
	@Given("^que Yeison quiere acceder a Metis$")
	public void queYeisonQuiereAccederAMetis() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    demoStep.CargarUrl();
	}


	@When("^en escribe el usuario \"([^\"]*)\" y la clave \"([^\"]*)\"$")
	public void enEscribeElUsuarioDemoYLaClaveDemo(String usuario, String clave) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		demoStep.EscribirCredenciales(usuario,clave);
	    
	}

	@Then("^el ve el mensaje de \"([^\"]*)\"$")
	public void elVeElMensajeDeBootstrapAdminTemplate(String tituloPantalla) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    demoStep.verificarAcceso(tituloPantalla);
	}
	
	
}
