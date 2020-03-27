package es.studium.ED_practica5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Modelo 
{
	//Base de datos
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
	String login = "root";
	String password = "Studium2020;";
	
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
}
