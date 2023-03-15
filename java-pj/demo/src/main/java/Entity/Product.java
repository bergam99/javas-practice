package Entity;

public class Product {
	private String name;
	private String description;
	private double price;
	public Product(String name, String description, double price) {
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String d) {
		this.description = d;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public double getPrice() {
		return this.price;
	}
}
