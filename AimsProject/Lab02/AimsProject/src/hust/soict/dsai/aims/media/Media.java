package hust.soict.dsai.aims.media;

public abstract class Media {
	
	private String title;
	private String category;
	private float cost;
	private int id;
	protected static int numCount=0;
	
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public int getId() {
		return id;
	}

	public float getCost() {
		return cost;
	}

	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		numCount++;
		this.id = numCount;}

	@Override
	public String toString() {
		return "Media [title=" + title + ", category=" + category + ", cost=" + cost + ", id=" + id + "]";
	}
	
	
	
}
