package Padre;

public class Círculo {
//cuando queremos trabajar con HERENCIA se utiliza "protected", solamente protege al hijo
	protected double radio;
//gereramos el constructor
public Círculo(double radio) {
	this.radio = radio;
}
//generamos get and set
public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}

//creamos el método de mensaje
public String MensajeCirculo()
{
	return "Soy Círculo";
}

public double AreaCirculo()
{	
	return  3.1416*(radio*radio);
}
public double LongitudCirculo()
{
	return 2*3.1416*radio;
}


}
