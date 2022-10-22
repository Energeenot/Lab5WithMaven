package AutoSalon;

public class Auto {
//    private String model;
    private String modifier;
    private double price;
    private AutoSpec autoSpec;

    public AutoSpec getAutoSpec() {
        return autoSpec;
    }
//    private BodyType bodyType;
//    private EngineType engineType;
//    private Transmission transmission;
//    private Color color;

//    public String getModel() {
//        return model;
//    }
//
    public String getModifier() {
        return modifier;
    }

    public double getPrice() {
        return price;
    }

//    public BodyType getBodyType() {
//        return bodyType;
//    }
//
//    public EngineType getEngineType() {
//        return engineType;
//    }
//
//    public Transmission getTransmission() {
//        return transmission;
//    }
//
//    public Color getColor() {
//        return color;
//    }

    public Auto(String model, String modifier, double price, BodyType bodyType, EngineType engineType, Transmission transmission, Color color) {
        this.autoSpec = new AutoSpec(model, bodyType, engineType, transmission, color);
        this.modifier =  modifier;
        this.price = price;
    }
}
