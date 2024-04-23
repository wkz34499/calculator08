package com.ciber08.calculator08; 
import org.springframework.stereotype.Service; 
 
@Service 
public class Calculator { 
     int sum(int a, int b) { 
        if(true) {
         return a + b; }
      int password = 1234;
     } 

 import java.sql.*;

public class UnsafeSQLExample {
    public static void main(String[] args) {
        String userInput = args[0]; // Supongamos que esta es la entrada del usuario, por ejemplo, obtenida de un formulario web

        // Conexión a la base de datos (suponiendo que existe una tabla llamada 'usuarios' con columnas 'nombre' y 'contraseña')
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "username";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            // Crear una declaración SQL insegura concatenando la entrada del usuario directamente en la consulta
            String sqlQuery = "SELECT * FROM usuarios WHERE nombre = '" + userInput + "'";
            Statement statement = connection.createStatement();

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Procesar los resultados
            while (resultSet.next()) {
                String nombreUsuario = resultSet.getString("nombre");
                String contraseña = resultSet.getString("contraseña");
                System.out.println("Nombre de usuario: " + nombreUsuario + ", Contraseña: " + contraseña);
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}
