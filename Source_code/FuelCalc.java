import java.util.*;

public class Example{
    public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		String f,g,h;
		float A,B,C,D,E,F,G,H,I,J,K,L,M,X,Y,Z;
		int c,d,e;
	
		
		/*PETROL SALES FIND*/
		System.out.print("\n			****PETROL METER****			\n");

        System.out.print("\nEnter Now Petrol Meter value>		 ");
		A=input.nextFloat();
        System.out.print("\nEnter Last Petrol Meter value> 		 ");
		B=input.nextFloat();
		C=(A-B);
		
		System.out.print("\nThe Day Sold 2T Price>			 Rs. ");
		X=input.nextInt();
		System.out.print("\nThe Day Sold Oil Price> 		 Rs. ");
		Y=input.nextInt();
		System.out.print("\nCard Payment Total Price> 		 Rs. ");
		K=input.nextFloat();
		
		System.out.println("\nThe Day Sales of the petrol Litters-->		 "+		C+"L");
		D=C*368;
		D=(int)D;
		System.out.println("\nTotal Income of the petrol Meter-->		 Rs."+		D);
		Z=D+X+Y;
		System.out.println("\nTotal Income of the petrol + 2T + OIL -->	 Rs."+	Z);
		
		
		System.out.print("\nTotal Loans of petrol Meter--> 		");
		J=input.nextInt();
		/*System.out.println("\nTotal Loans of petrol Meter--> "+ J);*/
		System.out.println("\nTotal Income of the petrol + 2T + OIL - CARD - Loans(money on the hand) -->	Rs. "+	((Z-J)-K)+"\n");
		
		
		/*DIESEL SALES FIND*/
		
		System.out.print("\n\n			****DIESEL METER****			\n\n");
		
		System.out.print("\nEnter Now Diesel Meter value> 			");
		E=input.nextFloat();
		System.out.print("\nEnter Last Diesel Meter value>  		");
		F=input.nextFloat();
		G=E-F;
		System.out.println("\nThe Day Sales of the Diesel Litters-->		"+		G+"L");
		H=G*360;
		System.out.println("\nTotal Income of the Diesel Meter--> 		Rs."+		H);
		
		System.out.print("\nTotal Loans of deisel Meter--> 			Rs.");
		L=input.nextInt();
		
		System.out.println("\nTotal Income of the Deisel - Loans (now money on the hand) -->		Rs."+	(H-L)+'\n');

		/*DIESEL & PETROL SALES FIND*/
		I=H+Z;
		System.out.println("\nTotal Income of the Diesel & Petrol Meter(withouts loans)--> 		Rs."+		I);
		
		System.out.println("\nTotal Income of the Diesel & Petrol Meter-(with loans)--> 		Rs."+		((H-L)+(Z-J)-K));
		
        }
}


