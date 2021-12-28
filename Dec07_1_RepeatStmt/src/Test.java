
public class Test {
	public static void main(String[] args) throws InterruptedException {
		for (int day = 0; day <= 30; day++) {
			for (int hour = 0; hour <= 24; hour++) {
				for (int minute = 0; minute <= 60; minute++) {
					for (int second = 0; second <= 60; second++) {
						System.out.printf("[Day%02d] %02d : %02d : %02d\n", day, hour, minute, second);
						Thread.sleep(1000);
					}
				}
			}
		}
	}
}
