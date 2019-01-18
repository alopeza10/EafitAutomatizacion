package co.com.eafit.steps;

import co.com.eafit.pageobject.DemoPage;
import net.thucydides.core.annotations.Step;

public class DemoStep {
	DemoPage demoPage;

	@Step
	public void CargarUrl() {
		// TODO Auto-generated method stub
		demoPage.open();
	}

	public void EscribirCredenciales(String usuario, String clave) {
		// TODO Auto-generated method stub
		demoPage.RealizarAutenticacion(usuario,clave);
	}

	public void verificarAcceso(String tituloPantalla) {
		// TODO Auto-generated method stub
		demoPage.verificarTitulo(tituloPantalla);
	}
	
	

}
