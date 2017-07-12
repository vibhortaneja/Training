public abstract class Shape {

	public int height;
	public int width;
	public int length;
	
	abstract void draw();
	
	
//	Shape(int height, int width, int length)
//	{
//		this.height=height;
//		this.width=width;
//		this.length=length;
//		
//	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
