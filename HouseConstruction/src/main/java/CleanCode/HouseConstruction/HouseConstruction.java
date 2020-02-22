package CleanCode.HouseConstruction;

class HouseConstruction
{
	double houseCost(int materialType,int fullyAutomated,double areaInSquareFeet)
	{
		int[] costOfMaterials={1200,1500,1800,2500};
		if(fullyAutomated==1 && materialType==3)
		{
			return costOfMaterials[3]*areaInSquareFeet;
		}
		else
		{
			return costOfMaterials[materialType-1]*areaInSquareFeet;
		}
	}
}