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
	
	public Kangaroo setKangarooFemale()
	{
		return kangarooFemale;
	}
	
	public void kangarooFemale(Kangaroo kangarooFemale)
	{
		this.kangarooFemale = kangarooFemale;
	}
}