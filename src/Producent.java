public class Producent {
    private final String model;
    private final String type;

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model + " " + type;
    }
}