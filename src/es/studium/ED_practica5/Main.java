package es.studium.ED_practica5;

public class Main 
{
	public static void main(String[] args)
	{
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		new Controlador(modelo, vista);
	}
}
