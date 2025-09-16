package caso1;

public class Calculadora {
private int n1, n2, n3; //recibe 3 enteros
private double num1, num2; //recibe 2 reales

//Cuando quieres hacer cambio al valor que vas a recibir, ahi se usa el get y set

//sobrecarga de constructores
public Calculadora(int n1, int n2) {
	super();
	this.n1 = n1;
	this.n2 = n2;
}
public Calculadora(int n1, int n2, int n3) {
	super();
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;
}
public Calculadora(double num1, double num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}
//sobrecarga de metodos
public int Sumar(int n1, int n2) //no olvidar los parametros para evitar error entre metodos
{
	return n1+n2;
}
public int Sumar(int n1, int n2, int n3)
{
	return n1+n2+n3;
}
public double Sumar(double num1, double num2)
{
	return num1+num2;
}

}
