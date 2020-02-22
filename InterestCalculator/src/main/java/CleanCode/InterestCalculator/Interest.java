package CleanCode.InterestCalculator;

class Interest
{
	float principalAmount;
	float timePeriod;
	float rateOfInterest;
	Interest(float p,float t,float r)
	{
		principalAmount=p;
		timePeriod=t;
		rateOfInterest=r;
	}
	public double calculateSimpleInterest()
	{
		double interest;
		interest=principalAmount*timePeriod*rateOfInterest;
		interest=interest/100;
		return interest;
	}
	public double calculateCompoundInterest()
	{
		double interest=principalAmount*Math.pow((1+rateOfInterest/100),timePeriod);
		return interest;
	}
}