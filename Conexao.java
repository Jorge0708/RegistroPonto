package RegistroPonto;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conexao {
	public static void main(String[] args) {
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String HOST = "localhost";
		final int PORT = 3306;
		final String DATABASE = "Banco";
		final String URL = "jdbc:mysql://" + HOST +
							":" + PORT +
							"/" + DATABASE;
		final String USER = "admin";
		final String PASSWORD = "Uni@2025";
		
		try{
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println( "Conexao realizada com sucesso" );
			connection.close();
		}
		catch( ClassNotFoundException erro ){
			System.out.println("Driver não encontrado!\n" + erro.toString() );
		}
		catch( SQLException erro ){
			System.out.println("Problemas na conexão com a fonte de dados\n" + erro.toString() );
		}
	}
 
}