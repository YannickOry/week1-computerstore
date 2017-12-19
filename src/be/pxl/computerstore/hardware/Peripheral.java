package be.pxl.computerstore.hardware;


public abstract class Peripheral extends Article{
	
	
	public Peripheral(String vendor, String name, double price) {
	setVendor(vendor);
	setName(name);
	setPrice(price);
	genereer();
	}
	
	public String getShortDescription() {
		return getArticleNumber() + " * "+ getClass().getSimpleName() + " * "  + getName() +" * " + getPrice() + "€";
	}

	@Override
	public String toString() {
		return "ArticleNumber = " + getArticleNumber() +"\nVendor = " + getVendor() + "\nPrice = " + getPrice();
	}
	
}
