public class Car {
    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private Dimension dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, Dimension dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "Car -> " +
                "\n   producent = " + producent +
                "\n   isAutomaticGear = " + isAutomaticGear +
                "\n   market = " + market +
                "\n   segment = " + segment +
                "\n   dimensions = " + dimensions + "\n";
    }

    public Producent getProducent() {
        return producent;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public Dimension getDimensions() {
        return dimensions;
    }
}