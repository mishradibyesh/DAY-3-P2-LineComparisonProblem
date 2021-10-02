import java.lang.*;
import java.util.Scanner;
public class LineComparison {
	public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program");
// making object of Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first co-ordinate");
// taking two inputs from user as point co ordinates
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter the second co-ordinate");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
//printing the co ordinates in well defined manner
        System.out.println("the first co-ordinate is (" +x1 +","+y1+") ");
        System.out.println("the second co-ordinate is (" +x2 +","+y2+") ");
        double length1;
//finding the sqares
        int point1=(x2-x1)*(x2-x1);
        int point2=(y2-y1)*(y2-y1);
// finding the sqare root 
        length1=Math.sqrt(point1+point2);
// printing the length of the line
        System.out.println("length of the line is "+length1);

//code for second line
        System.out.println("enter the first co-ordinate");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        System.out.println("enter the second co-ordinate");
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("the first co-ordinate is (" +m1 +","+n1+") ");
        System.out.println("the second co-ordinate is (" +m2 +","+n2+") ");
        double length2;
        int point3=(m2-m1)*(m2-m1);
        int point4=(n2-n1)*(n2-n1);
        length2=Math.sqrt(point3+point4);
        System.out.println("length of the second line is "+length2);
// using wrapper class concept
        Double length1new= length1;
        Double length2new= length2;

        boolean chk=length1new.equals(length2new);
	if(chk==true)
		System.out.println("these two lines are equal");
   	else
		System.out.println("these two lines are NOT equal");

//cheking line 1 is greater lesser or eqal to 2nd line
	int compare=length1new.compareTo(length2new);
        if(compare<0) {
                System.out.println("line is lesser than other line ");
	}
        else if(compare>0) {
                System.out.println("line is greater than other line ");
        }
         else if(compare==0) {
                System.out.println("line is equal to other line ");
         }
    }

}
