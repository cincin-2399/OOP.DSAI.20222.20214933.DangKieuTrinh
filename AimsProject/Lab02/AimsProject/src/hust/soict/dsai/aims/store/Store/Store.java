package hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media a) {
		if (itemsInStore.contains(a)) {
			System.out.println("The media has already been added.");
		}
		else {
			itemsInStore.add(a);
			System.out.println("The media has been added to the store successfully.");
		}
	}
	
	public void removeMedia(Media a) {
		if (itemsInStore.contains(a)) {
			itemsInStore.remove(a);
			System.out.println("The media has been removed from the store successfully.");
		}
		else System.out.println("The media do not present in the store.");
	}
	
	public void searchByID(int id) {
		boolean found=false;
		for (Media media: itemsInStore) {
			if (media.getId()==id) {
				found=true;
				System.out.println("The result founded:");
				System.out.println(media.toString());
				break;
			}
		}
		if (!found) {System.out.println("There is no result for the given id.");}
		}
	
	public void searchByTitle(String title) {
		boolean found = false;
		for (Media media: itemsInStore) {
			if (media.getTitle().equals(title)) {
				found=true;
				System.out.println("The result matchs with the provided title:");
				System.out.println(media.toString());
			}
		}
		if (!found) {
			System.out.println("There's no result matchs the provided title.");
			}
	}

	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	
	
	
}
