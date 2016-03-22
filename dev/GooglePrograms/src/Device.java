
public class Device {

	private String Manufacturer;
	private String Model;
	
	public Device(String manufacturer, String model) {
		
		this.Manufacturer = manufacturer;
		this.Model = model;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.Manufacturer = manufacturer;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		this.Model = model;
	}
	
	@Override
	public boolean equals(Object otherObject){
		if(otherObject==null){
		return false;
		}
		
		Device device = (Device) otherObject;
		if((device.getManufacturer().equals(this.Manufacturer))&&(device.getModel().equals(this.Model))){
		return true;
		
		}
		
		return false;
	}
	
}
