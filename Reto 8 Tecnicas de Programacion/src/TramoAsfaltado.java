public class TramoAsfaltado extends TramoGenerico{

  private String nombreProvedor;
  private int velocidadMaxima;
  private boolean adelantar;

  private final double ANCHO = 8;
  private final double ESPESOR = 0.25;

  protected int coordenadasXInicio;
  protected int coordenadasXFinal;
  protected int coordenadasYInicio;
  protected int coordenadasYFinal;

  public TramoAsfaltado(int coordenadasXInicio, int coordenadasXFinal,
                        int coordenadasYInicio, int coordenadasYFinal) {
    this.coordenadasXInicio = coordenadasXInicio;
    this.coordenadasXFinal = coordenadasXFinal;
    this.coordenadasYInicio = coordenadasYInicio;
    this.coordenadasYFinal = coordenadasYFinal;
  }

  //METEDOS PADRE
  public double longitud() {
    double longitud = Math.sqrt((coordenadasXFinal - coordenadasXInicio) * (coordenadasXFinal - coordenadasXInicio) +
        (coordenadasYFinal - coordenadasYInicio) * (coordenadasYFinal - coordenadasYInicio));
    if(longitud < 0){
      longitud = longitud*(-1);
    }
    return longitud;
  }

  public double area() {
    double area = longitud() * ANCHO;
    return area;
  }


  public double volumen() {
    double volumen = longitud() * ANCHO * ESPESOR;
    return volumen;
  }


  //GET AND SET

  public String getNombreProvedor(){
    return this.nombreProvedor;
  }
  public void setNombreProvedor(){
    System.out.println("Ingrese el nombre del provedor del asfalto: ");
    nombreProvedor = entrada.nextLine();
  }

  public int getVelocidadMaxima(){
    return this.velocidadMaxima;
  }
  public void setVelocidadMaxima(){
    System.out.println("La velocidad máxima en esta carretera asfalta es 80km/h");
  }

  public boolean isAdelantar(){
    return this.adelantar;
  }

  public void setAdelantar(boolean adelantar) {
    System.out.println("Se puede adelantar en esta carretera asfaltada");
    this.adelantar = false;
  }
}
