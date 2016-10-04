import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = input.nextInt();
        input.close();
        if(x >= 1 && x <= 5 ){
			if(x % 2 ==0){
				System.out.println("The number is even.");
			}
			else{
				System.out.println("The number is odd.");
			}
		}
		else{
			if(x >=6 && x <=15){
				if(x % 3 ==0){
					System.out.println("Divisible by 3");
				}
				else{
					System.out.println("Not divisible by 3");
				}
			}
			else{
				if(x<0){
					System.out.println("The number is negative,");
				}
				else{
					if(x==0){
						System.out.println("The number is 0.");
					}
					else{
						System.out.println("The number is positive.");
					}
				}
			}
		}
	}
}