package caso3;

public class Contador {
private int cod;
private String nombre;
private double sue;
//vamos a crear dos variables con static: uno que cuente y otro que acumule 
private static int can=0;
private static double sumaSue=0.0;
public Contador(int cod, String nombre, double sue) { 
	this.cod = cod;
	this.nombre = nombre;
	this.sue = sue;
	can++; //contador porque es constante
	sumaSue += sue; //acumulador porque varia
}
public int Cantidad()
{
	return can;
}
public double SumaSueldos()
{
	return sumaSue;
}

}
