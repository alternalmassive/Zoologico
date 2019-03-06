package model;
import model.Dragon;
import model.Kangaroo;
public class Environment
{
	
	//Atributes
	
	private String humidity;
	private int temperature;
	
	//Relations
	
	private Dragon dragon1;
	private Dragon dragon2;
	private Kangaroo kangarooMale;
	private Kangaroo kangarooFemale;
	
	//Constructor
	
	public Environment(String humidity, int temperature, Dragon dragon1, Dragon dragon2, Kangaroo kangarooMale, Kangaroo kangarooFemale)
	{
		this.humidity = humidity;
		this.temperature = temperature;
		this.dragon1 =  dragon1;
		this.dragon2 = dragon2;
		this.kangarooMale = kangarooMale;
		this.kangarooFemale = kangarooFemale;
	}
	
	//Gets and Sets
	
	public String getHumidity()
	{
		return humidity;
	}
	
	public void setHumidity(String humidity)
	{
		this.humidity = humidity;
	}
	
	public int getTemperature()
	{
		return temperature;
	}
	
	public void setTemperature(int temperature)
	{
		this.temperature = temperature;
	}
	
			
	public Dragon getDragon1()
	{
		return dragon1;
	}
	
	public void setDragon1(Dragon dragon1)
	{
		this.dragon1 = dragon1;
	}
	
	public Dragon getDragon2()
	{
		return dragon2;
	}
	
	public void setDragon2(Dragon dragon2)
	{
		this.dragon2 = dragon2;
	}
	
	public Kangaroo getKangarooMale()
	{
		return kangarooMale;
	}
	
	public void setKangarooMale(Kangaroo kangarooMale)
	{
		this.kangarooMale = kangarooMale;
	}
	
	public Kangaroo getKangarooFemale()
	{
		return kangarooFemale;
	}
	
	public void setkangarooFemale(Kangaroo kangarooFemale)
	{
		this.kangarooFemale = kangarooFemale;
	}
	
	//methods
	
	public String calculateWaterDragon()
	{
		String water = "";
		water = "El agua requeria del dragon: " + getDragon1().getName() + " es: " + getDragon1().calculateIMC()*0.75;
		water = water + "\nEl agua requeria del dragon: " + getDragon2().getName() + " es: " + getDragon2().calculateIMC()*0.75;
		return water;
	}
	
	public String calculateWaterKangaroo()
	{
		String water = "";
		water = "El agua requeria del canguro: " + getKangarooMale().getName() + " es: " + getKangarooMale().calculateIMC()*0.75;
		water = water + "\nEl agua requeria del canguro: " + getKangarooFemale().getName() + " es: " + getKangarooFemale().calculateIMC()*0.75;
		return water;
	}
	
	public String showReportKangaroo()
	{
		String report;
		report = "Nombre: " + getKangarooMale().getName() + ", Peso: " + getKangarooMale().getWeight() + ", Altura: " + getKangarooMale().getHeight() + ", Sexo: " + getKangarooMale().getGender() + ", Tipo de sangre: " + getKangarooMale().getBloodType() + ", Fecha de Nacimiento: " + getKangarooMale().showDate();
		report = report + "\nNombre: " + getKangarooFemale().getName() + ", Peso: " + getKangarooFemale().getWeight() + ", Altura: " + getKangarooFemale().getHeight() + ", Sexo: " + getKangarooFemale().getGender() + ", Tipo de sangre: " + getKangarooFemale().getBloodType()+ ", Fecha de Nacimiento: " + getKangarooFemale().showDate();
		return report;
	}
	
	public String showReportDragon()
	{
		String report;
		report = "Nombre: " + getDragon1().getName() + ", Peso: " + getDragon1().getWeight() + ", Altura: " + getDragon1().getHeight() + ", Sexo: " + getDragon1().getGender() + ", Tipo de sangre: " + getDragon1().getBloodType()+ ", Fecha de Nacimiento: " + getDragon1().showDate();
		report = report + "\nNombre: " + getDragon2().getName() + ", Peso: " + getDragon2().getWeight() + ", Altura: " + getDragon2().getHeight() + ", Sexo: " + getDragon2().getGender() + ", Tipo de sangre: " + getDragon2().getBloodType()+ ", Fecha de Nacimiento: " + getDragon2().showDate();
		return report;
	}
	
	public String showCardiacRisk()
	{
		String report;
		report = "El riesgo cardiaco del canguro: " + getKangarooMale().getName() + " es: " + getKangarooMale().establishCardiacRisk();
		report = report + "\nEl riesgo cardiaco del canguro: " + getKangarooFemale().getName() + " es: " + getKangarooFemale().establishCardiacRisk();
		return report;
	}
	
	public String showTimeVaccines()
	{
		String report;
		report = "El Estado del canguro: " + getKangarooMale().getName() + " es: " + getKangarooMale().calculateTimeVaccines();
		report = report + "\nEl Estado del canguro: " + getKangarooFemale().getName() + " es: " + getKangarooFemale().calculateTimeVaccines();
		return report;
	}
	
	public String showFood()
	{
		String report;
		report = "La cantidad de alimento del canguro: " + getKangarooMale().getName() + " es: " + getKangarooMale().calculateFood();
		report = report + "\nLa cantidad de alimento del canguro: " + getKangarooFemale().getName() + " es: " + getKangarooFemale().calculateFood();
		return report;
	}
}