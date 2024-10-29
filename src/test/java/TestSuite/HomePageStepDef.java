package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

@Given("utilisateur est sur la page dacceuil")
public void utilisateur_est_sur_la_page_dacceuil() throws Exception {
Config.driver = new ChromeDriver();
Config.confChrome();
Config.maxWindow();

Config.driver.get(Utils.getproprety("Web_portal_link"));
}

@When("utilisateur survole le souris sur le menu {string} et clique sur le submenu {string}")
public void utilisateur_survole_le_souris_sur_le_menu_et_clique_sur_le_submenu(String menuname, String submenuname) {
   HomePage page = new HomePage();
   page.mouseHoverOnMenu(menuname);
   page.clickOnProduct(submenuname);
}

@Then("utilisateur est dirige vers la page {string}")
public void utilisateur_est_dirige_vers_la_page(String name) {
	 HomePage page = new HomePage();
	 page.verif(name);
	 Config.closeBrowser();
}

}
