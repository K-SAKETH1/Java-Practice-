package p1;

import java.util.Scanner;

public class ArithematicMain
{
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		while(true)
		{
			System.out.println("==Perform Arithematic Operations==");
			System.out.println("***Choice***");
			System.out.println("\t1.Addition\n\t2.Subtraction\n\t3.Multiplication\n\t4.Division\n\t5.Exit");
			System.out.print("Enter choice:");
			int choice = s.nextInt();
			if(choice > 5)
			{
				System.out.println("Invalid choice..");
			}//end of if
			else
			{
				if(choice == 5)
				{
					System.out.println("Operation Cancelled..");
					System.exit(0);
					s.close();
				}//end of if
				else
				{
					System.out.print("Enter num1:");
					int n1  = s.nextInt();
					System.out.print("Enter num2:");
					int n2  = s.nextInt();
					if(choice == 1)
					{
						Arithematic a = new Arithematic();
						System.out.println("Addition::" + a.getSum(n1, n2));
					}
					else if(choice == 2)
					{
						Arithematic a = new Arithematic();
						System.out.println("Subtraction::" + a.getSub(n1, n2));
					}
					else if(choice == 3)
					{
						Arithematic a = new Arithematic();
						System.out.println("Multiplication::" + a.getMul(n1, n2));
					}
					else if(choice == 4)
					{
						Arithematic a = new Arithematic();
						System.out.println("Division::" + a.getDiv(n1, n2));
					}
				}//end of else
			}//end of else
		}//end of while
	}
}
