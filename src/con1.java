import java.util.Scanner;

public class con1 {
	public static void main(String[] args) {
		System.out.println("Please Enter your score: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = "";
		if(a < 50 ) { result ="F";}
		if(a >= 50 && a <60) { result ="D";}
		if(a >= 60 && a <70) { result ="C";}
		if(a >= 70 && a <80) { result ="B";}
		if(a >= 80 && a <=100) { result ="A";}
		System.out.println(result);
	}
}
