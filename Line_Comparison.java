
import java.util.Scanner;
public class Line_Comparison {

        static Double length1 = 0.0d;
        static Double length2 = 0.0d;

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program");
               
                Line_Comparison L1 = new Line_Comparison();
                L1.Length_Calculation();
                L1.Length_Comparison();
                L1.Using_CompareToMehod();
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

			length1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 -y1),2));
			System.out.println("Length of Line 1 = "+length1);
                        
                        System.out.println("Enter the  Co-ordinates of 2nd Line");
                        x3=sc.nextDouble();
                        x4=sc.nextDouble();

                        y3=sc.nextDouble();
                        y4=sc.nextDouble();

                        length2 = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 -y3),2));
                        System.out.println("Length of Line 2 = "+length2);
                       
                 
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
  
     public static void Using_CompareToMehod(){
		int check = length1.compareTo(length2);
		if(check == 0){
			System.out.println("The length of line 1 is equals to line 2");
		    }

		else if(check > 0){
			System.out.println("The length of line 1 is greater than  line 2");
                   }

		else
			System.out.println("The length of line 1 is less than line 2");

        }

}
