package Lab2_Task1;

public class Task_1_4 {
	public static void moveTower(int disk, String source, String dest, String spare) {
		if (disk == 0) {
			System.out.println("Move disk from " + source + " to " + dest);
		} else {
			moveTower(disk - 1, source, spare, dest);

			System.out.println("Move disk from " + source + " to " + dest);

			moveTower(disk - 1, spare, dest, source);
		}
	}

	public static void main(String[] args) {
		int numDisks = 3; 
		moveTower(numDisks, "A", "C", "B");
	}
}
