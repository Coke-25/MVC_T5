package es.studium.ED_practica5;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;

public class Vista extends Frame
{
	private static final long serialVersionUID = 1L;
	//Ventanas
	Dialog darNuevo = new Dialog(this,"Nuevo",true);
	Dialog darConsultar = new Dialog(this,"Consultar",true);
	Dialog darEliminar = new Dialog(this,"Eliminar",true);
	Dialog darModificar = new Dialog(this,"Modificar",true);
	Dialog correcto = new Dialog(this,"¡Operación realizada!",true);
	Dialog incorrecto = new Dialog(this,"Error",true);
	//Objetos para el menu
	MenuBar barraMenu = new MenuBar();
	Menu empleados = new Menu("Empleados");
		//Items de Empleados
		MenuItem nuevo = new MenuItem("Nuevo");
		MenuItem consultar = new MenuItem("Consultar");
		MenuItem eliminar = new MenuItem("Eliminar");
		MenuItem modificar = new MenuItem("Modificar");
		
	//Nuevo
	Label lbNuevo = new Label("Nuevo Empleado");
	TextField txNuevo = new TextField(20);
	Button btnAceptarNuevo = new Button("Aceptar");
	//Consultar
	Label lbConsultarID1 = new Label("Introduzca id del empleado:");
	TextField txConsultarID1 = new TextField(5);
	Label lbConsultarNombre = new Label("Nombre:");
	Label lbConsultarID2 = new Label("ID:");
	TextField txConsultarNombre = new TextField(20);
	TextField txConsultarID2 = new TextField(5);
	Button btnConsultar = new Button("Consultar");
	//Eliminar
	Choice listaEliminar = new Choice();
	Label lbEliminar = new Label("Empleado que se eliminará:");
	TextField txEliminar = new TextField(20);
	Button btnAceptarEliminar = new Button("Eliminar");
	//Modificar
	Choice listaModificar = new Choice();
	Label lbModificar1 = new Label("Nombre actual:");
	TextField txModificar1 = new TextField(20);
	Label lbModificar2 = new Label("Nuevo nombre:");
	TextField txModificar2 = new TextField(20);
	Button btnAceptarModificar = new Button("Modificar");
	//Correcto
	Label lbCorrecto = new Label("La acción se ha realizado exitosamente :)");
	//Incorrecto
	Label lbIncorrecto = new Label("La acción no se ha podido realizar :(");
		
 
	public Vista() 
	{
		//Menú
		setLayout(new FlowLayout());
		setTitle("Menú");
		setMenuBar(barraMenu);
		barraMenu.add(empleados);
		empleados.add(nuevo);
		empleados.add(consultar);
		empleados.add(eliminar);
		empleados.add(modificar);
		setSize(350,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Nuevo
		darNuevo.setLayout(new FlowLayout());
		darNuevo.add(lbNuevo);
		darNuevo.add(txNuevo);
		darNuevo.add(btnAceptarNuevo);
		darNuevo.setSize(200,150);
		darNuevo.setLocationRelativeTo(null);
		darNuevo.setVisible(false);
		
		//Consultar
		darConsultar.setLayout(new FlowLayout());
		darConsultar.add(lbConsultarID1);
		darConsultar.add(txConsultarID1);
		darConsultar.add(btnConsultar);
		darConsultar.add(lbConsultarNombre);
		darConsultar.add(txConsultarNombre);
		darConsultar.add(lbConsultarID2);
		darConsultar.add(txConsultarID2);
		darConsultar.setSize(700,80);
		darConsultar.setLocationRelativeTo(null);
		darConsultar.setVisible(false);
		
		//Eliminar
		darEliminar.setLayout(new FlowLayout());
		darEliminar.add(listaEliminar);
		listaEliminar.add("Selecciona un empleado");
		darEliminar.add(lbEliminar);
		darEliminar.add(txEliminar);
		darEliminar.add(btnAceptarEliminar);
		darEliminar.setSize(230,160);
		darEliminar.setLocationRelativeTo(null);
		darEliminar.setVisible(false);
		
		//Modificar
		darModificar.setLayout(new FlowLayout());
		darModificar.add(listaModificar);
		listaModificar.add("Selecciona un empleado");
		darModificar.add(lbModificar1);
		darModificar.add(txModificar1);
		darModificar.add(lbModificar2);
		darModificar.add(txModificar2);
		darModificar.add(btnAceptarModificar);
		darModificar.setSize(230,230);
		darModificar.setLocationRelativeTo(null);
		darModificar.setVisible(false);
		
		//Correcto
		correcto.setLayout(new FlowLayout());
		correcto.add(lbCorrecto);
		correcto.setSize(280,100);
		correcto.setLocationRelativeTo(null);
		correcto.setVisible(false);
		
		//Incorrecto
		incorrecto.setLayout(new FlowLayout());
		incorrecto.add(lbIncorrecto);
		incorrecto.setSize(280,100);
		incorrecto.setLocationRelativeTo(null);
		incorrecto.setVisible(false);
	}
}
