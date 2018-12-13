package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the contructor, getters and setters for the attributes above.
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired,
			double dRequiredIncome, double dMonthlySSI) {
		super();
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}

	
	
	public int getiYearsToWork() {
		return iYearsToWork;
	}



	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}



	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}



	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		if(dAnnualReturnWorking<=20) {
		this.dAnnualReturnWorking = dAnnualReturnWorking/100;
	
		}
		else
			System.out.println("Must be below 20%");//
	}
		



	public int getiYearsRetired() {
		return iYearsRetired;
	}



	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}



	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}



	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		
		if(dAnnualReturnRetired<=3) {
			this.dAnnualReturnRetired = dAnnualReturnRetired/100;
		
			}
			else
				System.out.println("Must be below 3%");
		}
			
	



	public double getdRequiredIncome() {
		return dRequiredIncome;
	}



	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}



	public double getdMonthlySSI() {
		return dMonthlySSI;
	}



	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}


	
	
	
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		double saveEachMonth = (TotalAmountSaved()-(TotalAmountSaved()*dAnnualReturnWorking))/(iYearsToWork*12);
		
		return saveEachMonth;
	}
	//I USED PV FORMULA
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		double amountToBeSaved =  (dRequiredIncome*dAnnualReturnRetired) / 1-Math.pow(1+dAnnualReturnRetired, -(iYearsRetired*12));
		
		//I USED PMT FORMULA
		return amountToBeSaved;
	}
}

