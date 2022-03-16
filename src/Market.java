import java.util.List;

public class Market {
    private final String name;
    private final List<Country> coutries;

    public Market(String name, List<Country> coutries) {
        this.name = name;
        this.coutries = coutries;
    }

    public List<Country> getCoutries() {
        return coutries;
    }

    @Override
    public String toString() {
        return name + " " + coutries;
    }
}