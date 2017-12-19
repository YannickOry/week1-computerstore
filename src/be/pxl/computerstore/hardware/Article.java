	package be.pxl.computerstore.hardware;

import java.util.Random;

public class Article {

	private String vendor;
	private String name;
	private double price;
	private String articleNumber;
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}

	@Override
	public String toString() {
		return "ArticleNumber = " + getArticleNumber() + "\nVendor = " + vendor + "\nName = "+ name +"\nPrice = " +price;
	}

	public void genereer() {
		if (vendor.length() == 1) {
			vendor = vendor + "XX";
		} else {
			if (vendor.length() == 2) {
				vendor = vendor + "x";
			}
		}
		String artikel = vendor.substring(0, 3).toUpperCase();
		int nummer;
		Random random = new Random();
		if (artikel.length() == 1) {
			artikel = artikel + "XX";
		} else {
			if (artikel.length() == 2) {
				artikel = artikel + "X";
			}
		}
		artikel = artikel + "-";
		StringBuilder getal = new StringBuilder();
		nummer = random.nextInt(100000);
		getal.append(nummer);
		while (getal.length() < 5) {
			getal.reverse();
			getal.append(0);
			getal.reverse();
		}
		artikel = artikel + getal + "-";
		getal = new StringBuilder();
		nummer = random.nextInt(1000);
		getal.append(nummer);
		while (getal.indexOf("0") != -1 || getal.length() < 3) {
			getal = new StringBuilder();
			nummer = random.nextInt(1000);
			getal.append(nummer);
		}
		artikel = artikel + getal;
		setArticleNumber(artikel);
	}
public String getShortDescription() {
	return getArticleNumber() + " * "+ getName() + " * " + getPrice() + "€";
}
}
