import java.util.Scanner;
public class AkarAssignment{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter (length) of your name: ");
		 int x = in.nextInt();

		 char[] akar = new char[x];


		 for(int a=0;a<akar.length;a++){
			 int t = a+1;
			 System.out.print(" enter letter "+t+"  ");
			 String c = in.next();
			 akar[a]= c.charAt(0);
		 }
		 System.out.print("your name is : ");
		 for(int a=0;a<akar.length;a++){
		 			System.out.print(akar[a]);
		 }
		 System.out.println();
		 System.out.println();
	}
}