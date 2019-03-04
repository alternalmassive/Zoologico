package model;
public class Kangaroo
{
	//Atributes 
	private String name;
	private int weight;
	private double height;
	private String gender;
	private String birthdate;
	private int imc;
	//Constructor
	public Kangaroo(String name, int weight, double height, String gender, String birthdate, int imc)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.birthdate = birthdate;
		this.imc = imc;
	}
	//Gets and Sets
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public String getBirthdate()
	{
		return birthdate;
	}
	
	public void setBirthdate(String birthdate)
	{
		this.birthdate = birthdate;
	}
	
	public int getImc()
	{
		return imc;
	}
	
	public void setImc(int imc)
	{
		this.imc = imc;
	}
}