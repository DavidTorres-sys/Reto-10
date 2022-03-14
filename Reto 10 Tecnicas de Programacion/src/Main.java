import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingDouble;

public class Main {
  public static void main(String[] args) {
    List<Integer> integerNumber = new ArrayList<>();
    integerNumber.add(2);
    integerNumber.add(-2);
    integerNumber.add(3);
    integerNumber.add(4);
    integerNumber.add(5);
    integerNumber.add(6);
    Stream<Integer> streamIntegerNumber = integerNumber.stream();
    streamIntegerNumber.filter(i -> i >= 0)
      .forEach(i -> System.out.println(PuntoTresB.factorial(i)));
    
    System.out.println("-----------------------");
    List<Double> doubleNumber = new ArrayList<>();
    doubleNumber.add(4.0);
    doubleNumber.add(-9.0);
    doubleNumber.add(9.0);
    doubleNumber.add(12.0);
    doubleNumber.add(121.0);
    doubleNumber.add(21.0);
    doubleNumber.add(100.0);
    doubleNumber.add(-15.0);
    Stream<Double> streamDoubleNumber = doubleNumber.stream();
    streamDoubleNumber.filter(i -> i >= 0)
      .map(e -> Math.sqrt(e))
      .forEach(i -> System.out.println(i));
  
    System.out.println("-----------------------");
    
    List<Estudiante> estudiantes = new ArrayList<>();
    estudiantes.add(new Estudiante("David", "Casillas", 4.5));
    estudiantes.add(new Estudiante("Juan", "Rodriguez", 3.0));
    estudiantes.add(new Estudiante("Laura", "Acosta", 4.2));
    estudiantes.add(new Estudiante("Manuel", "Perez", 2.8));
    Stream<Estudiante> streamEstudiantes = estudiantes.stream();
    
    System.out.println("Menor Promedio");
      streamEstudiantes.forEach(e -> System.out.println(Estudiante.MenorPromedioEstudiantes((List<Estudiante>) e)));
      streamEstudiantes.forEach(e -> System.out.println(Estudiante.Promedio((List<Estudiante>) e)));
      
  }
}
