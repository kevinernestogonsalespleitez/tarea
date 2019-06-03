package modelo;

public class usuario {
    private int id;
    private String usuario;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    
    private int fecha_dia;
    private int fecha_mes;
    private int fecha_año;
    private String Fecha_registro;
    
    private int activo;
    private int disponible;
    private String clave;
    private int tipo_Usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getFecha_dia() {
        return fecha_dia;
    }

    public void setFecha_dia(int fecha_dia) {
        this.fecha_dia = fecha_dia;
    }

    public int getFecha_mes() {
        return fecha_mes;
    }

    public void setFecha_mes(int fecha_mes) {
        this.fecha_mes = fecha_mes;
    }

    public int getFecha_año() {
        return fecha_año;
    }

    public void setFecha_año(int fecha_año) {
        this.fecha_año = fecha_año;
    }

    public String getFecha_registro() {
        return Fecha_registro;
    }

    public void setFecha_registro(String Fecha_registro) {
        this.Fecha_registro = Fecha_registro;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = encriptar(clave,21);
    }

    public int getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(int tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }
    public String encriptar(String cadena,int clave){
        String ret = "";
        char[] chars = cadena.toCharArray();
        for(int i = 0;i<chars.length;i++){
            char c = (char)(chars[i] ^ clave);
            ret = ret+c;
        }
        return ret;
    }
}
