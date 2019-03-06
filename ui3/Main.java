package ui;
import model.*;
import java.util.Scanner;
public class Main
{	
	private Zoo zoo1;
	private Scanner reader;

	public Main()
	{
	    reader = new Scanner(System.in);
		
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
		
		Environment EK1 = new Environment ("20%", 34, null, null, KM1, KF1);
		Environment EK2 = new Environment ("24%", 34, null, null, KM2, KF2);
		Environment EK3 = new Environment ("23%", 34, null, null, KM3, KF3);
		Environment ED1 = new Environment ("63%", 20, D1, D2, null, null);
		
		zoo1 = new Zoo(EK1, EK2, EK3, ED1);
	}
	
	public static void main(String[] args)
	{	
	 
		Main m = new Main();
		
	}
	
	/*public void showMenu()
	{	
		int options = 0;
		
		while(options != 5)
		{ 	
			System.out.println("Digite el numero de la operacion que desea realizar");
			System.out.println("1. Para crear canguros");
			System.out.println("2. Para eliminar canguros");
			System.out.println("3. Para cambiar canguros de ambiente");
			System.out.println("4. Para otros servicios");
			System.out.println("5. Para salir");
			options = reader.nextInt();
			Main m = new Main();
			switch(options)
			{	
				case 1:
					System.out.println("nombre del canguro: ");
					break;
				case 2:
					System.out.println("nombre del canguro: ");
					break;
				case 3:
					System.out.println("metodo cualquiera: ");
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
	

	public void metodoEntrante()
	{
		System.out.println("nombre del canguro:");
		String name = reader.nextLine();
		System.out.println("peso del canguro:");
		int weight = reader.nextInt();
		System.out.println("altura del canguro:");
		double height = reader.nextDouble();
		System.out.println("sexo del canguro:");
		String gender = reader.nextLine();
		System.out.println("tipo de sangre del canguro:");
		String bloodType = reader.nextLine();
		Kangaroo kanga = new Kangaroo(name, weight, height, gender, bloodType, null);
	}
	*/
}
