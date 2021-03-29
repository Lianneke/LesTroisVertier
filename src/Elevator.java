public class Elevator {

    private String name;
    private int startHeightMeters;
    private int endHeightMeters;
    private int maxWindForce;

    public Elevator(String name, int startHeightMeters, int endHeightMeters, int maxWindForce) {
        this.name = name;
        this.startHeightMeters = startHeightMeters;
        this.endHeightMeters = endHeightMeters;
        this.maxWindForce = maxWindForce;
    }

    public boolean controlAccess(Tourist tourist){
        return false;
    }
}
