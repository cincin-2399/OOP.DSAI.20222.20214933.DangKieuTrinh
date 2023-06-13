package hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED =20;
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	//TotalCost method
	public void addMedia(Media a) {
		if (itemsOrdered.contains(a)) {
			itemsOrdered.add(a);
			System.out.println("The media has been added to the cart.");
		}
		else System.out.println("The media has already existed in the cart.");
	}
	public void removeMedia(Media a) {
		if(itemsOrdered.contains(a)) {
			itemsOrdered.remove(a);
			System.out.println("The media has been removed from the cart.");
		}
		else System.out.println("The media does not present in the cart.");
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (Media media: itemsOrdered) {
			totalCost+=media.getCost();
			}
		return totalCost;}

	public void print(){
		System.out.println("***********************CART*********************** ");
		System.out.println("Ordered Items:");
		for (Media media: itemsOrdered) {
			System.out.println(media.toString());
		}
		System.out.println("Total Cost: " + totalCost());
		System.out.println("***************************************************");
		}
		

}
