package num1;

public enum Food {

    MEAT("meat"),
    GRASS("grass");

    private final String name;

    private Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
}
