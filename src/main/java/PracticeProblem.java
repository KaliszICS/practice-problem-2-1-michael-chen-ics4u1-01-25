public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return i;
			}
		}
		return -1;
	}

	public static int findLast(String[] a, String b) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == b) {
				return i;
			}
		}
		return -1;
	}

	public static int findSecond(char[] a, char b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b && count != 0) {
				return i;
			} else if (a[i] == b) {
				count = i + 1;
			}
		}
		return count != 0 ? count - 1 : -1;
	}

}
