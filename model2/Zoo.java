package model;
import model.Environment;
public class Zoo
{
	//Relations
	private Environment environment1;  //Ambiente canguro
	private Environment environment2;  //Ambiente Canguro
	private Environment environment3;  //Ambiente Canguro
	private Environment environment4;  //Ambiente Dragon
	//constructor
	public Zoo(Environment environment1, Environment environment2, Environment environment3, Environment environment4)
	{
		this.environment1 = environment1;
		this.environment2 = environment2;
		this.environment3 = environment3;
		this.environment4 = environment4;
	}
	//Gets and Sets
	public Environment getEnvironment1()
	{
		return environment1;
	}
	public void setEnvironment1(Environment environment1)
	{
		this.environment1 = environment1;
	}
	
	public Environment getEnvironment2()
	{
		return environment2;
	}
	public void setEnvironment2(Environment environment2)
	{
		this.environment2 = environment2;
	}
	
	public Environment getEnvironment3()
	{
		return environment2;
	}
	public void setEnvironment3(Environment environment3)
	{
		this.environment3 = environment3;
	}
	
	public Environment getEnvironment4()
	{
		return environment4;
	}
	public void setEnvironment4(Environment environment4)
	{
		this.environment4 = environment4;
	}
}