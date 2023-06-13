package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public String toString() {
		return "DVD - " + this.getTitle() + " - "  + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getCost() + " $";
	}
}
