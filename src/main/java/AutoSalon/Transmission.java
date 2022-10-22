package AutoSalon;

public enum Transmission {
    AUTOMATIC, MANUAL;

    public String toString() {
        return switch (this) {
            case AUTOMATIC -> "Automatic transmission";
            case MANUAL -> "Manual transmission";
            default -> throw new IllegalArgumentException();
        };
    }
}
