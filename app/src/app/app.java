package app;

class Robot {
	public void speak(String text) {
		System.out.println("Hello ");
	}
	public void jump(int height) {
		System.out.println("Jumping   "  + height);
	}
}

public class app {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("hi im sam"); 
		sam.jump(7);
	}

}
