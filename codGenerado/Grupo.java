public class Grupo {

    private String actividades;
    private double nota;

  public String getGrupo(){
    return (
      "Actividades: "+getActividades()+"\n"+
      "Nota: "+getNota()+"\n"+
      "\n");
    }

    public String getActividades(){
      return this.actividades;
    }
    public double getNota(){
      return this.nota;
    }

    public void setActividades(String value){
      this.actividades = value;
    }
    public void setNota(double value){
      this.nota = value;
    }
}