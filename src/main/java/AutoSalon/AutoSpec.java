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

    public AutoSpec(String model, BodyType bodyType, EngineType engineType, Transmission transmission, Color color) {
        this.model = model;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.transmission = transmission;
        this.color = color;
    }
}
