
import java.util.Scanner;
public class Line_Comparison {

        
	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program");
                
                Line_Comparison L1 = new Line_Comparison();
                L1.Length_Calculation();
                L1.Length_Comparison();
         }

        public static void Length_Calculation(){

			double x1,x2,y1,y2;
                        double x3,x4,y3,y4;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the  Co-ordinates of 1st Line");
			x1=sc.nextDouble();
			x2=sc.nextDouble();

			y1=sc.nextDouble();
			y2=sc.nextDouble();

			double length1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 -y1),2));
			System.out.println("Length of Line = "+length1);
                        
                        System.out.println("Enter the  Co-ordinates of 2nd Line");
                        x3=sc.nextDouble();
                        x4=sc.nextDouble();

                        y3=sc.nextDouble();
                        y4=sc.nextDouble();

                        double length2 = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 -y3),2));
                        System.out.println("Length of Line = "+length2);

		}

       public static void Length_Comparison(){
                        if(length1.equals(length2))
                        {
                                System.out.println("The length of line are equals");
                        }
                        else
                        {
                                System.out.println("The length of line are not equals");
                        }
  
     }                 
  }
