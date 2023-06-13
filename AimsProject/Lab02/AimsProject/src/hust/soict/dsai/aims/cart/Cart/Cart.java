package hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED =20;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	
	//add an item to the list
		public void addDigitalVideoDisc(DigitalVideoDisc disc) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered[qtyOrdered++] = disc;
				System.out.println("The disc has been added");
			}
			else {
				System.out.println("The cart is almost full");
			}
		}

		public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
			for (DigitalVideoDisc disc: dvdList) {
				if (qtyOrdered < MAX_NUMBERS_ORDERED) {
					itemsOrdered[qtyOrdered++] = disc;
					System.out.println("The disc has been added");
				}
				else {
					System.out.println("The cart is almost full");
				}
			}
		}
		
		public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) { 
				addDigitalVideoDisc(dvd1);
				addDigitalVideoDisc(dvd2);
		}
		
		//remove the item passed by argument from the list
		public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
			for(int i = 0; i <qtyOrdered; i++) {
				if (itemsOrdered[i] == disc) {
					for(int j = i; j < qtyOrdered; j++) {
						itemsOrdered[j] = itemsOrdered[i+1];
					}
					itemsOrdered[--qtyOrdered] = null; 
					
				}
			}
		}
		
		//TotalCost method
		public float totalCost() {
			float totalCost = 0;
			for (int i = 0; i < qtyOrdered; i++) {
				totalCost +=  itemsOrdered[i].getCost();
			}
			return totalCost;
		}

		public void print(){
			System.out.println("***********************CART*********************** ");
			System.out.println("Ordered Items:");
			for (int i = 0; i < qtyOrdered; i++) {
				DigitalVideoDisc dvd = itemsOrdered[i];
				System.out.println((i+1) + " " + dvd.getDetail());
			}
			System.out.println("Total Cost: " + totalCost());
			System.out.println("***************************************************");
		}
		
		/*public void searchByTitle(String title) {
			boolean foundMatch=false;
			System.out.println("Search results for title: "+title);
			for (DigitalVideoDisc dvd: items) {
		} */
	

}
