public class Dimension {
    private final int high;
    private final int width;
    private final int trankCapacity;

    public Dimension(int high, int width, int trankCapacity) {
        this.high = high;
        this.width = width;
        this.trankCapacity = trankCapacity;
    }

    public int getTrankCapacity() {
        return trankCapacity;
    }

    @Override
    public String toString() {
        return "high=" + high +
                ", width=" + width +
                ", trankCapacity=" + trankCapacity;
    }
}