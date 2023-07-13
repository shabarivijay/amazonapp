package AmazonApp;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Amazon amazon=new Amazon();
		Search search=new Search();
		Productitem productitem=new Productitem();
		PaymentMethod payment=new PaymentMethod();
		
		Scanner scn=new Scanner(System.in);
		System.out.println("welcome to amazon\nenter");
		String welcome=scn.next();
		 if("enter".equals(welcome)) 
		 {
			 System.out.println("create an amazon account\nyes\nno");
			 String create=scn.next();
			 if("yes".equals(create)) 
			 {
				 System.out.println("enter your name");
				 String name=scn.next();
				 System.out.println(name);
				 System.out.println("gmail");
				 String gmail=scn.next();
				 System.out.println(gmail);
				 System.out.println("phoneNumber");
				 long phonenum=scn.nextLong();
				 System.out.println(phonenum);
				 for(int i=0;i<3;i++)
				 {
				 System.out.println(" ");
				 }
				 System.out.println("wait for otp............\n");
				 System.out.println("otp="+amazon.otp);
				 int otp=scn.nextInt();
				 
				 if(amazon.otp==4547) 
				 {
					 System.out.println("\naccount has been created\n");
					 search.searchAmazonIn();
					 System.out.println("\nBuy Now\nyes\nno");
					 String buynow=scn.next();
					 if("yes".equals(buynow)) 
					 {
					 System.out.println("1-UPI\n2-CoD\n3-CREDITorDEBIT");
					 String upi=scn.next();
					 if("UPI".equals(upi)) 
					 {
						 payment.UPI();
					 }
					 else if("CoD".equals(upi)) 
					 {
						 payment.cashOnDelivery();
					 }
					 else if("CREDITorDEBIT".equals(upi)) 
					 {
						 payment.CCorDC();
					 }
					 }
					 else 
					 {
						 System.out.println("order is not placed");
					 }
					 
				 }else 
				 {
					 System.out.println("wrong otp");
				 }
			 }

		 }

		

		
	}

}
