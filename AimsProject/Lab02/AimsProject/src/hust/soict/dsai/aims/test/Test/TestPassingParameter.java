package hust.soict.dsai.aims.test.Test;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD= new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD= new DigitalVideoDisc("Cinderella");
        
        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        
	}
	
	public static void swap (Object o1, Object o2) {
		Object tmp=o1;
		o1=o2;
		o2=tmp;
	}
	
	public static void swap(DigitalVideoDisc d1, DigitalVideoDisc d2) {
		String d1Title=d1.getTitle();
		String d2Title=d2.getTitle();
		d1.setTitle(d2Title);
		d2.setTitle(d1Title);
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle=dvd.getTitle();
		dvd.setTitle(title);
		dvd= new DigitalVideoDisc(oldTitle);
		
	}

}
