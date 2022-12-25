package ua.lviv.lgs;

public class Lesson_3_hw {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(400, 800);
		
		Ring ring1 = new Ring();
				
		//System.out.println("Rectangle height is " + rect1.getHeight()+ " mm");
		//System.out.println("Rectangle width is " + rect1.getWidth()+ " mm");
		
		System.out.println("Rectangle area " + rect1.Area() + " mm2");
		System.out.println("Rectangle perimeter " + rect1.Perimeter() + " mm");
		
		System.out.println(ring1);
		System.out.println("Ring lenght " + ring1.RingLenght() + " mm");
		System.out.println("Ring area " + ring1.RingArea() + " mm2");
		

	}

}
