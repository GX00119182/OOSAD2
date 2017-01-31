package Classes;

public class Driver {

	private Cart testCart;

	/**
	 * 
	 * @param args
	 */
	public void main(String[] args) {
		CartItem i1 = new CartItem("Apple", 1);
		Cart c1 = new Cart(2,i1);
		c1.printCart();

	}

}
