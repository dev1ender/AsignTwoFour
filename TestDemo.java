import java.util.Scanner;
public class TestDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		if(a > 0){
			System.out.println("You Have Entered Positive Value");
		}
		else if(a<0){
			System.out.println("You Have Entered Negative Value");
		}
		else
			System.out.println("You Have Entered Zero");
	}

}
