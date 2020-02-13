package animals;

public class Eagle extends Bird {
    String huntTarget;

    public Eagle() {

    }

    public Eagle(String inputTarget,String flyspeed,String age,String weight) {
        super(flyspeed,age,weight);
        huntTarget = inputTarget;
    }

    public String getHuntTarget() {
        return huntTarget;
    }

    public void hunt() {
        System.out.println("捕食了一只:" + huntTarget);
    }
}
