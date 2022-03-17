import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Data {

    public static void printMatchingCountryName(String model, boolean isAutomaticGear, int trankCapacity) {
        List<Country> collect = createCars().stream()
                .filter(x -> x.getProducent().getModel().equals(model))
                .filter(x -> x.isAutomaticGear() == isAutomaticGear)
                .filter(x -> x.getDimensions().getTrankCapacity() > trankCapacity)
                .map(x -> x.getMarket().getCoutries())
                .flatMap(List::stream)
                .collect(Collectors.toList());

        Set<String> countries = new HashSet<>();

        for (Country coutry : collect) {
            int i = 0;
            countries.add(coutry.toString());
        }
        System.out.println(countries);
    }

    private static ArrayList<Country> createCoutries() {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country china = new Country("China", 'C');
        Country netherlands = new Country("Netherlands", 'N');
        Country korea = new Country("Korea", 'K');
        return new ArrayList<>(List.of(poland, germany, china, netherlands, korea));
    }

    private static ArrayList<Market> createMarkets() {
        Market businessMarket = new Market("business", List.of(createCoutries().get(0), createCoutries().get(3)));
        Market cargoMarket = new Market("cargo", List.of(createCoutries().get(1), createCoutries().get(2)));
        Market transportMarket = new Market("transport", List.of(createCoutries().get(3), createCoutries().get(4)));
        Market taxiMarket = new Market("taxi", List.of(createCoutries().get(0), createCoutries().get(2), createCoutries().get(3)));
        Market busMarket = new Market("bus", List.of(createCoutries().get(1), createCoutries().get(4)));
        return new ArrayList<>(List.of(businessMarket, cargoMarket, transportMarket, taxiMarket, busMarket));
    }

    private static ArrayList<Dimension> createDimensions() {
        Dimension d0 = new Dimension(110, 145, 220);
        Dimension d1 = new Dimension(150, 140, 250);
        Dimension d2 = new Dimension(130, 200, 300);
        Dimension d3 = new Dimension(120, 180, 280);
        Dimension d4 = new Dimension(110, 120, 310);
        Dimension d5 = new Dimension(155, 160, 340);
        Dimension d6 = new Dimension(160, 150, 290);
        Dimension d7 = new Dimension(125, 210, 400);
        Dimension d8 = new Dimension(135, 220, 275);
        Dimension d9 = new Dimension(140, 190, 360);
        return new ArrayList<>(List.of(d0, d1, d2, d3, d4, d5, d6, d7, d8, d9));
    }

    private static ArrayList<Producent> createPoducents() {
        Producent p0 = new Producent("Toyota", "Corolla");
        Producent p1 = new Producent("Toyota", "Yaris");
        Producent p2 = new Producent("BMW", "m1");
        Producent p3 = new Producent("BMW", "m2");
        Producent p4 = new Producent("Volkswagen", "Golf");
        Producent p5 = new Producent("Volkswagen", "Passat");
        Producent p6 = new Producent("Peugeot", "508");
        Producent p7 = new Producent("Peugeot", "208");
        Producent p8 = new Producent("Skoda", "Fabia");
        Producent p9 = new Producent("Skoda", "Octavia");
        return new ArrayList<>(List.of(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9));
    }

    private static ArrayList<Car> createCars() {
        Car c0 = new Car(createPoducents().get(0), true, createMarkets().get(0), "standard", createDimensions().get(7));
        Car c1 = new Car(createPoducents().get(1), false, createMarkets().get(4), "medium", createDimensions().get(9));
        Car c2 = new Car(createPoducents().get(2), true, createMarkets().get(2), "premium", createDimensions().get(2));
        Car c3 = new Car(createPoducents().get(3), false, createMarkets().get(1), "standard", createDimensions().get(2));
        Car c4 = new Car(createPoducents().get(4), true, createMarkets().get(0), "premium", createDimensions().get(3));
        Car c5 = new Car(createPoducents().get(5), true, createMarkets().get(1), "standard", createDimensions().get(3));
        Car c6 = new Car(createPoducents().get(6), true, createMarkets().get(3), "premium", createDimensions().get(8));
        Car c7 = new Car(createPoducents().get(7), false, createMarkets().get(4), "medium", createDimensions().get(4));
        Car c8 = new Car(createPoducents().get(8), true, createMarkets().get(2), "medium", createDimensions().get(1));
        Car c9 = new Car(createPoducents().get(9), false, createMarkets().get(1), "standard", createDimensions().get(5));
        Car c10 = new Car(createPoducents().get(4), false, createMarkets().get(0), "premium", createDimensions().get(6));
        Car c11 = new Car(createPoducents().get(3), true, createMarkets().get(2), "standard", createDimensions().get(9));
        Car c12 = new Car(createPoducents().get(7), false, createMarkets().get(3), "medium", createDimensions().get(0));
        Car c13 = new Car(createPoducents().get(2), false, createMarkets().get(4), "premium", createDimensions().get(4));
        Car c14 = new Car(createPoducents().get(0), true, createMarkets().get(3), "medium", createDimensions().get(0));
        return new ArrayList<>(List.of(c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14));
    }
}