import java.util.Scanner;

public class WrapperClassDemo {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Number Of Indexes: ");
		Integer inti = Integer.parseInt(scnr.next());

		Integer[] arrayi = new Integer[inti];
		for (int i = 0; i < inti; i++) {
			System.out.println("Number for Index " + i + ": ");
			Integer num = Integer.parseInt(scnr.next());
			arrayi[i] = num;
		}

		for (int j = 0; j < arrayi.length - 1; j++) {
			for (int k = 0; k < arrayi.length - j - 1; k++) {
				if (arrayi[k + 1].compareTo(arrayi[k]) < 0) {
					Integer temp = arrayi[k];
					arrayi[k] = arrayi[k + 1];
					arrayi[k + 1] = temp;
				}
			}
		}

		System.out.println("\nSorted: ");
		for (int l = 0; l < arrayi.length; l++) {
			System.out.print(arrayi[l] + " ");
		}
	}
}
