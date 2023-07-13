package AmazonApp;

import java.util.Scanner;

public class Productitem extends Amazon
{
	Scanner scn=new Scanner (System.in);
	
	void mobile()
	{
		System.out.println("MOBILE");  
		System.out.println("1-samsung\n2-vivo\n3-oppo\n4-apple\n5-nokia");
		String mobile=scn.next();
		if("samsung".equals(mobile))
		{
			   System.out.println("samsungM12\nsamsungA30\nsamsungA12\nsamsungA16\nsamsungGalaxy2");
			   String samsung=scn.next();
			   if("samsungM12".equals(samsung)) 
			   {
				   System.out.println("samsungM12 mobile and its details");
			   }
			   else if("samsungA30".equals(samsung)) 
			   {
				   System.out.println("samsungA30 mobile and its details");
			   }
			   else if("samsungA12".equals(samsung)) 
			   {
				   System.out.println("samsungA12 mobile and its details");
			   }
			   else if("samsungA16".equals(samsung)) 
			   {
				   System.out.println("samsungA16 mobile and its details");
			   }
			   else if("samsungGalaxy2".equals(samsung)) 
			   {
				   System.out.println("samsungGalaxy2 mobile and its details");
			   }
		}
		else if("vivo".equals(mobile))
		{
			   System.out.println("vivoV23\nvivoV23pro\nvivoV11\nvivoV5\nvivoV25");
			   String vivo=scn.next();
			   if("vivoV23".equals(vivo)) 
			   {
				   System.out.println("vivoV23 mobile and its details");
			   }
			   else if("vivoV23pro".equals(vivo)) 
			   {
				   System.out.println("vivoV23pro mobile and its details");
			   }
			   else if("vivoV11".equals(vivo)) 
			   {
				   System.out.println("vivoV11 mobile and its details");
				   
			   }
			   else if("vivoV5".equals(vivo)) 
			   {
				   System.out.println("vivoV5 mobile and its details");
			   }
			   else if("vivoV25".equals(vivo)) 
			   {
				   System.out.println("vivoV25 mobile and its details");
			   }

			
		}
		else if("oppo".equals(mobile))
		{
			   System.out.println("oppo15\noppo23\noppo20\noppo18\noppoA1");
			   String oppo=scn.next();
			   if("oppo15".equals(oppo)) 
			   {
				   System.out.println("oppo15 mobile and its details");
			   }
			   else if("oppo23".equals(oppo)) 
			   {
				   System.out.println("oppo23 mobile and its details");
			   }
			   else if("oppo20".equals(oppo)) 
			   {
				   System.out.println("oppo20 mobile and its details");
				   
			   }
			   else if("oppo18".equals(oppo)) 
			   {
				   System.out.println("oppo18 mobile and its details");
			   }
			   else if("oppoA1".equals(oppo)) 
			   {
				   System.out.println("oppoA1 mobile and its details");
			   }

			
		}
		else if("oppo".equals(mobile))
		{
			   System.out.println("oppo15\noppo23\noppo20\noppo18\noppoA1");
			   String oppo=scn.next();
			   if("oppo15".equals(oppo)) 
			   {
				   System.out.println("oppo15 mobile and its details");
			   }
			   else if("oppo23".equals(oppo)) 
			   {
				   System.out.println("oppo23 mobile and its details");
			   }
			   else if("oppo20".equals(oppo)) 
			   {
				   System.out.println("oppo20 mobile and its details");
				   
			   }
			   else if("oppo18".equals(oppo)) 
			   {
				   System.out.println("oppo18 mobile and its details");
			   }
			   else if("oppoA1".equals(oppo)) 
			   {
				   System.out.println("oppoA1 mobile and its details");
			   }

			
		}
		else if("apple".equals(mobile))
		{
			   System.out.println("apple10\napple20\napple30\napple40\napple50");
			   String apple=scn.next();
			   if("apple10".equals(apple)) 
			   {
				   System.out.println("apple10 mobile and its details");
			   }
			   else if("apple20".equals(apple)) 
			   {
				   System.out.println("apple20 mobile and its details");
			   }
			   else if("apple30".equals(apple)) 
			   {
				   System.out.println("apple30 mobile and its details");
				   
			   }
			   else if("apple40".equals(apple)) 
			   {
				   System.out.println("apple40 mobile and its details");
			   }
			   else if("apple50".equals(apple)) 
			   {
				   System.out.println("apple50 mobile and its details");
			   }

			
		}
		else if("nokia".equals(mobile))
		{
			   System.out.println("nokia12\nnokia22\nnokia13\nnokia32\nnokia14");
			   String nokia=scn.next();
			   if("nokia12".equals(nokia)) 
			   {
				   System.out.println("nokia12 mobile and its details");
			   }
			   else if("nokia22".equals(nokia)) 
			   {
				   System.out.println("nokia22 mobile and its details");
			   }
			   else if("nokia13".equals(nokia)) 
			   {
				   System.out.println("nokia13 mobile and its details");
				   
			   }
			   else if("nokia32".equals(nokia)) 
			   {
				   System.out.println("nokia32 mobile and its details");
			   }
			   else if("nokia14".equals(nokia)) 
			   {
				   System.out.println("nokia14 mobile and its details");
			   }

			
		}
		
		
			
	}
	
