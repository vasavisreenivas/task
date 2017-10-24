
import java.util.Scanner; 
public class Test { 
	
	public static void main(String[] args)
    {
		System.out.println("List of Hotels");
		System.out.println("5 Rating Hotels are: \n The PARK \n The HYAAT");
		System.out.println("3 Rating Hotels are:\n The RADDISSION \n The RAINTREE");
		System.out.println("1 Rating Hotels are: \n The FORTUNE \n The ACCORD");
		int dis = 0,s,amount,amount1;
        Scanner y= new Scanner (System.in);
        System.out.println("What is your money?");
        double money= y.nextDouble();
        
        System.out.println("Please enter your name!");
        String keyboard= y.nextLine(); 
        y.nextLine();
        
     
        System.out.println("What is your ratings?");
        int rating= y.nextInt();


        if(rating ==5) 
        {
            System.out.println("THE HOTEL PARK\n THE HYAAT");
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
            double product = money*num2;
            System.out.println("Output(money*days): "+product);
            if(num2>2)
   	         dis=20;
   	        s=100-dis;
   	        amount= (int) ((s*product)/100);
   	        System.out.println("You are staying more than 2 days in hotel park so your  discount is 20% : "+amount);
            
            double total = product/90;
            System.out.println("Hotel PARK per one day cost with discount is : "+total);
           
            
            if(num2>3)
		         dis=12;
		        s=100-dis;
		        amount1= (int) ((s*product)/100);
		        System.out.println("You are staying more than 3 days in hotel HYAAT so your  discount is 12%: "+amount1);
            double total1 = product/82;
            System.out.println("Hotel HYAAT per one day cost with discount is : "+total1);
            
        
            if(total<total1){
            	System.out.println("!!!!!...........congratulations....!! You can hire the room in Hotel:THE PARK");
            }
            else{
            	System.out.println("!!!!.........congratulations....!! You can hire the room in Hotel:THE  HYAAT");
            }
        }
        
        
        
 else  if(rating ==3) 
            {
                System.out.println("the RADDISSION\nRAINTREE");
                System.out.println("What is number of days?");
                Scanner z= new Scanner (System.in);
                int days= z.nextInt();
                if(days>1 && days<32){
                	System.out.println("perfect days");
                }
                else{
                	System.out.println("only one month is allowed");
                }
                
                
                System.out.print("Enter  number of days: ");
                int num2 = y.nextInt();
                double product = money*num2;
                System.out.println("Output(money*days): "+product);
                
                
                if(num2>3)
       	         dis=18;
       	        s=100-dis;
       	        amount= (int) ((s*product)/100);
       	        System.out.println("You are staying more than 2 days in hotel RADDISSION so your  discount is 18% : "+amount);
                
                double total = product/60;
                System.out.println("Hotel RADDISSION per one day cost with discount is : "+total);
               
                
                if(num2>2)
    		         dis=15;
    		        s=100-dis;
    		        amount1= (int) ((s*product)/100);
    		        System.out.println("You are staying more than 3 days in hotel RAINTREE so your  discount is 15%: "+amount1);
    		        
                double total1 = product/82;
                System.out.println("Hotel RAINTREE per one day cost with discount is : "+total1);
                
            
                if(total<total1){
                	System.out.println("!!!!!...........congratulations....!! You can hire the room in Hotel:THE RADDISSION");
                }
                else{
                	System.out.println("!!!!.........congratulations....!! You can hire the room in Hotel:THE  RAINTREE");
                }
            }
        
        
        
        
        
 else if(rating ==1) 
     {
         System.out.println("the FORTUNE\nACCORD");
         System.out.println("What is number of days?");
         Scanner z= new Scanner (System.in);
         int days= z.nextInt();
         if(days>1 && days<32){
         	System.out.println("perfect days");
         }
         else{
         	System.out.println("only one month is allowed");
         }
         
         
         System.out.print("Enter  number of days: ");
         int num2 = y.nextInt();
         double product = money*num2;
         System.out.println("Output(money*days): "+product);
         if(num2>4)
	         dis=15;
	        s=100-dis;
	        amount= (int) ((s*product)/100);
	        System.out.println("You are staying more than 2 days in hotel FORTUNE so your  discount is 15% : "+amount);
         
         double total = product/43;
         System.out.println("Hotel FORTUNE per one day cost with discount is : "+total);
        
         
         if(num2>3)
		         dis=12;
		        s=100-dis;
		        amount1= (int) ((s*product)/100);
		        System.out.println("You are staying more than 3 days in hotel ACCORD so your  discount is 12%: "+amount1);
		        
         double total1 = product/41.55;
         System.out.println("Hotel ACCORD per one day cost with discount is : "+total1);
         
     
         if(amount<amount1){
         	System.out.println("!!!!!...........congratulations....!! You can hire the room in Hotel:THE FORTUNE");
         }
         else{
         	System.out.println("!!!!.........congratulations....!! You can hire the room in Hotel:THE  ACCORD");
         }
     }
else{
	 System.out.println("Sorry.....These kind of ratings not avaliable");
 }
     
    }
}
        
        
      