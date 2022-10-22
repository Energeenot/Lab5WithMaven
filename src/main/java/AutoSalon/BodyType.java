package AutoSalon;

public enum BodyType {
    SEDAN, HATCHBACK, STATIONWAGON, COUPE, MINIVAN;

    public String toString() {
        return switch (this) {
            case SEDAN -> "Sedan";
            case HATCHBACK -> "Hatchback";
            case STATIONWAGON -> "Station wagon";
            case COUPE -> "Coupe";
            case MINIVAN -> "Minivan";
            default -> throw new IllegalArgumentException();
        };
    }
}
