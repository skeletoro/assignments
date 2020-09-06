
public class septemberfourth {

	public static void main(String[] args) {
		int answer = voldemortTriangle(44, 32);
		System.out.print(answer);
	}

	public static int voldemortTriangle(int b, int h) {
		int baseTimesHeight = 0;
		int height = h;
		int base = b;
		int area = 0;
		baseTimesHeight = (b * h);
		area = baseTimesHeight / 2;
		return area;

	}
}
