package AutoSalon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Catalog {
    private List<Auto> autos;


    public Catalog(){
        autos = new LinkedList<Auto>();
    }


    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public List<Auto> getAutos() {
        return autos;
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

    public void addAuto(String modifier, double price, AutoSpec autoSpec){
        Auto auto = new Auto(modifier, price, autoSpec);
        autos.add(auto);
    }

//    public void addAutoSpec(String model, BodyType bodyType, EngineType engineType, Transmission transmission, Color color){
//        AutoSpec autoSpec = new AutoSpec(model, bodyType, engineType, transmission, color);
//
//    }

    public List<Auto> search(AutoSpec searchAutoSpec){
        List<Auto> matchingAutos = new LinkedList<>();
//        searchAuto.getAutoSpec();
        for (int i = 0; i < autos.size(); i++) {
            Auto auto = autos.get(i);
            AutoSpec autoSpec = auto.getAutoSpec();
            if (autoSpec.matches(searchAutoSpec)) {
                matchingAutos.add(auto);
            }
        }
//            AutoSpec autoSpec = auto.getAutoSpec();
//            String model = searchAutoSpec.getModel().toLowerCase();
//            if ((model != null) && (!model.equals("")) && (!model.equals(autoSpec.getModel().toLowerCase())))
//                continue;
//
//            if (searchAutoSpec.getBodyType() != autoSpec.getBodyType())
//                continue;
//            if (searchAutoSpec.getEngineType() != autoSpec.getEngineType())
//                continue;
//            if (searchAutoSpec.getTransmission() != autoSpec.getTransmission())
//                continue;
//            if (searchAutoSpec.getColor() != autoSpec.getColor())
//                continue;
//            matchingAutos.add(auto);
            return matchingAutos;
        }

    }

