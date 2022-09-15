package prueba1.Modelos;

//ID, nombre completo, rut, digito verificador, fecha de nacimiento, teléfono, 
//email, nombre de usuario y contraseña.

import java.util.Date;

public class Usuario {
    
    private int Id;
    private String Nombres;
    private String Apellidos;
    private int Rut;
    private String Dv;
    private Date FechaNacimiento;
    private int Telefono;
    private String Email;
    private String NombreUsuario;
    private String Contraseña;


    public Usuario(int Id, String Nombres, String Apellidos, int Rut, String Dv, Date FechaNacimiento, int Telefono, String Email, String NombreUsuario, String Contraseña) {
        this.Id = Id;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Rut = Rut;
        this.Dv = Dv;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
    }

        public Usuario() {
        this.Id = 0;
        this.Nombres = "";
        this.Apellidos = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNacimiento = new Date();
        this.Telefono = 0;
        this.Email = "";
        this.NombreUsuario = "";
        this.Contraseña = "";
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
        
        char[] mayusculas = {'A', 'G'};
        char[] minusculas = {'a', 'd', 'f', 'i', 'n', 'o', 'v'};
        char[] numeros = {'1', '2', '3', '4'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        
        
    }
    
    
}

    
   