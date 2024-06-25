package learning_java.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan=new Fan("Manufacturer 1", 0.34, "Green");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)4);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
}