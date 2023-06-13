package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }
    
    public void play() {
    	System.out.println("Playing DVD: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    	}

    public String toString() {
        return "DVD - " + this.getTitle() + " - "  + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getCost() + " $";
    }
}

