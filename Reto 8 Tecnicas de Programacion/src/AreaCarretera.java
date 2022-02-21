public class AreaCarretera {

  private static double areaTotal = 0;

  public static double areaTotalCarretera() {
    for(TramoGenerico area : Carretera.tramo ) {
      areaTotal += area.area();
    }
    return areaTotal;
  }

}
