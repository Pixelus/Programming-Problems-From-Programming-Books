public class DateRedesign {

	public static String printAmerican(String day, int date, String month, int year) {
		return ("American format: " + day + " " + month + " " + date + " " + year);
	}

	public static String printEuropean(String day, int date, String month, int year) {
		return ("European format: " + day + " " + date + " " + month + " " + year);
	}
	public static void main(String[] args) {
		String day = "Monday";
		int date = 5;
		String month = "October";
		int year = 2020;
		System.out.println(printAmerican(day, date, month, year));
		System.out.println(printEuropean(day, date, month, year));
	}
}