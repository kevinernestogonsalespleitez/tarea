package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class consultaUsuario {
    public boolean insertUsuario(usuario usuario){
        conexion c = new conexion();
        try {
            String sql = "INSERT INTO `usuarios`(`id`, `usuario`, `nombre`, `apellido`, `email`, `celular`, `fecha_registro`, `activo`, `disponible`, `clave`, `tipo_usuario`) VALUES ('"+usuario.getId()+"','"+usuario.getUsuario()+"','"+usuario.getNombre()+"','"+usuario.getApellido()+"','"+usuario.getEmail()+"','"+usuario.getCelular()+"','"+usuario.getFecha_registro()+"','"+usuario.getActivo()+"','"+usuario.getDisponible()+"','"+usuario.getClave()+"','"+usuario.getTipo_Usuario()+"')";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.execute();
            ps.close();
            ps = null;
            c.desconectar();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
