package general;
abstract class GraphicObject1
{
	int x, y;
	void moveTo(int newX, int newY)
	{
		this.x=newX;
		this.y=newY;
	}
	abstract void draw();
	abstract void resize();	
}
class Rectangle1 extends GraphicObject1
{
	void show()
	{
		System.out.println("show rectangle");
		
	}

	@Override
	void draw() {
	System.out.println("drawing rectangle");
		
	}

	@Override
	void resize() {
		System.out.println("4 size rectangle");
			
	}
}

class Circle1 extends GraphicObject1
{
	@Override
	void draw() {
		System.out.println("showing circle");
		
	}

	@Override
	void resize() {
		System.out.println("1 size circle");
		
	}
	
}

public class MainDemo {

	public static void main(String[] args) {
		//GraphicObject1 obj1=new GraphicObject1();
		
		Rectangle1 obj1=new Rectangle1();
		obj1.show();
		obj1.draw();
		obj1.resize();
		Circle1 obj2=new Circle1();
		obj2.draw();
		obj2.resize();

	}

}

