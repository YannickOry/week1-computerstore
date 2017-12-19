package be.pxl.computerstore.hardware;


public class Processor extends Article {


	private double clockspeed;
	
	public Processor(String vendor,String name, double price, double clockspeed) {
		setVendor(vendor);
		setName(name);
		setPrice(price);
		setClockspeed(clockspeed);
	
	}


	public double getClockspeed() {
		return clockspeed;
	}

	public void setClockspeed(double clockspeed) {
		if (clockspeed < 0.7) {
			this.clockspeed = 0.7;
		} else {
			this.clockspeed = clockspeed;
		}
		
	}


	@Override
	public String toString() {
		return super.toString() + "\nClock speed = " + getClockspeed() + "GHz";
	}

	
}
