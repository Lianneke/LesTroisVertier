public class Gondola extends Elevator{

    private int minAge;

    public Gondola(String name, int startHeightMeters, int endHeightMeters, int maxWindForce) {
        super(name, startHeightMeters, endHeightMeters, maxWindForce);
        this.minAge = 12;
    }

    @Override
    public boolean controlAccess(Tourist tourist) {
        int age = tourist.getAge();
        boolean hasGuidance = tourist.isHasGuidance();
        if(age < minAge && hasGuidance == false){
            System.out.println("NO ACCESS ALLOWED");
            return false;
        }else {
            System.out.println("ACCESS ALLOWED");
            return true;
        }
        //return super.controlAccess(tourist);
    }
}
