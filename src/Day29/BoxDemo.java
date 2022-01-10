package Day29;

class Box {
	float width;
	float height;
	float depth;

	float calvol() {
		return width * height * depth;

	}
}

public class BoxDemo {

	public static void main(String[] args) {
		Box Box1;
		Box1 = new Box();
		Box1.width = 3.14f;
		Box1.height = 2.2f;
		Box1.depth = 1.4f;
		float vol = Box1.calvol();
		System.out.println("volume is" + vol);

	}

}
