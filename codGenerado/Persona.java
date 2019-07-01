public class Persona {

    private String nombre;
    private String apellido;
    private Direccion direccion;
    private int edad;
    private Telefono telefono;
    private String correo;

  public String getPersona(){
    return (
      "Nombre: "+getNombre()+"\n"+
      "Apellido: "+getApellido()+"\n"+
      "Direccion: "+getDireccion()+"\n"+
      "Edad: "+getEdad()+"\n"+
      "Telefono: "+getTelefono()+"\n"+
      "Correo: "+getCorreo()+"\n"+
      "\n");
    }

    public String getNombre(){
      return this.nombre;
    }
    public String getApellido(){
      return this.apellido;
    }
    public Direccion getDireccion(){
      return this.direccion;
    }
    public integer getEdad(){
      return this.edad;
    }
    public Telefono getTelefono(){
      return this.telefono;
    }
    public String getCorreo(){
      return this.correo;
    }

    public void setNombre(String value){
      this.nombre = value;
    }
    public void setApellido(String value){
      this.apellido = value;
    }
    public void setDireccion(Direccion value){
      this.direccion = value;
    }
    public void setEdad(integer value){
      this.edad = value;
    }
    public void setTelefono(Telefono value){
      this.telefono = value;
    }
    public void setCorreo(String value){
      this.correo = value;
    }
}