public class Telefono {

    private String indicador;
    private String numero;

  public String getTelefono(){
    return (
      "Indicador: "+getIndicador()+"\n"+
      "Numero: "+getNumero()+"\n"+
      "\n");
    }

    public String getIndicador(){
      return this.indicador;
    }
    public String getNumero(){
      return this.numero;
    }

    public void setIndicador(String value){
      this.indicador = value;
    }
    public void setNumero(String value){
      this.numero = value;
    }
}