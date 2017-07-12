
public class TestShape {

	public static void main(String[] args) {

		Triangle shapeTraingle = new Triangle();
		Rectangle shapeRectangle = new Rectangle();

		/*
		 * shapeTraingle.draw(); System.out.println("\n\n\n");
		 * shapeRectangle.draw();
		 */

		Shape shape = shapeTraingle;
		shape.height = 10;
		shape.length = 10;
		shape.width = 10;
		shape.draw();

		System.out.println("\n");
		shape = shapeRectangle;
		shape.height = 10;
		shape.length = 20;
		shape.width = 20;
		shape.draw();

	}

	Shape r = new Shape(){
			void draw(){
			System.out.println("hello");
		}
	};
	//r.draw();
		
	
}
