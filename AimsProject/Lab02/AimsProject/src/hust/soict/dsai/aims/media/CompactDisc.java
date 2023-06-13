package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable{
	
	private String artist;
	private List<Track> tracks;

	public CompactDisc(String title,String category,float cost,String artist) {
		super(title,category,cost);
		this.artist=artist;
		this.tracks=new ArrayList<Track>();
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track a) {
		if (tracks.contains(a)) {
			System.out.println("The track is already in the list.");
        } else {
            tracks.add(a);
            System.out.println("The track has been added successfully.");
        }
	}
	public void removeTrack(Track a) {
		if (tracks.contains(a)) {
			tracks.remove(a);
			System.out.println("The track has been removed successfully.");
        } else {
            System.out.println("The track is not present in the list.");
		}
	}
	
	public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
	
	public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("CD length: " + getLength());
        System.out.println("Artist: " + getArtist());
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
	}

}
