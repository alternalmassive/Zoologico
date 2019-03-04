package ui;
import model.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Kangaroo KM1 = new Kangaroo ("Pancho", 20, 1.2, "masculino", "Junio 8 de 2017", 16);
		Kangaroo KM2 = new Kangaroo ("Hachiko", 26, 1.1, "masculino", "Enero 5 de 2018", 20);
		Kangaroo KM3 = new Kangaroo ("Pongo", 22, 1.3, "masculino", "Septiembre 27 de 2018", 17);
		Kangaroo KF1 = new Kangaroo ("Molly", 27, 0.9, "femenino", "Diciembre 13 de 2016", 21);
		Kangaroo KF2 = new Kangaroo ("Sally", 23, 1.1, "femenino", "Octubre 15 de 2017", 18);
		Kangaroo KF3 = new Kangaroo ("Sharon", 24, 0.8, "femenino", "Febrero 26 de 2018", 19);
		
		Dragon D1 = new Dragon ("King", 450, 60.0, "masculino", "Agosto 5 de 2018", 183);
		Dragon D2 = new Dragon ("Niza", 438, 54.0, "femenino", "Diciembre 12 2018", 245);
		
		Environment EK1 = new Environment ("20%", 34, null, null, KM1, KF1);
		Environment EK2 = new Environment ("24%", 34, null, null, KM2, KF2);
		Environment EK3 = new Environment ("23%", 34, null, null, KM3, KF3);
		Environment ED1 = new Environment ("63%", 20, D1, D2, null, null);
		
		System.out.println("Ambiente de carguros 1 \nHumedad: " + EK1.getHumidity() + " Temperatura: " 
							+ EK1.getTemperature() + "\nCanguro 1 \nNombre: " + KM1.getName() + " Peso: " + KM1.getWeight() 
							+ " Estatura: " + KM1.getHeight() + " Sexo: " + KM1.getGender() + " Fecha de nacimiento: " + KM1.getBirthdate()
							+ " Masa Muscular: " + KM1.getImc());
		System.out.println("\nCanguro 2 \nNombre: " + KF1.getName() + " Peso: " + KF1.getWeight() + " Estatura: " 
							+ KF1.getHeight() + " Sexo: " + KF1.getGender() + " Fecha de nacimiento: " + KF1.getBirthdate()
							+ " Masa Muscular: " + KF1.getImc() + "\n");
		System.out.println("Ambiente de carguros 2 \nHumedad: " + EK2.getHumidity() + " Temperatura: " 
							+ EK2.getTemperature() + "\nCanguro 1 \nNombre: " + KM2.getName() + " Peso: " + KM2.getWeight() 
							+ " Estatura: " + KM2.getHeight() + " Sexo: " + KM2.getGender() + " Fecha de nacimiento: " + KM2.getBirthdate()
							+ " Masa Muscular: " + KM2.getImc());
		System.out.println("\nCanguro 2 \nNombre: " + KF2.getName() + " Peso: " + KF2.getWeight() + " Estatura: " 
							+ KF2.getHeight() + " Sexo: " + KF2.getGender() + " Fecha de nacimiento: " + KF2.getBirthdate()
							+ " Masa Muscular: " + KF2.getImc() + "\n");
		System.out.println("Ambiente de carguros 3 \nHumedad: " + EK3.getHumidity() + " Temperatura: " 
							+ EK3.getTemperature() + "\nCanguro 1 \nNombre: " + KM3.getName() + " Peso: " + KM3.getWeight() 
							+ " Estatura: " + KM3.getHeight() + " Sexo: " + KM3.getGender() + " Fecha de nacimiento: " + KM3.getBirthdate()
							+ " Masa Muscular: " + KM3.getImc());
		System.out.println("\nCanguro 2 \nNombre: " + KF3.getName() + " Peso: " + KF3.getWeight() + " Estatura: " 
							+ KF3.getHeight() + " Sexo: " + KF3.getGender() + " Fecha de nacimiento: " + KF3.getBirthdate()
							+ " Masa Muscular: " + KF3.getImc() + "\n");
		
		
		System.out.println("Ambiente de dragones barbados \nHumedad: " + ED1.getHumidity() + " Temperatura: " 
							+ ED1.getTemperature() + "\nDragon barbado 1 \nNombre: " + D1.getName() + " Peso: " + D1.getWeight() 
							+ " Estatura: " + D1.getHeight() + " Sexo: " + D1.getGender() + " Fecha de nacimiento: " + D1.getBirthdate()
							+ " Masa Muscular: " + D1.getImc());
		System.out.println("\nDragon barbado 2 \nNombre: " + D2.getName() + " Peso: " + D2.getWeight() + " Estatura: " 
							+ D2.getHeight() + " Sexo: " + D2.getGender() + " Fecha de nacimiento: " + D2.getBirthdate()
							+ " Masa Muscular: " + D2.getImc() + "\n");
		
	}
}