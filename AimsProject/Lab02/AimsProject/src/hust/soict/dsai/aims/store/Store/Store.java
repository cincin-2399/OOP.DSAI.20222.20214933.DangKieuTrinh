package hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int itemCount;
	
	public Store(int capacity) {
		itemsInStore=new DigitalVideoDisc[capacity];
		itemCount=0;
	}
    
	public void addDVD(DigitalVideoDisc dvd) {
		if (itemCount<itemsInStore.length) {
			boolean exist=false;
			for (int i=0;i<itemCount;i++) {
				if(itemsInStore[i].equals(dvd)) {
					exist=true;
					break;
				}
			}
			if (!exist) {
				itemsInStore[itemCount]=dvd;
				itemCount++;
				System.out.println("DVD has been added to the store.");
			}
			else {
				System.out.println("DVD already exists in the store.");
			}
		}
		else System.out.println("The store is full. Cannot add more DVDs.");
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		boolean found=false;
		for (int i=0;i<itemCount;i++) {
			if (itemsInStore[i].equals(dvd)) {
				found=true;
				for (int j=i;j<itemCount-1;j++) {
					itemsInStore[j]=itemsInStore[j+1];}
				itemsInStore[itemCount-1]=null;
				itemCount--;
				System.out.println("DVD has been removed from the store.");
				break;
				}
			}
		if (!found) {
			System.out.println("DVD not found in the store.");
		}
		
	}
	
	public void displayDVDInformation(DigitalVideoDisc dvd) {
	    if (dvd != null) {
	        System.out.println("DVD Information:");
	        System.out.println("Title: " + dvd.getTitle());
	        System.out.println("Category: " + dvd.getCategory());
	        System.out.println("Director: " + dvd.getDirector());
	        System.out.println("Length: " + dvd.getLength());
	        System.out.println("Cost: " + dvd.getCost());
	    } else 
	        System.out.println("DVD not found.");
	}
	
	public void searchByID(int id) {
		DigitalVideoDisc dvd=null;
		for(int i=0;i<itemCount;i++) {
			if(itemsInStore[i].getID()==id) {
				dvd=itemsInStore[i];
				break;
			}
		}
		if (dvd!=null) {
			System.out.println("The result matchs with the provided ID:");
			displayDVDInformation(dvd);
		}
		else System.out.println("There's no result matchs the provided ID.");
	}
	
	public void searchByTitle(String title) {
		DigitalVideoDisc dvd=null;
		for(int i=0;i<itemCount;i++) {
			if (itemsInStore[i].getTitle().equals(title)) {
				dvd=itemsInStore[i];
				break;
			}
		}
		if (dvd!=null) {
			System.out.println("The result matchs with the provided title:");
			displayDVDInformation(dvd);
		}
		else System.out.println("There's no result matchs the provided title.");
	}
	
	
}
