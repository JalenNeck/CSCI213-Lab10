/**
*
* @author Jalen Neck
* date: 02/22/2020
*/
public class Car extends Vehicle{
	
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers) {
		super(aMake, aModel, aPlate);
		this.make = aMake;
		this.model = aModel;
		this.plate = aPlate;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		String result = "";
		result = String.format(" #-%d %s %s with license %s", this.doors, this.make, this.model, this.plate);
		return result;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		// wrong type
		Car otherCar = (Car) obj;
		// cast, check Car properties
		if(this.getDoors() == otherCar.getDoors()) {
			return super.equals(otherCar); // check superclass properties
		}
		else if(this.getPassengers() == otherCar.getPassengers()) {
			return super.equals(otherCar); // check superclass properties
		}
		return false;
	}
	public Car copy() {
	// create and return a copy
		Car CarCopy = new Car(this.getMake(), this.getModel(), this.getPlate());
			
		return CarCopy;
	}
	}	
	




