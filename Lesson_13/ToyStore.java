import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore {
    private ArrayList<Toy> toyList;

    public ToyStore() {
        toyList = new ArrayList<Toy>();
    }

    public ToyStore(String t) {
        loadToys(t);
    }

    public void loadToys(String ts) {
        toyList = new ArrayList<Toy>();
        ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(",")));
        for (int i = 0; i < toys.size(); i += 2) {
            String name = toys.get(i);
            String type = toys.get(i + 1);
            Toy t = getThatToy(name);

            if (t == null) {
                if (type.equals("Car")) {
                    toyList.add(new Car(name));
                } else {
                    toyList.add(new Afigure(name));
                }
            } else {
                t.setCount(t.getCount() + 1);
            }
        }
    }

    public Toy getThatToy(String nm) {
        for (Toy i : toyList) {
            if (i.getName().equals(nm)) {
                return i;
            }
        }
        return null;
    }

    public String getMostFrequentToy() {
        String name = "";
        int max = Integer.MIN_VALUE;
        for (Toy i : toyList) {
            if (max < i.getCount()) {
                max = i.getCount();
                name = i.getName();
            }
        }
        return name;
    }

    public String getMostFrequentType() {
        int cars = 0;
        int figures = 0;
        for (Toy i : toyList) {
            if (i.getType().equals("Car")) {
                cars++;
            } else {
                figures++;
            }
        }
        if (cars > figures) {
            return "Cars";
        }
        if (figures > cars) {
            return "Action Figures";
        } else {
            return "Equal amounts of action figures and cars!";
        }

    }

    public String toString() {
        return " " + toyList;
    }
}