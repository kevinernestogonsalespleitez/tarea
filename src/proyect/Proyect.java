package proyect;

import controlador.ctrlUsuario;
import modelo.consultaUsuario;
import modelo.usuario;
import vista.ven_1;

public class Proyect {

    public static void main(String[] args) {
        usuario u = new usuario();
        consultaUsuario cu = new consultaUsuario();
        ven_1 v = new ven_1();
        ctrlUsuario ctrlu = new ctrlUsuario(u,cu,v);
    }
    
}
