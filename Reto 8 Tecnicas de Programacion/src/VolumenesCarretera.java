public class VolumenesCarretera {

  private static double volumenAsfalto = 0;
  private static double volumenMateriales = 0;
  private static double volumenMaterialTramoSinAsfaltar = 0;

  public static double volumenMaterialesCarretera () {
    for(TramoGenerico volumen : Carretera.tramo){
      volumenMateriales += volumen.volumen();
    }
    return volumenMateriales;
  }
  public static double volumenAsfaltoCarretera () {
    for(TramoGenerico volumen : Carretera.tramo){
      if(Carretera.tramo instanceof TramoAsfaltado){
        volumenAsfalto += volumen.volumen();
      }
    }
    return volumenAsfalto;
  }

  public static double volumenTotalMaterialTramoSinAsfaltar() {
    for(TramoGenerico volumen : Carretera.tramo) {
      if (Carretera.tramo instanceof TramoSinAsfaltar) {
        volumenAsfalto += volumen.volumen();
      }
    }
    return volumenMaterialTramoSinAsfaltar;
  }
}
