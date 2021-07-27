public class Triangle {
	public static void main(String[] args) {
		int x = 1;

		while (x <= 5) {
			int y = 1;

			while (y <= x) {
				System.out.print(y + " ");
				y++;
			}

			System.out.println();
			x++;
		}
	}
}