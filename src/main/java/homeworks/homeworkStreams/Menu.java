package homeworks.homeworkStreams;

public class Menu {
    String name;
    String mainIngredient;
    Integer kKal;

    public Menu(String name, String mainIngredient, Integer kKal) {
        this.name = name;
        this.mainIngredient = mainIngredient;
        this.kKal = kKal;
    }

    public Integer getkKal() {
        return kKal;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", mainIngredient='" + mainIngredient + '\'' +
                ", kKal=" + kKal +
                '}';
    }
}
