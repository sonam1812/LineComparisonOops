package com.bridgelabz.LineComparisonProgramOops;
import java.util.Scanner;

public class LineComparisonOops {
	public static void main(String[] args) {
		
//for line1 input
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter x1 of line 1:");
		        int x1 = sc.nextInt();
		        
		        System.out.print("Enter x2 of line 1:");
		        int x2 = sc.nextInt();

		        System.out.print("Enter y1 of line 1:");
		        int y1 = sc.nextInt();

		        System.out.print("Enter y2 of line 1:");
		        int y2 = sc.nextInt();
//for line2 input
		        System.out.print("Enter x1 of line 2:");
		        int p1 = sc.nextInt();

		        System.out.print("Enter x2 of line 2:");
		        int p2 = sc.nextInt();

		        System.out.print("Enter y1 of line 2:");
		        int q1 = sc.nextInt();

		        System.out.print("Enter y2 of line 2:");
		        int q2 = sc.nextInt();

		        LineComparisonOops obj = new LineComparisonOops();
		        double length1 = obj.calculate(x1, x2, y1, y2);
		        double length2 = obj.calculate(p1, p2, q1, q2);
		        obj.compare(length1, length2);
		    }

		    public double calculate(int x1, int x2, int y1, int y2) {
		        int a = x2 - x1;
		        int b = y2 - y1;
		        double length = Math.sqrt((a * a) + (b * b));
		        System.out.println("Distance between the coordinates are : " + length);
		        return length;
		    }

		    public void compare(double length1, double length2) {
		    	 if(length1 > length2) {
		             System.out.println("1st line is greater");
		         }else if(length1==length2) {
		             System.out.println("Both lines are equal");
		         }else {
		             System.out.println("2nd line is greater");
		         }
		    }
		    
		    	 public void equal(double length1, double length2) {
			    	 if(length1 == length2) {
			             System.out.println("both lines are equal");
			         }else{
			             System.out.println("compare again");
			         
			         }
		     }
		    }


