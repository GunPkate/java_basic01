import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Height (cm)");
		double h = sc.nextDouble();
		h = h / 100;
		System.out.println("Input weight (kg)");
		double w = sc.nextDouble();

		double bmi = w / (h * h);
		System.out.println(w);
		System.out.println(h);
		System.out.println(bmi);
		if (bmi < 20) {
			System.out.println("thin");
		}
		if (bmi >= 25) {
			System.out.println("fat");
		} else {
			System.out.println("normal");
		}
	}
}
