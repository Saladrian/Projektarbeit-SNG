package data;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MotorCar implements Serializable {

	private long fzid;
	private String license;
	private String name;
	private String type;
	private int km;
	private Timestamp nextCheck;
	private List<Location> locations;
	//private SwingWayPoint swPoint;
	
	
	public MotorCar(long fzId, String license, String name, String type, int km, Timestamp nextCheck) {
	super();
	this.fzid = fzId;
	this.license = license;
	this.name = name;
	this.type = type;
	this.km = km;
	this.nextCheck = nextCheck;
		
	}
	
	
	public long getFzId() {
		return fzid;
		
	}
	
	public String getLicense() {
		return license;
		
	}
	
	public String getName() {
		return license;
		
	}
	
	public String getType() {
		return license;
		
	}
	
	public void setType(String type) {
		
	}
	
	public int getKm() {
		return km;
		
	}
	
	public void setKm(int km) {
		
	}
	
	public Timestamp getNextCheck() {
		return nextCheck;
		
	}
	
	
	public void setNextCheck (Timestamp nextCheck) {
		
	}
	
	public Location getLastPos() {
		if(locations != null && locations.size() >0) {
			return locations.get(locations.size()-1);
		}
		return null;
	}
	
	public List<Location> getLocationList(){
		return locations;
		
	}
	
	public void addLocation(Location loc) {
		
		if(locations == null) {
			locations = new ArrayList<Location>();
		}
		
		locations.add(loc);
		
	}
	
	//public SwingWaypoint getMyPoint() {
		
	//}
	
	//public void setMyPoint(SwingWaypoint swp) {
		
	//}
	
	public String toString() {
		return license;
		
		
	}
	
	
	public String[] getCarData() {
		return null;
		
	}
	
	public String[] getCarColumns() {
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
