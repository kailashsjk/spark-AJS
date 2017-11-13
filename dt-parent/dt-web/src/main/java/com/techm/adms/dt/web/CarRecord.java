package com.techm.adms.dt.web;

public class CarRecord implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String vin;
	private String model;
	private String timestamp;
	private String outsidetemperature;
	private String enginetemperature;
	private String speed;
	private String fuel;
	private String engineoil;
	private String tirepressure;
	private String odometer;
	private String city;
	private String accelerator_pedal_position;
	private String parking_brake_status;
	private String headlamp_status;
	private String brake_pedal_status;
	private String transmission_gear_position;
	private String ignition_status;
	private String windshield_wiper_status;
	private String abs;
	private String modelCount;
	private String count;
	//private String gendate;
	

	public CarRecord() {
		super();
	}
	public CarRecord(String model, String speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	
	public CarRecord(String vin, String model, String timestamp,
			String outsidetemperature, String enginetemperature, String speed,
			String fuel, String engineoil, String tirepressure,
			String odometer, String city, String accelerator_pedal_position,
			String parking_brake_status, String headlamp_status,
			String brake_pedal_status, String transmission_gear_position,
			String ignition_status, String windshield_wiper_status, String abs, String modelCount, String count
			) {
		super();
		this.vin = vin;
		this.model = model;
		this.timestamp = timestamp;
		this.outsidetemperature = outsidetemperature;
		this.enginetemperature = enginetemperature;
		this.speed = speed;
		this.fuel = fuel;
		this.engineoil = engineoil;
		this.tirepressure = tirepressure;
		this.odometer = odometer;
		this.city = city;
		this.accelerator_pedal_position = accelerator_pedal_position;
		this.parking_brake_status = parking_brake_status;
		this.headlamp_status = headlamp_status;
		this.brake_pedal_status = brake_pedal_status;
		this.transmission_gear_position = transmission_gear_position;
		this.ignition_status = ignition_status;
		this.windshield_wiper_status = windshield_wiper_status;
		this.abs = abs;
		this.modelCount=modelCount;
		this.count=count;
		//this.gendate = gendate;
	}
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getOutsidetemperature() {
		return outsidetemperature;
	}
	public void setOutsidetemperature(String outsidetemperature) {
		this.outsidetemperature = outsidetemperature;
	}
	public String getEnginetemperature() {
		return enginetemperature;
	}
	public void setEnginetemperature(String enginetemperature) {
		this.enginetemperature = enginetemperature;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getEngineoil() {
		return engineoil;
	}
	public void setEngineoil(String engineoil) {
		this.engineoil = engineoil;
	}
	public String getTirepressure() {
		return tirepressure;
	}
	public void setTirepressure(String tirepressure) {
		this.tirepressure = tirepressure;
	}
	public String getOdometer() {
		return odometer;
	}
	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAccelerator_pedal_position() {
		return accelerator_pedal_position;
	}
	public void setAccelerator_pedal_position(String accelerator_pedal_position) {
		this.accelerator_pedal_position = accelerator_pedal_position;
	}
	public String getParking_brake_status() {
		return parking_brake_status;
	}
	public void setParking_brake_status(String parking_brake_status) {
		this.parking_brake_status = parking_brake_status;
	}
	public String getHeadlamp_status() {
		return headlamp_status;
	}
	public void setHeadlamp_status(String headlamp_status) {
		this.headlamp_status = headlamp_status;
	}
	public String getBrake_pedal_status() {
		return brake_pedal_status;
	}
	public void setBrake_pedal_status(String brake_pedal_status) {
		this.brake_pedal_status = brake_pedal_status;
	}
	public String getTransmission_gear_position() {
		return transmission_gear_position;
	}
	public void setTransmission_gear_position(String transmission_gear_position) {
		this.transmission_gear_position = transmission_gear_position;
	}
	public String getIgnition_status() {
		return ignition_status;
	}
	public void setIgnition_status(String ignition_status) {
		this.ignition_status = ignition_status;
	}
	public String getWindshield_wiper_status() {
		return windshield_wiper_status;
	}
	public void setWindshield_wiper_status(String windshield_wiper_status) {
		this.windshield_wiper_status = windshield_wiper_status;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	public String getModelCount() {
		return modelCount;
	}
	public void setModelCount(String modelCount) {
		this.modelCount = modelCount;
	}
	/*public String getGendate() {
		return gendate;
	}
	public void setGendate(String gendate) {
		this.gendate = gendate;
	}*/
	@Override
	public String toString() {
		return "CarRecord [model=" + model + ", speed=" + speed + ", city="
				+ city + "]";
	}
	
	}
