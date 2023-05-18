package view;

import java.awt.Container;
import java.sql.Timestamp;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import app.AppManager;
import data.MotorCar;
import data.Customer;
import view.mapView.MapPanel;

public class ViewManager {

	static final int car = 1;
	static final int Customer = 2;
	private static ViewManager instance;
	
	private Container rootPane;
	private MapPanel mapPanel;
	private JTabbedPane dataTabs;
	//private DataPanel carPanel;
	//private DataPanel customerPanel;
	private JPanel jPanelCars;
	private JPanel jPanelCustomers;
	private JTable tableCars;
	private JTable tableCust;

	
	private ViewManager() {
		
	}
	
	
	public static ViewManager getInstance() {
		
		if(instance == null) {
			instance = new ViewManager();
		
		}
		return instance;
	}
	
	public void setRootPane(Container root) {
		
	}
	
	public void setPanel(MapPanel map, JTabbedPane dataTabs) {
		
	}
	
	public void showStatusOverview() {
		
	}

	public void createMotorCar(String license, String name, String type, int km, Timestamp nextCheck) {
		
	}
	public void updateCarDataPanel(List<MotorCar> cars) {
		
	}
	
	public void selectCarFromMap(String id) {
		
	}
	
	public void selectCar(String id) {
		
	}
	
	public void selectCustomer(String id) {
		
	}
	public void createCustomer(String name, String vorname, String adresse) {
		
	}
	
	public void updateCustomerDataPanel(List<Customer> customers) {
		
	}
	
	public void showMessage(String message) {
		
	}
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
