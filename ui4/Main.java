package ui;
import model.*;
import java.util.Scanner;
public class Main
{
	//Relaciones
	private Zoo zoo1;
	private Scanner reader;
	public Main()
	
	{
		init();
	}
	
	
	public static void main(String[] args)
	{
		Main finish = new Main();
	}
	
	public void init()
	{	
		reader = new Scanner(System.in);
		int options = 0;
		
		while(options != 6)
		{ 	
			System.out.println("Digite el numero de la operacion que desea realizar");
			System.out.println("1. Para dar reporte de todos los ambientes");
			System.out.println("2. Para calcular el agua que necesitan los dragones y los canguros");
			System.out.println("3. Para establecer riesgo cardiaco de los canguros");
			System.out.println("4. Para dar reporte de vacunas de los canguros");
			System.out.println("5. Para calcular cuanta comida necesitan los cangutos");
			System.out.println("6. Para salir");
			options = reader.nextInt();
			switch(options)
			{	
				case 1:
					zoo1 = new Zoo();
					String report;
					report = zoo1.showReportEnvironment();
					System.out.println(report);
					break;
				case 2:
					zoo1 = new Zoo();
					String report2;
					report2 = zoo1.showReportWaterDragon();
					System.out.println(report2);
					break;
				case 3:
					zoo1 = new Zoo();
					String report3;
					report3 = zoo1.showReportCardiacRisk();
					System.out.println(report3);
					break;
				case 4:
					zoo1 = new Zoo();
					String report4;
					report4 = zoo1.showReportTimeVaccines();
					System.out.println(report4);
					break;
				case 5:
					zoo1 = new Zoo();
					String report5;
					report5 = zoo1.showReportFood();
					System.out.println(report5);
					break;
				case 6:
					System.out.println("Aplicacion finalizada");
					break;
				default:
					System.out.println("Operacion invalida");
					break;
			}
		}
	}
}


