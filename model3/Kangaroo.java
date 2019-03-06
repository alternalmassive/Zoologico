package model;
import java.util.*;
public class Kangaroo
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
	
	private Date birthdateKangaroo; 
	
	//Constructor
	
	public Kangaroo(String name, int weight, double height, String gender, String bloodType, Date birthdateKangaroo)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodType = bloodType;
		this.birthdateKangaroo = birthdateKangaroo;
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
	
	public Date getBirthdateKangaroo()
	{
		return birthdateKangaroo;
	}
	
	public void setBirthdateKangaroo(Date birthdateKangaroo)
	{
		this.birthdateKangaroo = birthdateKangaroo;
	}
	
	//Methods
	
	Calendar cal = new GregorianCalendar();
	int currentYear = cal.get(Calendar.YEAR);
	int currentDay = cal.get(Calendar.DAY_OF_MONTH);
	int currentMonth = cal.get(Calendar.MONTH);
	
	public double calculateIMC()
	{
		double imc = 0;
		imc = weight/height;
	    return imc;
	}
	
	public String establishCardiacRisk()
	{
		String mensaje = "";
		if(calculateIMC() < 18.0)
		{
			if(BLOOD_TYPE_A == bloodType || BLOOD_TYPE_AB == bloodType)
			{
				mensaje += "Riesgo bajo";
			}
			else
			{
				mensaje +="Riesgo Moderado";
			}
		}
		if(calculateIMC() > 18.0 && calculateIMC() < 25.0)
		{
			mensaje += " Riesgo bajo";
		}
		if(calculateIMC() > 25.0) 
		{
			if(BLOOD_TYPE_AB == bloodType)
			{
				mensaje += "Riesgo moderado";
			}
			else
			{
				mensaje += "Riesgo alto";
			}
		}
		return mensaje;
	}

	public int calculateYear()
	{
		int age = 0;
		age = currentYear - birthdateKangaroo.getYear();
		return age;
	}
	public int calculateMonth()
	{
		int months = 0;
		months = 11 - birthdateKangaroo.getMonth();
		return months;
	}
	public int calculateDay()
	{
		int days = 0;
		days = 30 - birthdateKangaroo.getDay();
		return days;
	}
	public String calculateTimeVaccines()
	{
		String vaccines = "";
		if(calculateYear() == 1 && calculateMonth() > currentMonth)
		{
			vaccines += "Requiere vacuna y faltan: " + calculateMonth() + " meses y " + calculateDay() + " dias";
		}
		if(calculateYear() == 0)
		{
			vaccines += "Requiere vacuna y faltan: " + calculateMonth() + " meses y " + calculateDay() + " dias";
		}
		if(calculateYear() >= 2)
		{
			vaccines+= "no requiere vacuna";
		}
		return vaccines;
	}
	
	public double calculateFood()
	{
		double foodTotal= 0.0;
		if(weight < 30)
		{
			foodTotal = weight * 0.8;
		}
		else if(weight < 48)
		{
			foodTotal = weight * 1.1;
		}
		else if(weight > 48)
		{
			foodTotal = (weight - 48)*0.4 + 40;
		}
		return foodTotal;
	}
	
	public String showDate()
	{
		String date;
		date = "Fecha de nacimiento: " + getBirthdateKangaroo().getDay() + "/" + getBirthdateKangaroo().getMonth() + "/" + getBirthdateKangaroo().getYear();
		return date;
	}
}