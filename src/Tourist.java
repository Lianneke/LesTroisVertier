public class Tourist {

    private String name;
    private Double weight;
    private int age;
    private boolean hasGuidance;

    public Tourist(String name, Double weight, int age, boolean hasGuidance) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.hasGuidance = hasGuidance;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasGuidance() {
        return hasGuidance;
    }

    public Double getWeight() {
        return weight;
    }
}
