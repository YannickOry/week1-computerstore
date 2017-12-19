package be.pxl.computerstore.hardware;

public class HardDisk extends Peripheral {
	
	private int opslagruimte;
	
	public HardDisk(String vendor,String name, double price,int opslagruimte) {
		super(vendor,name,price);
		this.setOpslagruimte(opslagruimte);
	}

	public int getOpslagruimte() {
		return opslagruimte;
	}

	public void setOpslagruimte(int opslagruimte) {
		this.opslagruimte = opslagruimte;
	}
	

}
