public enum Mealtimes {
    Breakfast("завтрак"),
    Lunch("обед"),
    Dinner("ужин");

    private final String description;

    Mealtimes(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }
}
