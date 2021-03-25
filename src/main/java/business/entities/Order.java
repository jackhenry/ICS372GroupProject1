package business.entities;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public class Order implements Serializable{
	private String orderId;
	private Product product;
	private int quantity;
	private Calendar date;

	// Prefix with "R" instead of "O" because "O" looks like "0"
	private static final String ORDER_ID_PREFIX = "R";
	private static int idCounter = 0;

	/**
	 * Stores product, quantity and date.
	 * 
	 * @param product  product ordered
	 * @param quantity quantity ordered
	 * @param date     date ordered
	 */
	public Order(Product product, int quantity, Calendar date) {
		this.orderId = ORDER_ID_PREFIX + ++idCounter;
		this.product = product;
		this.quantity = quantity;
		this.date = date;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public Product getProduct() {
		return this.product;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public Calendar getDate() {
		return this.date;
	}
	/**
	 * save method
	 */
	public static void save(ObjectOutputStream output) throws IOException {
		output.writeObject(idCounter);
	}
	
	/**
	 * retrieve counter value
	 */
	public static void retrieve(ObjectInputStream input)
			throws IOException, ClassNotFoundException {
		Order.idCounter = (int) input.readObject();
	}
	

	@Override
	public String toString() {
		return "Order [product id=" + this.product.getProductId() + ", product name="
				+ this.product.getProductName() + ", quantity=" + this.quantity + "]";
	}

}
