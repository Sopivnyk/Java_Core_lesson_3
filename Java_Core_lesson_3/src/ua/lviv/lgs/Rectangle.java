package ua.lviv.lgs;

public class Rectangle {

	private int width;
	private int height;

	Rectangle() {
		this.width = 100;
		this.height = 200;
	}

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int Area() {
		return height * width;
	}
	
	public int Perimeter(){
	return 2*(height + width);	
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	

}

