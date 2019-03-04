package ui;
import model.*;
import java.util.Scanner;
public class Main
{	
	private Zoo zoo1;
	
	public static void main(String[] args)
	{	
		Scanner reader = new Scanner(System.in);
		
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
		
		Dragon D1 = new Dragon ("King", 450, 60.0, "masculino", BDD1);
		Dragon D2 = new Dragon ("Niza", 438, 54.0, "femenino", BDD2);
		
		Environment EK1 = new Environment ("20%", 34, null, null, KM1, KF1);
		Environment EK2 = new Environment ("24%", 34, null, null, KM2, KF2);
		Environment EK3 = new Environment ("23%", 34, null, null, KM3, KF3);
		Environment ED1 = new Environment ("63%", 20, D1, D2, null, null);
		
		int options = 0;
		
		while(options != 5){
			
			System.out.println("Digite el numero de la operacion que desea realizar");
			System.out.println("1. Para crear canguros");
			System.out.println("2. Para eliminar canguros");
			System.out.println("3. Para cambiar canguros de ambiente");
			System.out.println("4. Para otros servicios");
			System.out.println("5. Para salir");
			options = reader.nextInt();
			
			switch(options)
			{	
				case 1:
					System.out.println("nombre del canguro: ");
					break;
				case 2:
					System.out.println("nombre del canguro: ");
					break;
				case 3:
					System.out.println("metodo cualquiera: " );
					break;
				case 4:
					System.out.println("metodo cualquiera: ");
					break;
				case 5:
					System.out.println("Aplicacion finalizada");
					break;
				default:
					System.out.println("Operacion invalida");
					break;
			}
		}
	}
		
	
		
		/*
		System.out.println("Ambiente de carguros 1 \nHumedad: " + EK1.getHumidity() + " Temperatura: " 
							+ EK1.getTemperature() + "\nCanguro 1 \nNombre: " + KM1.getName() + " Peso: " + KM1.getWeight() 
							+ " Estatura: " + KM1.getHeight() + " Sexo: " + KM1.getGender() + " Fecha de nacimiento: " + BDKM1.getDay() + "/" + BDKM1.getMonth() + "/" + BDKM1.getYear());
		System.out.println("\nCanguro 2 \nNombre: " + KF1.getName() + " Peso: " + KF1.getWeight() + " Estatura: " 
							+ KF1.getHeight() + " Sexo: " + KF1.getGender() + "\n");
		System.out.println("Ambiente de carguros 2 \nHumedad: " + EK2.getHumidity() + " Temperatura: " 
							+ EK2.getTemperature() + "\nCanguro 1 \nNombre: " + KM2.getName() + " Peso: " + KM2.getWeight() 
							+ " Estatura: " + KM2.getHeight() + " Sexo: " + KM2.getGender());
		System.out.println("\nCanguro 2 \nNombre: " + KF2.getName() + " Peso: " + KF2.getWeight() + " Estatura: " 
							+ KF2.getHeight() + " Sexo: " + KF2.getGender() + "\n");
		System.out.println("Ambiente de carguros 3 \nHumedad: " + EK3.getHumidity() + " Temperatura: " 
							+ EK3.getTemperature() + "\nCanguro 1 \nNombre: " + KM3.getName() + " Peso: " + KM3.getWeight() 
							+ " Estatura: " + KM3.getHeight() + " Sexo: " + KM3.getGender());
		System.out.println("\nCanguro 2 \nNombre: " + KF3.getName() + " Peso: " + KF3.getWeight() + " Estatura: " 
							+ KF3.getHeight() + " Sexo: " + KF3.getGender() + "\n");
		
		
		System.out.println("Ambiente de dragones barbados \nHumedad: " + ED1.getHumidity() + " Temperatura: " 
							+ ED1.getTemperature() + "\nDragon barbado 1 \nNombre: " + D1.getName() + " Peso: " + D1.getWeight() 
							+ " Estatura: " + D1.getHeight() + " Sexo: " + D1.getGender());
		System.out.println("\nDragon barbado 2 \nNombre: " + D2.getName() + " Peso: " + D2.getWeight() + " Estatura: " 
							+ D2.getHeight() + " Sexo: " + D2.getGender() + "\n");
							
		//calcular alimento
		System.out.println(KM1.calculateFood() +" "+ KM2.calculateFood() + " " + KM3.calculateFood());
		//calcular edad
		System.out.println(KM1.calculateTimeVaccines()+"\n"+KM2.calculateTimeVaccines()+"\n"+KM3.calculateTimeVaccines());
		//calcular imc
		System.out.println(KM1.calculateIMC() + " " + KM2.calculateIMC() + " " + KM3.calculateIMC());
		//calcular riesgo cardiaco
		System.out.println(KM1.establishCardiacRisk() + " " + KM2.establishCardiacRisk() + " " + KM3.establishCardiacRisk());
		*/
}