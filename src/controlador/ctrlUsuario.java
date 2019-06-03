package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.consultaUsuario;
import modelo.usuario;
import vista.ven_1;

public class ctrlUsuario implements ActionListener{
    usuario u;
    consultaUsuario cu;
    ven_1 v;
    public ctrlUsuario(usuario u, consultaUsuario cu, ven_1 v) {
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        this.u = u;
        this.cu = cu;
        this.v = v;
        v.Jenviar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == v.Jenviar){
            u.setId(Integer.parseInt(v.Jid.getText()));
            u.setUsuario(v.Jusuario.getText());
            u.setNombre(v.Jnombre.getText());
            u.setApellido(v.Japellido.getText());
            u.setEmail(v.Jemail.getText());
            u.setCelular(v.Jcelular.getText());
            u.setFecha_dia(v.Jfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            u.setFecha_mes(v.Jfecha.getCalendar().get(Calendar.MONDAY));
            u.setFecha_año(v.Jfecha.getCalendar().get(Calendar.YEAR));
            u.setFecha_registro(u.getFecha_año()+"-"+u.getFecha_mes()+"-"+u.getFecha_dia());
            u.setActivo(Integer.parseInt(v.Jactivo.getText()));
            u.setDisponible(Integer.parseInt(v.Jdisponible.getText()));
            u.setClave(v.Jclave.getText());
            u.setTipo_Usuario(Integer.parseInt(v.Jtipo.getText()));
            if(cu.insertUsuario(u)){
                JOptionPane.showMessageDialog(null, "Exito!");
            } else{
                JOptionPane.showMessageDialog(null, "Error!");
            }
        }
    }
    
    
}
