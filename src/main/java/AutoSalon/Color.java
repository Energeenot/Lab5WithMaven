package AutoSalon;

public enum Color {
    GREEN, RED, BLUE, WHITE, BLACK, GRAY;

    public String toString() {
        return switch (this) {
            case GREEN -> "Green color";
            case RED -> "Red color";
            case BLUE -> "Blue color";
            case WHITE -> "White color";
            case BLACK -> "Black color";
            case GRAY -> "Gray color";
            default -> throw new IllegalArgumentException();
        };
    }
}
