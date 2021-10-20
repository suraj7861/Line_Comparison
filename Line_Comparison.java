//package lineComparison;
import java.util.Scanner;
public class Line_Comparison {
	
	//declaring global variables
	//use Wrapper class to use equals method and compareTo() Method

        public static Double length1 = 0.0d;
        public static Double length2 = 0.0d;
	
	//method: length calculation
        public static void lengthCalculation(){
			//declaring variables	
			double x1,x2,y1,y2;
                        double x3,x4,y3,y4;
			//use Scanner class to get inputs from user
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the  Co-ordinates of 1st Line");
			x1=sc.nextDouble();
			x2=sc.nextDouble();

			y1=sc.nextDouble();
			y2=sc.nextDouble();

			//calculate length of line 1
			length1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 -y1),2));
			System.out.println("Length of Line 1 = "+length1);
                        
                        System.out.println("Enter the  Co-ordinates of 2nd Line");
                        x3=sc.nextDouble();
                        x4=sc.nextDouble();

                        y3=sc.nextDouble();
                        y4=sc.nextDouble();

			//calculate length of line 2
                        length2 = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 -y3),2));
                        System.out.println("Length of Line 2 = "+length2);
                       
                 
		}
	//method: comparison of length of two lines
        public static void lengthComparison(){
                        if(length1.equals(length2))
                        {
                                System.out.println("The length of line are equals");
                        }
                        else
                        {
                              System.out.println("The length of line are not equals");
                        }

                  }                 
        //method: compare length of lines using compareTo methods 	
        public static void usingCompareToMehod(){
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

        public static void main(String[] args) {

              System.out.println("Welcome to Line Comparison Computation Program");

              //methods call
              lengthCalculation();
              lengthComparison();
              usingCompareToMehod();
         }
}
