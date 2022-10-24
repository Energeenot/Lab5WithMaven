package AutoSalon;

public class AutoSpec {
    private String model;
    private BodyType bodyType;
    private EngineType engineType;
    private Transmission transmission;
    private  Color color;

//    добавил пункты из задания
    private int numberOfPassengerSeats;
    private int maxSpeed;
    private double fuelConsumption;

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Color getColor() {
        return color;
    }

    public AutoSpec(String model, BodyType bodyType, EngineType engineType, Transmission transmission, Color color, int numberOfPassengerSeats, int maxSpeed, double fuelConsumption) {
        this.model = model;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.transmission = transmission;
        this.color = color;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }
    public AutoSpec(){}

    public boolean matches(AutoSpec otherSpec){
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))){
            return false;
        }
        if (bodyType != otherSpec.bodyType){
            return false;
        }
        if (engineType != otherSpec.engineType){
            return false;
        }
        if (transmission != otherSpec.transmission){
            return false;
        }
        if (color != otherSpec.color){
            return false;
        }
//        пункты из б

        if (numberOfPassengerSeats != otherSpec.numberOfPassengerSeats){
            return false;
        }

        if (maxSpeed != otherSpec.maxSpeed){
            return false;
        }
        if (fuelConsumption != otherSpec.fuelConsumption){
            return false;
        }

        return true;
    }
}
