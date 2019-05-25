package week3.day1;

public class VechicleConcrete implements Vechicle1 {

	public void accidentAlarm() {
		System.out.println("Accident Alarm");
	}

	public void autoAirFill() {
		System.out.println("Auto Air Fill");

	}

	public void enableQuietMode() {
		System.out.println("Enable Quiet Mode");

	}

	public static void main(String[] args) {
		VechicleConcrete test = new VechicleConcrete();
		test.accidentAlarm();
		test.enableQuietMode();
		test.autoAirFill();
	}

}
