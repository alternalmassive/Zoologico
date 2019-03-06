package model;
import model.Environment;
public class Zoo
{
	//Relations
	
	private Environment environment1;  //Ambiente canguro
	private Environment environment2;  //Ambiente Canguro
	private Environment environment3;  //Ambiente Canguro
	private Environment environment4;  //Ambiente Dragon
	
	//constructor
	
	public Zoo()
	{
		Date BDKM1 = new Date(8, 6, 2017);
		Date BDKM2 = new Date(5, 1, 2019);
		Date BDKM3 = new Date(27, 7, 2018);
		Date BDKF1 = new Date(13, 12, 2016);
		Date BDKF2 = new Date(15, 8, 2017);
		Date BDKF3 = new Date(26, 2, 2018);
		Date BDD1 = new Date(5, 8, 2018);
		Date BDD2 = new Date(12, 12, 2018);
		
		Kangaroo KM1 = new Kangaroo ("Hachiko", 32, 1.2, "masculino", "AB", BDKM1);
		Kangaroo KM2 = new Kangaroo ("Hachiko", 32, 1.2, "masculino", "AB", BDKM2);
		Kangaroo KM3 = new Kangaroo ("Pongo", 60, 1.3, "masculino", "O", BDKM3);
		Kangaroo KF1 = new Kangaroo ("Molly", 60, 1.3, "femenino", "AB", BDKF1);
		Kangaroo KF2 = new Kangaroo ("Sally", 23, 1.1, "femenino", "O", BDKF2);
		Kangaroo KF3 = new Kangaroo ("Sharon", 24, 0.8, "femenino", "B", BDKF3);
		
		Dragon D1 = new Dragon ("King", 450, 60.0, "masculino", "A", BDD1);
		Dragon D2 = new Dragon ("Niza", 438, 54.0, "femenino", "B", BDD2);
		
		environment1 = new Environment ("20%", 34, null, null, KM1, KF1);
		environment2 = new Environment ("24%", 34, null, null, KM2, KF2);
		environment3 = new Environment ("23%", 34, null, null, KM3, KF3);
		environment4 = new Environment ("63%", 20, D1, D2, null, null);
	}
	
	//Gets and Sets
	
	public Environment getEnvironment1()
	{
		return environment1;
	}
	public void setEnvironment1(Environment environment1)
	{
		this.environment1 = environment1;
	}
	
	public Environment getEnvironment2()
	{
		return environment2;
	}
	public void setEnvironment2(Environment environment2)
	{
		this.environment2 = environment2;
	}
	
	public Environment getEnvironment3()
	{
		return environment2;
	}
	public void setEnvironment3(Environment environment3)
	{
		this.environment3 = environment3;
	}
	
	public Environment getEnvironment4()
	{
		return environment4;
	}
	public void setEnvironment4(Environment environment4)
	{
		this.environment4 = environment4;
	}
	
	public String showReportEnvironment()
	{
		String report;
		report = "Reporte del ambiente canguros 1:\n" + getEnvironment1().showReportKangaroo() + "\n";
		report = report + "\nReporte del ambiente canguros 2:\n" + getEnvironment2().showReportKangaroo() + "\n";
		report = report + "\nReporte del ambiente canguros 3:\n" + getEnvironment3().showReportKangaroo() + "\n";
		report = report + "\nReporte del ambiente dragones:\n" + getEnvironment4().showReportDragon() + "\n";
		return report;
	}
	
	public String showReportWaterDragon()
	{
		String report;
		report = "Ambiente canguros 1:\n" + getEnvironment1().calculateWaterKangaroo();
		report = report + "\nAmbiente canguros 2:\n" + getEnvironment2().calculateWaterKangaroo();
		report = report + "\nAmbiente canguros 3:\n" + getEnvironment3().calculateWaterKangaroo();
		report = report + "\nAmbiente dragones:\n" + getEnvironment4().calculateWaterDragon();
		return report;
	}
	
	public String showReportCardiacRisk()
	{
		String report;
		report = "Ambiente canguros 1:\n" + getEnvironment1().showCardiacRisk();
		report = report + "\nAmbiente canguros 2:\n" + getEnvironment2().showCardiacRisk();
		report = report + "\nAmbiente canguros 3:\n" + getEnvironment3().showCardiacRisk();
		return report;
	}
	
	public String showReportTimeVaccines()
	{
		String report;
		report = "Ambiente canguros 1:\n" + getEnvironment1().showTimeVaccines();
		report = report + "\nAmbiente canguros 2:\n" + getEnvironment2().showTimeVaccines();
		report = report + "\nAmbiente canguros 3:\n" + getEnvironment3().showTimeVaccines();
		return report;
	}
	
	public String showReportFood()
	{
		String report;
		report = "Ambiente canguros 1:\n" + getEnvironment1().showFood();
		report = report + "\nAmbiente canguros 2:\n" + getEnvironment2().showFood();
		report = report + "\nAmbiente canguros 3:\n" + getEnvironment3().showFood();
		return report;
	}
}