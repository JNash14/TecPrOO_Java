package Hijos;

import Padre.Círculo;

public class Cilindro extends Círculo{ //para heredar se utiliza el "extends"
	private double altura;
	
	public Cilindro(double radio, double altura) {
	super(radio); //no se borra porque sirve para herencia
	this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public String MensajeCilindro()
	{
		return "Soy cilindro";
	}
	public double AreaCilindro()
	{
		return 2*3.1416*radio*(radio+altura);
	}
	public double VolumenCilindro()
	{
		return 3.1416*radio*radio*altura;
	}
	
}
