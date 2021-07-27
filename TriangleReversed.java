public class TriangleReversed {
	public static void main(String[] args) {
		int x = 5;

		while (x >= 1) {
			int y = 1;

			while (y <= x) {
				System.out.print(y + " ");
				y++;
			}

			System.out.println();
			x--;
		}
	}
}