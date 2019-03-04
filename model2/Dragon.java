package model;
public class Dragon
{
	//Atributes 
	private String name;
	private int weight;
	private double height;
	private String gender;
	//Relations
	private Date birthdateDragon; 
	//Constructor
	public Dragon(String name, int weight, double height, String gender, Date birthdateDragon)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.birthdateDragon = birthdateDragon;
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
	
	public Date getBirthdateDragon()
	{
		return birthdateDragon;
	}
	
	public void setBirthdateDragon(Date birthdateDragon)
	{
		this.birthdateDragon = birthdateDragon;
	}
}