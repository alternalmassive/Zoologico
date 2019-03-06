package model;
public class Dragon
{
	//Atributes 
	
	private String name;
	private int weight;
	private double height;
	private String gender;
	private String bloodType;
	
	//Constants
	
	public final static String BLOOD_TYPE_A = "A";
	public final static String BLOOD_TYPE_B = "B";
	public final static String BLOOD_TYPE_O = "O";
	public final static String BLOOD_TYPE_AB = "AB";
	
	//Relations
	
	private Date birthdateDragon; 
	
	//Constructor
	
	public Dragon(String name, int weight, double height, String gender, String bloodType, Date birthdateDragon)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodType = bloodType;
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
	
	public String getBloodType()
	{
		return bloodType;
	}
	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}
	
	public Date getBirthdateDragon()
	{
		return birthdateDragon;
	}
	
	public void setBirthdateDragon(Date birthdateDragon)
	{
		this.birthdateDragon = birthdateDragon;
	}
	
	//Methods 
	
	public double calculateIMC()
	{
		double imc = 0;
		imc = weight/height;
	    return imc;
	}
	
	public String showDate()
	{
		String date;
		date = "Fecha de nacimiento: " + getBirthdateDragon().getDay() + "/" + getBirthdateDragon().getMonth() + "/" + getBirthdateDragon().getYear();
		return date;
	}
}