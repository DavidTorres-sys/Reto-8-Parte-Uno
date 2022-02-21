public class LongitudCarretera {

  private static double longitudTotal = 0;

  public static double longitudTotalCarretera() {
    for(TramoGenerico longitud : Carretera.tramo ) {
      longitudTotal += longitud.longitud();
    }
    return longitudTotal;
  }
}
