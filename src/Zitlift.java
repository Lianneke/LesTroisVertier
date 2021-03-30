public class Zitlift extends Elevator{

    private double maxWeight;

    public Zitlift(String name, int startHeightMeters, int endHeightMeters, int maxWindForce) {
        super(name, startHeightMeters, endHeightMeters, maxWindForce);
        this.maxWeight = 95;
    }

    @Override
    public boolean controlAccess(Tourist tourist) {
        double weight = tourist.getWeight();
        if(weight >= maxWeight){
            System.out.println("NO ACCESS ALLOWED");
            return false;
        }else{
            System.out.println("ACCESS ALLOWED");
            return true;
        }
    }


}
