import java.util.Scanner;

public class MainClass {
  public static void main(String[] args){

    Carretera.tramo.add(new TramoAsfaltado(3,17,13,17));
    Carretera.tramo.add(new TramoAsfaltado(3,17,21,14));
    Carretera.tramo.add(new TramoSinAsfaltar(21,14,13,16));
    Carretera.tramo.add(new TramoAsfaltado(13,16,41,10));
    Carretera.tramo.add(new TramoSinAsfaltar(41,10,40,4));
    Carretera.tramo.add(new TramoSinAsfaltar(40,4,35,3));
    Carretera.tramo.add(new TramoAsfaltado(35,3,27,7));
    Carretera.tramo.add(new TramoAsfaltado(27,7,17,7));
    Carretera.tramo.add(new TramoAsfaltado(17,7,8,2));
    Carretera.tramo.add(new TramoSinAsfaltar(8,2,1,6));

    System.out.println("la longitud total es: " + LongitudCarretera.longitudTotalCarretera() + " Km");
    System.out.println("el area total es: " + AreaCarretera.areaTotalCarretera());
    System.out.println("el volumen total de asfalto es: " + VolumenesCarretera.volumenAsfaltoCarretera());
    System.out.println("el volumen total de materiales  es: " + VolumenesCarretera.volumenMaterialesCarretera());
    System.out.println("el volumen total de materiales es: " + VolumenesCarretera.volumenTotalMaterialTramoSinAsfaltar());
    //System.out.println("Conectados: " + Carretera.tramosConectados());
  }
}
