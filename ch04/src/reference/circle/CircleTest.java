package reference.circle;

public class CircleTest {

	public static void main(String[] args) {
		/*Circle c1 = new Circle(2, 3, 5);
		c1.showCircleInfo();
		
		Circle c2 = new Circle(5, 10, 15);
		c2.showCircleInfo(); */
		
		Circle[] circle = {
			new Circle(2, 3, 5),
			new Circle(10, 12, 15),
			new Circle(-10, -12, 10)
		};
		//circle[0].showCircleInfo();
		//circle[1].showCircleInfo();
		//circle[2].showCircleInfo();
		for(int i=0; i<circle.length; i++) {
			circle[i].showCircleInfo();
		}
	}

}
