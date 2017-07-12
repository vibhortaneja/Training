
public class Triangle extends Shape {
//	Triangle(int height, int width, int length) {
//		super(height, width, length);
//		// TODO Auto-generated constructor stub
//	}

	public void draw(){
		for(int i=1; i<height; i++){
			System.out.print("\n");
			
		for(int j=1; j<i; j++){
			System.out.print("*");
		}
	}

}
}