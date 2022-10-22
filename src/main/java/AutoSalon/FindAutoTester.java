package AutoSalon;

import java.util.Iterator;
import java.util.List;

public class FindAutoTester {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
//        initializeCatalog(catalog);
        catalog.addAuto("Mazda mazda6 2019", "sport",  2559223, BodyType.SEDAN, EngineType.ICE_PETROL, Transmission.AUTOMATIC, Color.WHITE);
        catalog.addAuto("Toyota Camry 2018", "stock",1900000, BodyType.SEDAN, EngineType.ICE_PETROL, Transmission.MANUAL, Color.GRAY);
        catalog.addAuto("BMW M5 2019", "stock",3500000, BodyType.SEDAN, EngineType.ICE_DIESEL, Transmission.AUTOMATIC, Color.BLACK);
        catalog.addAuto("BMW M5 2019", "sport",4000000, BodyType.SEDAN, EngineType.ICE_DIESEL, Transmission.AUTOMATIC, Color.BLACK);
        catalog.addAuto("Honda Civic 2007", "sport", 650000, BodyType.SEDAN, EngineType.ICE_PETROL, Transmission.MANUAL, Color.RED);


        AutoSpec whatErinLikes = new AutoSpec("BMW M5 2019", BodyType.SEDAN, EngineType.ICE_DIESEL, Transmission.AUTOMATIC, Color.BLACK);
//        Auto whatErinLikes = new Auto("BMW M5 2019", "", 0, BodyType.SEDAN, EngineType.ICE_DIESEL,
//                Transmission.AUTOMATIC, Color.BLACK);
        List<Auto> matchingAutos = catalog.search(whatErinLikes);
        if (!matchingAutos.isEmpty()){
            System.out.println("Erin, you might like these autos: ");
            for (Object matchingAuto : matchingAutos) {
                Auto auto = (Auto) matchingAuto;
                AutoSpec spec = auto.getAutoSpec();
                System.out.println(" We have a " + spec.getModel() + ", " + auto.getModifier() + ", " +
                        spec.getBodyType() + ", " + spec.getEngineType() + ", " + spec.getTransmission() + ", " +
                        spec.getColor() + ", you can have it for only " + auto.getPrice());

            }
        } else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }
}
