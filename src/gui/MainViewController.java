package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem MenuItemSeller;
	
	@FXML
	private MenuItem MenuItemDepartment;
	
	@FXML
	private MenuItem MenuItemAbout;
	
	@FXML
	public void OnMenuItemSellerAction() {
		System.out.println("OnMenuItemSellerAction");
	}
	
	@FXML
	public void OnMenuItemDepartmentAction() {
		System.out.println("OnMenuItemDepartmentAction");
	}
	
	@FXML
	public void OnMenuItemAboutAction() {
		System.out.println("OnMenuItemAboutAction");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
