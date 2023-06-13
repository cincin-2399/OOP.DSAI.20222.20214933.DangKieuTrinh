package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	private int id;

	public Book(String title, String category, float cost) {
	    super(title, category, cost);
	}

	
	public void addAuthor(String authorName) {
		for(String author: authors){
            if (author.equals(authorName)){
                System.out.println("The author is already added!");
                break;
            }
            else {
                authors.add(authorName);
                System.out.println("The author has been added successfully.");
            }
        }
    }
	
	public void removeAuthor(String authorName) {
		for(String author: authors) {
			if (author.equals(authorName)) {
				authors.remove(authorName);
				System.out.println("The author has been removed successfully.");
				break;
			}
			else System.out.println("The author is not present in the list.");
		}
	}

}
