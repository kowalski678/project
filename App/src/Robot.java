class Robot1 {
	public void speak(String text) {
		System.out.println(text );
	}
	public void jump(int height) {
		System.out.println("Jumping " + height);
	}
	public void move (String direction, double distance) {
		System.out.println("Moving "	+ distance + "  metres in direction" + direction );
	}
	public void start(int weight)	{
		System.out.println(" I weight" + weight);
		
	}
}
public class Robot {

	public static void main(String[] args) {
		Robot1 sam = new Robot1();
		sam.speak("Hi I'm Sam");
		sam.jump(7);
		sam.move("Chocznia", 8932.22 );
		sam.start(83);
	}

}
