package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private Connection cx;
    private String bd = "programacion";
    private String url = "jdbc:mysql://pma.yyekk.info:3306/"+bd;
    private String user = "progra";
    private String pass = "progra";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Se conecto");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("no se conecto");
        }
        return cx;
    }

    public void desconectar() {
        try {
            cx.close();
            System.out.println("se desconecto");
        } catch (SQLException ex) {
        }

    }
}
