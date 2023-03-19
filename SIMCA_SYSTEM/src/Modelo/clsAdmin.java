package Modelo;

public class clsAdmin {
    //DECLARACION DE VARIABLES
    private String usuario;
    private String contraseña;
    
    //CONSTRUCTOR
    public clsAdmin() {
        this.usuario="admin";
        this.contraseña = "123";
    }
    
    //GETTERS AND SETTER
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    //METODOS Y PROCEDIMINETOS
    public int verificarContraseña (String passw){
        int verificacion=0;
        if(this.contraseña.equals(passw)){
            verificacion=1;
        }
        return verificacion;
    }
    
    public int verificarUsuario (String us){
        int verificacion=0;
        if(this.usuario.equalsIgnoreCase(us)){
            verificacion=1;
        }
        return verificacion;
    }
}
