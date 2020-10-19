public class Time {
	public static void main(String[] args) {
		int hour = 18;
		int minute = 17;
		int second = 00;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		
		/* Number of seconds since midnight */
		int secondsInHour = SECONDS_IN_HOUR * hour;
		int secondsInMinute = SECONDS_IN_MINUTE * minute;
		int secondsSinceMidnight = secondsInHour + secondsInMinute + second;
		System.out.println("Number of seconds since midnight: " + secondsSinceMidnight);
		
		/* Number of seconds remaining in the day */
		final int HOURS_IN_A_DAY = 24;
		final int SECONDS_IN_DAY = SECONDS_IN_HOUR * HOURS_IN_A_DAY;
		int secondsRemaining = SECONDS_IN_DAY - secondsSinceMidnight;
		System.out.println("Number of seconds remaining in the day: " + secondsRemaining);
		
		/* Percentage of the day that has passed */
		double percentageOfTheDay = (secondsSinceMidnight * 100.00) / SECONDS_IN_DAY;
		System.out.printf("Percentage of the day that has passed: %.2f", percentageOfTheDay);
		System.out.println("%");
		
		/* Elapsed time since I started working on this exercise */
		int currentMinute = 56;
		int currentSecond = 12;
		int currentTime = secondsSinceMidnight + (currentMinute * SECONDS_IN_MINUTE) + currentSecond;
		int elapsedSeconds = currentTime - secondsSinceMidnight;
		System.out.println("Elapsed seconds since I started working on this problem: " + elapsedSeconds);
		
	}
}