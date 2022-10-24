package AutoSalon;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindAutoTester {
    public static void main(String[] args) throws IOException {
        Catalog catalog = new Catalog();
//        initializeCatalog(catalog);

        ObjectMapper mapper = new ObjectMapper();
        catalog.setAutos(mapper.readValue(new File("carsInStock.json"), mapper.getTypeFactory().constructCollectionType(ArrayList.class, Auto.class)));

//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            Auto[] autos = mapper.readValue(new File("carsInStock.json"), Auto[].class);
//            for (int i = 0; i < autos.length; i++){
//                System.out.println(autos[i].getName() + " " + actors[i].getAddress() + " " + actors[i].getBirthday() + " "  + actors[i].isCrime() +  " " + actors[i].getPrisonTerm() + " " + Arrays.toString(actors[i].getFriends()));
//            }
//            System.out.println(Arrays.toString(autos));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        catalog.addAuto( "sport",  2559223, new AutoSpec("Mazda mazda6 2019", BodyType.SEDAN, EngineType.ICE_PETROL, Transmission.AUTOMATIC, Color.WHITE, 4, 211, 13.8));
//        catalog.addAuto( "stock",1900000, new AutoSpec("Toyota Camry 2018", BodyType.SEDAN, EngineType.ICE_PETROL, Transmission.MANUAL, Color.GRAY, 4, 210, 13));
//        catalog.addAuto( "stock",3500000, new AutoSpec("BMW M5 2019", BodyType.SEDAN, EngineType.ICE_DIESEL, Transmission.AUTOMATIC, Color.BLACK, 4, 250, 15.6));
//        catalog.addAuto( "sport",4000000, new AutoSpec("BMW M5 2019", BodyType.SEDAN, EngineType.ICE_DIESEL, Transmission.AUTOMATIC, Color.BLACK, 4, 305, 16.9));
//        catalog.addAuto( "sport", 650000, new AutoSpec("Honda Civic 2007", BodyType.SEDAN, EngineType.ICE_PETROL, Transmission.MANUAL, Color.RED, 4, 235, 12.7));


        AutoSpec whatErinLikes = new AutoSpec("BMW M5 2019", BodyType.SEDAN, EngineType.ICE_DIESEL, Transmission.AUTOMATIC, Color.BLACK, 4, 250, 15.6);
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
                        spec.getColor() + ", number of passenger seats " + spec.getNumberOfPassengerSeats() +
                        ", max. speed " + spec.getMaxSpeed() + ", fuel consumption " + spec.getFuelConsumption() +
                        ", you can have it for only " + auto.getPrice());

            }
        } else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }
}
