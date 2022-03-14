import java.util.stream.IntStream;

public class PuntoTresB {
  static int factorial(int x) {
    return IntStream.range(1, x + 1).reduce(1, (a, b) -> a * b);
  }
}