	void shoes()
	{
		System.out.println("SHOES");  
		System.out.println("1-puma\n2-adidas\n3-nike\n4-woodland\n5-localbrands");
		String shoes=scn.next();
		 if("puma".equals(shoes)) 
		   {
			   System.out.println("puma shoes and its details");
		   }
		   else if("adidas".equals(shoes)) 
		   {
			   System.out.println("adidas shoes and its details");
		   }
		   else if("nike".equals(shoes)) 
		   {
			   System.out.println("nike shoes and its details");
			   
		   }
		   else if("woodland".equals(shoes)) 
		   {
			   System.out.println("woodland shoes and its details");
		   }
		   else if("localbrands".equals(shoes)) 
		   {
			   System.out.println("localbrands shoes and its details");
		   }
		
	}
	
	void bags() 
	{
		System.out.println("BAGS");  
		System.out.println("1-wildcraft\n2-nikebags\n3-pumabags\n4-americantourister\n5-mokobara");
		String bags=scn.next();
		 if("wildcraft".equals(bags)) 
		   {
			   System.out.println("wildcraft bags and its details");
		   }
		   else if("nikebags".equals(bags)) 
		   {
			   System.out.println("nikebags  and its details");
		   }
		   else if("pumabags".equals(bags)) 
		   {
			   System.out.println("pumabags  and its details");
			   
		   }
		   else if("americantourister".equals(bags)) 
		   {
			   System.out.println("americantourister bags and its details");
		   }
		   else if("mokobara".equals(bags)) 
		   {
			   System.out.println("mokobara bags and its details");
		   }
		
	}
	void watches() 
	{
		System.out.println("WATCHES");  
		System.out.println("1-fastrack\n2-titan\n3-amazefit\n4-firebolt\n5-fossil\n6-noise");
		String watch=scn.next();
		 if("fastrack".equals(watch)) 
		   {
			   System.out.println("fastrack watch and its details");
		   }
		   else if("titan".equals(watch)) 
		   {
			   System.out.println("titan watch and its details");
		   }
		   else if("amazefit".equals(watch)) 
		   {
			   System.out.println("amazefit watch and its details");
			   
		   }
		   else if("firebolt".equals(watch)) 
		   {
			   System.out.println("firebolt watch and its details");
		   }
		   else if("fossil".equals(watch)) 
		   {
			   System.out.println("fossil watch and its details");
		   }
		   else if("noise".equals(watch)) 
		   {
			   System.out.println("noise watch and its details");
		   }
		
	}
	void headphone() 
	{
		System.out.println("HEADPHONES");  
		System.out.println("1-oneplus\n2-samsung\n3-boult\n4-boat\n5-jbl\n6-sony");
		String headphone=scn.next();
		 if("oneplus".equals(headphone)) 
		   {
			   System.out.println("oneplus headphone and its details");
		   }
		   else if("samsung".equals(headphone)) 
		   {
			   System.out.println("samsung headphone and its details");
		   }
		   else if("boult".equals(headphone)) 
		   {
			   System.out.println("boult headphone and its details");
			   
		   }
		   else if("boat".equals(headphone)) 
		   {
			   System.out.println("boat headphone and its details");
		   }
		   else if("jbl".equals(headphone)) 
		   {
			   System.out.println("jbl headphone and its details");
		   }
		   else if("sony".equals(headphone)) 
		   {
			   System.out.println("sony headphone and its details");
		   }
		
	}
		
	
	

}
