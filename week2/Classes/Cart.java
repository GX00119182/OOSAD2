package Classes;

public class Cart {

	private CartItem cartItems;
	int id = 0;
	public Cart(int id, CartItem c) {
		id = id;
		cartItems = c;
	}
	
	public void printCart(){
	System.out.println("cart item:" + id);
	}


}
