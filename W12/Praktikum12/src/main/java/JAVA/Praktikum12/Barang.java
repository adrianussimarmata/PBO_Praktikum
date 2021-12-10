package JAVA.Praktikum12;

public class Barang {

	private int weight;
	private int quantity;
	private int priceItem;
	private String productName;
	private Status status;
	private ServicePackage servicePackage;
	private City city;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(int priceItem) {
		this.priceItem = priceItem;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ServicePackage getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(ServicePackage servicePackage) {
		this.servicePackage = servicePackage;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public int getTotal() {
		return priceItem * quantity;
	}
	
	public String toString() {
		return "Barang(" + productName + " | " + quantity + " | " + weight + " | " + city.getDestination() + " | " +
				servicePackage.getService() + " | " + servicePackage.getValue() + " | " + getTotal() + " ) ";
	}
}
