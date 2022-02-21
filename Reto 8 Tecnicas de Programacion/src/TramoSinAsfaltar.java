import java.util.Objects;
import java.util.Scanner;

public class TramoSinAsfaltar extends TramoGenerico{

  String [] tipoMaterial = {"piedra", "arena", "balastro" };

  private int coordenadasXInicio;
  private int coordenadasXFinal;
  private int coordenadasYInicio;
  private int coordenadasYFinal;

  private double volumen = 0;

  private final int ANCHO = 6;
  private final double ESPESOR_PIEDRA = 0.25;
  private final double ESPESOR_ARENA = 0.20;
  private final double ESPESOR_BALASTRO = 0.30;

  public TramoSinAsfaltar(int coordenadasXInicio,int coordenadasYInicio,
                          int coordenadasXFinal, int coordenadasYFinal) {
    this.coordenadasXInicio = coordenadasXInicio;
    this.coordenadasXFinal = coordenadasXFinal;
    this.coordenadasYInicio = coordenadasYInicio;
    this.coordenadasYFinal = coordenadasYFinal;
  }
  Scanner input = new Scanner(System.in);

  @Override
  public double longitud() {
    double longitud = Math.sqrt((coordenadasXFinal - coordenadasXInicio) * (coordenadasXFinal - coordenadasXInicio) +
        (coordenadasYFinal - coordenadasYInicio) * (coordenadasYFinal - coordenadasYInicio));
    if(longitud < 0){
      longitud = longitud*(-1);
    }
    return longitud;
  }

  @Override
  public double area() {
    return longitud() * ANCHO;
  }


  String n = input.nextLine();

  @Override
  public double volumen() {
    for (int i = 0; i < tipoMaterial.length ; i++) {
      if (tipoMaterial[i].equals(tipoMaterial[0])) {
        volumen = longitud() * ANCHO * ESPESOR_PIEDRA;
      }
      if (tipoMaterial[i].equals(tipoMaterial[1])) {
        volumen = longitud() * ANCHO * ESPESOR_ARENA;
      }
      if (tipoMaterial[i].equals(tipoMaterial[2])) {
       volumen = longitud() * ANCHO * ESPESOR_BALASTRO;
      }
    }
    return volumen;
  }
}
