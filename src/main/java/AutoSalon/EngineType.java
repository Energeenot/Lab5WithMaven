package AutoSalon;

public enum EngineType {
    ICE_PETROL, ICE_DIESEL, ICE_GAS, ELECTRICMOTOR, HYBRID;

    public String toString() {
        return switch (this) {
            case ICE_PETROL -> "ICE - Petrol engine";
            case ICE_DIESEL -> "ICE - Diesel engine";
            case ICE_GAS -> "ICE - Gas engine";
            case ELECTRICMOTOR -> "Electronic engine";
            case HYBRID -> "Hybrid engine";
            default -> throw new IllegalArgumentException();
        };
    }
}
