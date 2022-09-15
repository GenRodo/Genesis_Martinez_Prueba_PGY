package prueba1.Modelos;

public class Usuario {
    
    private int Id;
    private String Nombre;
    private String Mail;
    private String Contraseña;
    
    public Usuario(){
        this.Id = 0;
        this.Nombre = "";
        this.Mail = "";
        this.Contraseña = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
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
