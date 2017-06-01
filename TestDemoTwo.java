import java.util.Scanner;
public class TestDemoTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter Age : ");
		int age =sc.nextInt();
		System.out.print("Enter Marks :");
		int marks = sc.nextInt();
		 
		//block for age less than 15
		if(age< 15){
			if(marks>60){
				System.out.println("Grade A");
			}
			else if(marks <=60 && marks >=45){
				System.out.println("Grade B");
			}
			else 
				System.out.println("Grade c");
		}
		//block for age greater than equal to 15
		else{
			if(marks >70)
				System.out.println("Grade A");
			else if(marks >=61 && marks <=70)
				System.out.println("Grade B");
			else
				System.out.println("Grade c");
				
		}
	}

}