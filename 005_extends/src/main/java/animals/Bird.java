package animals;

public class Bird extends Animal{
    String flySpeed;

    public Bird() {

    }

    public Bird(String inputSpeed,String age,String weight) {
        super(age,weight);
        flySpeed = inputSpeed;
    }

    public String getFlySpeed() {
        return flySpeed;
    }

    public void fly() {
        System.out.println("翱翔天空");
    }

}
