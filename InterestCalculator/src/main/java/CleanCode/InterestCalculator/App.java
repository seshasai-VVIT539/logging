package CleanCode.InterestCalculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args)
	{
		Interest obj;
		Scanner sc=new Scanner(System.in);
		int choice;
		float principalAmount,timePeriod,rateOfInterest;
		LOGGER.info("Enter principal amount:");
		principalAmount=sc.nextFloat();
		LOGGER.info("Enter time:");
		timePeriod=sc.nextFloat();
		LOGGER.info("Enter rate:");
		rateOfInterest=sc.nextFloat();
		obj=new Interest(principalAmount,timePeriod,rateOfInterest);
		LOGGER.info("Enter choice\n1.Simple Interest\t2.Compound Interest\n");
		choice=sc.nextInt();
		if(choice!=1 && choice!=2)
		{
			LOGGER.info("Invalid choice\n");
		}
		else if(choice==1)
		{
			LOGGER.info("Simple interest is: {}",obj.calculateSimpleInterest());
		}
		else
		{
			LOGGER.info("Compound interest is: {}",obj.calculateCompoundInterest());
		}
	}
}