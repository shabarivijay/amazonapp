package AmazonApp;
import java.util.Scanner;

public class Search extends Productitem
{

	Scanner scn=new Scanner (System.in);

	void searchAmazonIn()
	{
		
		System.out.println("searchAmazon.In- __________\nyes");
		String srh=scn.next();
		if("yes".equals(srh))
		{
		System.out.println("1-mobile\n2-shoes\n3-bags\n4-watch\n5-headphone");
		String search=scn.next();
		if("mobile".equals(search))
		{
			mobile();

		}
		else if("shoes".equals(search))
		{
			shoes();

		}
		else if("bags".equals(search))
		{
			bags();

		}
		else if("watch".equals(search))
		{
			watches();

		}
		else if("headphone".equals(search))
		{
			headphone();

		}
		
	}
	
	

}
}
