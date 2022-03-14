
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;

public class Estudiante {
  private String nombre;
  private String apellido;
  private double promedio;
  
  public Estudiante(String nombre, String apellido, double promedio) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.promedio = promedio;
  }
  
  public static double Promedio (List<Estudiante> list) {
    return list.stream()
      .collect(averagingDouble(x -> x.getPromedio() ));
  }
  
  public static Estudiante MenorPromedioEstudiantes(List<Estudiante> list) {
    return list.stream()
      .min((a,b) -> (int) (a.getPromedio() - b.getPromedio()))
      .get();
  }
  
  @Override
  public String toString() {
    return "Estudiante{" +
      "nombre='" + nombre + '\'' +
      ", apellido='" + apellido + '\'' +
      ", promedio=" + promedio +
      '}';
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
  
  public double getPromedio() {
    return promedio;
  }
  
  public void setPromedio(double promedio) {
    this.promedio = promedio;
  }
}
