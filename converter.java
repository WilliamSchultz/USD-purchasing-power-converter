import java.util.Scanner;

public class money
{

public static void main(String[] args)
{

	Scanner stdIn = new Scanner(System.in); 
	String response; 
	double presentValue;
	int pastYear;
	double CPI = 231; //Current Consumer Price Index 
	double pastCPI = 0; 
	double ratio; 
	
	double todaysValue; 
	
	int futureValue; 
	double futureResponse; 
	int futureYear; 
	double interest = .97;  
	
	System.out.println(); 
	System.out.println("Hello!"); 
	
	System.out.println(); 
	System.out.println("Today this progrom offers two options: "); 
	System.out.println(); 
	System.out.println("A.) You can learn what the purchasing power a sum of money");  
	System.out.println("from a year in the past (between the years 1900 and 2012) would have in today's market or; "); 
	System.out.println(); 
	System.out.println("B.) You can learn what a sum of money in today's market will be worth in the future."); 
	System.out.println(); 
	System.out.print("Plese choose either A or B: "); 
	response = stdIn.nextLine(); 
	
	
	if (response.equalsIgnoreCase("A"))
	{
		System.out.println(); 
		System.out.println("What is the amount of money from the past that you want to convert? "); 
		presentValue = stdIn.nextDouble();
		System.out.println("Please enter a year between 1900 and present from which the money is from: "); 
		pastYear = stdIn.nextInt(); 
		
		if (pastYear >= 1900 && pastYear <= 1910) 
			{
			pastCPI = 9;
			}
		else if(pastYear >= 1911 && pastYear <= 1920)
			{
			pastCPI = 15; 
			}
		else if((pastYear >= 1921) && (pastYear <= 1930)) 
			{
			pastCPI = 18; 
			}
		else if((pastYear >= 1931) && (pastYear <= 1940))
			{
			pastCPI = 14; 
			}
		else if((pastYear >= 1941) && (pastYear <= 1950))
			{
			pastCPI = 19; 
			}
		else if((pastYear >= 1951) && (pastYear <= 1960))	
			{
			pastCPI = 27; 
			}
		else if((pastYear >= 1961) && (pastYear <= 1970))	
			{
			pastCPI = 35; 
			}
		else if((pastYear >= 1971) && (pastYear <= 1980))	
			{
			pastCPI = 60; 
			}
		else if((pastYear >= 1981) && (pastYear <= 1990))	
			{
			pastCPI = 110; 
			}
		else if((pastYear >= 1991) && (pastYear <= 2000))	
			{
			pastCPI = 150; 
			}
		else if((pastYear >= 2001) && (pastYear <= 2010))	
			{
			pastCPI = 195; 
			}
		else if((pastYear >= 2011) && (pastYear <= 2012))	
			{
			pastCPI = 231; 
			}
		else 
		{
			System.out.println("Incorrect value, please restart the program"); 
		}
		ratio = (int) CPI / pastCPI; 
		todaysValue = (int) presentValue * ratio; 
		System.out.println("This means that $" + presentValue + " from " + pastYear + " would have the purchasing power of $" + todaysValue + " in today's market!!!"); 
	}
		
else if(response.equalsIgnoreCase("B"))
{
	System.out.println(); 
	System.out.println("What is the amount of money from the today that you want to convert to future value? "); 
	futureResponse = stdIn.nextDouble();
	System.out.println("How many years from now do you want to know this amount's value? "); 
	futureYear = stdIn.nextInt(); 
	
	 futureValue = (int) (futureResponse * Math.pow((interest), futureYear)); 
	 
	 System.out.println("The future value of $" + futureResponse + " in " + futureYear + " years from now will be $" + futureValue); 
	
}
	


}
}

