import java.util.Scanner;

public class Rohith {

	

	public static void main(String[] args)
    {
		System.out.println("List of Hotels");
		System.out.println("5 Rating Hotels are: \n The PARK \n The HYAAT");
		System.out.println("3 Rating Hotels are:\n The RADDISSION \n The RAINTREE");
		System.out.println("1 Rating Hotels are: \n The FORTUNE \n The ACCORD");
		double dis = 0;
		int s,amount = 0,amount1=0;
		double prize=0,prize1=0;
        Scanner y= new Scanner (System.in);
        System.out.println("What is your money?");
        double money= y.nextDouble();
        
       
     
        System.out.println("What is your ratings?");
        int rating= y.nextInt();


        if(rating ==5) 
        {
            System.out.println("THE HOTEL PARK\n THE HOTEL HYAAT");
            System.out.println("What is number of days?");
        
            int days= y.nextInt();
            
            if(days>1 && days<32){
            	System.out.println("perfect days");
            }
            else{
            	System.out.println("only one month is allowed except emergency");
            }
            
            
            System.out.print("Enter  number of days: ");
            int num2 = y.nextInt();
            double product = 90*num2;
            double product1= 82*num2;
            System.out.println("Output of park(90*num2): "+product);
            System.out.println("Output of hyaat(82*num2): "+product1);
            
            if(num2<=2){
            	System.out.println("you can hire room with amount but no discount");
            	
            	if(money>=90 && product<product1){
            		System.out.println("you can take room in PARK with amount:" +product);
            	}
            	else if(money>=82 && product1<product){
            		System.out.println("you can take room in HYAAT with amount:" +product1);
            	}
            	else if(money<82){
            		System.out.println("please choose other rating hotels");
            	}
            }
            
            
            
            if(num2>2){
   	         dis=20;
   	        amount= (int) ((dis*product)/100);
   	        prize=product-amount;
   	        System.out.println("You are staying more than 2 days in hotel park so your  discount is 20% : "+prize);
            }
           
            
            if(num2>3){
		         dis=12;
		        amount1= (int) ((dis*product1)/100);
		        prize1=product1-amount;
		        System.out.println("You are staying more than 3 days in hotel HYAAT so your  discount is 12%: "+prize1);
            }
        
            if(prize<prize1){
            	System.out.println("!!!!!...........congratulations....!! You can hire the room in Hotel THE PARK for days:" +num2);
            }
            else if(prize1<prize){
            	System.out.println("!!!!.........congratulations....!! You can hire the room in Hotel THE  HYAAT for the days:" +num2);
            }
        }
        
        
        
        
        
        
        
        
        if(rating ==3) 
        {
            System.out.println("THE HOTEL RADDISSION\n THE HOTEL RAINTREE");
            System.out.println("What is number of days?");
        
            int days= y.nextInt();
            
            if(days>1 && days<32){
            	System.out.println("perfect days");
            }
            else{
            	System.out.println("only one month is allowed except emergency");
            }
            
            
            System.out.print("Enter  number of days: ");
            int num2 = y.nextInt();
            double product = 60*num2;
            double product1= 58*num2;
            System.out.println("Output of raddission(60*num2): "+product);
            System.out.println("Output of raintree(58*num2): "+product1);
            
            if(num2<=2){
            	System.out.println("you can hire room with amount but no discount");
            	
            	if(money>=60 && product<product1){
            		System.out.println("you can take room in RADDISSION with amount:" +product);
            	}
            	else if(money>=58 && product1<product){
            		System.out.println("you can take room in RAINTREE with amount:" +product1);
            	}
            	else if(money<58){
            		System.out.println("please choose other rating hotels");
            	}
            	
            }
            
            
            
            if(num2>2){
   	         dis=18;
   	        amount= (int) ((dis*product)/100);
   	        prize=product-amount;
   	        System.out.println("You are staying more than 2 days in hotel RAINTREE so your  discount is 15% : "+prize);
            }
           
            if(num2>3){
		         dis=12;
		        amount1= (int) ((dis*product1)/100);
		        prize1=product1-amount1;
		        System.out.println("You are staying more than 3 days in hotel RADDISSION so your  discount is 18% : "+prize1);
            }
        
            if(prize<prize1){
            	System.out.println("!!!!!...........congratulations....!! You can hire the room in Hotel THE RAINTREE for the  days:" +num2);
            }
            else if(prize1<prize){
            	System.out.println("!!!!.........congratulations....!! You can hire the room in Hotel THE  RADDISSION for the  days:" +num2);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        if(rating ==1) 
        {
            System.out.println("THE HOTEL FORTUNE\n THE HOTEL ACCORD");
            System.out.println("What is number of days?");
        
            int days= y.nextInt();
            
            if(days>1 && days<32){
            	System.out.println("perfect days");
            }
            else{
            	System.out.println("only one month is allowed except emergency");
            }
            
            
            System.out.print("Enter  number of days: ");
            int num2 = y.nextInt();
            double product = 43*num2;
            double product1= 41.55*num2;
            System.out.println("Output of raddission(43*num2): "+product);
            System.out.println("Output of raintree(41.55*num2): "+product1);
            
            if(num2<=3){
            	System.out.println("you can hire room with amount but no discount");
            	
            	if(money>=41.55 && product<product1){
            		System.out.println("you can take room in ACCORD with amount:" +product);
            	}
            	else if(money>=43 && product1<product){
            		System.out.println("you can take room in FORTUNE with amount:" +product1);
            	}
            	else if(money<41.55){
            		System.out.println("please choose other rating hotels");
            	}
            }
            
            
            
            if(num2>3){
   	         dis=11.8;
   	        amount= (int) ((dis*product)/100);
   	        prize=product-amount;
   	        System.out.println("You are staying more than 2 days in hotel ACCORD so your  discount is 11.8% : "+prize);
            }
           
            if(num2>4){
		         dis=14.8;
		        amount1= (int) ((dis*product1)/100);
		        prize1=product-amount1;
		        System.out.println("You are staying more than 3 days in hotel FORTUNE so your  discount is 14.8%: "+prize1);
            }
        
            if(prize<prize1){
            	System.out.println("!!!!!...........congratulations....!! You can hire the room in Hotel THE ACCORD for the  days:" +num2);
            }
            else if(prize1<prize){
            	System.out.println("!!!!.........congratulations....!! You can hire the room in Hotel THE  FORTUNE for the days:" +num2);
            }
        }
      
        if(rating!=5 && rating!=3 && rating!=1 ){
        	System.out.println("please choose correct ratings");
        }
        
    }
}
        