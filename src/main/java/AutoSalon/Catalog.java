package AutoSalon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Catalog {
    private List autos;

    public Catalog(){
        autos = new LinkedList();
    }

    public Auto getAuto(String model) {
        for (Iterator i = autos.iterator(); i.hasNext();){
            Auto auto = (Auto) i.next();
            AutoSpec autoSpec = (AutoSpec) i.next();
            if (autoSpec.getModel().equals(model)){
                return auto;
            }
        }
        return null;
    }

    public void addAuto(String  model,  String modifier, double price, BodyType bodyType, EngineType engineType, Transmission transmission, Color color){
        Auto auto = new Auto(model, modifier, price, bodyType, engineType, transmission, color);
        autos.add(auto);
    }

//    public void addAutoSpec(String model, BodyType bodyType, EngineType engineType, Transmission transmission, Color color){
//        AutoSpec autoSpec = new AutoSpec(model, bodyType, engineType, transmission, color);
//
//    }

    public List<Auto> search(AutoSpec searchAutoSpec){
        List<Auto> matchingAutos = new LinkedList<>();
//        searchAuto.getAutoSpec();
        for (Object o : autos) {
            Auto auto = (Auto) o;
            AutoSpec autoSpec = auto.getAutoSpec();
            String model = searchAutoSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(autoSpec.getModel().toLowerCase())))
                continue;

            if (searchAutoSpec.getBodyType() != autoSpec.getBodyType())
                continue;
            if (searchAutoSpec.getEngineType() != autoSpec.getEngineType())
                continue;
            if (searchAutoSpec.getTransmission() != autoSpec.getTransmission())
                continue;
            if (searchAutoSpec.getColor() != autoSpec.getColor())
                continue;
            matchingAutos.add(auto);
            return matchingAutos;
        }
        return null;
    }

//    private static void initializeCatalog(Catalog catalog){
//        AutoSpec
//        catalog.addAuto(("Mazda mazda6 2019", BodyType.SEDAN, EngineType.ICE_PETROL, Transmission.AUTOMATIC, Color.WHITE), "sport",  2559223);
//    }
}
