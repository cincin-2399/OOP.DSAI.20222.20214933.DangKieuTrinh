package hust.soict.dsai.lab01;
import java.util.Scanner;
public class NumDaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String monthStr;
		int day,month,year;
	    year=0;month=0;day=0;
		
		
		//transfer the monthstr to month
		while (true){
			System.out.println("Please enter the month: ");
			monthStr=sc.nextLine().toLowerCase();
			// Determine month number
            if (monthStr.equals("january") || monthStr.equals("jan.") || monthStr.equals("jan") || monthStr.equals("1")) {
                month = 1;
                break;
            } else if (monthStr.equals("february") || monthStr.equals("feb.") || monthStr.equals("feb") || monthStr.equals("2")) {
                month = 2;
                break;
            } else if (monthStr.equals("march") || monthStr.equals("mar.") || monthStr.equals("mar") || monthStr.equals("3")) {
                month = 3;
                break;
            } else if (monthStr.equals("april") || monthStr.equals("apr.") || monthStr.equals("apr") || monthStr.equals("4")) {
                month = 4;
                break;
            } else if (monthStr.equals("may") || monthStr.equals("5")) {
                month = 5;
                break;
            } else if (monthStr.equals("june") || monthStr.equals("jun.") || monthStr.equals("jun") || monthStr.equals("6")) {
                month = 6;
                break;
            } else if (monthStr.equals("july") || monthStr.equals("jul.") || monthStr.equals("jul") || monthStr.equals("7")) {
                month = 7;
                break;
            } else if (monthStr.equals("august") || monthStr.equals("aug.") || monthStr.equals("aug") || monthStr.equals("8")) {
                month = 8;
                break;
            } else if (monthStr.equals("september") || monthStr.equals("sep.") || monthStr.equals("sep") || monthStr.equals("9")) {
                month = 9;
                break;
            } else if (monthStr.equals("october") || monthStr.equals("oct.") || monthStr.equals("oct") || monthStr.equals("10")) {
                month = 10;
                break;
            } else if (monthStr.equals("november") || monthStr.equals("nov.") || monthStr.equals("nov") || monthStr.equals("11")) {
                month = 11;
                break;
            } else if (monthStr.equals("december") || monthStr.equals("dec.") || monthStr.equals("dec") || monthStr.equals("12")) {
                month = 12;
                break;}
			else {
				System.out.println("Invalid month. Please enter again.");}
			}
            
		// Input the number of the year
		while (true) {
			System.out.println("Enter the year: ");
			if (sc.hasNextInt()) {
				year=sc.nextInt();
				if (year>0) {
					break;
				}
			}
			System.out.println("Invalid year. Please enter again.");
			sc.nextLine();
		}
		
		switch(month) {
		case 2:
			if (year%4==0 &&year%100!=0 || year%400==0) {
				day=29;
			}
			else day=28;
			break;
		case 4,6,9,11:
			day=30;
			break;
		default:
			day=31;
			break;
		}
		System.out.println("There are "+day+" in "+getMonthName(month)+", "+year);}
		
		
		public static String getMonthName(int month) {
	        switch (month) {
	            case 1:
	                return "January";
	            case 2:
	                return "February";
	            case 3:
	                return "March";
	            case 4:
	                return "April";
	            case 5:
	                return "May";
	            case 6:
	                return "June";
	            case 7:
	                return "July";
	            case 8:
	                return "August";
	            case 9:
	                return "September";
	            case 10:
	                return "October";
	            case 11:
	                return "November";
	            case 12:
	                return "December";
	            default:
	                return "";
	        }
		}
}

