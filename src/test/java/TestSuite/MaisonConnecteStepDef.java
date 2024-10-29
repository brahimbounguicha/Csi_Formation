package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.MaisonConnectePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteStepDef {

@Given("utilisateur est sur la page de maison connecte")
public void utilisateur_est_sur_la_page_de_maison_connecte() {
Config.driver = new ChromeDriver();
Config.confChrome();
Config.maxWindow();
String url = "https://mistore.com.tn/product-category/maison-connectee/";
Config.driver.get(url);
}

@When("utilisateur effectue le tri {string} et clique sur le produit {string}")
public void utilisateur_effectue_le_tri_et_clique_sur_le_produit(String sortTri, String nameProd) {
    MaisonConnectePage mm = new MaisonConnectePage();
    mm.sortTriAndClickProduct(sortTri, nameProd);
}

@Then("utilisateur est derigee vers la page du produit {string}")
public void utilisateur_est_derigee_vers_la_page_du_produit(String x) {
	 MaisonConnectePage mm = new MaisonConnectePage();
	 mm.verifProduct(x);
}

}
