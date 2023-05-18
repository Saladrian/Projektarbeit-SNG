package app;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



import data.MotorCar;
import data.Customer;
import data.Location;
public class AppManager {

	private static AppManager instance;
	private List<MotorCar> allCars = new ArrayList<MotorCar>();
	private List<Customer> allCustomers = new ArrayList<Customer>();
	
	
	
	
	private AppManager() {
		
	}
	
	public static  AppManager getInstance() {
		if(instance == null) {
			instance = new AppManager();
		}
		return instance;
	}
	
	public long createId() {
		return 0;
	}
	
	
	public void createMotorcar(String license,
			String name, String type, int km, Timestamp nextCheck,Location loc ) {
		
	}
	
	public void deleteCar(String license) {
		
	}
	
	private void writeCarsToFile(String filepath) {
		
	}
	
	private List<MotorCar> readCarsFromFile(String filepath){
		
		return allCars;
	}
	
	private void exportCarsToFile(String filepath) {
		
	}
	
	private List<MotorCar> importCarsFromFile(String filepath){
		return allCars;
	}
	
	private void writeCustomersToFile(String filepath) {
		
	}
	
	private  List<MotorCar> readCustomerToFile(String filepath) {
		return allCars;
		
		
	}
	
	private void exportCustomersToFile(String filepath) {
		
	}
	
	private List<Customer> importCustomersFromFile(String filepath) {
	return allCustomers;	
	}
	
	public void readDate() {
		
	}
	
	public void saveData() {
		
	}
	
	public void importData() {
		
	}
	
	public void exportData() {
		
	}
	
	public List<MotorCar> getCars(){
		return allCars;
	}
	
	public List<MotorCar> getCustomers(){
		return allCars;
	}
	
	

	public MotorCar getSpecificCar(long id) {
		return null;
		
	}
	
	public void resetSelections() {
		
	}
	
	public void createCustomer(String name, String vorname, String adresse) {
		
	}
	
	public void deleteCustomer(int cld) {
		
	}
	
	public Customer getCustomer(){
		return null;
		
	}
	
	
	public Customer getSpecificCustomer(long id) {
		return null;
		
	}
}
